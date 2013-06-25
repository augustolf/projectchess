package com.deploy.libgdx;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameRoot implements ApplicationListener {
    
    private SpriteBatch currentBatch;
    private Texture currentTexture;

    @Override
    public void create() {
        currentBatch = new SpriteBatch();
        currentTexture = new Texture("player.png");        
    }

    @Override
    public void dispose() {
        currentBatch.dispose();
        currentTexture.dispose();
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void render() {
        currentBatch.begin();
        currentBatch.setColor(1, 1, 1, 1);
        currentBatch.draw(currentTexture, 0, 0);
        currentBatch.setColor(1, 0, 1, 1);
        currentBatch.draw(currentTexture, 200, 20);
        currentBatch.end();       
    }

    @Override
    public void resize(int arg0, int arg1) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void resume() {
        // TODO Auto-generated method stub
        
    }

}
