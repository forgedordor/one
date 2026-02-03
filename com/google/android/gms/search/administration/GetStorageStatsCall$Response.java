package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcfx;
import defpackage.dclw;
import defpackage.debd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetStorageStatsCall$Response extends AbstractSafeParcelable implements dcfx {
    public static final Parcelable.Creator<GetStorageStatsCall$Response> CREATOR = new debd();
    public Status a;
    public GetStorageStatsCall$PackageStats[] b;
    public long c;
    public long d;
    public long e;

    public GetStorageStatsCall$Response() {
    }

    @Override // defpackage.dcfx
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.E(parcel, 2, this.b, i);
        dclw.j(parcel, 3, this.c);
        dclw.j(parcel, 4, this.d);
        dclw.j(parcel, 5, this.e);
        dclw.c(parcel, iA);
    }

    public GetStorageStatsCall$Response(Status status, GetStorageStatsCall$PackageStats[] getStorageStatsCall$PackageStatsArr, long j, long j2, long j3) {
        this.a = status;
        this.b = getStorageStatsCall$PackageStatsArr;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }
}
