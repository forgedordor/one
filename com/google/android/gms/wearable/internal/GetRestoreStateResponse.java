package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.desi;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetRestoreStateResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetRestoreStateResponse> CREATOR = new desi();
    public final int a;
    public final int b;
    public final byte[] c;

    public GetRestoreStateResponse(int i, int i2, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.i(parcel, 2, this.b);
        dclw.f(parcel, 3, this.c, false);
        dclw.c(parcel, iA);
    }
}
