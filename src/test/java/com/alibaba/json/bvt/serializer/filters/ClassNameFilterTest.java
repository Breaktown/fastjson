package com.alibaba.json.bvt.serializer.filters;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.NameFilter;
import com.alibaba.fastjson.serializer.SerializeConfig;

import junit.framework.TestCase;

public class ClassNameFilterTest extends TestCase {
    
    public void test_filter() throws Exception {
        NameFilter upcaseNameFilter = new NameFilter() {
            
            
            public String process(Object object, String name, Object value) {
                return name.toUpperCase();
            }
        };
        SerializeConfig.getGlobalInstance() //
                       .addFilter(A.class, upcaseNameFilter);
        
        Assert.assertEquals("{\"ID\":0}", JSON.toJSONString(new A()));
        Assert.assertEquals("{\"id\":0}", JSON.toJSONString(new B()));
    }

    public static class A {
        public int id;
    }

    public static class B {

        public int id;
    }

}
