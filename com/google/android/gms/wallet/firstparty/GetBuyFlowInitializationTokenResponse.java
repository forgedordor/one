package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.delx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GetBuyFlowInitializationTokenResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetBuyFlowInitializationTokenResponse> CREATOR = new delx();
    byte[] a;

    public GetBuyFlowInitializationTokenResponse(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.f(parcel, 2, this.a, false);
        dclw.c(parcel, iA);
    }

    GetBuyFlowInitializationTokenResponse() {
        this(new byte[0]);
    }
}
