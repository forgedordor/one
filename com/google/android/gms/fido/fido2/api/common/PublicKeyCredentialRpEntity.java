package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.dcyt;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialRpEntity> CREATOR = new dcyt();
    public final String a;
    public final String b;
    public final String c;

    public PublicKeyCredentialRpEntity(String str, String str2, String str3) {
        dclh.m(str);
        this.a = str;
        dclh.m(str2);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        return dclc.a(this.a, publicKeyCredentialRpEntity.a) && dclc.a(this.b, publicKeyCredentialRpEntity.b) && dclc.a(this.c, publicKeyCredentialRpEntity.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        return "PublicKeyCredentialRpEntity{\n id='" + this.a + "', \n name='" + this.b + "', \n icon='" + this.c + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, str, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.m(parcel, 4, this.c, false);
        dclw.c(parcel, iA);
    }
}
