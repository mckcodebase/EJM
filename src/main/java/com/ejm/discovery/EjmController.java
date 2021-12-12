package com.ejm.discovery;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ejm.discovery.api.enums.BusinessUnits;
import com.ejm.discovery.api.enums.Locations;
import com.ejm.discovery.api.util.AS400FileUtil;
import com.ejm.discovery.api.view.AccountBalance;
import com.ejm.discovery.api.view.MetalBalance;
import com.ejm.discovery.api.view.MetalBalances;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "EjmController")
@RequestMapping("/User")
public class EjmController {

	public String Acc_Name = "";

	@GetMapping("/AccountBalance")
	@ApiOperation(value = "Get Metal Account Balance In The System ", response = Iterable.class, tags = "getAccountBalance")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success|OK") })
	public ResponseEntity<AccountBalance> getAccountBalance(@RequestParam("reference") Integer reference,
			@RequestParam("businessUnitCode") String businessUnitCode,
			@RequestParam("locationCode") String locationCode, @RequestParam("accountType") String accountType,
			@RequestParam("dataEnv") String dataEnv) {
		List<MetalBalances> balances = new ArrayList<MetalBalances>();
		balances = getMetalOpeningBalance(reference);
		AccountBalance accountbalance = new AccountBalance(reference, businessUnitCode, locationCode, accountType,
				dataEnv,
				new MetalBalance(reference, Acc_Name, accountType, BusinessUnits.valueOf(businessUnitCode).label,
						Locations.valueOf(locationCode).label, balances));
		return ResponseEntity.ok(accountbalance);
	}

	public List<MetalBalances> getMetalOpeningBalance(Integer id) {
		List<String> dataList = AS400FileUtil.readDataListFromFile("AS400Responses.txt");
		List<MetalBalances> metalBalanceList = new ArrayList<MetalBalances>();
		for (int i = 0; i < dataList.size(); i++) {
			if (i == id) {
				String[] responseDeatils = dataList.get(i).split("\\|");
				if (responseDeatils.length != 0) {
					this.Acc_Name = responseDeatils[0];
					for (int j = 1; j < responseDeatils.length; j++) {
						String[] responseData = responseDeatils[j].split("~");
						if (responseData.length != 0) {
							MetalBalances m = new MetalBalances(responseData[0].trim(), responseData[1].trim(),
									responseData[2].trim(), responseData[3].trim(),
									Double.parseDouble(responseData[4].trim().toString()));
							metalBalanceList.add(m);
						}
					}
				}
				break;
			}
		}
		return metalBalanceList;
	}
}
