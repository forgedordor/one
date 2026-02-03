package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.demt;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LabelValue extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LabelValue> CREATOR = new demt();
    String a;
    String b;

    LabelValue() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, this.a, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.c(parcel, iA);
    }

    public LabelValue(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
