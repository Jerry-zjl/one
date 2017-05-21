package xm.zjl.filter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.util.AntPathMatcher;

public class MySecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
	
	private AntPathMatcher urlMatcher = new AntPathMatcher();  
    private static Map<String, Collection<ConfigAttribute>> resourceMap = null;
    
    public MySecurityMetadataSource() {  
        loadResourceDefine();  
    }  
    
    private void loadResourceDefine() {  
        resourceMap = new HashMap<String, Collection<ConfigAttribute>>();  
        Collection<ConfigAttribute> atts = new ArrayList<ConfigAttribute>();  
        ConfigAttribute ca = new SecurityConfig("ROLE_ADMIN");  
        atts.add(ca);  
        resourceMap.put("/index.jsp", atts);  
        resourceMap.put("/i.jsp", atts);  
    }  
    
    public Collection<ConfigAttribute> getAttributes(Object object){  
        // guess object is a URL.  
         String url = ((FilterInvocation)object).getRequestUrl();  
         Iterator<String> ite = resourceMap.keySet().iterator();  
        while (ite.hasNext()) {  
             String resURL = ite.next();  
            if (urlMatcher.match(url, resURL)) {  
                return resourceMap.get(resURL);  
             }  
         }  
        return null;  
     }  
  
    public boolean supports(Class<?> clazz) {  
        return true;  
     }  
    
    public Collection<ConfigAttribute> getAllConfigAttributes() {  
        return null;  
     }  
  
}  