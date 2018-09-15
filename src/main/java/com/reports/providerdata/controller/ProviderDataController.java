package com.reports.providerdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.reports.providerdata.service.ProviderDataService;

@Controller
public class ProviderDataController {

	@Autowired
	private ProviderDataService providerDataService;

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String index(Model model) {

		String message = "Provider Data Reports Page";

		model.addAttribute("message", message);

		return "index";
	}

	@RequestMapping(value = { "/indexData" }, method = RequestMethod.GET)
	public String indexData(Model model) {

		model.addAttribute("indexStatus", providerDataService.indexData() ? "Success" : "Failure");
		return "dataindex";
	}

	@RequestMapping(value = { "/providerDataList" }, method = RequestMethod.GET)
	public String getAllProviders(Model model) {
		return "providersdata";
	}
	
	@RequestMapping(value = { "/providerDataList" }, method = RequestMethod.POST)
	public String viewPersonListByLastName(Model model, @RequestParam("lastname") String lastName) {

		model.addAttribute("providersData", providerDataService.getAllProvidersDataByLastName(lastName));
		return "providersdata";
	}
	
	@RequestMapping(value = { "/providerDataMerge" }, method = RequestMethod.GET)
	public String mergeData(Model model) {

		model.addAttribute("mergeStataus", providerDataService.mergeProviderData());
		return "datamerge";
	}
	
}
