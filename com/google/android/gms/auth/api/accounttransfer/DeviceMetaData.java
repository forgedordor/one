package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbom;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new dbom();
    final int a;
    public final boolean b;
    public final long c;
    public final boolean d;

    public DeviceMetaData(int i, boolean z, long j, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = j;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.d(parcel, 2, this.b);
        dclw.j(parcel, 3, this.c);
        dclw.d(parcel, 4, this.d);
        dclw.c(parcel, iA);
    }
}
