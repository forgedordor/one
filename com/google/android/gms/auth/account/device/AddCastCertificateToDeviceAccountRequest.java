package com.google.android.gms.auth.account.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbnz;
import defpackage.dclh;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AddCastCertificateToDeviceAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AddCastCertificateToDeviceAccountRequest> CREATOR = new dbnz();
    public final String a;
    public final byte[][] b;

    public AddCastCertificateToDeviceAccountRequest(String str, byte[][] bArr) {
        dclh.k(str);
        this.a = str;
        dclh.m(bArr);
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.q(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}
