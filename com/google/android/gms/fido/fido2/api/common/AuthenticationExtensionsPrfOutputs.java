package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.dcxp;
import defpackage.evqs;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AuthenticationExtensionsPrfOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsPrfOutputs> CREATOR = new dcxp();
    public final boolean a;
    private final evqs b;

    public AuthenticationExtensionsPrfOutputs(boolean z, evqs evqsVar) {
        this.a = z;
        this.b = evqsVar;
    }

    public static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public final byte[] b() {
        evqs evqsVar = this.b;
        if (evqsVar == null) {
            return null;
        }
        return evqsVar.I();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsPrfOutputs)) {
            return false;
        }
        AuthenticationExtensionsPrfOutputs authenticationExtensionsPrfOutputs = (AuthenticationExtensionsPrfOutputs) obj;
        return this.a == authenticationExtensionsPrfOutputs.a && dclc.a(this.b, authenticationExtensionsPrfOutputs.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final String toString() {
        byte[] bArrB = b();
        StringBuilder sb = new StringBuilder("AuthenticationExtensionsPrfOutputs{enabled:");
        sb.append(this.a);
        sb.append("outputs:");
        sb.append(bArrB != null);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iA = dclw.a(parcel);
        dclw.d(parcel, 1, z);
        dclw.f(parcel, 2, b(), false);
        dclw.c(parcel, iA);
    }
}
