package service;

public class UseTestService {
    TestService testService;

    public String SayHello(String word) {
        return testService.sayHello(word);
    }

    public void setTestService(TestService testService) {
        this.testService = testService;
    }
}
