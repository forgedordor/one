package org.bouncycastle.asn1.pkcs;

import defpackage.a;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class SignedData extends ASN1Object implements PKCSObjectIdentifiers {
    public ASN1Set L;
    public ASN1Set M;
    private ASN1Integer N;
    private ASN1Set O;
    private ContentInfo P;
    private ASN1Set Q;

    public SignedData(ASN1Integer aSN1Integer, ASN1Set aSN1Set, ContentInfo contentInfo, ASN1Set aSN1Set2, ASN1Set aSN1Set3) {
        this.N = aSN1Integer;
        this.O = aSN1Set;
        this.P = contentInfo;
        this.L = aSN1Set2;
        this.M = null;
        this.Q = aSN1Set3;
    }

    public static SignedData a(Object obj) {
        if (obj != null) {
            return new SignedData(ASN1Sequence.j(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.b(this.N);
        aSN1EncodableVector.b(this.O);
        aSN1EncodableVector.b(this.P);
        ASN1Set aSN1Set = this.L;
        if (aSN1Set != null) {
            aSN1EncodableVector.b(new DERTaggedObject(false, 0, aSN1Set));
        }
        ASN1Set aSN1Set2 = this.M;
        if (aSN1Set2 != null) {
            aSN1EncodableVector.b(new DERTaggedObject(false, 1, aSN1Set2));
        }
        aSN1EncodableVector.b(this.Q);
        return new BERSequence(aSN1EncodableVector);
    }

    public SignedData(ASN1Sequence aSN1Sequence) {
        Enumeration enumerationF = aSN1Sequence.f();
        this.N = (ASN1Integer) enumerationF.nextElement();
        this.O = (ASN1Set) enumerationF.nextElement();
        Object objNextElement = enumerationF.nextElement();
        this.P = objNextElement instanceof ContentInfo ? (ContentInfo) objNextElement : objNextElement != null ? new ContentInfo(ASN1Sequence.j(objNextElement)) : null;
        while (enumerationF.hasMoreElements()) {
            ASN1Primitive aSN1Primitive = (ASN1Primitive) enumerationF.nextElement();
            if (aSN1Primitive instanceof ASN1TaggedObject) {
                ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive;
                int i = aSN1TaggedObject.c;
                if (i == 0) {
                    this.L = ASN1Set.i(aSN1TaggedObject);
                } else {
                    if (i != 1) {
                        throw new IllegalArgumentException(a.g(i, "unknown tag value "));
                    }
                    this.M = ASN1Set.i(aSN1TaggedObject);
                }
            } else {
                this.Q = (ASN1Set) aSN1Primitive;
            }
        }
    }
}
