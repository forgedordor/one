package com.google.android.gms.auth.api.accounttransfer.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbop;
import defpackage.dclh;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RetrieveDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RetrieveDataRequest> CREATOR = new dbop();
    public final String a;

    public RetrieveDataRequest(String str) {
        dclh.m(str);
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, 1);
        dclw.m(parcel, 2, this.a, false);
        dclw.c(parcel, iA);
    }
}
