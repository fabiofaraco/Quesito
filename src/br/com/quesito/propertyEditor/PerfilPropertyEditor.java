package br.com.quesito.propertyEditor;

import java.beans.PropertyEditorSupport;

import br.com.quesito.bean.Perfil;

public class PerfilPropertyEditor extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String text) {
		Perfil perfil = new Perfil();
		perfil.setId(Integer.parseInt(text));
		setValue(perfil);
	}

}
