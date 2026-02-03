package com.google.android.gms.googlehelp.internal.common;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dddm;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class OverflowMenuItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OverflowMenuItem> CREATOR = new dddm();
    final int a;
    final String b;
    final Intent c;

    public OverflowMenuItem(int i, String str, Intent intent) {
        this.a = i;
        this.b = str;
        this.c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, this.a);
        dclw.m(parcel, 3, this.b, false);
        dclw.k(parcel, 4, this.c, i, false);
        dclw.c(parcel, iA);
    }
}
