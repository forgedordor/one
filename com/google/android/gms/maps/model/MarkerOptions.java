package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.dclw;
import defpackage.ddrc;
import defpackage.ddrq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new ddrq();
    public LatLng a;
    public String b;
    public String c;
    public float d;
    public float e;
    public boolean f;
    public boolean g;
    public boolean h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public int n;
    public int o;
    public String p;
    private ddrc q;
    private View r;

    public MarkerOptions() {
        this.d = 0.5f;
        this.e = 1.0f;
        this.g = true;
        this.h = false;
        this.i = 0.0f;
        this.j = 0.5f;
        this.k = 0.0f;
        this.l = 1.0f;
        this.n = 0;
    }

    /* JADX WARN: Type inference failed for: r6v19, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, this.a, i, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.m(parcel, 4, this.c, false);
        ddrc ddrcVar = this.q;
        dclw.u(parcel, 5, ddrcVar == null ? null : ddrcVar.a.asBinder());
        dclw.h(parcel, 6, this.d);
        dclw.h(parcel, 7, this.e);
        dclw.d(parcel, 8, this.f);
        dclw.d(parcel, 9, this.g);
        dclw.d(parcel, 10, this.h);
        dclw.h(parcel, 11, this.i);
        dclw.h(parcel, 12, this.j);
        dclw.h(parcel, 13, this.k);
        dclw.h(parcel, 14, this.l);
        dclw.h(parcel, 15, this.m);
        dclw.i(parcel, 17, this.n);
        dclw.u(parcel, 18, ObjectWrapper.wrap(this.r));
        dclw.i(parcel, 19, this.o);
        dclw.m(parcel, 20, this.p, false);
        dclw.c(parcel, iA);
    }

    public MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7, int i, IBinder iBinder2, int i2, String str3) {
        this.d = 0.5f;
        this.e = 1.0f;
        this.g = true;
        this.h = false;
        this.i = 0.0f;
        this.j = 0.5f;
        this.k = 0.0f;
        this.l = 1.0f;
        this.n = 0;
        this.a = latLng;
        this.b = str;
        this.c = str2;
        if (iBinder == null) {
            this.q = null;
        } else {
            this.q = new ddrc(IObjectWrapper.Stub.asInterface(iBinder));
        }
        this.d = f;
        this.e = f2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = f3;
        this.j = f4;
        this.k = f5;
        this.l = f6;
        this.m = f7;
        this.o = i2;
        this.n = i;
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(iBinder2);
        this.r = iObjectWrapperAsInterface != null ? (View) ObjectWrapper.unwrap(iObjectWrapperAsInterface) : null;
        this.p = str3;
    }
}
