package com.example.suecada;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;

public class Sueca extends Activity {

	NumberPicker npNos;
	NumberPicker npVos;
	TableLayout pontuacao;
	TextView tvNos,tvVos;
	Button reiniciar, bloquear;
	
	public void setUp(){
		
		bloquear = (Button) findViewById(R.id.btnBloquear);
		reiniciar = (Button) findViewById(R.id.btnReiniciar);
		npNos=(NumberPicker) findViewById(R.id.nPNos);
		npVos=(NumberPicker) findViewById(R.id.nPVos);
		pontuacao=(TableLayout) findViewById(R.id.tLPontos);
		String valores[] = {"0","1","2","4"};
		
		npNos.setMaxValue(3);
		npNos.setMinValue(0);
		npNos.setDisplayedValues(valores);
		
		npVos.setMaxValue(3);
		npVos.setMinValue(0);
		npVos.setDisplayedValues(valores);
		
		npNos.setWrapSelectorWheel(false);
		npVos.setWrapSelectorWheel(false);
		npNos.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
		npVos.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
		pontuacao.setClickable(false);
		
		npNos.setOnValueChangedListener(new OnValueChangeListener() {
		    @Override
		    public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
		        npVos.setValue(0);
		    }
		});
		
		npVos.setOnValueChangedListener(new OnValueChangeListener() {
		    @Override
		    public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
		        npNos.setValue(0);
		    }
		});
		
		
		
	}
	
	public void preencheTabela(){
		
		
		
		TableRow tr_head = new TableRow(this);
		tr_head.setId(10);
		tr_head.setBackgroundColor(Color.GRAY);
		tr_head.setLayoutParams(new LayoutParams(
		(LayoutParams.MATCH_PARENT),
		LayoutParams.WRAP_CONTENT));
		
		TextView titulo = new TextView(this);
		titulo.setGravity(1);
		titulo.setId(20);
		titulo.setText("PONTUAÇÃO");
		titulo.setTextColor(Color.WHITE);
		titulo.setPadding(5, 5, 5, 5);
        tr_head.addView(titulo);// add the column to the table row here
        

        pontuacao.addView(tr_head, new TableLayout.LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT));
        

	}
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sueca);
		setUp();
		preencheTabela();
		
	
	}
	

	private void doExit() {

	    AlertDialog.Builder alertDialog = new AlertDialog.Builder(
	            Sueca.this);

	    alertDialog.setPositiveButton("Sim", new OnClickListener() {

	        @Override
	        public void onClick(DialogInterface dialog, int which) {
	            finish();
	        }
	    });

	    alertDialog.setNegativeButton("Não", null);

	    alertDialog.setMessage("Tem a certeza que deseja sair?");
	    alertDialog.setTitle("Sueca");
	    alertDialog.show();
	}
	
	@Override
	public void onBackPressed() {

	    doExit();
	}
	
	
	public void tabela(View view){
		
	        	String pontos_nos;
	    		String pontos_vos;
	    		String quatro="4";
	    		pontos_nos=String.valueOf(npNos.getValue());
	    		pontos_vos=String.valueOf(npVos.getValue());
	    		tvNos = (TextView) findViewById(R.id.tvTotalNos);
	    		tvVos = (TextView) findViewById(R.id.tvTotalVos);
	    		int nos_inc,vos_inc;
	    		nos_inc=Integer.valueOf(tvNos.getText().toString());
	    		vos_inc=Integer.valueOf(tvVos.getText().toString());
	    		
	    		TableRow tr = new TableRow(this);
	    		tr.setId(20);
	    		tr.setGravity(Gravity.CENTER);
	    		tr.setLayoutParams(new LayoutParams(
	    		(LayoutParams.MATCH_PARENT),
	    		LayoutParams.WRAP_CONTENT));
	    		
	    		TextView nospontos = new TextView(this);
	    		nospontos.setGravity(Gravity.LEFT);
	    		nospontos.setId(20);
	    		
	    		if(pontos_nos.equals("3")){
	    			nospontos.setText(quatro);
	    			nos_inc+=4;
	    			tvNos.setText(Integer.toString(nos_inc));
	    			
	    		}
	    		else{
	    			nospontos.setText(pontos_nos);
	    			nos_inc+=Integer.valueOf(pontos_nos);
	    			tvNos.setText(Integer.toString(nos_inc));
	    		}
	    		
	    		nospontos.setPadding(5, 5, 5, 5);
	    		
	    		TextView vospontos = new TextView(this);
	    		vospontos.setLayoutParams(new LayoutParams(
	    	    		LayoutParams.WRAP_CONTENT,
	    	    		LayoutParams.MATCH_PARENT));
	    		vospontos.setGravity(Gravity.RIGHT);
	    		vospontos.setId(20);
	    		
	    		if(pontos_vos.equals("3")){
	    			vospontos.setText(quatro);
	    			vos_inc+=4;
	    			tvVos.setText(Integer.toString(vos_inc));
	    		}
	    		else{
	    		vospontos.setText(pontos_vos);
	    		vos_inc+=Integer.valueOf(pontos_vos);
    			tvVos.setText(Integer.toString(vos_inc));
	    		
	    		}
	    		vospontos.setPadding(5, 5, 5, 5);
	    		
	            tr.addView(nospontos);// add the column to the table row here
	    		tr.addView(vospontos);
	    		
	    		
	            pontuacao.addView(tr);
	            
	            final ScrollView scrollview = ((ScrollView) findViewById(R.id.ScrollView01));
	            scrollview.post(new Runnable() {
	                @Override
	                public void run() {
	                    scrollview.fullScroll(ScrollView.FOCUS_DOWN);
	                }
	            });
	            
	            npNos.setValue(0);
	            npVos.setValue(0);
	        	
	        
	}
	
	public void reiniciar(View v){
		npNos.setValue(0);
		npVos.setValue(0);
		tvVos.setText("0");
		tvNos.setText("0");
		
		pontuacao.removeAllViews();
		preencheTabela();
		
	}
	
	public void anular(View v){
		
		  int ultima_linha=pontuacao.getChildCount();
		  int prev_nos;
		  int prev_vos;
		  
		  
		  
		  if (ultima_linha==1){
			  Toast.makeText(getApplicationContext(),"A tabela está vazia!" ,
					   Toast.LENGTH_LONG).show();
		  }
		  else{
			//Subtrair valor da ultima linha da tabela ao total
			  TableRow row1= (TableRow)pontuacao.getChildAt(ultima_linha-1);
			  TextView tv=(TextView) row1.getChildAt(0);
			  prev_nos=Integer.parseInt(tv.getText().toString());
			  
			  TextView tv1=(TextView) row1.getChildAt(1);
			  prev_vos=Integer.parseInt(tv1.getText().toString());
			  
			  tvNos = (TextView) findViewById(R.id.tvTotalNos);
	  		  tvVos = (TextView) findViewById(R.id.tvTotalVos);
	  		  int nos_inc,vos_inc;
	  		  nos_inc=Integer.valueOf(tvNos.getText().toString());
	  		  vos_inc=Integer.valueOf(tvVos.getText().toString());
	  		  
	  		  
	  		  tvVos.setText(String.valueOf(vos_inc-prev_vos));
	  		  tvNos.setText(String.valueOf(nos_inc-prev_nos));
	  		  
		      pontuacao.removeViewAt(ultima_linha-1);
		  }
		  
		 
		  
	}
		

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sueca, menu);
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
