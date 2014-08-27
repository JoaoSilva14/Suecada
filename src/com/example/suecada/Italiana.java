package com.example.suecada;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Italiana extends Activity {
	
	EditText j1, j2, j3, j4, j5;
	String j1n, j2n, j3n, j4n, j5n;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_italiana);

	}
	
	public Intent guardaNomes(View view){
		
		j1=(EditText) findViewById(R.id.etj1);
		j2=(EditText) findViewById(R.id.etj2);
		j3=(EditText) findViewById(R.id.etj3);
		j4=(EditText) findViewById(R.id.etj4);
		j5=(EditText) findViewById(R.id.etj5);
		
		
//		j1.setText("Jogador 1"); //Apagar
//		j2.setText("Jogador 2"); //""
//		j3.setText("Jogador 3"); //""
//		j4.setText("Jogador 4"); //""
//		j5.setText("Jogador 5"); //""
		
		j1n=j1.getText().toString();
		j2n=j2.getText().toString();
		j3n=j3.getText().toString();
		j4n=j4.getText().toString();
		j5n=j5.getText().toString();
		Intent i = new Intent(this, ItalianaPontos.class);
		
		if(j1n.equals("")||j2n.equals("")||j3n.equals("")||j4n.equals("")||j5n.equals("")){
		
			Toast.makeText(getApplicationContext(),"Preencha todos os campos!" ,
					   Toast.LENGTH_LONG).show();
		}
		else if(j1n.equals(j2n)||j1n.equals(j3n)||j1n.equals(j4n)||j1n.equals(j5n)||j2n.equals(j3n)
				||j2n.equals(j4n)||j2n.equals(j5n)||j3n.equals(j4n)||j3n.equals(j5n)||j4n.equals(j5n)){
			
			Toast.makeText(getApplicationContext(),"Nome de jogador repetido!" ,
					   Toast.LENGTH_LONG).show();
			
		}
		else{
			
			i.putExtra("jogador1", j1n);
			i.putExtra("jogador2", j2n);
			i.putExtra("jogador3", j3n);
			i.putExtra("jogador4", j4n);
			i.putExtra("jogador5", j5n);
			startActivity(i); 
				
			return i;
		}
		return null;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.italiana, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	

}
