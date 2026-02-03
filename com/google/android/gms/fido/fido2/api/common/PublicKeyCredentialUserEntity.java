package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.dcmw;
import defpackage.dcyw;
import defpackage.evqs;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new dcyw();
    public final String a;
    public final String b;
    public final String c;
    private final evqs d;

    public PublicKeyCredentialUserEntity(byte[] bArr, String str, String str2, String str3) {
        dclh.m(bArr);
        this.d = evqs.x(bArr);
        dclh.m(str);
        this.a = str;
        this.b = str2;
        dclh.m(str3);
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return dclc.a(this.d, publicKeyCredentialUserEntity.d) && dclc.a(this.a, publicKeyCredentialUserEntity.a) && dclc.a(this.b, publicKeyCredentialUserEntity.b) && dclc.a(this.c, publicKeyCredentialUserEntity.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.a, this.b, this.c});
    }

    public final String toString() {
        return "PublicKeyCredentialUserEntity{\n id=" + dcmw.c(this.d.I()) + ", \n name='" + this.a + "', \n icon='" + this.b + "', \n displayName='" + this.c + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        evqs evqsVar = this.d;
        int iA = dclw.a(parcel);
        dclw.f(parcel, 2, evqsVar.I(), false);
        dclw.m(parcel, 3, this.a, false);
        dclw.m(parcel, 4, this.b, false);
        dclw.m(parcel, 5, this.c, false);
        dclw.c(parcel, iA);
    }
}
