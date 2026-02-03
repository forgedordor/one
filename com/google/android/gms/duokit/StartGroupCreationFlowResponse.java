package com.google.android.gms.duokit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dcvb;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class StartGroupCreationFlowResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StartGroupCreationFlowResponse> CREATOR = new dcvb();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof StartGroupCreationFlowResponse);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dclw.c(parcel, dclw.a(parcel));
    }
}
