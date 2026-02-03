package org.bouncycastle.asn1.x500.style;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.x500.AttributeTypeAndValue;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class AbstractX500NameStyle implements X500NameStyle {
    public static Hashtable d(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            Object objNextElement = enumerationKeys.nextElement();
            hashtable2.put(objNextElement, hashtable.get(objNextElement));
        }
        return hashtable2;
    }

    private static final int e(ASN1Encodable aSN1Encodable) {
        return IETFUtils.a(aSN1Encodable).hashCode();
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public final int a(X500Name x500Name) {
        RDN[] rdnArrC = x500Name.c();
        int iHashCode = 0;
        for (int i = 0; i != rdnArrC.length; i++) {
            if (rdnArrC[i].c()) {
                AttributeTypeAndValue[] attributeTypeAndValueArrD = rdnArrC[i].d();
                for (int i2 = 0; i2 != attributeTypeAndValueArrD.length; i2++) {
                    iHashCode = (iHashCode ^ attributeTypeAndValueArrD[i2].a.hashCode()) ^ e(attributeTypeAndValueArrD[i2].b);
                }
            } else {
                iHashCode = (iHashCode ^ rdnArrC[i].b().a.hashCode()) ^ e(rdnArrC[i].b().b);
            }
        }
        return iHashCode;
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public boolean c(X500Name x500Name, X500Name x500Name2) {
        if (x500Name.a() != x500Name2.a()) {
            return false;
        }
        RDN[] rdnArrC = x500Name.c();
        RDN[] rdnArrC2 = x500Name2.c();
        AttributeTypeAndValue attributeTypeAndValueB = rdnArrC[0].b();
        AttributeTypeAndValue attributeTypeAndValueB2 = rdnArrC2[0].b();
        boolean z = (attributeTypeAndValueB == null || attributeTypeAndValueB2 == null) ? false : !attributeTypeAndValueB.a.w(attributeTypeAndValueB2.a);
        loop0: for (int i = 0; i != rdnArrC.length; i++) {
            RDN rdn = rdnArrC[i];
            if (!z) {
                for (int i2 = 0; i2 != rdnArrC2.length; i2++) {
                    RDN rdn2 = rdnArrC2[i2];
                    if (rdn2 != null && IETFUtils.e(rdn, rdn2)) {
                        rdnArrC2[i2] = null;
                    }
                }
                return false;
            }
            int length = rdnArrC2.length;
            while (true) {
                length--;
                if (length < 0) {
                    break loop0;
                }
                RDN rdn3 = rdnArrC2[length];
                if (rdn3 != null && IETFUtils.e(rdn, rdn3)) {
                    rdnArrC2[length] = null;
                    break;
                }
            }
        }
        return true;
    }
}
