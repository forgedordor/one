package org.bouncycastle.asn1.x500.style;

import defpackage.ffwu;
import defpackage.ffxa;
import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1UniversalString;
import org.bouncycastle.asn1.x500.AttributeTypeAndValue;
import org.bouncycastle.asn1.x500.RDN;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class IETFUtils {
    public static String a(ASN1Encodable aSN1Encodable) {
        String strB = b(aSN1Encodable);
        if (strB.length() > 0 && strB.charAt(0) == '#') {
            try {
                ASN1Encodable aSN1EncodableV = ASN1Primitive.v(ffxa.f(strB, strB.length() - 1));
                if (aSN1EncodableV instanceof ASN1String) {
                    strB = ((ASN1String) aSN1EncodableV).e();
                }
            } catch (IOException e) {
                throw new IllegalStateException("unknown encoding in name: ".concat(e.toString()));
            }
        }
        String strB2 = ffwu.b(strB);
        int length = strB2.length();
        if (length < 2) {
            return strB2;
        }
        int i = length - 1;
        int i2 = 0;
        while (i2 < i && strB2.charAt(i2) == '\\' && strB2.charAt(i2 + 1) == ' ') {
            i2 += 2;
        }
        int i3 = i2 + 1;
        int i4 = i;
        while (i4 > i3 && strB2.charAt(i4 - 1) == '\\' && strB2.charAt(i4) == ' ') {
            i4 -= 2;
        }
        if (i2 > 0 || i4 < i) {
            strB2 = strB2.substring(i2, i4 + 1);
        }
        if (strB2.indexOf("  ") < 0) {
            return strB2;
        }
        StringBuffer stringBuffer = new StringBuffer();
        char cCharAt = strB2.charAt(0);
        stringBuffer.append(cCharAt);
        for (int i5 = 1; i5 < strB2.length(); i5++) {
            char cCharAt2 = strB2.charAt(i5);
            if (cCharAt == ' ' && cCharAt2 == ' ') {
                cCharAt = ' ';
            } else {
                stringBuffer.append(cCharAt2);
                cCharAt = cCharAt2;
            }
        }
        return stringBuffer.toString();
    }

    public static String b(ASN1Encodable aSN1Encodable) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        if (!(aSN1Encodable instanceof ASN1String) || (aSN1Encodable instanceof ASN1UniversalString)) {
            try {
                stringBuffer.append('#');
                stringBuffer.append(ffxa.a(aSN1Encodable.p().u()));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String strE = ((ASN1String) aSN1Encodable).e();
            if (strE.length() > 0 && strE.charAt(0) == '#') {
                stringBuffer.append('\\');
            }
            stringBuffer.append(strE);
        }
        int length = stringBuffer.length();
        int i2 = (stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#') ? 2 : 0;
        while (i2 != length) {
            char cCharAt = stringBuffer.charAt(i2);
            if (cCharAt != '\"' && cCharAt != '\\' && cCharAt != '+' && cCharAt != ',') {
                switch (cCharAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i2++;
                }
            }
            stringBuffer.insert(i2, "\\");
            length++;
            i2 += 2;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.length() > i && stringBuffer.charAt(i) == ' ') {
                stringBuffer.insert(i, "\\");
                i += 2;
            }
        }
        int length2 = stringBuffer.length();
        while (true) {
            length2--;
            if (length2 >= i && stringBuffer.charAt(length2) == ' ') {
                stringBuffer.insert(length2, '\\');
            }
        }
        return stringBuffer.toString();
    }

    public static void c(StringBuffer stringBuffer, RDN rdn, Hashtable hashtable) {
        if (!rdn.c()) {
            if (rdn.b() != null) {
                d(stringBuffer, rdn.b(), hashtable);
                return;
            }
            return;
        }
        AttributeTypeAndValue[] attributeTypeAndValueArrD = rdn.d();
        boolean z = true;
        int i = 0;
        while (i != attributeTypeAndValueArrD.length) {
            if (!z) {
                stringBuffer.append('+');
            }
            d(stringBuffer, attributeTypeAndValueArrD[i], hashtable);
            i++;
            z = false;
        }
    }

    public static void d(StringBuffer stringBuffer, AttributeTypeAndValue attributeTypeAndValue, Hashtable hashtable) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = attributeTypeAndValue.a;
        String str = (String) hashtable.get(aSN1ObjectIdentifier);
        if (str != null) {
            stringBuffer.append(str);
        } else {
            stringBuffer.append(aSN1ObjectIdentifier.e());
        }
        stringBuffer.append('=');
        stringBuffer.append(b(attributeTypeAndValue.b));
    }

    public static boolean e(RDN rdn, RDN rdn2) {
        if (rdn.a() != rdn2.a()) {
            return false;
        }
        AttributeTypeAndValue[] attributeTypeAndValueArrD = rdn.d();
        AttributeTypeAndValue[] attributeTypeAndValueArrD2 = rdn2.d();
        if (attributeTypeAndValueArrD.length != attributeTypeAndValueArrD2.length) {
            return false;
        }
        for (int i = 0; i != attributeTypeAndValueArrD.length; i++) {
            AttributeTypeAndValue attributeTypeAndValue = attributeTypeAndValueArrD[i];
            AttributeTypeAndValue attributeTypeAndValue2 = attributeTypeAndValueArrD2[i];
            if (attributeTypeAndValue != attributeTypeAndValue2) {
                if (attributeTypeAndValue != null && attributeTypeAndValue2 != null) {
                    if (attributeTypeAndValue.a.w(attributeTypeAndValue2.a)) {
                        if (!a(attributeTypeAndValue.b).equals(a(attributeTypeAndValue2.b))) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }
}
