package com.example.adesk;

import java.io.FileDescriptor;
import java.io.PrintWriter;

import android.app.Activity;
import android.view.accessibility.AccessibilityEvent;

public class HaHaActivity extends Activity{

	@Override
	public void closeContextMenu() {
		// TODO Auto-generated method stub
		super.closeContextMenu();
	}

	@Override
<<<<<<< HEAD
	public void finish() {
		// TODO Auto-generated method stub
		super.finish();
=======
	public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
		// TODO Auto-generated method stub
		return super.dispatchPopulateAccessibilityEvent(event);
	}

	@Override
	public void dump(String prefix, FileDescriptor fd, PrintWriter writer,
			String[] args) {
		// TODO Auto-generated method stub
		super.dump(prefix, fd, writer, args);
	}

	@Override
	public String getLocalClassName() {
		// TODO Auto-generated method stub
		return super.getLocalClassName();
>>>>>>> master
	}


}
