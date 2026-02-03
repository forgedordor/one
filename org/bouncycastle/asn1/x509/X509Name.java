package org.bouncycastle.asn1.x509;

import com.android.vcard.VCardConstants;
import defpackage.a;
import defpackage.ffwu;
import defpackage.ffxa;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1UniversalString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class X509Name extends ASN1Object {
    public static final ASN1ObjectIdentifier A;
    public static final ASN1ObjectIdentifier B;
    public static final ASN1ObjectIdentifier C;
    public static final ASN1ObjectIdentifier D;
    public static final ASN1ObjectIdentifier E;
    public static final ASN1ObjectIdentifier F;
    public static final ASN1ObjectIdentifier G;
    public static final Hashtable H;
    public static final Hashtable I;
    public static final Hashtable J;
    public static final Hashtable K;
    private static final Boolean L;
    private static final Boolean M;
    public static final ASN1ObjectIdentifier a;
    public static final ASN1ObjectIdentifier b;
    public static final ASN1ObjectIdentifier c;
    public static final ASN1ObjectIdentifier d;
    public static final ASN1ObjectIdentifier e;
    public static final ASN1ObjectIdentifier f;
    public static final ASN1ObjectIdentifier g;
    public static final ASN1ObjectIdentifier h;
    public static final ASN1ObjectIdentifier i;
    public static final ASN1ObjectIdentifier j;
    public static final ASN1ObjectIdentifier k;
    public static final ASN1ObjectIdentifier l;
    public static final ASN1ObjectIdentifier m;
    public static final ASN1ObjectIdentifier n;
    public static final ASN1ObjectIdentifier o;
    public static final ASN1ObjectIdentifier p;
    public static final ASN1ObjectIdentifier q;
    public static final ASN1ObjectIdentifier r;
    public static final ASN1ObjectIdentifier s;
    public static final ASN1ObjectIdentifier t;
    public static final ASN1ObjectIdentifier u;
    public static final ASN1ObjectIdentifier v;
    public static final ASN1ObjectIdentifier w;
    public static final ASN1ObjectIdentifier x;
    public static final ASN1ObjectIdentifier y;
    public static final ASN1ObjectIdentifier z;
    private Vector N = new Vector();
    private Vector O = new Vector();
    private Vector P = new Vector();
    private ASN1Sequence Q;
    private boolean R;
    private int S;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("2.5.4.6");
        a = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier("2.5.4.10");
        b = aSN1ObjectIdentifier2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = new ASN1ObjectIdentifier("2.5.4.11");
        c = aSN1ObjectIdentifier3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = new ASN1ObjectIdentifier("2.5.4.12");
        d = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = new ASN1ObjectIdentifier("2.5.4.3");
        e = aSN1ObjectIdentifier5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = new ASN1ObjectIdentifier("2.5.4.5");
        f = aSN1ObjectIdentifier6;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = new ASN1ObjectIdentifier("2.5.4.9");
        g = aSN1ObjectIdentifier7;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = new ASN1ObjectIdentifier("2.5.4.7");
        h = aSN1ObjectIdentifier8;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = new ASN1ObjectIdentifier("2.5.4.8");
        i = aSN1ObjectIdentifier9;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = new ASN1ObjectIdentifier("2.5.4.4");
        j = aSN1ObjectIdentifier10;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = new ASN1ObjectIdentifier("2.5.4.42");
        k = aSN1ObjectIdentifier11;
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = new ASN1ObjectIdentifier("2.5.4.43");
        l = aSN1ObjectIdentifier12;
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = new ASN1ObjectIdentifier("2.5.4.44");
        m = aSN1ObjectIdentifier13;
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = new ASN1ObjectIdentifier("2.5.4.45");
        n = aSN1ObjectIdentifier14;
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = new ASN1ObjectIdentifier("2.5.4.15");
        o = aSN1ObjectIdentifier15;
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = new ASN1ObjectIdentifier("2.5.4.17");
        p = aSN1ObjectIdentifier16;
        ASN1ObjectIdentifier aSN1ObjectIdentifier17 = new ASN1ObjectIdentifier("2.5.4.46");
        q = aSN1ObjectIdentifier17;
        ASN1ObjectIdentifier aSN1ObjectIdentifier18 = new ASN1ObjectIdentifier("2.5.4.65");
        r = aSN1ObjectIdentifier18;
        ASN1ObjectIdentifier aSN1ObjectIdentifier19 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.1");
        s = aSN1ObjectIdentifier19;
        ASN1ObjectIdentifier aSN1ObjectIdentifier20 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.2");
        t = aSN1ObjectIdentifier20;
        ASN1ObjectIdentifier aSN1ObjectIdentifier21 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.3");
        u = aSN1ObjectIdentifier21;
        ASN1ObjectIdentifier aSN1ObjectIdentifier22 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.4");
        v = aSN1ObjectIdentifier22;
        ASN1ObjectIdentifier aSN1ObjectIdentifier23 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.5");
        w = aSN1ObjectIdentifier23;
        ASN1ObjectIdentifier aSN1ObjectIdentifier24 = new ASN1ObjectIdentifier("1.3.36.8.3.14");
        x = aSN1ObjectIdentifier24;
        ASN1ObjectIdentifier aSN1ObjectIdentifier25 = new ASN1ObjectIdentifier("2.5.4.16");
        y = aSN1ObjectIdentifier25;
        new ASN1ObjectIdentifier("2.5.4.54");
        ASN1ObjectIdentifier aSN1ObjectIdentifier26 = X509ObjectIdentifiers.b;
        z = aSN1ObjectIdentifier26;
        ASN1ObjectIdentifier aSN1ObjectIdentifier27 = X509ObjectIdentifiers.c;
        A = aSN1ObjectIdentifier27;
        ASN1ObjectIdentifier aSN1ObjectIdentifier28 = PKCSObjectIdentifiers.w;
        B = aSN1ObjectIdentifier28;
        ASN1ObjectIdentifier aSN1ObjectIdentifier29 = PKCSObjectIdentifiers.x;
        C = aSN1ObjectIdentifier29;
        ASN1ObjectIdentifier aSN1ObjectIdentifier30 = PKCSObjectIdentifiers.z;
        D = aSN1ObjectIdentifier30;
        E = aSN1ObjectIdentifier28;
        ASN1ObjectIdentifier aSN1ObjectIdentifier31 = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.25");
        F = aSN1ObjectIdentifier31;
        ASN1ObjectIdentifier aSN1ObjectIdentifier32 = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.1");
        G = aSN1ObjectIdentifier32;
        Hashtable hashtable = new Hashtable();
        H = hashtable;
        Hashtable hashtable2 = new Hashtable();
        I = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        J = hashtable3;
        Hashtable hashtable4 = new Hashtable();
        K = hashtable4;
        L = new Boolean(true);
        M = new Boolean(false);
        hashtable.put(aSN1ObjectIdentifier, "C");
        hashtable.put(aSN1ObjectIdentifier2, "O");
        hashtable.put(aSN1ObjectIdentifier4, "T");
        hashtable.put(aSN1ObjectIdentifier3, "OU");
        hashtable.put(aSN1ObjectIdentifier5, "CN");
        hashtable.put(aSN1ObjectIdentifier8, "L");
        hashtable.put(aSN1ObjectIdentifier9, "ST");
        hashtable.put(aSN1ObjectIdentifier6, "SERIALNUMBER");
        hashtable.put(aSN1ObjectIdentifier28, "E");
        hashtable.put(aSN1ObjectIdentifier31, "DC");
        hashtable.put(aSN1ObjectIdentifier32, VCardConstants.PROPERTY_UID);
        hashtable.put(aSN1ObjectIdentifier7, "STREET");
        hashtable.put(aSN1ObjectIdentifier10, "SURNAME");
        hashtable.put(aSN1ObjectIdentifier11, "GIVENNAME");
        hashtable.put(aSN1ObjectIdentifier12, "INITIALS");
        hashtable.put(aSN1ObjectIdentifier13, "GENERATION");
        hashtable.put(aSN1ObjectIdentifier30, "unstructuredAddress");
        hashtable.put(aSN1ObjectIdentifier29, "unstructuredName");
        hashtable.put(aSN1ObjectIdentifier14, "UniqueIdentifier");
        hashtable.put(aSN1ObjectIdentifier17, "DN");
        hashtable.put(aSN1ObjectIdentifier18, "Pseudonym");
        hashtable.put(aSN1ObjectIdentifier25, "PostalAddress");
        hashtable.put(aSN1ObjectIdentifier24, "NameAtBirth");
        hashtable.put(aSN1ObjectIdentifier22, "CountryOfCitizenship");
        hashtable.put(aSN1ObjectIdentifier23, "CountryOfResidence");
        hashtable.put(aSN1ObjectIdentifier21, "Gender");
        hashtable.put(aSN1ObjectIdentifier20, "PlaceOfBirth");
        hashtable.put(aSN1ObjectIdentifier19, "DateOfBirth");
        hashtable.put(aSN1ObjectIdentifier16, "PostalCode");
        hashtable.put(aSN1ObjectIdentifier15, "BusinessCategory");
        hashtable.put(aSN1ObjectIdentifier26, "TelephoneNumber");
        hashtable.put(aSN1ObjectIdentifier27, "Name");
        hashtable2.put(aSN1ObjectIdentifier, "C");
        hashtable2.put(aSN1ObjectIdentifier2, "O");
        hashtable2.put(aSN1ObjectIdentifier3, "OU");
        hashtable2.put(aSN1ObjectIdentifier5, "CN");
        hashtable2.put(aSN1ObjectIdentifier8, "L");
        hashtable2.put(aSN1ObjectIdentifier9, "ST");
        hashtable2.put(aSN1ObjectIdentifier7, "STREET");
        hashtable2.put(aSN1ObjectIdentifier31, "DC");
        hashtable2.put(aSN1ObjectIdentifier32, VCardConstants.PROPERTY_UID);
        hashtable3.put(aSN1ObjectIdentifier, "C");
        hashtable3.put(aSN1ObjectIdentifier2, "O");
        hashtable3.put(aSN1ObjectIdentifier3, "OU");
        hashtable3.put(aSN1ObjectIdentifier5, "CN");
        hashtable3.put(aSN1ObjectIdentifier8, "L");
        hashtable3.put(aSN1ObjectIdentifier9, "ST");
        hashtable3.put(aSN1ObjectIdentifier7, "STREET");
        hashtable4.put("c", aSN1ObjectIdentifier);
        hashtable4.put("o", aSN1ObjectIdentifier2);
        hashtable4.put("t", aSN1ObjectIdentifier4);
        hashtable4.put("ou", aSN1ObjectIdentifier3);
        hashtable4.put("cn", aSN1ObjectIdentifier5);
        hashtable4.put("l", aSN1ObjectIdentifier8);
        hashtable4.put("st", aSN1ObjectIdentifier9);
        hashtable4.put("sn", aSN1ObjectIdentifier6);
        hashtable4.put("serialnumber", aSN1ObjectIdentifier6);
        hashtable4.put("street", aSN1ObjectIdentifier7);
        hashtable4.put("emailaddress", aSN1ObjectIdentifier28);
        hashtable4.put("dc", aSN1ObjectIdentifier31);
        hashtable4.put("e", aSN1ObjectIdentifier28);
        hashtable4.put("uid", aSN1ObjectIdentifier32);
        hashtable4.put("surname", aSN1ObjectIdentifier10);
        hashtable4.put("givenname", aSN1ObjectIdentifier11);
        hashtable4.put("initials", aSN1ObjectIdentifier12);
        hashtable4.put("generation", aSN1ObjectIdentifier13);
        hashtable4.put("unstructuredaddress", aSN1ObjectIdentifier30);
        hashtable4.put("unstructuredname", aSN1ObjectIdentifier29);
        hashtable4.put("uniqueidentifier", aSN1ObjectIdentifier14);
        hashtable4.put("dn", aSN1ObjectIdentifier17);
        hashtable4.put("pseudonym", aSN1ObjectIdentifier18);
        hashtable4.put("postaladdress", aSN1ObjectIdentifier25);
        hashtable4.put("nameofbirth", aSN1ObjectIdentifier24);
        hashtable4.put("countryofcitizenship", aSN1ObjectIdentifier22);
        hashtable4.put("countryofresidence", aSN1ObjectIdentifier23);
        hashtable4.put("gender", aSN1ObjectIdentifier21);
        hashtable4.put("placeofbirth", aSN1ObjectIdentifier20);
        hashtable4.put("dateofbirth", aSN1ObjectIdentifier19);
        hashtable4.put("postalcode", aSN1ObjectIdentifier16);
        hashtable4.put("businesscategory", aSN1ObjectIdentifier15);
        hashtable4.put("telephonenumber", aSN1ObjectIdentifier26);
        hashtable4.put("name", aSN1ObjectIdentifier27);
    }

    protected X509Name() {
    }

    private static final void a(StringBuffer stringBuffer, Hashtable hashtable, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        String str2 = (String) hashtable.get(aSN1ObjectIdentifier);
        if (str2 != null) {
            stringBuffer.append(str2);
        } else {
            stringBuffer.append(aSN1ObjectIdentifier.e());
        }
        stringBuffer.append('=');
        int length = stringBuffer.length();
        stringBuffer.append(str);
        int length2 = stringBuffer.length();
        if (str.length() >= 2 && str.charAt(0) == '\\' && str.charAt(1) == '#') {
            length += 2;
        }
        while (length < length2 && stringBuffer.charAt(length) == ' ') {
            stringBuffer.insert(length, "\\");
            length += 2;
            length2++;
        }
        while (true) {
            length2--;
            if (length2 <= length || stringBuffer.charAt(length2) != ' ') {
                break;
            } else {
                stringBuffer.insert(length2, '\\');
            }
        }
        while (length <= length2) {
            char cCharAt = stringBuffer.charAt(length);
            if (cCharAt != '\"' && cCharAt != '\\' && cCharAt != '+' && cCharAt != ',') {
                switch (cCharAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        length++;
                }
            }
            stringBuffer.insert(length, "\\");
            length += 2;
            length2++;
        }
    }

    private static final String b(String str) {
        String strB = ffwu.b(str.trim());
        if (strB.length() > 0 && strB.charAt(0) == '#') {
            try {
                ASN1Encodable aSN1EncodableV = ASN1Primitive.v(ffxa.f(strB, strB.length() - 1));
                if (aSN1EncodableV instanceof ASN1String) {
                    return ffwu.b(((ASN1String) aSN1EncodableV).e().trim());
                }
            } catch (IOException e2) {
                throw new IllegalStateException("unknown encoding in name: ".concat(e2.toString()));
            }
        }
        return strB;
    }

    private static final String c(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char cCharAt = str.charAt(0);
            stringBuffer.append(cCharAt);
            int i2 = 1;
            while (i2 < str.length()) {
                char cCharAt2 = str.charAt(i2);
                if (cCharAt != ' ' || cCharAt2 != ' ') {
                    stringBuffer.append(cCharAt2);
                }
                i2++;
                cCharAt = cCharAt2;
            }
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bc, code lost:
    
        r3[r9] = true;
        r4 = r4 + r6;
     */
    @Override // org.bouncycastle.asn1.ASN1Object
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 1
            if (r14 != r13) goto L4
            return r0
        L4:
            boolean r1 = r14 instanceof org.bouncycastle.asn1.x509.X509Name
            r2 = 0
            if (r1 != 0) goto Lf
            boolean r3 = r14 instanceof org.bouncycastle.asn1.ASN1Sequence
            if (r3 == 0) goto Le
            goto Lf
        Le:
            return r2
        Lf:
            r3 = r14
            org.bouncycastle.asn1.ASN1Encodable r3 = (org.bouncycastle.asn1.ASN1Encodable) r3
            org.bouncycastle.asn1.ASN1Primitive r3 = r3.p()
            org.bouncycastle.asn1.ASN1Primitive r4 = r13.p()
            boolean r3 = r4.w(r3)
            if (r3 != 0) goto Lc6
            if (r1 == 0) goto L25
            org.bouncycastle.asn1.x509.X509Name r14 = (org.bouncycastle.asn1.x509.X509Name) r14     // Catch: java.lang.IllegalArgumentException -> Lc5
            goto L45
        L25:
            boolean r1 = r14 instanceof org.bouncycastle.asn1.x500.X500Name     // Catch: java.lang.IllegalArgumentException -> Lc5
            if (r1 == 0) goto L37
            org.bouncycastle.asn1.x509.X509Name r1 = new org.bouncycastle.asn1.x509.X509Name     // Catch: java.lang.IllegalArgumentException -> Lc5
            org.bouncycastle.asn1.x500.X500Name r14 = (org.bouncycastle.asn1.x500.X500Name) r14     // Catch: java.lang.IllegalArgumentException -> Lc5
            org.bouncycastle.asn1.DERSequence r14 = r14.b     // Catch: java.lang.IllegalArgumentException -> Lc5
            org.bouncycastle.asn1.ASN1Sequence r14 = org.bouncycastle.asn1.ASN1Sequence.j(r14)     // Catch: java.lang.IllegalArgumentException -> Lc5
            r1.<init>(r14)     // Catch: java.lang.IllegalArgumentException -> Lc5
            goto L42
        L37:
            if (r14 == 0) goto L44
            org.bouncycastle.asn1.x509.X509Name r1 = new org.bouncycastle.asn1.x509.X509Name     // Catch: java.lang.IllegalArgumentException -> Lc5
            org.bouncycastle.asn1.ASN1Sequence r14 = org.bouncycastle.asn1.ASN1Sequence.j(r14)     // Catch: java.lang.IllegalArgumentException -> Lc5
            r1.<init>(r14)     // Catch: java.lang.IllegalArgumentException -> Lc5
        L42:
            r14 = r1
            goto L45
        L44:
            r14 = 0
        L45:
            java.util.Vector r1 = r13.N
            int r1 = r1.size()
            java.util.Vector r3 = r14.N
            int r3 = r3.size()
            if (r1 == r3) goto L54
            return r2
        L54:
            boolean[] r3 = new boolean[r1]
            java.util.Vector r4 = r13.N
            java.lang.Object r4 = r4.elementAt(r2)
            java.util.Vector r5 = r14.N
            java.lang.Object r5 = r5.elementAt(r2)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L6c
            r6 = r0
            r5 = r1
            r4 = r2
            goto L70
        L6c:
            int r4 = r1 + (-1)
            r5 = -1
            r6 = r5
        L70:
            if (r4 == r5) goto Lc4
            java.util.Vector r7 = r13.N
            java.lang.Object r7 = r7.elementAt(r4)
            org.bouncycastle.asn1.ASN1ObjectIdentifier r7 = (org.bouncycastle.asn1.ASN1ObjectIdentifier) r7
            java.util.Vector r8 = r13.O
            java.lang.Object r8 = r8.elementAt(r4)
            java.lang.String r8 = (java.lang.String) r8
            r9 = r2
        L83:
            if (r9 >= r1) goto Lc3
            boolean r10 = r3[r9]
            if (r10 == 0) goto L8a
            goto Lc0
        L8a:
            java.util.Vector r10 = r14.N
            java.lang.Object r10 = r10.elementAt(r9)
            org.bouncycastle.asn1.ASN1ObjectIdentifier r10 = (org.bouncycastle.asn1.ASN1ObjectIdentifier) r10
            boolean r10 = r7.w(r10)
            if (r10 == 0) goto Lc0
            java.util.Vector r10 = r14.O
            java.lang.Object r10 = r10.elementAt(r9)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = b(r8)
            java.lang.String r10 = b(r10)
            boolean r12 = r11.equals(r10)
            if (r12 != 0) goto Lbc
            java.lang.String r11 = c(r11)
            java.lang.String r10 = c(r10)
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto Lc0
        Lbc:
            r3[r9] = r0
            int r4 = r4 + r6
            goto L70
        Lc0:
            int r9 = r9 + 1
            goto L83
        Lc3:
            return r2
        Lc4:
            return r0
        Lc5:
            return r2
        Lc6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.x509.X509Name.equals(java.lang.Object):boolean");
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        if (!this.R) {
            this.R = true;
            for (int i2 = 0; i2 != this.N.size(); i2++) {
                String strC = c(b((String) this.O.elementAt(i2)));
                int iHashCode = this.S ^ this.N.elementAt(i2).hashCode();
                this.S = iHashCode;
                this.S = strC.hashCode() ^ iHashCode;
            }
        }
        return this.S;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        if (this.Q == null) {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            if (this.N.size() != 0) {
                new ASN1EncodableVector(2).b((ASN1ObjectIdentifier) this.N.elementAt(0));
                throw null;
            }
            aSN1EncodableVector.b(new DERSet(aSN1EncodableVector2));
            this.Q = new DERSequence(aSN1EncodableVector);
        }
        return this.Q;
    }

    public final String toString() {
        Hashtable hashtable = H;
        StringBuffer stringBuffer = new StringBuffer();
        Vector vector = new Vector();
        StringBuffer stringBuffer2 = null;
        for (int i2 = 0; i2 < this.N.size(); i2++) {
            if (((Boolean) this.P.elementAt(i2)).booleanValue()) {
                stringBuffer2.append('+');
                a(stringBuffer2, hashtable, (ASN1ObjectIdentifier) this.N.elementAt(i2), (String) this.O.elementAt(i2));
            } else {
                stringBuffer2 = new StringBuffer();
                a(stringBuffer2, hashtable, (ASN1ObjectIdentifier) this.N.elementAt(i2), (String) this.O.elementAt(i2));
                vector.addElement(stringBuffer2);
            }
        }
        boolean z2 = true;
        int i3 = 0;
        while (i3 < vector.size()) {
            if (!z2) {
                stringBuffer.append(',');
            }
            stringBuffer.append(vector.elementAt(i3).toString());
            i3++;
            z2 = false;
        }
        return stringBuffer.toString();
    }

    public X509Name(ASN1Sequence aSN1Sequence) {
        this.Q = aSN1Sequence;
        Enumeration enumerationF = aSN1Sequence.f();
        while (enumerationF.hasMoreElements()) {
            ASN1Set aSN1SetG = ASN1Set.g(((ASN1Encodable) enumerationF.nextElement()).p());
            int i2 = 0;
            while (i2 < aSN1SetG.e()) {
                ASN1Sequence aSN1SequenceJ = ASN1Sequence.j(aSN1SetG.f(i2).p());
                if (aSN1SequenceJ.e() == 2) {
                    this.N.addElement(ASN1ObjectIdentifier.h(aSN1SequenceJ.h(0)));
                    ASN1Encodable aSN1EncodableH = aSN1SequenceJ.h(1);
                    if ((aSN1EncodableH instanceof ASN1String) && !(aSN1EncodableH instanceof ASN1UniversalString)) {
                        String strE = ((ASN1String) aSN1EncodableH).e();
                        if (strE.length() > 0 && strE.charAt(0) == '#') {
                            this.O.addElement("\\".concat(strE));
                        } else {
                            this.O.addElement(strE);
                        }
                    } else {
                        try {
                            Vector vector = this.O;
                            byte[] bArrD = ffxa.d(aSN1EncodableH.p().u());
                            int length = bArrD.length;
                            char[] cArr = new char[length];
                            for (int i3 = 0; i3 != length; i3++) {
                                cArr[i3] = (char) (bArrD[i3] & 255);
                            }
                            vector.addElement(a.v(new String(cArr), "#"));
                        } catch (IOException unused) {
                            throw new IllegalArgumentException("cannot encode value");
                        }
                    }
                    this.P.addElement(i2 != 0 ? L : M);
                    i2++;
                } else {
                    throw new IllegalArgumentException("badly sized pair");
                }
            }
        }
    }
}
