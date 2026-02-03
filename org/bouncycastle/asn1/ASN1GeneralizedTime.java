package org.bouncycastle.asn1;

import defpackage.a;
import defpackage.ffwk;
import defpackage.ffwu;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ASN1GeneralizedTime extends ASN1Primitive {
    static final ASN1UniversalType a = new ASN1UniversalType(ASN1GeneralizedTime.class) { // from class: org.bouncycastle.asn1.ASN1GeneralizedTime.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive a(DEROctetString dEROctetString) {
            return new ASN1GeneralizedTime(dEROctetString.c);
        }
    };
    final byte[] b;

    public ASN1GeneralizedTime(String str) {
        this.b = ffwu.d(str);
        try {
            f();
        } catch (ParseException e) {
            throw new IllegalArgumentException("invalid date string: ".concat(String.valueOf(e.getMessage())));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ASN1GeneralizedTime g(Object obj) {
        if (obj == 0 || (obj instanceof ASN1GeneralizedTime)) {
            return (ASN1GeneralizedTime) obj;
        }
        ASN1Primitive aSN1PrimitiveP = obj.p();
        if (aSN1PrimitiveP instanceof ASN1GeneralizedTime) {
            return (ASN1GeneralizedTime) aSN1PrimitiveP;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
        }
        try {
            return (ASN1GeneralizedTime) a.c((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: ".concat(String.valueOf(e.toString())));
        }
    }

    private final String m(String str) {
        String str2;
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str2 = "-";
        } else {
            str2 = "+";
        }
        int i = rawOffset / 3600000;
        int i2 = (rawOffset - (3600000 * i)) / 60000;
        try {
            if (timeZone.useDaylightTime()) {
                if (h()) {
                    str = r(str);
                }
                if (timeZone.inDaylightTime(n().parse(str + "GMT" + str2 + q(i) + ":" + q(i2)))) {
                    i += true != str2.equals("+") ? -1 : 1;
                }
            }
        } catch (ParseException unused) {
        }
        return "GMT" + str2 + q(i) + ":" + q(i2);
    }

    private final SimpleDateFormat n() {
        SimpleDateFormat simpleDateFormat = h() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz") : j() ? new SimpleDateFormat("yyyyMMddHHmmssz") : i() ? new SimpleDateFormat("yyyyMMddHHmmz") : new SimpleDateFormat("yyyyMMddHHz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    private final boolean o(int i) {
        byte b;
        byte[] bArr = this.b;
        return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
    }

    private static final String q(int i) {
        return i < 10 ? a.g(i, "0") : Integer.toString(i);
    }

    private static final String r(String str) {
        char cCharAt;
        String strSubstring = str.substring(14);
        int i = 1;
        while (i < strSubstring.length() && (cCharAt = strSubstring.charAt(i)) >= '0' && cCharAt <= '9') {
            i++;
        }
        int i2 = i - 1;
        if (i2 > 3) {
            return String.valueOf(str.substring(0, 14)).concat(String.valueOf(strSubstring.substring(0, 4)).concat(String.valueOf(strSubstring.substring(i))));
        }
        if (i2 == 1) {
            return String.valueOf(str.substring(0, 14)).concat(strSubstring.substring(0, i) + "00" + strSubstring.substring(i));
        }
        if (i2 != 2) {
            return str;
        }
        return String.valueOf(str.substring(0, 14)).concat(strSubstring.substring(0, i) + "0" + strSubstring.substring(i));
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int a(boolean z) {
        return ASN1OutputStream.b(z, this.b.length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.j(z, 24, this.b);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean c(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1GeneralizedTime) {
            return Arrays.equals(this.b, ((ASN1GeneralizedTime) aSN1Primitive).b);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return false;
    }

    public final String e() {
        String strA = ffwu.a(this.b);
        if (strA.charAt(strA.length() - 1) == 'Z') {
            return String.valueOf(strA.substring(0, strA.length() - 1)).concat("GMT+00:00");
        }
        int length = strA.length();
        char cCharAt = strA.charAt(length - 6);
        if ((cCharAt == '-' || cCharAt == '+') && strA.indexOf("GMT") == length - 9) {
            return strA;
        }
        int length2 = strA.length();
        int i = length2 - 5;
        char cCharAt2 = strA.charAt(i);
        if (cCharAt2 == '-' || cCharAt2 == '+') {
            int i2 = length2 - 2;
            return strA.substring(0, i) + "GMT" + strA.substring(i, i2) + ":" + strA.substring(i2);
        }
        int length3 = strA.length() - 3;
        char cCharAt3 = strA.charAt(length3);
        if (cCharAt3 != '-' && cCharAt3 != '+') {
            return strA.concat(m(strA));
        }
        return strA.substring(0, length3) + "GMT" + strA.substring(length3) + ":00";
    }

    public final Date f() {
        SimpleDateFormat simpleDateFormatN;
        String strA = ffwu.a(this.b);
        if (strA.endsWith("Z")) {
            simpleDateFormatN = h() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'", LocaleUtil.a) : j() ? new SimpleDateFormat("yyyyMMddHHmmss'Z'", LocaleUtil.a) : i() ? new SimpleDateFormat("yyyyMMddHHmm'Z'", LocaleUtil.a) : new SimpleDateFormat("yyyyMMddHH'Z'", LocaleUtil.a);
            simpleDateFormatN.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (strA.indexOf(45) > 0 || strA.indexOf(43) > 0) {
            strA = e();
            simpleDateFormatN = n();
        } else {
            simpleDateFormatN = h() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS") : j() ? new SimpleDateFormat("yyyyMMddHHmmss") : i() ? new SimpleDateFormat("yyyyMMddHHmm") : new SimpleDateFormat("yyyyMMddHH");
            simpleDateFormatN.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (h()) {
            strA = r(strA);
        }
        return simpleDateFormatN.parse(strA);
    }

    protected final boolean h() {
        int i = 0;
        while (true) {
            byte[] bArr = this.b;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return ffwk.a(this.b);
    }

    protected final boolean i() {
        return o(10) && o(11);
    }

    protected final boolean j() {
        return o(12) && o(13);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive k() {
        return new DERGeneralizedTime(this.b);
    }

    public ASN1GeneralizedTime(byte[] bArr) {
        if (bArr.length >= 4) {
            this.b = bArr;
            if (!o(0) || !o(1) || !o(2) || !o(3)) {
                throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
            }
            return;
        }
        throw new IllegalArgumentException("GeneralizedTime string too short");
    }
}
