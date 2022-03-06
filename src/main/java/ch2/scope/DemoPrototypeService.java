package ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * request web项目中给每个http request新建一个bean实例
 * session web项目中给每个http session新建一个bean实例
 */
@Service
@Scope("prototype")//每次调用新建一个bean
public class DemoPrototypeService {
}
