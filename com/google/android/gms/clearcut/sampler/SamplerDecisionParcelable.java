package com.google.android.gms.clearcut.sampler;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcbw;
import defpackage.dclw;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SamplerDecisionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SamplerDecisionParcelable> CREATOR = new dcbw();
    public final boolean a;
    public final long b;

    public SamplerDecisionParcelable(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    public final Instant a() {
        return Instant.ofEpochMilli(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iA = dclw.a(parcel);
        dclw.d(parcel, 1, z);
        dclw.j(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}
