package com.pablomunuera.droptutorial;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import com.badlogic.gdx.Gdx;

public class DropGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	float x=0;
	float y=0;
	float vx = 5.0f;
	float vy = 5.0f;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		//CALCULA
		if(y>Gdx.graphics.getHeight() || y<0){
			vy=-vy;
		}
		if(x>Gdx.graphics.getWidth() || x<0){
			vx=-vx;
		}
		x=x+vx;
		y=y+vy;

		//PINTA
		ScreenUtils.clear(1, 1, 0, 1);
		batch.begin();
		batch.draw(img, x, y);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
