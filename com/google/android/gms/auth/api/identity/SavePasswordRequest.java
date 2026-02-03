package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbql;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class SavePasswordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new dbql();
    public final SignInPassword a;
    public final String b;
    public final int c;

    public SavePasswordRequest(SignInPassword signInPassword, String str, int i) {
        dclh.m(signInPassword);
        this.a = signInPassword;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        return dclc.a(this.a, savePasswordRequest.a) && dclc.a(this.b, savePasswordRequest.b) && this.c == savePasswordRequest.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SignInPassword signInPassword = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, signInPassword, i, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.i(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }
}
