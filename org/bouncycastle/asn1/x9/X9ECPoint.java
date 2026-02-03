package org.bouncycastle.asn1.x9;

import defpackage.ffwk;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class X9ECPoint extends ASN1Object {
    private final ASN1OctetString a;

    public X9ECPoint(ASN1OctetString aSN1OctetString) {
        this.a = new DEROctetString(ffwk.c(aSN1OctetString.c));
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        return this.a;
    }
}
