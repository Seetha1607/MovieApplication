package com.niit.userauthenticationservice.security;



import com.niit.userauthenticationservice.domain.User;

import java.util.Map;

public interface SecurityTokenGenerator {
    String createToken(User user);
}
