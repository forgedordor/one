package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbsm;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetAndAdvanceOtpCounterResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetAndAdvanceOtpCounterResponse> CREATOR = new dbsm();
    final int a;
    public final Long b;

    public GetAndAdvanceOtpCounterResponse(int i, Long l) {
        this.a = i;
        this.b = l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.A(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}
