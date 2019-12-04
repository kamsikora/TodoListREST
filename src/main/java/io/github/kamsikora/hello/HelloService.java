package io.github.kamsikora.hello;

import io.github.kamsikora.lang.Lang;
import io.github.kamsikora.lang.LangRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
class HelloService {
    static final String FALLBACK_NAME = "world";
    static final Lang FALLBACK_LANG = new Lang(1L, "Hello", "en");
    private final Logger logger = LoggerFactory.getLogger(HelloService.class);

    private LangRepository repository;

    HelloService(LangRepository repository) {
        this.repository = repository;
    }

    String prepareGreeting(String name, Long langId) {
        langId = Optional.ofNullable(langId).orElse(FALLBACK_LANG.getId());
        var welcomeMsg = repository.findById(langId).orElse(FALLBACK_LANG).getWelcomeMsg();
        var nameToWelcome = Optional.ofNullable(name).orElse(FALLBACK_NAME);
        return welcomeMsg + " " + nameToWelcome + "!";
    }
}
