package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.debb;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetStorageStatsCall$PackageStats extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetStorageStatsCall$PackageStats> CREATOR = new debb();
    public String a;
    public long b;
    public boolean c;
    public long d;

    public GetStorageStatsCall$PackageStats() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, this.a, false);
        dclw.j(parcel, 2, this.b);
        dclw.d(parcel, 3, this.c);
        dclw.j(parcel, 4, this.d);
        dclw.c(parcel, iA);
    }

    public GetStorageStatsCall$PackageStats(String str, long j, boolean z, long j2) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = j2;
    }
}
