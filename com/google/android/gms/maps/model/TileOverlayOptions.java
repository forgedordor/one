package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.internal.ITileProviderDelegate;
import defpackage.dclw;
import defpackage.ddsg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new ddsg();
    public boolean a;
    public float b;
    public boolean c;
    public float d;
    private ITileProviderDelegate e;

    public TileOverlayOptions() {
        this.a = true;
        this.c = true;
        this.d = 0.0f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        ITileProviderDelegate iTileProviderDelegate = this.e;
        dclw.u(parcel, 2, iTileProviderDelegate == null ? null : iTileProviderDelegate.asBinder());
        dclw.d(parcel, 3, this.a);
        dclw.h(parcel, 4, this.b);
        dclw.d(parcel, 5, this.c);
        dclw.h(parcel, 6, this.d);
        dclw.c(parcel, iA);
    }

    public TileOverlayOptions(IBinder iBinder, boolean z, float f, boolean z2, float f2) {
        this.a = true;
        this.c = true;
        this.d = 0.0f;
        this.e = ITileProviderDelegate.Stub.asInterface(iBinder);
        this.a = z;
        this.b = f;
        this.c = z2;
        this.d = f2;
    }
}
