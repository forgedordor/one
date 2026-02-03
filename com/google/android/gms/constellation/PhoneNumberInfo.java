package com.google.android.gms.constellation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dcol;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PhoneNumberInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PhoneNumberInfo> CREATOR = new dcol();
    public final int a;
    public final String b;
    public final Long c;
    public final Bundle d;

    public PhoneNumberInfo(int i, String str, Long l, Bundle bundle) {
        this.a = i;
        this.b = str;
        this.c = l;
        this.d = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.m(parcel, 2, this.b, false);
        dclw.A(parcel, 3, this.c);
        dclw.p(parcel, 4, this.d);
        dclw.c(parcel, iA);
    }
}
