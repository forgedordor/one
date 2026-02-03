package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddcn;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class OfflineSuggestion extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OfflineSuggestion> CREATOR = new ddcn();
    final String a;
    final String b;
    final String c;
    final String d;

    public OfflineSuggestion(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str4;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, str, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.m(parcel, 4, this.c, false);
        dclw.m(parcel, 5, this.d, false);
        dclw.c(parcel, iA);
    }
}
