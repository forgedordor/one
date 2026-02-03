package org.bouncycastle.asn1.cms;

import defpackage.a;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DLSequence;
import org.bouncycastle.asn1.DLTaggedObject;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ContentInfo extends ASN1Object implements CMSObjectIdentifiers {
    private final ASN1ObjectIdentifier d;
    private final ASN1Encodable e;
    private final boolean f;

    public ContentInfo(ASN1Sequence aSN1Sequence) {
        ASN1Object aSN1ObjectF;
        if (aSN1Sequence.e() <= 0 || aSN1Sequence.e() > 2) {
            throw new IllegalArgumentException(a.W(aSN1Sequence));
        }
        this.d = (ASN1ObjectIdentifier) aSN1Sequence.h(0);
        if (aSN1Sequence.e() > 1) {
            ASN1Encodable aSN1EncodableH = aSN1Sequence.h(1);
            if (aSN1EncodableH == null) {
                throw new NullPointerException("'obj' cannot be null");
            }
            ASN1TaggedObject aSN1TaggedObjectN = ASN1TaggedObject.n(aSN1EncodableH);
            ASN1Util.c(aSN1TaggedObjectN);
            if (!aSN1TaggedObjectN.o() || aSN1TaggedObjectN.c != 0) {
                throw new IllegalArgumentException("Bad tag for 'content'");
            }
            aSN1ObjectF = aSN1TaggedObjectN.f();
        } else {
            aSN1ObjectF = null;
        }
        this.e = aSN1ObjectF;
        this.f = !(aSN1Sequence instanceof BERSequence);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.b(this.d);
        ASN1Encodable aSN1Encodable = this.e;
        if (aSN1Encodable != null) {
            if (this.f) {
                aSN1EncodableVector.b(new DLTaggedObject(aSN1Encodable));
            } else {
                aSN1EncodableVector.b(new BERTaggedObject(aSN1Encodable));
            }
        }
        return this.f ? new DLSequence(aSN1EncodableVector) : new BERSequence(aSN1EncodableVector);
    }
}
