package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.dczp;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class BrowserRegisterRequestParams extends BrowserRequestParams {
    public static final Parcelable.Creator<BrowserRegisterRequestParams> CREATOR = new dczp();
    public final RegisterRequestParams a;
    public final Uri b;

    public BrowserRegisterRequestParams(RegisterRequestParams registerRequestParams, Uri uri) {
        dclh.m(registerRequestParams);
        this.a = registerRequestParams;
        dclh.m(uri);
        dclh.b(uri.getScheme() != null, "origin scheme must be non-empty");
        dclh.b(uri.getAuthority() != null, "origin authority must be non-empty");
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserRegisterRequestParams)) {
            return false;
        }
        BrowserRegisterRequestParams browserRegisterRequestParams = (BrowserRegisterRequestParams) obj;
        return dclc.a(this.a, browserRegisterRequestParams.a) && dclc.a(this.b, browserRegisterRequestParams.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        RegisterRequestParams registerRequestParams = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, registerRequestParams, i, false);
        dclw.k(parcel, 3, this.b, i, false);
        dclw.c(parcel, iA);
    }
}
