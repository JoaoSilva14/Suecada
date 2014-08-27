package com.example.suecada;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;
import android.widget.TextView;

public class ItalianaPontos extends ActionBarActivity {
	
	TableLayout t1,t2,t3,t4,t5;
	TextView j1,j2,j3,j4,j5;
	EditText p1,p2,p3,p4,p5;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_italiana_pontos);
		setUp();
		
		
		
	}
	
	
	
	private void doExit() {

	    AlertDialog.Builder alertDialog = new AlertDialog.Builder(
	            ItalianaPontos.this);

	    alertDialog.setPositiveButton("Sim", new OnClickListener() {

	        @Override
	        public void onClick(DialogInterface dialog, int which) {
	            finish();
	        }
	    });

	    alertDialog.setNegativeButton("Não", null);

	    alertDialog.setMessage("Tem a certeza que deseja sair?");
	    alertDialog.setTitle("Sueca Italiana");
	    alertDialog.show();
	}
	
	@Override
	public void onBackPressed() {

	    doExit();
	}
	
	
	public void setUp(){
		Intent intent = getIntent();
		j1 = (TextView)findViewById(R.id.tVj1);
		j2 = (TextView)findViewById(R.id.tVj2);
		j3 = (TextView)findViewById(R.id.tVj3);
		j4 = (TextView)findViewById(R.id.tVj4);
		j5 = (TextView)findViewById(R.id.tVj5);
		p1 = (EditText)findViewById(R.id.etp1);
		p2 = (EditText)findViewById(R.id.etp2);
		p3 = (EditText)findViewById(R.id.etp3);
		p4 = (EditText)findViewById(R.id.etp4);
		p5 = (EditText)findViewById(R.id.etp5);
		
		t1 = (TableLayout)findViewById(R.id.Tlj1);
		t2 = (TableLayout)findViewById(R.id.Tlj2);
		t3 = (TableLayout)findViewById(R.id.Tlj3);
		t4 = (TableLayout)findViewById(R.id.Tlj4);
		t5 = (TableLayout)findViewById(R.id.Tlj5);
		
		
	
		
		
		//Receber os nomes dos jogadores definidos na activity anterior
		String jogador1 = intent.getExtras().getString("jogador1");
		String jogador2 = intent.getExtras().getString("jogador2");
		String jogador3 = intent.getExtras().getString("jogador3");
		String jogador4 = intent.getExtras().getString("jogador4");
		String jogador5 = intent.getExtras().getString("jogador5");
		
		//Atribuir os nomes as respectivas textviews
		
		j1.setText(jogador1);
		j2.setText(jogador2);
		j3.setText(jogador3);
		j4.setText(jogador4);
		j5.setText(jogador5);
		
	}
	
	
	public TableLayout regulaTabelas(TableLayout tabela){
		
		 int j = tabela.getChildCount();
			    
		  if( j>=7) 
		        tabela.removeViewAt(0);

		return tabela;		
	}
	
	
	
	//Métodos para botoes de pontuaçao do jogador 1
	
	public void soma0j1(View view)
	{
		
		TableRow tr = new TableRow(this);
		tr.setId(10);
		tr.setLayoutParams(new LayoutParams(
		(LayoutParams.MATCH_PARENT),
		LayoutParams.WRAP_CONTENT));
		
		TextView tvp = new TextView(this);
		tvp.setGravity(1);
		tvp.setId(20);
		tvp.setText(p1.getText().toString());
		tvp.setPadding(5, 5, 5, 5);
        tr.addView(tvp);// add the column to the table row here
        

        t1.addView(tr, new TableLayout.LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT));
        
        regulaTabelas(t1);
 
	}
	
	public void soma1j1(View view)
	{
		int pontos1;
		int soma;
		String resultado;
		
		pontos1=Integer.valueOf(p1.getText().toString());
		soma=pontos1+1;
		resultado=Integer.toString(soma);
		p1.setText(resultado);
		
		TableRow tr = new TableRow(this);
		tr.setId(10);
		tr.setLayoutParams(new LayoutParams(
		(LayoutParams.MATCH_PARENT),
		LayoutParams.WRAP_CONTENT));
		
		TextView tvp = new TextView(this);
		tvp.setGravity(1);
		tvp.setId(20);
		tvp.setText(p1.getText().toString());
		tvp.setTextColor(Color.GREEN);
		tvp.setPadding(5, 5, 5, 5);
        tr.addView(tvp);// add the column to the table row here
        

        t1.addView(tr, new TableLayout.LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT));
        
        regulaTabelas(t1);
 
	}
	
	public void soma2j1(View view)
	{
		int pontos1;
		int soma;
		String resultado;
		
		pontos1=Integer.valueOf(p1.getText().toString());
		soma=pontos1+2;
		resultado=Integer.toString(soma);
		p1.setText(resultado);
		
		TableRow tr = new TableRow(this);
		tr.setId(10);
		tr.setLayoutParams(new LayoutParams(
		(LayoutParams.MATCH_PARENT),
		LayoutParams.WRAP_CONTENT));
		
		TextView tvp = new TextView(this);
		tvp.setGravity(1);
		tvp.setId(20);
		tvp.setText(p1.getText().toString());
		tvp.setTextColor(Color.GREEN);
		tvp.setPadding(5, 5, 5, 5);
        tr.addView(tvp);// add the column to the table row here
        

        t1.addView(tr, new TableLayout.LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT));
        
        regulaTabelas(t1);
		
	}
	
	public void soma4j1(View view)
	{
		int pontos1;
		int soma;
		String resultado;
		
		pontos1=Integer.valueOf(p1.getText().toString());
		soma=pontos1+4;
		resultado=Integer.toString(soma);
		p1.setText(resultado);
		
		TableRow tr = new TableRow(this);
		tr.setId(10);
		tr.setLayoutParams(new LayoutParams(
		(LayoutParams.MATCH_PARENT),
		LayoutParams.WRAP_CONTENT));
		
		TextView tvp = new TextView(this);
		tvp.setGravity(1);
		tvp.setId(20);
		tvp.setText(p1.getText().toString());
		tvp.setTextColor(Color.GREEN);
		tvp.setPadding(5, 5, 5, 5);
        tr.addView(tvp);// add the column to the table row here
        

        t1.addView(tr, new TableLayout.LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT));
		
		regulaTabelas(t1);
	}
	
	public void sub1j1(View view)
	{
		int pontos1;
		int soma;
		String resultado;
		
		pontos1=Integer.valueOf(p1.getText().toString());
		soma=pontos1-1;
		resultado=Integer.toString(soma);
		p1.setText(resultado);
		
		TableRow tr = new TableRow(this);
		tr.setId(10);
		tr.setLayoutParams(new LayoutParams(
		(LayoutParams.MATCH_PARENT),
		LayoutParams.WRAP_CONTENT));
		
		TextView tvp = new TextView(this);
		tvp.setGravity(1);
		tvp.setId(20);
		tvp.setText(p1.getText().toString());
		tvp.setTextColor(Color.RED);
		tvp.setPadding(5, 5, 5, 5);
        tr.addView(tvp);// add the column to the table row here
        

        t1.addView(tr, new TableLayout.LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT));
		
		regulaTabelas(t1);
	}
	
	public void sub2j1(View view)
	{
		int pontos1;
		int soma;
		String resultado;
		
		pontos1=Integer.valueOf(p1.getText().toString());
		soma=pontos1-2;
		resultado=Integer.toString(soma);
		p1.setText(resultado);
		
		TableRow tr = new TableRow(this);
		tr.setId(10);
		tr.setLayoutParams(new LayoutParams(
		(LayoutParams.MATCH_PARENT),
		LayoutParams.WRAP_CONTENT));
		
		TextView tvp = new TextView(this);
		tvp.setGravity(1);
		tvp.setId(20);
		tvp.setText(p1.getText().toString());
		tvp.setTextColor(Color.RED);
		tvp.setPadding(5, 5, 5, 5);
        tr.addView(tvp);// add the column to the table row here
        

        t1.addView(tr, new TableLayout.LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT));
		
		regulaTabelas(t1);
	}
	
	public void sub4j1(View view)
	{
		int pontos1;
		int soma;
		String resultado;
		
		pontos1=Integer.valueOf(p1.getText().toString());
		soma=pontos1-4;
		resultado=Integer.toString(soma);
		p1.setText(resultado);
		
		TableRow tr = new TableRow(this);
		tr.setId(10);
		tr.setLayoutParams(new LayoutParams(
		(LayoutParams.MATCH_PARENT),
		LayoutParams.WRAP_CONTENT));
		
		TextView tvp = new TextView(this);
		tvp.setGravity(1);
		tvp.setId(20);
		tvp.setText(p1.getText().toString());
		tvp.setTextColor(Color.RED);
		tvp.setPadding(5, 5, 5, 5);
        tr.addView(tvp);// add the column to the table row here
        

        t1.addView(tr, new TableLayout.LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT));
		
		regulaTabelas(t1);
	}
	
	//Métodos p/ botoes j2
	
	public void soma0j2(View view)
	{
		
		TableRow tr = new TableRow(this);
		tr.setId(10);
		tr.setLayoutParams(new LayoutParams(
		(LayoutParams.MATCH_PARENT),
		LayoutParams.WRAP_CONTENT));
		
		TextView tvp = new TextView(this);
		tvp.setGravity(1);
		tvp.setId(20);
		tvp.setText(p2.getText().toString());
		tvp.setPadding(5, 5, 5, 5);
        tr.addView(tvp);// add the column to the table row here
        

        t2.addView(tr, new TableLayout.LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT));
        
        regulaTabelas(t2);
 
	}
	
	public void soma1j2(View view)
	{
		int pontos1;
		int soma;
		String resultado;
		
		pontos1=Integer.valueOf(p2.getText().toString());
		soma=pontos1+1;
		resultado=Integer.toString(soma);
		p2.setText(resultado);
		
		TableRow tr = new TableRow(this);
		tr.setId(10);
		tr.setLayoutParams(new LayoutParams(
		(LayoutParams.MATCH_PARENT),
		LayoutParams.WRAP_CONTENT));
		
		TextView tvp = new TextView(this);
		tvp.setGravity(1);
		tvp.setId(20);
		tvp.setText(p2.getText().toString());
		tvp.setTextColor(Color.GREEN);
		tvp.setPadding(5, 5, 5, 5);
        tr.addView(tvp);// add the column to the table row here
        

        t2.addView(tr, new TableLayout.LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT));
		
		regulaTabelas(t2);
		
	}
	
	public void soma2j2(View view)
	{
		int pontos1;
		int soma;
		String resultado;
		
		pontos1=Integer.valueOf(p2.getText().toString());
		soma=pontos1+2;
		resultado=Integer.toString(soma);
		p2.setText(resultado);
		
		TableRow tr = new TableRow(this);
		tr.setId(10);
		tr.setLayoutParams(new LayoutParams(
		(LayoutParams.MATCH_PARENT),
		LayoutParams.WRAP_CONTENT));
		
		TextView tvp = new TextView(this);
		tvp.setGravity(1);
		tvp.setId(20);
		tvp.setText(p2.getText().toString());
		tvp.setTextColor(Color.GREEN);
		tvp.setPadding(5, 5, 5, 5);
        tr.addView(tvp);// add the column to the table row here
        

        t2.addView(tr, new TableLayout.LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT));
		
		regulaTabelas(t2);
		
	}
	
	public void soma4j2(View view)
	{
		int pontos1;
		int soma;
		String resultado;
		
		pontos1=Integer.valueOf(p2.getText().toString());
		soma=pontos1+4;
		resultado=Integer.toString(soma);
		p2.setText(resultado);
		
		TableRow tr = new TableRow(this);
		tr.setId(10);
		tr.setLayoutParams(new LayoutParams(
		(LayoutParams.MATCH_PARENT),
		LayoutParams.WRAP_CONTENT));
		
		TextView tvp = new TextView(this);
		tvp.setGravity(1);
		tvp.setId(20);
		tvp.setText(p2.getText().toString());
		tvp.setTextColor(Color.GREEN);
		tvp.setPadding(5, 5, 5, 5);
        tr.addView(tvp);// add the column to the table row here
        

        t2.addView(tr, new TableLayout.LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT));
		
		regulaTabelas(t2);
		
	}
	
	public void sub1j2(View view)
	{
		int pontos1;
		int soma;
		String resultado;
		
		pontos1=Integer.valueOf(p2.getText().toString());
		soma=pontos1-1;
		resultado=Integer.toString(soma);
		p2.setText(resultado);
		
		TableRow tr = new TableRow(this);
		tr.setId(10);
		tr.setLayoutParams(new LayoutParams(
		(LayoutParams.MATCH_PARENT),
		LayoutParams.WRAP_CONTENT));
		
		TextView tvp = new TextView(this);
		tvp.setGravity(1);
		tvp.setId(20);
		tvp.setText(p2.getText().toString());
		tvp.setTextColor(Color.RED);
		tvp.setPadding(5, 5, 5, 5);
        tr.addView(tvp);// add the column to the table row here
        

        t2.addView(tr, new TableLayout.LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT));
		
		regulaTabelas(t2);
		
	}
	
	public void sub2j2(View view)
	{
		int pontos1;
		int soma;
		String resultado;
		
		pontos1=Integer.valueOf(p2.getText().toString());
		soma=pontos1-2;
		resultado=Integer.toString(soma);
		p2.setText(resultado);
		
		TableRow tr = new TableRow(this);
		tr.setId(10);
		tr.setLayoutParams(new LayoutParams(
		(LayoutParams.MATCH_PARENT),
		LayoutParams.WRAP_CONTENT));
		
		TextView tvp = new TextView(this);
		tvp.setGravity(1);
		tvp.setId(20);
		tvp.setText(p2.getText().toString());
		tvp.setTextColor(Color.RED);
		tvp.setPadding(5, 5, 5, 5);
        tr.addView(tvp);// add the column to the table row here
        

        t2.addView(tr, new TableLayout.LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT));
		
		regulaTabelas(t2);
		
	}
	
	public void sub4j2(View view)
	{
		int pontos1;
		int soma;
		String resultado;
		
		pontos1=Integer.valueOf(p2.getText().toString());
		soma=pontos1-4;
		resultado=Integer.toString(soma);
		p2.setText(resultado);
		
		TableRow tr = new TableRow(this);
		tr.setId(10);
		tr.setLayoutParams(new LayoutParams(
		(LayoutParams.MATCH_PARENT),
		LayoutParams.WRAP_CONTENT));
		
		TextView tvp = new TextView(this);
		tvp.setGravity(1);
		tvp.setId(20);
		tvp.setText(p2.getText().toString());
		tvp.setTextColor(Color.RED);
		tvp.setPadding(5, 5, 5, 5);
        tr.addView(tvp);// add the column to the table row here
        

        t2.addView(tr, new TableLayout.LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT));
		
		regulaTabelas(t2);
	}
	
	//Métodos p/ botoes j3
	
	
	public void soma0j3(View view)
	{
		
		TableRow tr = new TableRow(this);
		tr.setId(10);
		tr.setLayoutParams(new LayoutParams(
		(LayoutParams.MATCH_PARENT),
		LayoutParams.WRAP_CONTENT));
		
		TextView tvp = new TextView(this);
		tvp.setGravity(1);
		tvp.setId(20);
		tvp.setText(p3.getText().toString());
		tvp.setPadding(5, 5, 5, 5);
        tr.addView(tvp);// add the column to the table row here
        

        t3.addView(tr, new TableLayout.LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT));
        
        regulaTabelas(t3);
 
	}
	
		public void soma1j3(View view)
		{
			int pontos1;
			int soma;
			String resultado;
			
			pontos1=Integer.valueOf(p3.getText().toString());
			soma=pontos1+1;
			resultado=Integer.toString(soma);
			p3.setText(resultado);
			
			TableRow tr = new TableRow(this);
			tr.setId(10);
			tr.setLayoutParams(new LayoutParams(
			(LayoutParams.MATCH_PARENT),
			LayoutParams.WRAP_CONTENT));
			
			TextView tvp = new TextView(this);
			tvp.setGravity(1);
			tvp.setId(20);
			tvp.setText(p3.getText().toString());
			tvp.setTextColor(Color.GREEN);
			tvp.setPadding(5, 5, 5, 5);
	        tr.addView(tvp);// add the column to the table row here
	        

	        t3.addView(tr, new TableLayout.LayoutParams(
	                LayoutParams.MATCH_PARENT,
	                LayoutParams.WRAP_CONTENT));
			
			regulaTabelas(t3);
		}
		
		public void soma2j3(View view)
		{
			int pontos1;
			int soma;
			String resultado;
			
			pontos1=Integer.valueOf(p3.getText().toString());
			soma=pontos1+2;
			resultado=Integer.toString(soma);
			p3.setText(resultado);
			
			TableRow tr = new TableRow(this);
			tr.setId(10);
			tr.setLayoutParams(new LayoutParams(
			(LayoutParams.MATCH_PARENT),
			LayoutParams.WRAP_CONTENT));
			
			TextView tvp = new TextView(this);
			tvp.setGravity(1);
			tvp.setId(20);
			tvp.setText(p3.getText().toString());
			tvp.setTextColor(Color.GREEN);
			tvp.setPadding(5, 5, 5, 5);
	        tr.addView(tvp);// add the column to the table row here
	        

	        t3.addView(tr, new TableLayout.LayoutParams(
	                LayoutParams.MATCH_PARENT,
	                LayoutParams.WRAP_CONTENT));
			
			regulaTabelas(t3);
			
		}
		
		public void soma4j3(View view)
		{
			int pontos1;
			int soma;
			String resultado;
			
			pontos1=Integer.valueOf(p3.getText().toString());
			soma=pontos1+4;
			resultado=Integer.toString(soma);
			p3.setText(resultado);
			
			TableRow tr = new TableRow(this);
			tr.setId(10);
			tr.setLayoutParams(new LayoutParams(
			(LayoutParams.MATCH_PARENT),
			LayoutParams.WRAP_CONTENT));
			
			TextView tvp = new TextView(this);
			tvp.setGravity(1);
			tvp.setId(20);
			tvp.setText(p3.getText().toString());
			tvp.setTextColor(Color.GREEN);
			tvp.setPadding(5, 5, 5, 5);
	        tr.addView(tvp);// add the column to the table row here
	        

	        t3.addView(tr, new TableLayout.LayoutParams(
	                LayoutParams.MATCH_PARENT,
	                LayoutParams.WRAP_CONTENT));
			
			regulaTabelas(t3);
		}
		
		public void sub1j3(View view)
		{
			int pontos1;
			int soma;
			String resultado;
			
			pontos1=Integer.valueOf(p3.getText().toString());
			soma=pontos1-1;
			resultado=Integer.toString(soma);
			p3.setText(resultado);
			
			TableRow tr = new TableRow(this);
			tr.setId(10);
			tr.setLayoutParams(new LayoutParams(
			(LayoutParams.MATCH_PARENT),
			LayoutParams.WRAP_CONTENT));
			
			TextView tvp = new TextView(this);
			tvp.setGravity(1);
			tvp.setId(20);
			tvp.setText(p3.getText().toString());
			tvp.setTextColor(Color.RED);
			tvp.setPadding(5, 5, 5, 5);
	        tr.addView(tvp);// add the column to the table row here
	        

	        t3.addView(tr, new TableLayout.LayoutParams(
	                LayoutParams.MATCH_PARENT,
	                LayoutParams.WRAP_CONTENT));
			
			regulaTabelas(t3);
		}
		
		public void sub2j3(View view)
		{
			int pontos1;
			int soma;
			String resultado;
			
			pontos1=Integer.valueOf(p3.getText().toString());
			soma=pontos1-2;
			resultado=Integer.toString(soma);
			p3.setText(resultado);
			
			TableRow tr = new TableRow(this);
			tr.setId(10);
			tr.setLayoutParams(new LayoutParams(
			(LayoutParams.MATCH_PARENT),
			LayoutParams.WRAP_CONTENT));
			
			TextView tvp = new TextView(this);
			tvp.setGravity(1);
			tvp.setId(20);
			tvp.setText(p3.getText().toString());
			tvp.setTextColor(Color.RED);
			tvp.setPadding(5, 5, 5, 5);
	        tr.addView(tvp);// add the column to the table row here
	        

	        t3.addView(tr, new TableLayout.LayoutParams(
	                LayoutParams.MATCH_PARENT,
	                LayoutParams.WRAP_CONTENT));
			
			regulaTabelas(t3);
			
		}
		
		public void sub4j3(View view)
		{
			int pontos1;
			int soma;
			String resultado;
			
			pontos1=Integer.valueOf(p3.getText().toString());
			soma=pontos1-4;
			resultado=Integer.toString(soma);
			p3.setText(resultado);
			
			TableRow tr = new TableRow(this);
			tr.setId(10);
			tr.setLayoutParams(new LayoutParams(
			(LayoutParams.MATCH_PARENT),
			LayoutParams.WRAP_CONTENT));
			
			TextView tvp = new TextView(this);
			tvp.setGravity(1);
			tvp.setId(20);
			tvp.setText(p3.getText().toString());
			tvp.setTextColor(Color.RED);
			tvp.setPadding(5, 5, 5, 5);
	        tr.addView(tvp);// add the column to the table row here
	        

	        t3.addView(tr, new TableLayout.LayoutParams(
	                LayoutParams.MATCH_PARENT,
	                LayoutParams.WRAP_CONTENT));
			
			regulaTabelas(t3);
			
		}

		//Métodos p/ botoes j4
		
		public void soma0j4(View view)
		{
			
			TableRow tr = new TableRow(this);
			tr.setId(10);
			tr.setLayoutParams(new LayoutParams(
			(LayoutParams.MATCH_PARENT),
			LayoutParams.WRAP_CONTENT));
			
			TextView tvp = new TextView(this);
			tvp.setGravity(1);
			tvp.setId(20);
			tvp.setText(p4.getText().toString());
			tvp.setPadding(5, 5, 5, 5);
	        tr.addView(tvp);// add the column to the table row here
	        

	        t4.addView(tr, new TableLayout.LayoutParams(
	                LayoutParams.MATCH_PARENT,
	                LayoutParams.WRAP_CONTENT));
	        
	        regulaTabelas(t4);
	 
		}
		
			public void soma1j4(View view)
			{
				int pontos1;
				int soma;
				String resultado;
				
				pontos1=Integer.valueOf(p4.getText().toString());
				soma=pontos1+1;
				resultado=Integer.toString(soma);
				p4.setText(resultado);
				
				TableRow tr = new TableRow(this);
				tr.setId(10);
				tr.setLayoutParams(new LayoutParams(
				(LayoutParams.MATCH_PARENT),
				LayoutParams.WRAP_CONTENT));
				
				TextView tvp = new TextView(this);
				tvp.setGravity(1);
				tvp.setId(20);
				tvp.setText(p4.getText().toString());
				tvp.setTextColor(Color.GREEN);
				tvp.setPadding(5, 5, 5, 5);
		        tr.addView(tvp);// add the column to the table row here
		        

		        t4.addView(tr, new TableLayout.LayoutParams(
		                LayoutParams.MATCH_PARENT,
		                LayoutParams.WRAP_CONTENT));
				
				regulaTabelas(t4);
				
			}
			
			public void soma2j4(View view)
			{
				int pontos1;
				int soma;
				String resultado;
				
				pontos1=Integer.valueOf(p4.getText().toString());
				soma=pontos1+2;
				resultado=Integer.toString(soma);
				p4.setText(resultado);
				
				TableRow tr = new TableRow(this);
				tr.setId(10);
				tr.setLayoutParams(new LayoutParams(
				(LayoutParams.MATCH_PARENT),
				LayoutParams.WRAP_CONTENT));
				
				TextView tvp = new TextView(this);
				tvp.setGravity(1);
				tvp.setId(20);
				tvp.setText(p4.getText().toString());
				tvp.setTextColor(Color.GREEN);
				tvp.setPadding(5, 5, 5, 5);
		        tr.addView(tvp);// add the column to the table row here
		        

		        t4.addView(tr, new TableLayout.LayoutParams(
		                LayoutParams.MATCH_PARENT,
		                LayoutParams.WRAP_CONTENT));
				
				regulaTabelas(t4);
				
			}
			
			public void soma4j4(View view)
			{
				int pontos1;
				int soma;
				String resultado;
				
				pontos1=Integer.valueOf(p4.getText().toString());
				soma=pontos1+4;
				resultado=Integer.toString(soma);
				p4.setText(resultado);
				
				TableRow tr = new TableRow(this);
				tr.setId(10);
				tr.setLayoutParams(new LayoutParams(
				(LayoutParams.MATCH_PARENT),
				LayoutParams.WRAP_CONTENT));
				
				TextView tvp = new TextView(this);
				tvp.setGravity(1);
				tvp.setId(20);
				tvp.setText(p4.getText().toString());
				tvp.setTextColor(Color.GREEN);
				tvp.setPadding(5, 5, 5, 5);
		        tr.addView(tvp);// add the column to the table row here
		        

		        t4.addView(tr, new TableLayout.LayoutParams(
		                LayoutParams.MATCH_PARENT,
		                LayoutParams.WRAP_CONTENT));
				
				regulaTabelas(t4);
			}
			
			public void sub1j4(View view)
			{
				int pontos1;
				int soma;
				String resultado;
				
				pontos1=Integer.valueOf(p4.getText().toString());
				soma=pontos1-1;
				resultado=Integer.toString(soma);
				p4.setText(resultado);
				
				TableRow tr = new TableRow(this);
				tr.setId(10);
				tr.setLayoutParams(new LayoutParams(
				(LayoutParams.MATCH_PARENT),
				LayoutParams.WRAP_CONTENT));
				
				TextView tvp = new TextView(this);
				tvp.setGravity(1);
				tvp.setId(20);
				tvp.setText(p4.getText().toString());
				tvp.setTextColor(Color.RED);
				tvp.setPadding(5, 5, 5, 5);
		        tr.addView(tvp);// add the column to the table row here
		        

		        t4.addView(tr, new TableLayout.LayoutParams(
		                LayoutParams.MATCH_PARENT,
		                LayoutParams.WRAP_CONTENT));
				
				regulaTabelas(t4);
			}
			
			public void sub2j4(View view)
			{
				int pontos1;
				int soma;
				String resultado;
				
				pontos1=Integer.valueOf(p4.getText().toString());
				soma=pontos1-2;
				resultado=Integer.toString(soma);
				p4.setText(resultado);
				
				TableRow tr = new TableRow(this);
				tr.setId(10);
				tr.setLayoutParams(new LayoutParams(
				(LayoutParams.MATCH_PARENT),
				LayoutParams.WRAP_CONTENT));
				
				TextView tvp = new TextView(this);
				tvp.setGravity(1);
				tvp.setId(20);
				tvp.setText(p4.getText().toString());
				tvp.setTextColor(Color.RED);
				tvp.setPadding(5, 5, 5, 5);
		        tr.addView(tvp);// add the column to the table row here
		        

		        t4.addView(tr, new TableLayout.LayoutParams(
		                LayoutParams.MATCH_PARENT,
		                LayoutParams.WRAP_CONTENT));
				
				regulaTabelas(t4);
				
			}
			
			public void sub4j4(View view)
			{
				int pontos1;
				int soma;
				String resultado;
				
				pontos1=Integer.valueOf(p4.getText().toString());
				soma=pontos1-4;
				resultado=Integer.toString(soma);
				p4.setText(resultado);
				
				TableRow tr = new TableRow(this);
				tr.setId(10);
				tr.setLayoutParams(new LayoutParams(
				(LayoutParams.MATCH_PARENT),
				LayoutParams.WRAP_CONTENT));
				
				TextView tvp = new TextView(this);
				tvp.setGravity(1);
				tvp.setId(20);
				tvp.setText(p4.getText().toString());
				tvp.setTextColor(Color.RED);
				tvp.setPadding(5, 5, 5, 5);
		        tr.addView(tvp);// add the column to the table row here
		        

		        t4.addView(tr, new TableLayout.LayoutParams(
		                LayoutParams.MATCH_PARENT,
		                LayoutParams.WRAP_CONTENT));
				
				regulaTabelas(t4);
			}
			
			//Métodos p/ botoes j5
			
			public void soma0j5(View view)
			{
				
				TableRow tr = new TableRow(this);
				tr.setId(10);
				tr.setLayoutParams(new LayoutParams(
				(LayoutParams.MATCH_PARENT),
				LayoutParams.WRAP_CONTENT));
				
				TextView tvp = new TextView(this);
				tvp.setGravity(1);
				tvp.setId(20);
				tvp.setText(p5.getText().toString());
				tvp.setPadding(5, 5, 5, 5);
		        tr.addView(tvp);// add the column to the table row here
		        

		        t5.addView(tr, new TableLayout.LayoutParams(
		                LayoutParams.MATCH_PARENT,
		                LayoutParams.WRAP_CONTENT));
		        
		        regulaTabelas(t5);
		 
			}
			
			public void soma1j5(View view)
			{
				int pontos1;
				int soma;
				String resultado;
				
				pontos1=Integer.valueOf(p5.getText().toString());
				soma=pontos1+1;
				resultado=Integer.toString(soma);
				p5.setText(resultado);
				
				TableRow tr = new TableRow(this);
				tr.setId(10);
				tr.setLayoutParams(new LayoutParams(
				(LayoutParams.MATCH_PARENT),
				LayoutParams.WRAP_CONTENT));
				
				TextView tvp = new TextView(this);
				tvp.setGravity(1);
				tvp.setId(20);
				tvp.setText(p5.getText().toString());
				tvp.setTextColor(Color.GREEN);
				tvp.setPadding(5, 5, 5, 5);
		        tr.addView(tvp);// add the column to the table row here
		        

		        t5.addView(tr, new TableLayout.LayoutParams(
		                LayoutParams.MATCH_PARENT,
		                LayoutParams.WRAP_CONTENT));
				
				regulaTabelas(t5);
			}
			
			public void soma2j5(View view)
			{
				int pontos1;
				int soma;
				String resultado;
				
				pontos1=Integer.valueOf(p5.getText().toString());
				soma=pontos1+2;
				resultado=Integer.toString(soma);
				p5.setText(resultado);
				
				TableRow tr = new TableRow(this);
				tr.setId(10);
				tr.setLayoutParams(new LayoutParams(
				(LayoutParams.MATCH_PARENT),
				LayoutParams.WRAP_CONTENT));
				
				TextView tvp = new TextView(this);
				tvp.setGravity(1);
				tvp.setId(20);
				tvp.setText(p5.getText().toString());
				tvp.setTextColor(Color.GREEN);
				tvp.setPadding(5, 5, 5, 5);
		        tr.addView(tvp);// add the column to the table row here
		        

		        t5.addView(tr, new TableLayout.LayoutParams(
		                LayoutParams.MATCH_PARENT,
		                LayoutParams.WRAP_CONTENT));
				
				regulaTabelas(t5);
				
			}
			
			public void soma4j5(View view)
			{
				int pontos1;
				int soma;
				String resultado;
				
				pontos1=Integer.valueOf(p5.getText().toString());
				soma=pontos1+4;
				resultado=Integer.toString(soma);
				p5.setText(resultado);
				
				TableRow tr = new TableRow(this);
				tr.setId(10);
				tr.setLayoutParams(new LayoutParams(
				(LayoutParams.MATCH_PARENT),
				LayoutParams.WRAP_CONTENT));
				
				TextView tvp = new TextView(this);
				tvp.setGravity(1);
				tvp.setId(20);
				tvp.setText(p5.getText().toString());
				tvp.setTextColor(Color.GREEN);
				tvp.setPadding(5, 5, 5, 5);
		        tr.addView(tvp);// add the column to the table row here
		        

		        t5.addView(tr, new TableLayout.LayoutParams(
		                LayoutParams.MATCH_PARENT,
		                LayoutParams.WRAP_CONTENT));
				
				regulaTabelas(t5);
			}
			
			public void sub1j5(View view)
			{
				int pontos1;
				int soma;
				String resultado;
				
				pontos1=Integer.valueOf(p5.getText().toString());
				soma=pontos1-1;
				resultado=Integer.toString(soma);
				p5.setText(resultado);
				
				TableRow tr = new TableRow(this);
				tr.setId(10);
				tr.setLayoutParams(new LayoutParams(
				(LayoutParams.MATCH_PARENT),
				LayoutParams.WRAP_CONTENT));
				
				TextView tvp = new TextView(this);
				tvp.setGravity(1);
				tvp.setId(20);
				tvp.setText(p5.getText().toString());
				tvp.setTextColor(Color.RED);
				tvp.setPadding(5, 5, 5, 5);
		        tr.addView(tvp);// add the column to the table row here
		        

		        t5.addView(tr, new TableLayout.LayoutParams(
		                LayoutParams.MATCH_PARENT,
		                LayoutParams.WRAP_CONTENT));
				
				regulaTabelas(t5);
			}
			
			public void sub2j5(View view)
			{
				int pontos1;
				int soma;
				String resultado;
				
				pontos1=Integer.valueOf(p5.getText().toString());
				soma=pontos1-2;
				resultado=Integer.toString(soma);
				p5.setText(resultado);
				
				TableRow tr = new TableRow(this);
				tr.setId(10);
				tr.setLayoutParams(new LayoutParams(
				(LayoutParams.MATCH_PARENT),
				LayoutParams.WRAP_CONTENT));
				
				TextView tvp = new TextView(this);
				tvp.setGravity(1);
				tvp.setId(20);
				tvp.setText(p5.getText().toString());
				tvp.setTextColor(Color.RED);
				tvp.setPadding(5, 5, 5, 5);
		        tr.addView(tvp);// add the column to the table row here
		        

		        t5.addView(tr, new TableLayout.LayoutParams(
		                LayoutParams.MATCH_PARENT,
		                LayoutParams.WRAP_CONTENT));
				
				regulaTabelas(t5);
				
			}
			
			public void sub4j5(View view)
			{
				int pontos1;
				int soma;
				String resultado;
				
				pontos1=Integer.valueOf(p5.getText().toString());
				soma=pontos1-4;
				resultado=Integer.toString(soma);
				p5.setText(resultado);
				
				TableRow tr = new TableRow(this);
				tr.setId(10);
				tr.setLayoutParams(new LayoutParams(
				(LayoutParams.MATCH_PARENT),
				LayoutParams.WRAP_CONTENT));
				
				TextView tvp = new TextView(this);
				tvp.setGravity(1);
				tvp.setId(20);
				tvp.setText(p5.getText().toString());
				tvp.setTextColor(Color.RED);
				tvp.setPadding(5, 5, 5, 5);
		        tr.addView(tvp);// add the column to the table row here
		        

		        t5.addView(tr, new TableLayout.LayoutParams(
		                LayoutParams.MATCH_PARENT,
		                LayoutParams.WRAP_CONTENT));
				
				regulaTabelas(t5);
			}
		
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.italiana_pontos, menu);
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
