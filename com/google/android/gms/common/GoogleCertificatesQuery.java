package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.ICertData;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.dcec;
import defpackage.dced;
import defpackage.dcej;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GoogleCertificatesQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleCertificatesQuery> CREATOR = new dcej();
    public final String a;
    public final boolean b;
    public final boolean c;
    private final dcec d;

    public GoogleCertificatesQuery(String str, dcec dcecVar, boolean z, boolean z2) {
        this.a = str;
        this.d = dcecVar;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dcec dcecVar = this.d;
        if (dcecVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            dcecVar = null;
        }
        dclw.u(parcel, 2, dcecVar);
        dclw.d(parcel, 3, this.b);
        dclw.d(parcel, 4, this.c);
        dclw.c(parcel, iA);
    }

    public GoogleCertificatesQuery(String str, IBinder iBinder, boolean z, boolean z2) {
        this.a = str;
        dced dcedVar = null;
        if (iBinder != null) {
            try {
                IObjectWrapper bytesWrapped = ICertData.Stub.asInterface(iBinder).getBytesWrapped();
                byte[] bArr = bytesWrapped == null ? null : (byte[]) ObjectWrapper.unwrap(bytesWrapped);
                if (bArr != null) {
                    dcedVar = new dced(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.d = dcedVar;
        this.b = z;
        this.c = z2;
    }
}
