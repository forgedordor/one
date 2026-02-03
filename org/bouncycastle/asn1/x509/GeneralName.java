package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class GeneralName extends ASN1Object implements ASN1Choice {
    public final ASN1Encodable a;
    public final int b;

    public GeneralName(int i, ASN1Encodable aSN1Encodable) {
        this.a = aSN1Encodable;
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.bouncycastle.asn1.x509.GeneralName a(java.lang.Object r6) {
        /*
            if (r6 == 0) goto Lc1
            boolean r0 = r6 instanceof org.bouncycastle.asn1.x509.GeneralName
            if (r0 == 0) goto L8
            goto Lc1
        L8:
            boolean r0 = r6 instanceof org.bouncycastle.asn1.ASN1TaggedObject
            if (r0 == 0) goto L92
            org.bouncycastle.asn1.ASN1TaggedObject r6 = (org.bouncycastle.asn1.ASN1TaggedObject) r6
            int r0 = r6.c
            r1 = 1
            r2 = 0
            switch(r0) {
                case 0: goto L88;
                case 1: goto L7a;
                case 2: goto L7a;
                case 3: goto L88;
                case 4: goto L6a;
                case 5: goto L88;
                case 6: goto L7a;
                case 7: goto L60;
                case 8: goto L21;
                default: goto L15;
            }
        L15:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "unknown tag: "
            java.lang.String r0 = defpackage.a.g(r0, r1)
            r6.<init>(r0)
            throw r6
        L21:
            int r3 = r6.a
            org.bouncycastle.asn1.x509.GeneralName r4 = new org.bouncycastle.asn1.x509.GeneralName
            org.bouncycastle.asn1.ASN1UniversalType r5 = org.bouncycastle.asn1.ASN1ObjectIdentifier.a
            r5 = 3
            if (r3 == r5) goto L54
            r5 = 4
            if (r3 == r5) goto L54
            int r3 = r6.b
            r5 = 128(0x80, float:1.794E-43)
            if (r3 != r5) goto L54
            org.bouncycastle.asn1.ASN1Object r3 = r6.e()
            org.bouncycastle.asn1.ASN1Primitive r3 = r3.p()
            boolean r5 = r3 instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier
            if (r5 != 0) goto L54
            org.bouncycastle.asn1.ASN1OctetString r6 = org.bouncycastle.asn1.ASN1OctetString.f(r3)
            byte[] r6 = r6.c
            if (r6 == 0) goto L4c
            org.bouncycastle.asn1.ASN1ObjectIdentifier r6 = org.bouncycastle.asn1.ASN1ObjectIdentifier.g(r6, r1)
            goto L5c
        L4c:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "'contents' cannot be null"
            r6.<init>(r0)
            throw r6
        L54:
            org.bouncycastle.asn1.ASN1UniversalType r1 = org.bouncycastle.asn1.ASN1ObjectIdentifier.a
            org.bouncycastle.asn1.ASN1Primitive r6 = r1.d(r6, r2)
            org.bouncycastle.asn1.ASN1ObjectIdentifier r6 = (org.bouncycastle.asn1.ASN1ObjectIdentifier) r6
        L5c:
            r4.<init>(r0, r6)
            return r4
        L60:
            org.bouncycastle.asn1.x509.GeneralName r1 = new org.bouncycastle.asn1.x509.GeneralName
            org.bouncycastle.asn1.ASN1OctetString r6 = org.bouncycastle.asn1.ASN1OctetString.g(r6, r2)
            r1.<init>(r0, r6)
            return r1
        L6a:
            org.bouncycastle.asn1.x509.GeneralName r2 = new org.bouncycastle.asn1.x509.GeneralName
            org.bouncycastle.asn1.x500.X500NameStyle r3 = org.bouncycastle.asn1.x500.X500Name.a
            org.bouncycastle.asn1.ASN1Sequence r6 = org.bouncycastle.asn1.ASN1Sequence.m(r6, r1)
            org.bouncycastle.asn1.x500.X500Name r6 = org.bouncycastle.asn1.x500.X500Name.b(r6)
            r2.<init>(r0, r6)
            return r2
        L7a:
            org.bouncycastle.asn1.x509.GeneralName r1 = new org.bouncycastle.asn1.x509.GeneralName
            org.bouncycastle.asn1.ASN1UniversalType r3 = org.bouncycastle.asn1.ASN1IA5String.a
            org.bouncycastle.asn1.ASN1Primitive r6 = r3.d(r6, r2)
            org.bouncycastle.asn1.ASN1IA5String r6 = (org.bouncycastle.asn1.ASN1IA5String) r6
            r1.<init>(r0, r6)
            return r1
        L88:
            org.bouncycastle.asn1.x509.GeneralName r1 = new org.bouncycastle.asn1.x509.GeneralName
            org.bouncycastle.asn1.ASN1Sequence r6 = org.bouncycastle.asn1.ASN1Sequence.m(r6, r2)
            r1.<init>(r0, r6)
            return r1
        L92:
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto La9
            byte[] r6 = (byte[]) r6     // Catch: java.io.IOException -> La1
            org.bouncycastle.asn1.ASN1Primitive r6 = org.bouncycastle.asn1.ASN1Primitive.v(r6)     // Catch: java.io.IOException -> La1
            org.bouncycastle.asn1.x509.GeneralName r6 = a(r6)     // Catch: java.io.IOException -> La1
            return r6
        La1:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unable to parse encoded general name"
            r6.<init>(r0)
            throw r6
        La9:
            java.lang.Class r6 = r6.getClass()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.getName()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "unknown object in getInstance: "
            java.lang.String r6 = r1.concat(r6)
            r0.<init>(r6)
            throw r0
        Lc1:
            org.bouncycastle.asn1.x509.GeneralName r6 = (org.bouncycastle.asn1.x509.GeneralName) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.x509.GeneralName.a(java.lang.Object):org.bouncycastle.asn1.x509.GeneralName");
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        int i = this.b;
        return new DERTaggedObject(i == 4, i, this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            int r1 = r3.b
            r0.append(r1)
            java.lang.String r2 = ": "
            r0.append(r2)
            r2 = 1
            if (r1 == r2) goto L33
            r2 = 2
            if (r1 == r2) goto L33
            r2 = 4
            if (r1 == r2) goto L25
            r2 = 6
            if (r1 == r2) goto L33
            org.bouncycastle.asn1.ASN1Encodable r1 = r3.a
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            goto L40
        L25:
            org.bouncycastle.asn1.ASN1Encodable r1 = r3.a
            org.bouncycastle.asn1.x500.X500Name r1 = org.bouncycastle.asn1.x500.X500Name.b(r1)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            goto L40
        L33:
            org.bouncycastle.asn1.ASN1Encodable r1 = r3.a
            org.bouncycastle.asn1.ASN1IA5String r1 = org.bouncycastle.asn1.ASN1IA5String.f(r1)
            java.lang.String r1 = r1.e()
            r0.append(r1)
        L40:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.x509.GeneralName.toString():java.lang.String");
    }

    public GeneralName(X500Name x500Name) {
        this.a = x500Name;
        this.b = 4;
    }

    public GeneralName(String str) {
        this.b = 6;
        this.a = new DERIA5String(str);
    }
}
