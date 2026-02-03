package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.delw;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class GetBuyFlowInitializationTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetBuyFlowInitializationTokenRequest> CREATOR = new delw();
    byte[] a;
    byte[] b;

    public GetBuyFlowInitializationTokenRequest(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.f(parcel, 2, this.a, false);
        dclw.f(parcel, 3, this.b, false);
        dclw.c(parcel, iA);
    }

    GetBuyFlowInitializationTokenRequest() {
        this(null, null);
    }
}
