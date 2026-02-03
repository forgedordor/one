package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.dczy;
import defpackage.ddab;
import defpackage.ejwf;
import defpackage.ejwg;
import defpackage.eldz;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class RegisterResponseData extends ResponseData {
    public static final Parcelable.Creator<RegisterResponseData> CREATOR = new ddab();
    public final byte[] a;
    public final String b;
    private final ProtocolVersion c;

    public RegisterResponseData(byte[] bArr, String str, String str2) {
        this.a = bArr;
        try {
            this.c = ProtocolVersion.a(str);
            this.b = str2;
        } catch (dczy e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RegisterResponseData)) {
            return false;
        }
        RegisterResponseData registerResponseData = (RegisterResponseData) obj;
        return dclc.a(this.c, registerResponseData.c) && Arrays.equals(this.a, registerResponseData.a) && dclc.a(this.b, registerResponseData.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Integer.valueOf(Arrays.hashCode(this.a)), this.b});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("protocolVersion", this.c);
        ejwfVarB.b("registerData", eldz.h.j(this.a));
        String str = this.b;
        if (str != null) {
            ejwfVarB.b("clientDataString", str);
        }
        return ejwfVarB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int iA = dclw.a(parcel);
        dclw.f(parcel, 2, bArr, false);
        dclw.m(parcel, 3, this.c.d, false);
        dclw.m(parcel, 4, this.b, false);
        dclw.c(parcel, iA);
    }
}
