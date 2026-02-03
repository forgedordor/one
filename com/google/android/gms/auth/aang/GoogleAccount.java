package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbnm;
import defpackage.dclc;
import defpackage.dclw;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GoogleAccount extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleAccount> CREATOR = new dbnm();
    public final String a;
    public final String b;
    public final String c;

    public GoogleAccount(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleAccount)) {
            return false;
        }
        GoogleAccount googleAccount = (GoogleAccount) obj;
        return dclc.a(this.a, googleAccount.a) && dclc.a(this.c, googleAccount.c) && dclc.a(this.b, googleAccount.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b});
    }

    public final String toString() {
        return "Account=" + this.c + ",obfuscated gaiaId=" + this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.c(parcel, iA);
    }
}
