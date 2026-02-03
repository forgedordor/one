package org.bouncycastle.asn1;

import defpackage.ffwk;
import defpackage.ffwu;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ASN1UTCTime extends ASN1Primitive {
    final byte[] a;

    /* compiled from: PG */
    /* renamed from: org.bouncycastle.asn1.ASN1UTCTime$1, reason: invalid class name */
    class AnonymousClass1 extends ASN1UniversalType {
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive a(DEROctetString dEROctetString) {
            throw null;
        }
    }

    public ASN1UTCTime(String str) {
        this.a = ffwu.d(str);
        try {
            new SimpleDateFormat("yyMMddHHmmssz", LocaleUtil.a).parse(f());
        } catch (ParseException e) {
            throw new IllegalArgumentException("invalid date string: ".concat(String.valueOf(e.getMessage())));
        }
    }

    private final boolean g(int i) {
        byte b;
        byte[] bArr = this.a;
        return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        return ASN1OutputStream.b(z, this.a.length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.j(z, 23, this.a);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean c(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1UTCTime) {
            return Arrays.equals(this.a, ((ASN1UTCTime) aSN1Primitive).a);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return false;
    }

    public final String e() {
        String strF = f();
        return (strF.charAt(0) < '5' ? "20" : "19").concat(strF);
    }

    public final String f() {
        String strA = ffwu.a(this.a);
        if (strA.indexOf(45) < 0 && strA.indexOf(43) < 0) {
            return strA.length() == 11 ? String.valueOf(strA.substring(0, 10)).concat("00GMT+00:00") : String.valueOf(strA.substring(0, 12)).concat("GMT+00:00");
        }
        int iIndexOf = strA.indexOf(45);
        if (iIndexOf < 0) {
            iIndexOf = strA.indexOf(43);
        }
        if (iIndexOf == strA.length() - 3) {
            strA = strA.concat("00");
        }
        if (iIndexOf == 10) {
            return strA.substring(0, 10) + "00GMT" + strA.substring(10, 13) + ":" + strA.substring(13, 15);
        }
        return strA.substring(0, 12) + "GMT" + strA.substring(12, 15) + ":" + strA.substring(15, 17);
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return ffwk.a(this.a);
    }

    public final String toString() {
        return ffwu.a(this.a);
    }

    public ASN1UTCTime(byte[] bArr) {
        if (bArr.length >= 2) {
            this.a = bArr;
            if (!g(0) || !g(1)) {
                throw new IllegalArgumentException("illegal characters in UTCTime string");
            }
            return;
        }
        throw new IllegalArgumentException("UTCTime string too short");
    }
}
