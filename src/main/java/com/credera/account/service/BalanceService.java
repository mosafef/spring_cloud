package com.credera.account.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.credera.account.model.Balance;



@RestController
public class BalanceService {
    /**                                                                                                                             
     * Sample usage: curl $HOST:$PORT/balance/accountId                                                                                     
     *                                                                                                                              
     * @param accountId                                                                                                             
     * @return                                                                                                                      
     */
    @RequestMapping("/balance/{accountId}")
	public Balance getBalance(@PathVariable int accountId) {

	return new Balance(accountId, "checking", 10000);
    }
}
