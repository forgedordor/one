package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import defpackage.dclw;
import defpackage.demm;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class WalletFragmentInitParams extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<WalletFragmentInitParams> CREATOR = new demm();
    public String a;
    public MaskedWalletRequest b;
    public final int c;
    public MaskedWallet d;

    private WalletFragmentInitParams() {
        this.c = -1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, this.a, false);
        dclw.k(parcel, 3, this.b, i, false);
        dclw.i(parcel, 4, this.c);
        dclw.k(parcel, 5, this.d, i, false);
        dclw.c(parcel, iA);
    }

    public WalletFragmentInitParams(String str, MaskedWalletRequest maskedWalletRequest, int i, MaskedWallet maskedWallet) {
        this.a = str;
        this.b = maskedWalletRequest;
        this.c = i;
        this.d = maskedWallet;
    }
}
