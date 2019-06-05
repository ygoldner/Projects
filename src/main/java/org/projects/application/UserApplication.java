package org.projects.application;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

import org.projects.user.resource.UserResource;
/**
 * Created by Yael Goldner (goldny) on 22/05/2019
 */
public class UserApplication extends Application<Configuration> {

    public void run(Configuration configuration, Environment environment) throws Exception {
        environment.jersey().register(new UserResource());
    }

    public static void main(String[] args) throws Exception {
        new UserApplication().run(args);
    }
}
