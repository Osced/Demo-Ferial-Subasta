package com.example.example_shareprovider;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		 // Inflate menu resource file.
	    getMenuInflater().inflate(R.menu.main, menu);
		
		// Localizar el menú item
		MenuItem item = menu.findItem(R.id.action_share);

		// Creo el intent para compartir
		Intent intent = new Intent(Intent.ACTION_SEND);
		intent.setType("text/plain");
		intent.putExtra(Intent.EXTRA_TEXT, "¡Hola mundo!");

		// Indicarle qué intent tiene que lanzar
		ShareActionProvider  shareActionProvider = (ShareActionProvider) item.getActionProvider();       
		shareActionProvider.setShareIntent(intent);
		              
		return true;

	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {		
		return super.onOptionsItemSelected(item);
	}
}
