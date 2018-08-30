package com.utec.ws;

import java.util.UUID;

public class Ciudad {

	private String mId;
	private String mNombre;
	private String mPais;
	private int mImagen;


	public Ciudad(String nombre, String pais, int imagen) {
        mId = UUID.randomUUID().toString();
        mNombre = nombre;
        mPais = pais;
        mImagen = imagen;
    }

    public String getId() {
        return mId;
    }

    public void setId(String mId) {
        this.mId = mId;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmNombre() {
        return mNombre;
    }

    public void setmNombre(String mNombre) {
        this.mNombre = mNombre;
    }

    public String getmPais() {
        return mPais;
    }

    public void setmPais(String mPais) {
        this.mPais = mPais;
    }

    public int getmImagen() {
		return mImagen;
	}

	public void setmImagen(int mImagen) {
		this.mImagen = mImagen;
	}

	@Override
    public String toString() {
        return "Ciudad{" +
                "mId='" + mId + '\'' +
                ", mNombre='" + mNombre + '\'' +
                ", mPais='" + mPais + 
                ", mImagen='" + mImagen + 
                '}';
    }
}

