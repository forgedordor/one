package org.bouncycastle.asn1.x9;

import defpackage.ffln;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class X9FieldElement extends ASN1Object {
    protected final ffln a;

    public X9FieldElement(ffln fflnVar) {
        this.a = fflnVar;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        byte[] bArr;
        ffln fflnVar = this.a;
        int iC = fflnVar.c() + 7;
        byte[] byteArray = fflnVar.d().toByteArray();
        int length = byteArray.length;
        int i = iC / 8;
        if (i >= length) {
            if (i > length) {
                bArr = new byte[i];
                System.arraycopy(byteArray, 0, bArr, i - length, length);
            }
            return new DEROctetString(byteArray);
        }
        bArr = new byte[i];
        System.arraycopy(byteArray, length - i, bArr, 0, i);
        byteArray = bArr;
        return new DEROctetString(byteArray);
    }
}
