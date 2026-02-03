package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERTaggedObject;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ProofOfPossession extends ASN1Object implements ASN1Choice {
    private final ASN1Encodable a = DERNull.a;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        return new DERTaggedObject(false, 0, this.a);
    }
}
