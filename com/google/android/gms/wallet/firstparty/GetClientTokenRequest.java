package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dely;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GetClientTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetClientTokenRequest> CREATOR = new dely();
    WalletCustomTheme a;
    boolean b;
    final int c;

    GetClientTokenRequest() {
        this.c = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, this.a, i, false);
        dclw.d(parcel, 3, this.b);
        dclw.i(parcel, 4, this.c);
        dclw.c(parcel, iA);
    }

    public GetClientTokenRequest(WalletCustomTheme walletCustomTheme, boolean z, int i) {
        this.a = walletCustomTheme;
        this.b = z;
        this.c = i;
        if (walletCustomTheme == null) {
            throw new NullPointerException("WalletCustomTheme is required");
        }
    }
}
