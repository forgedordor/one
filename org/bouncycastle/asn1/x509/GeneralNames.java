package org.bouncycastle.asn1.x509;

import defpackage.ffwu;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class GeneralNames extends ASN1Object {
    private final GeneralName[] a;

    public GeneralNames(GeneralName generalName) {
        this.a = new GeneralName[]{generalName};
    }

    public static GeneralNames a(Object obj) {
        if (obj instanceof GeneralNames) {
            return (GeneralNames) obj;
        }
        if (obj != null) {
            return new GeneralNames(ASN1Sequence.j(obj));
        }
        return null;
    }

    public static GeneralNames b(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return new GeneralNames(ASN1Sequence.m(aSN1TaggedObject, z));
    }

    public final GeneralName[] c() {
        GeneralName[] generalNameArr = this.a;
        int length = generalNameArr.length;
        GeneralName[] generalNameArr2 = new GeneralName[length];
        System.arraycopy(generalNameArr, 0, generalNameArr2, 0, length);
        return generalNameArr2;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        return new DERSequence(this.a);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("GeneralNames:");
        String str = ffwu.a;
        stringBuffer.append(str);
        int i = 0;
        while (true) {
            GeneralName[] generalNameArr = this.a;
            if (i == generalNameArr.length) {
                return stringBuffer.toString();
            }
            stringBuffer.append("    ");
            stringBuffer.append(generalNameArr[i]);
            stringBuffer.append(str);
            i++;
        }
    }

    private GeneralNames(ASN1Sequence aSN1Sequence) {
        this.a = new GeneralName[aSN1Sequence.e()];
        for (int i = 0; i != aSN1Sequence.e(); i++) {
            this.a[i] = GeneralName.a(aSN1Sequence.h(i));
        }
    }
}
