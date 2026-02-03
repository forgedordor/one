package com.google.android.gms.people.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddxh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SyncStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SyncStatus> CREATOR = new ddxh();
    public final int a;
    public final String b;
    public final long c;

    public SyncStatus(int i, String str, long j) {
        this.a = i;
        this.b = str;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, i2);
        dclw.m(parcel, 3, this.b, false);
        dclw.j(parcel, 4, this.c);
        dclw.c(parcel, iA);
    }
}
