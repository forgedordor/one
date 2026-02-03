package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbqo;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class SignInPassword extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInPassword> CREATOR = new dbqo();
    public final String a;
    public final String b;

    public SignInPassword(String str, String str2) {
        dclh.n(str, "Account identifier cannot be null");
        String strTrim = str.trim();
        dclh.l(strTrim, "Account identifier cannot be empty");
        this.a = strTrim;
        dclh.k(str2);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        return dclc.a(this.a, signInPassword.a) && dclc.a(this.b, signInPassword.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.c(parcel, iA);
    }
}
