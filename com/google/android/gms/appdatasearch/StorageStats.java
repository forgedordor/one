package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbji;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class StorageStats extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StorageStats> CREATOR = new dbji();
    public final RegisteredPackageInfo[] a;
    public final long b;
    public final long c;
    public final long d;

    public StorageStats(RegisteredPackageInfo[] registeredPackageInfoArr, long j, long j2, long j3) {
        this.a = registeredPackageInfoArr;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.E(parcel, 1, this.a, i);
        dclw.j(parcel, 2, this.b);
        dclw.j(parcel, 3, this.c);
        dclw.j(parcel, 4, this.d);
        dclw.c(parcel, iA);
    }
}
