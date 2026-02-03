package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.denm;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ConnectionDelayConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionDelayConfig> CREATOR = new denm();
    public final long a;
    public final long b;

    public ConnectionDelayConfig(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int iA = dclw.a(parcel);
        dclw.j(parcel, 1, j);
        dclw.j(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}
