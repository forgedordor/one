package com.google.android.gms.auth.firstparty.shared;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbtl;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CaptchaChallenge extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CaptchaChallenge> CREATOR = new dbtl();
    final String a;
    final String b;
    final Bitmap c;

    public CaptchaChallenge(String str, String str2, Bitmap bitmap) {
        this.a = str;
        this.b = str2;
        this.c = bitmap;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, str, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.k(parcel, 4, this.c, i, false);
        dclw.c(parcel, iA);
    }
}
