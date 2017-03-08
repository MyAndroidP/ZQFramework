package com.example.baselibrary.injector.component;



import com.example.baselibrary.injector.module.ActivityModule;
import com.example.baselibrary.injector.module.FragmentModule;
import com.example.baselibrary.injector.scope.ActivityScope;

import dagger.Component;

/**
 * Created by ZQ on 2017/2/4.
 */
@ActivityScope
@Component(dependencies = ApplicationComponent.class, modules = {ActivityModule.class, FragmentModule.class})
public interface FragmentComponent extends ActivityComponent {

}
