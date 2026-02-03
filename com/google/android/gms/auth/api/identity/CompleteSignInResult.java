package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbpx;
import defpackage.dclh;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CompleteSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CompleteSignInResult> CREATOR = new dbpx();
    public final SignInCredential a;

    public CompleteSignInResult(SignInCredential signInCredential) {
        dclh.m(signInCredential);
        this.a = signInCredential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SignInCredential signInCredential = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, signInCredential, i, false);
        dclw.c(parcel, iA);
    }
}
