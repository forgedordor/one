package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcfx;
import defpackage.dclw;
import defpackage.debw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetCurrentExperimentIdsCall$Response extends AbstractSafeParcelable implements dcfx {
    public static final Parcelable.Creator<GetCurrentExperimentIdsCall$Response> CREATOR = new debw();
    public Status a;
    public int[] b;

    public GetCurrentExperimentIdsCall$Response() {
    }

    @Override // defpackage.dcfx
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.v(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }

    public GetCurrentExperimentIdsCall$Response(Status status, int[] iArr) {
        this.a = status;
        this.b = iArr;
    }
}
