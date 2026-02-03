package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.dclw;
import defpackage.ddrc;
import defpackage.ddrx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class StampStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StampStyle> CREATOR = new ddrx();
    protected final ddrc a;

    public StampStyle(IBinder iBinder) {
        this.a = new ddrc(IObjectWrapper.Stub.asInterface(iBinder));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.u(parcel, 2, this.a.a.asBinder());
        dclw.c(parcel, iA);
    }
}
