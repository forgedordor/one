package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddpy;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SendDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SendDataRequest> CREATOR = new ddpy();
    public final String a;
    public final byte[] b;

    public SendDataRequest(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.f(parcel, 2, this.b, false);
        dclw.c(parcel, iA);
    }
}
