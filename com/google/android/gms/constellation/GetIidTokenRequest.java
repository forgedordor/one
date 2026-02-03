package com.google.android.gms.constellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dcoe;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetIidTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetIidTokenRequest> CREATOR = new dcoe();
    public final Long a;

    public GetIidTokenRequest(Long l) {
        this.a = l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.a;
        int iA = dclw.a(parcel);
        dclw.A(parcel, 1, l);
        dclw.c(parcel, iA);
    }
}
