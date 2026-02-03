package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.delz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GetClientTokenResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetClientTokenResponse> CREATOR = new delz();
    public byte[] a;

    public GetClientTokenResponse(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.f(parcel, 2, this.a, false);
        dclw.c(parcel, iA);
    }

    GetClientTokenResponse() {
        this(new byte[0]);
    }
}
