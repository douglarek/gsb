package xin.lingchao.springboot.controller

import org.springframework.web.bind.annotation.{GetMapping, RestController}

/**
 * @author xin
 */
@RestController
class HelloController {

  @GetMapping(Array("/"))
  def greet(): String = "Hello World"
}
