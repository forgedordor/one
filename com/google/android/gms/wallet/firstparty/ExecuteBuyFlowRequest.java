package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.delu;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ExecuteBuyFlowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ExecuteBuyFlowRequest> CREATOR = new delu();
    final byte[] a;
    final byte[] b;
    final WalletCustomTheme c;

    public ExecuteBuyFlowRequest(byte[] bArr, byte[] bArr2, WalletCustomTheme walletCustomTheme) {
        this.a = bArr;
        this.b = bArr2;
        this.c = walletCustomTheme;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int iA = dclw.a(parcel);
        dclw.f(parcel, 2, bArr, false);
        dclw.f(parcel, 3, this.b, false);
        dclw.k(parcel, 4, this.c, i, false);
        dclw.c(parcel, iA);
    }
}
