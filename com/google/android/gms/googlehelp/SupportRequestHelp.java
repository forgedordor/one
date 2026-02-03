package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddco;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SupportRequestHelp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SupportRequestHelp> CREATOR = new ddco();
    public final GoogleHelp a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public SupportRequestHelp(GoogleHelp googleHelp, String str, String str2, String str3, String str4) {
        this.a = googleHelp;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.m(parcel, 4, this.d, false);
        dclw.m(parcel, 5, this.e, false);
        dclw.c(parcel, iA);
    }
}
