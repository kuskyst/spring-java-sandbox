package jp.kuskyst.springsandbox.service;

import org.springframework.stereotype.Service;

@Service
public interface HelloService {
    public String hello(String  name);
}
