package org.bouncycastle.asn1.x509;

import defpackage.ffwu;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class CRLDistPoint extends ASN1Object {
    final ASN1Sequence a;

    private CRLDistPoint(ASN1Sequence aSN1Sequence) {
        this.a = aSN1Sequence;
    }

    public static CRLDistPoint a(Object obj) {
        if (obj != null) {
            return new CRLDistPoint(ASN1Sequence.j(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        return this.a;
    }

    public final String toString() {
        DistributionPoint distributionPoint;
        StringBuffer stringBuffer = new StringBuffer("CRLDistPoint:");
        String str = ffwu.a;
        stringBuffer.append(str);
        ASN1Sequence aSN1Sequence = this.a;
        int iE = aSN1Sequence.e();
        DistributionPoint[] distributionPointArr = new DistributionPoint[iE];
        for (int i = 0; i != aSN1Sequence.e(); i++) {
            ASN1Encodable aSN1EncodableH = aSN1Sequence.h(i);
            if (aSN1EncodableH == null || (aSN1EncodableH instanceof DistributionPoint)) {
                distributionPoint = (DistributionPoint) aSN1EncodableH;
            } else {
                if (!(aSN1EncodableH instanceof ASN1Sequence)) {
                    throw new IllegalArgumentException("Invalid DistributionPoint: ".concat(String.valueOf(aSN1EncodableH.getClass().getName())));
                }
                distributionPoint = new DistributionPoint((ASN1Sequence) aSN1EncodableH);
            }
            distributionPointArr[i] = distributionPoint;
        }
        for (int i2 = 0; i2 != iE; i2++) {
            stringBuffer.append("    ");
            stringBuffer.append(distributionPointArr[i2]);
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }
}
