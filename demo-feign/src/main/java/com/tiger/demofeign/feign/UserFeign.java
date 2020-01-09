/**
 * @author ：tigermeng.
 * @date ：15:15 2020/1/9
 */
package com.tiger.demofeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author     ：tigermeng.
 * @date       ：15:15 2020/1/9
 *
 */
@FeignClient(value = "user-service",url = "/user")
public interface UserFeign {

    /**
     *
     * @param userId
     * @return
     */
    @GetMapping("/${userId}")
    public String getUserName(@PathVariable("userId") String userId);
}
