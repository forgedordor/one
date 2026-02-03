package com.google.android.gms.wallet.shared;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.demq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BuyFlowConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<BuyFlowConfig> CREATOR = new demq();
    String a;
    ApplicationParameters b;
    String c;
    String d;
    String e;
    String f;
    int g;

    BuyFlowConfig() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, this.a, false);
        dclw.k(parcel, 3, this.b, i, false);
        dclw.m(parcel, 4, this.c, false);
        dclw.m(parcel, 5, this.d, false);
        dclw.m(parcel, 6, TextUtils.isEmpty(this.e) ? this.c : this.e, false);
        dclw.m(parcel, 7, this.f, false);
        dclw.i(parcel, 8, this.g);
        dclw.c(parcel, iA);
    }

    public BuyFlowConfig(String str, ApplicationParameters applicationParameters, String str2, String str3, String str4, String str5, int i) {
        this.a = str;
        this.b = applicationParameters;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = i;
    }
}
