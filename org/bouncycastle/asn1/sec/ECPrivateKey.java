package org.bouncycastle.asn1.sec;

import defpackage.a;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UniversalType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ECPrivateKey extends ASN1Object {
    private final ASN1Sequence a;

    public ECPrivateKey(ASN1Sequence aSN1Sequence) {
        this.a = aSN1Sequence;
    }

    public final ASN1BitString a() {
        return (ASN1BitString) b(1, 3);
    }

    public final ASN1Object b(int i, int i2) {
        Enumeration enumerationF = this.a.f();
        while (true) {
            ASN1UniversalType aSN1UniversalType = null;
            if (!enumerationF.hasMoreElements()) {
                return null;
            }
            ASN1Encodable aSN1Encodable = (ASN1Encodable) enumerationF.nextElement();
            if (aSN1Encodable instanceof ASN1TaggedObject) {
                ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Encodable;
                if (aSN1TaggedObject.b == 128 && aSN1TaggedObject.c == i) {
                    if (i2 < 0) {
                        return aSN1TaggedObject.f().p();
                    }
                    if (i2 == 1) {
                        aSN1UniversalType = ASN1Boolean.a;
                    } else if (i2 == 2) {
                        aSN1UniversalType = ASN1Integer.a;
                    } else if (i2 == 3) {
                        aSN1UniversalType = ASN1BitString.a;
                    }
                    if (aSN1UniversalType != null) {
                        return aSN1TaggedObject.i(true, aSN1UniversalType);
                    }
                    throw new IllegalArgumentException(a.g(i2, "unsupported UNIVERSAL tag number: "));
                }
            }
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        return this.a;
    }
}
