package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.dczq;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class BrowserSignRequestParams extends BrowserRequestParams {
    public static final Parcelable.Creator<BrowserSignRequestParams> CREATOR = new dczq();
    public final SignRequestParams a;
    public final Uri b;

    public BrowserSignRequestParams(SignRequestParams signRequestParams, Uri uri) {
        dclh.m(signRequestParams);
        this.a = signRequestParams;
        dclh.m(uri);
        dclh.b(uri.getScheme() != null, "origin scheme must be non-empty");
        dclh.b(uri.getAuthority() != null, "origin authority must be non-empty");
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserSignRequestParams)) {
            return false;
        }
        BrowserSignRequestParams browserSignRequestParams = (BrowserSignRequestParams) obj;
        return dclc.a(this.a, browserSignRequestParams.a) && dclc.a(this.b, browserSignRequestParams.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SignRequestParams signRequestParams = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, signRequestParams, i, false);
        dclw.k(parcel, 3, this.b, i, false);
        dclw.c(parcel, iA);
    }
}
