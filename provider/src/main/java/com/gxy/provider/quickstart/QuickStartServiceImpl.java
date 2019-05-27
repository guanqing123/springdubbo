package com.gxy.provider.quickstart;

import com.gxy.provider.ServiceAPI;

public class QuickStartServiceImpl implements ServiceAPI {

	public String sendMessage(String message) {
		// TODO Auto-generated method stub
		return "quickstart-provider-message="+message;
	}

}
