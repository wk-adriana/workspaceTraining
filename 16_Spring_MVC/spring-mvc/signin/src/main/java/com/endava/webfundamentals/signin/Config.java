package com.endava.webfundamentals.signin;

import org.dozer.Mapper;
import org.dozer.MappingException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by aancuta on 8/1/2016.
 */
@Configuration
public class Config {
     @Bean
        public Mapper getMapper(){
                return new Mapper() {
                        @Override
                        public <T> T map(Object o, Class<T> aClass) throws MappingException {
                                return null;
                            }

                        @Override
                        public void map(Object o, Object o1) throws MappingException {

                            }

                        @Override
                        public <T> T map(Object o, Class<T> aClass, String s) throws MappingException {
                                return null;
                            }

                        @Override
                        public void map(Object o, Object o1, String s) throws MappingException {

                            }
                    };
            }


}
