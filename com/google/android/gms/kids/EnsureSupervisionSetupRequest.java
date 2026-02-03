package com.google.android.gms.kids;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddhn;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class EnsureSupervisionSetupRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<EnsureSupervisionSetupRequest> CREATOR = new ddhn();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof EnsureSupervisionSetupRequest);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dclw.c(parcel, dclw.a(parcel));
    }
}
