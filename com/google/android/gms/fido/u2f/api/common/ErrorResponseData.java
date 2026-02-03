package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.dczv;
import defpackage.ejwf;
import defpackage.ejwg;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class ErrorResponseData extends ResponseData {
    public static final Parcelable.Creator<ErrorResponseData> CREATOR = new dczv();
    public final String a;
    private final ErrorCode b;

    public ErrorResponseData(int i, String str) {
        this.b = ErrorCode.a(i);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ErrorResponseData)) {
            return false;
        }
        ErrorResponseData errorResponseData = (ErrorResponseData) obj;
        return dclc.a(this.b, errorResponseData.b) && dclc.a(this.a, errorResponseData.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.f("errorCode", this.b.g);
        String str = this.a;
        if (str != null) {
            ejwfVarB.b("errorMessage", str);
        }
        return ejwfVarB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, this.b.g);
        dclw.m(parcel, 3, this.a, false);
        dclw.c(parcel, iA);
    }
}
