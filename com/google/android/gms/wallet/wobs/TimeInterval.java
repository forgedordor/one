package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.demy;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class TimeInterval extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TimeInterval> CREATOR = new demy();
    long a;
    long b;

    TimeInterval() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.j(parcel, 2, this.a);
        dclw.j(parcel, 3, this.b);
        dclw.c(parcel, iA);
    }

    public TimeInterval(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
