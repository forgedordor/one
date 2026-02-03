package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbpq;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AuthorizationResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthorizationResult> CREATOR = new dbpq();
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final GoogleSignInAccount e;
    public final PendingIntent f;

    public AuthorizationResult(String str, String str2, String str3, List list, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        dclh.m(list);
        this.d = list;
        this.f = pendingIntent;
        this.e = googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationResult)) {
            return false;
        }
        AuthorizationResult authorizationResult = (AuthorizationResult) obj;
        return dclc.a(this.a, authorizationResult.a) && dclc.a(this.b, authorizationResult.b) && dclc.a(this.c, authorizationResult.c) && dclc.a(this.d, authorizationResult.d) && dclc.a(this.f, authorizationResult.f) && dclc.a(this.e, authorizationResult.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.f, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.D(parcel, 4, this.d);
        dclw.k(parcel, 5, this.e, i, false);
        dclw.k(parcel, 6, this.f, i, false);
        dclw.c(parcel, iA);
    }
}
