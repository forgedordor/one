package com.google.android.gms.feedback;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dcvz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AdditionalConsentConfig extends AbstractSafeParcelable {
    public static final dcvz CREATOR = new dcvz();
    final String a;
    final String b;
    final String c;
    final String d;
    final String e;
    final Bundle f;

    public AdditionalConsentConfig(String str, String str2, String str3, String str4, String str5, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, str, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.m(parcel, 4, this.c, false);
        dclw.m(parcel, 5, this.d, false);
        dclw.m(parcel, 6, this.e, false);
        dclw.p(parcel, 7, this.f);
        dclw.c(parcel, iA);
    }
}
