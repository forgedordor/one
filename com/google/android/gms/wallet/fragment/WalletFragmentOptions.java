package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.demn;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class WalletFragmentOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<WalletFragmentOptions> CREATOR = new demn();
    public final int a;
    public int b;
    public final WalletFragmentStyle c;
    public int d;

    public WalletFragmentOptions(int i, int i2, WalletFragmentStyle walletFragmentStyle, int i3) {
        this.a = i;
        this.b = i2;
        this.c = walletFragmentStyle;
        this.d = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, this.a);
        dclw.i(parcel, 3, this.b);
        dclw.k(parcel, 4, this.c, i, false);
        dclw.i(parcel, 5, this.d);
        dclw.c(parcel, iA);
    }

    private WalletFragmentOptions() {
        this.a = 3;
        this.c = new WalletFragmentStyle();
    }
}
