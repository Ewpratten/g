package ca.retrylife.libg;

import ca.retrylife.libg.scene.SceneBuilder;
import ca.retrylife.libg.scene.SceneConfig;

public abstract class Scene {

    private SceneBuilder builder;

    public abstract SceneConfig setup();

    public abstract void buildScene();

    protected SceneBuilder getBuilder() {
        
    }
}