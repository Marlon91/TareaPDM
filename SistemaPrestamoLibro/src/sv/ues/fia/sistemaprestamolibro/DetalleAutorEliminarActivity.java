package sv.ues.fia.sistemaprestamolibro;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class DetalleAutorEliminarActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detalle_autor_eliminar);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.detalle_autor_eliminar, menu);
		return true;
	}

}
