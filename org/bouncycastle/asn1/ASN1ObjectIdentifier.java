package org.bouncycastle.asn1;

import defpackage.a;
import defpackage.ffwk;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ASN1ObjectIdentifier extends ASN1Primitive {
    public static final ASN1UniversalType a = new ASN1UniversalType(ASN1ObjectIdentifier.class) { // from class: org.bouncycastle.asn1.ASN1ObjectIdentifier.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive a(DEROctetString dEROctetString) {
            return ASN1ObjectIdentifier.g(dEROctetString.c, false);
        }
    };
    private static final ConcurrentMap b = new ConcurrentHashMap();
    private final byte[] c;
    private String d;

    /* compiled from: PG */
    static class OidHandle {
        private final int a;
        private final byte[] b;

        public OidHandle(byte[] bArr) {
            this.a = ffwk.a(bArr);
            this.b = bArr;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof OidHandle) {
                return Arrays.equals(this.b, ((OidHandle) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.a;
        }
    }

    private ASN1ObjectIdentifier(byte[] bArr, String str) {
        this.c = bArr;
        this.d = str;
    }

    public static ASN1ObjectIdentifier g(byte[] bArr, boolean z) {
        j(bArr.length);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) b.get(new OidHandle(bArr));
        if (aSN1ObjectIdentifier != null) {
            return aSN1ObjectIdentifier;
        }
        if (!ASN1RelativeOID.i(bArr)) {
            throw new IllegalArgumentException("invalid OID contents");
        }
        if (z) {
            bArr = ffwk.c(bArr);
        }
        return new ASN1ObjectIdentifier(bArr, null);
    }

    public static ASN1ObjectIdentifier h(Object obj) {
        if (obj == null || (obj instanceof ASN1ObjectIdentifier)) {
            return (ASN1ObjectIdentifier) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1PrimitiveP = ((ASN1Encodable) obj).p();
            if (aSN1PrimitiveP instanceof ASN1ObjectIdentifier) {
                return (ASN1ObjectIdentifier) aSN1PrimitiveP;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (ASN1ObjectIdentifier) a.c((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct object identifier from byte[]: ".concat(String.valueOf(e.getMessage())));
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
    }

    static void j(int i) {
        if (i > 4096) {
            throw new IllegalArgumentException("exceeded OID contents length limit");
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        return ASN1OutputStream.b(z, this.c.length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.j(z, 6, this.c);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean c(ASN1Primitive aSN1Primitive) {
        if (this == aSN1Primitive) {
            return true;
        }
        if (aSN1Primitive instanceof ASN1ObjectIdentifier) {
            return Arrays.equals(this.c, ((ASN1ObjectIdentifier) aSN1Primitive).c);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return false;
    }

    public final synchronized String e() {
        long j;
        if (this.d == null) {
            byte[] bArr = this.c;
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            long j2 = 0;
            BigInteger bigIntegerShiftLeft = null;
            for (int i = 0; i != bArr.length; i++) {
                byte b2 = bArr[i];
                long j3 = b2 & 127;
                int i2 = b2 & 128;
                if (j2 <= 72057594037927808L) {
                    long j4 = j2 + j3;
                    if (i2 == 0) {
                        if (z) {
                            if (j4 < 40) {
                                sb.append('0');
                            } else {
                                if (j4 < 80) {
                                    sb.append('1');
                                    j = -40;
                                } else {
                                    sb.append('2');
                                    j = -80;
                                }
                                j4 += j;
                            }
                        }
                        sb.append('.');
                        sb.append(j4);
                        z = false;
                        j2 = 0;
                    } else {
                        j2 = j4 << 7;
                    }
                } else {
                    if (bigIntegerShiftLeft == null) {
                        bigIntegerShiftLeft = BigInteger.valueOf(j2);
                    }
                    BigInteger bigIntegerOr = bigIntegerShiftLeft.or(BigInteger.valueOf(j3));
                    if (i2 == 0) {
                        if (z) {
                            sb.append('2');
                            bigIntegerOr = bigIntegerOr.subtract(BigInteger.valueOf(80L));
                        }
                        sb.append('.');
                        sb.append(bigIntegerOr);
                        z = false;
                        j2 = 0;
                        bigIntegerShiftLeft = null;
                    } else {
                        bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                    }
                }
            }
            this.d = sb.toString();
        }
        return this.d;
    }

    public final ASN1ObjectIdentifier f(String str) {
        ConcurrentMap concurrentMap = ASN1RelativeOID.a;
        if (str.length() > 16383) {
            throw new IllegalArgumentException("exceeded relative OID contents length limit");
        }
        if (!ASN1RelativeOID.j(str, 0)) {
            throw new IllegalArgumentException("string " + str + " not a valid relative OID");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OIDTokenizer oIDTokenizer = new OIDTokenizer(str);
        while (oIDTokenizer.b()) {
            String strA = oIDTokenizer.a();
            if (strA.length() <= 18) {
                ASN1RelativeOID.g(byteArrayOutputStream, Long.parseLong(strA));
            } else {
                ASN1RelativeOID.h(byteArrayOutputStream, new BigInteger(strA));
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArr = this.c;
        j(bArr.length + byteArray.length);
        return new ASN1ObjectIdentifier(ffwk.e(bArr, byteArray), e() + "." + str);
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return ffwk.a(this.c);
    }

    public final ASN1ObjectIdentifier i() {
        OidHandle oidHandle = new OidHandle(this.c);
        ConcurrentMap concurrentMap = b;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) concurrentMap.get(oidHandle);
        if (aSN1ObjectIdentifier != null) {
            return aSN1ObjectIdentifier;
        }
        synchronized (concurrentMap) {
            if (concurrentMap.containsKey(oidHandle)) {
                return (ASN1ObjectIdentifier) concurrentMap.get(oidHandle);
            }
            concurrentMap.put(oidHandle, this);
            return this;
        }
    }

    public final boolean m(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        byte[] bArr = aSN1ObjectIdentifier.c;
        int length = bArr.length;
        byte[] bArr2 = this.c;
        if (bArr2.length > length) {
            for (int i = 0; i < length; i++) {
                if (bArr2[i] == bArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        return e();
    }

    public ASN1ObjectIdentifier(String str) {
        char cCharAt;
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        }
        if (str.length() > 16385) {
            throw new IllegalArgumentException("exceeded OID contents length limit");
        }
        if (str.length() < 3 || str.charAt(1) != '.' || (cCharAt = str.charAt(0)) < '0' || cCharAt > '2' || !ASN1RelativeOID.j(str, 2) || !(cCharAt == '2' || str.length() == 3 || str.charAt(3) == '.' || ((str.length() == 4 || str.charAt(4) == '.') && str.charAt(2) < '4'))) {
            throw new IllegalArgumentException(a.a(str, "string ", " not a valid OID"));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OIDTokenizer oIDTokenizer = new OIDTokenizer(str);
        int i = Integer.parseInt(oIDTokenizer.a()) * 40;
        String strA = oIDTokenizer.a();
        long j = i;
        if (strA.length() <= 18) {
            ASN1RelativeOID.g(byteArrayOutputStream, j + Long.parseLong(strA));
        } else {
            ASN1RelativeOID.h(byteArrayOutputStream, new BigInteger(strA).add(BigInteger.valueOf(j)));
        }
        while (oIDTokenizer.b()) {
            String strA2 = oIDTokenizer.a();
            if (strA2.length() <= 18) {
                ASN1RelativeOID.g(byteArrayOutputStream, Long.parseLong(strA2));
            } else {
                ASN1RelativeOID.h(byteArrayOutputStream, new BigInteger(strA2));
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        j(byteArray.length);
        this.c = byteArray;
        this.d = str;
    }
}
