package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.dcmw;
import defpackage.dcyk;
import defpackage.evqs;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class HmacSecretExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<HmacSecretExtension> CREATOR = new dcyk();
    public final int a;
    private final evqs b;
    private final evqs c;
    private final evqs d;

    public HmacSecretExtension(evqs evqsVar, evqs evqsVar2, evqs evqsVar3, int i) {
        this.b = evqsVar;
        this.c = evqsVar2;
        this.d = evqsVar3;
        this.a = i;
    }

    public final byte[] a() {
        evqs evqsVar = this.b;
        if (evqsVar == null) {
            return null;
        }
        return evqsVar.I();
    }

    public final byte[] b() {
        evqs evqsVar = this.d;
        if (evqsVar == null) {
            return null;
        }
        return evqsVar.I();
    }

    public final byte[] c() {
        evqs evqsVar = this.c;
        if (evqsVar == null) {
            return null;
        }
        return evqsVar.I();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HmacSecretExtension)) {
            return false;
        }
        HmacSecretExtension hmacSecretExtension = (HmacSecretExtension) obj;
        return dclc.a(this.b, hmacSecretExtension.b) && dclc.a(this.c, hmacSecretExtension.c) && dclc.a(this.d, hmacSecretExtension.d) && this.a == hmacSecretExtension.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, Integer.valueOf(this.a)});
    }

    public final String toString() {
        return "HmacSecretExtension{coseKeyAgreement=" + dcmw.c(a()) + ", saltEnc=" + dcmw.c(c()) + ", saltAuth=" + dcmw.c(b()) + ", getPinUvAuthProtocol=" + this.a + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.f(parcel, 1, a(), false);
        dclw.f(parcel, 2, c(), false);
        dclw.f(parcel, 3, b(), false);
        dclw.i(parcel, 4, this.a);
        dclw.c(parcel, iA);
    }
}
