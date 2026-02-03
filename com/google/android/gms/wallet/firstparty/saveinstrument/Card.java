package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.demg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Card extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Card> CREATOR = new demg();
    String a;
    String b;
    int c;
    int d;

    private Card() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, this.a, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.i(parcel, 3, this.c);
        dclw.i(parcel, 4, this.d);
        dclw.c(parcel, iA);
    }

    public Card(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }
}
