package com.google.android.gms.carrierauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbxv;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class EAPAKAResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<EAPAKAResponse> CREATOR = new dbxv();
    public final String a;

    public EAPAKAResponse(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.c(parcel, iA);
    }
}
