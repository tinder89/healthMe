/**
 * Project: o2osearchservice
 * 
 * File Created at 2015-6-17
 * $Id$
 * 
 */
package com.sk.constants;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO Comment of ParamsMap
 * @author shisong
 *
 */
public class ParamsMap {
	public static final Map<String, String> params = new HashMap<String, String>();
	static {
		params.put("category","美食");
		params.put("subCat","湘菜");
		params.put("keyword","唐家");
		params.put("city","珠海市");
		params.put("longitude","109.03989");
		params.put("latitude","34.251904");
		params.put("areaFilter","香洲区");
		params.put("district","新香洲");
		params.put("page","0");
		params.put("limit","10");
		params.put("bref","唐");
	}
}
