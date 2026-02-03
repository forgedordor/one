package org.bouncycastle.asn1;

import defpackage.ffwk;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ASN1UniversalString extends ASN1Primitive implements ASN1String {
    public static final /* synthetic */ int b = 0;
    private static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final byte[] a;

    /* compiled from: PG */
    /* renamed from: org.bouncycastle.asn1.ASN1UniversalString$1, reason: invalid class name */
    class AnonymousClass1 extends ASN1UniversalType {
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive a(DEROctetString dEROctetString) {
            throw null;
        }
    }

    public ASN1UniversalString(byte[] bArr) {
        this.a = bArr;
    }

    private static void f(StringBuffer stringBuffer, int i) {
        char[] cArr = c;
        stringBuffer.append(cArr[(i >>> 4) & 15]);
        stringBuffer.append(cArr[i & 15]);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        return ASN1OutputStream.b(z, this.a.length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.j(z, 28, this.a);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean c(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1UniversalString) {
            return Arrays.equals(this.a, ((ASN1UniversalString) aSN1Primitive).a);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f A[LOOP:0: B:11:0x003d->B:12:0x003f, LOOP_END] */
    @Override // org.bouncycastle.asn1.ASN1String
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e() {
        /*
            r11 = this;
            byte[] r0 = r11.a
            int r1 = r0.length
            int r2 = org.bouncycastle.asn1.ASN1OutputStream.a(r1)
            int r2 = r2 + r1
            int r2 = r2 + r2
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            int r2 = r2 + 3
            r3.<init>(r2)
            java.lang.String r2 = "#1C"
            r3.append(r2)
            r2 = 0
            r4 = 128(0x80, float:1.794E-43)
            if (r1 >= r4) goto L1e
            f(r3, r1)
            goto L3d
        L1e:
            r5 = 5
            byte[] r6 = new byte[r5]
            r8 = r1
            r7 = r5
        L23:
            int r9 = r7 + (-1)
            byte r10 = (byte) r8
            r6[r9] = r10
            int r8 = r8 >>> 8
            if (r8 != 0) goto L4e
            int r8 = 5 - r9
            int r7 = r7 + (-2)
            r4 = r4 | r8
            byte r4 = (byte) r4
            r6[r7] = r4
        L34:
            int r4 = r7 + 1
            r7 = r6[r7]
            f(r3, r7)
            if (r4 < r5) goto L4c
        L3d:
            if (r2 >= r1) goto L47
            r4 = r0[r2]
            f(r3, r4)
            int r2 = r2 + 1
            goto L3d
        L47:
            java.lang.String r0 = r3.toString()
            return r0
        L4c:
            r7 = r4
            goto L34
        L4e:
            r7 = r9
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.ASN1UniversalString.e():java.lang.String");
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return ffwk.a(this.a);
    }

    public final String toString() {
        return e();
    }
}
