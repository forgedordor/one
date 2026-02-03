package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.demw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LoyaltyPoints extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyPoints> CREATOR = new demw();
    String a;
    LoyaltyPointsBalance b;

    @Deprecated
    TimeInterval c;

    LoyaltyPoints() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, this.a, false);
        dclw.k(parcel, 3, this.b, i, false);
        dclw.k(parcel, 5, this.c, i, false);
        dclw.c(parcel, iA);
    }

    public LoyaltyPoints(String str, LoyaltyPointsBalance loyaltyPointsBalance, TimeInterval timeInterval) {
        this.a = str;
        this.b = loyaltyPointsBalance;
        this.c = timeInterval;
    }
}
