package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.delp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class TransactionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TransactionInfo> CREATOR = new delp();
    int a;
    String b;
    String c;

    private TransactionInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.m(parcel, 2, this.b, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.c(parcel, iA);
    }

    public TransactionInfo(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }
}
