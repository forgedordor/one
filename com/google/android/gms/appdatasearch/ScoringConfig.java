package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbjc;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ScoringConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ScoringConfig> CREATOR = new dbjc();
    public final boolean a;

    public ScoringConfig(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScoringConfig) && this.a == ((ScoringConfig) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.d(parcel, 1, this.a);
        dclw.c(parcel, iA);
    }
}
