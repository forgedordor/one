package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbow;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new dbow();
    public final String a;
    public final String b;

    public IdToken(String str, String str2) {
        dclh.b(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        dclh.b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return dclc.a(this.a, idToken.a) && dclc.a(this.b, idToken.b);
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
