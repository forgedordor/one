package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dekz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InstrumentInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<InstrumentInfo> CREATOR = new dekz();
    public String a;
    public String b;
    private int c;

    private InstrumentInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, this.a, false);
        dclw.m(parcel, 3, this.b, false);
        int i2 = this.c;
        dclw.i(parcel, 4, (i2 == 1 || i2 == 2 || i2 == 3) ? i2 : 0);
        dclw.c(parcel, iA);
    }

    public InstrumentInfo(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }
}
