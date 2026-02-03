package defpackage;

import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ls {
    private static final ekrg a = ekrg.c("android/support/v7/mms/pdu/PduParser");
    private static final String[] b = {"/type=plmn@tmomail.net", "/type=plmn@mmsc1.mtel.ba", "/type=plmn@mmsc1.hteronet.ba"};
    private static byte[] c = null;
    private static byte[] d = null;
    private ByteArrayInputStream e;
    private lq f = null;
    private ln g = null;
    private final boolean h;

    public ls(byte[] bArr, boolean z) {
        this.e = null;
        this.e = new ByteArrayInputStream(bArr);
        this.h = z;
    }

    private static int b(ByteArrayInputStream byteArrayInputStream) {
        return byteArrayInputStream.read() & 255;
    }

    private static int c(ByteArrayInputStream byteArrayInputStream) {
        return byteArrayInputStream.read() & 127;
    }

    private static int d(ByteArrayInputStream byteArrayInputStream) {
        int i = byteArrayInputStream.read();
        if (i != -1) {
            int i2 = 0;
            do {
                i2 = (i2 << 7) | (i & 127);
                if ((i & 128) == 0) {
                    return i2;
                }
                i = byteArrayInputStream.read();
            } while (i != -1);
        }
        return -1;
    }

    private static int e(ByteArrayInputStream byteArrayInputStream) {
        int i = byteArrayInputStream.read() & 255;
        if (i <= 30) {
            return i;
        }
        if (i == 31) {
            return d(byteArrayInputStream);
        }
        throw new lr();
    }

    private static int f(ByteArrayInputStream byteArrayInputStream, int i) {
        int i2 = byteArrayInputStream.read(new byte[i], 0, i);
        if (i2 < i) {
            return -1;
        }
        return i2;
    }

    private static long g(ByteArrayInputStream byteArrayInputStream) {
        byteArrayInputStream.mark(1);
        int i = byteArrayInputStream.read();
        byteArrayInputStream.reset();
        return i > 127 ? c(byteArrayInputStream) : h(byteArrayInputStream);
    }

    private static long h(ByteArrayInputStream byteArrayInputStream) {
        int i = byteArrayInputStream.read() & 255;
        if (i > 8) {
            throw new RuntimeException("Octet count greater than 8 and I can't represent that!");
        }
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) + (byteArrayInputStream.read() & 255);
        }
        return j;
    }

    private static lg i(ByteArrayInputStream byteArrayInputStream) {
        int iC;
        byteArrayInputStream.mark(1);
        int i = byteArrayInputStream.read() & 255;
        if (i == 0) {
            return new lg("");
        }
        byteArrayInputStream.reset();
        if (i < 32) {
            e(byteArrayInputStream);
            iC = c(byteArrayInputStream);
        } else {
            iC = 0;
        }
        byte[] bArrM = m(byteArrayInputStream, 0);
        try {
            return iC != 0 ? new lg(iC, bArrM) : new lg(bArrM);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.ln j(java.io.ByteArrayInputStream r24) throws java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instructions count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ls.j(java.io.ByteArrayInputStream):ln");
    }

    private static lq k(ByteArrayInputStream byteArrayInputStream) throws UnsupportedEncodingException {
        int i;
        int i2;
        int i3;
        lq lqVar;
        lg lgVar;
        byte[] bArrE;
        int i4;
        lq lqVar2 = new lq();
        int i5 = 1;
        int i6 = 1;
        while (i6 != 0 && byteArrayInputStream.available() > 0) {
            byteArrayInputStream.mark(i5);
            int iB = b(byteArrayInputStream);
            if (iB < 32 || iB > 127) {
                lq lqVar3 = null;
                switch (iB) {
                    case 129:
                    case 130:
                    case 151:
                        i = 1;
                        lg lgVarI = i(byteArrayInputStream);
                        if (lgVarI != null) {
                            byte[] bArrE2 = lgVarI.e();
                            if (bArrE2 != null) {
                                String str = new String(bArrE2);
                                ekrw ekrwVarG = a.g();
                                ekrwVarG.X(eksq.a, "PduParser");
                                ((ekrd) ((ekrd) ekrwVarG).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 425, "PduParser.java")).u("parseHeaders: (to/cc/bcc) address: %d redacted-pii[%d-chars]", iB, str.length());
                                int iIndexOf = str.indexOf(47);
                                if (iIndexOf > 0) {
                                    str = str.substring(0, iIndexOf);
                                }
                                try {
                                    lgVarI.d(str.getBytes());
                                } catch (NullPointerException e) {
                                    ekrw ekrwVarI = a.i();
                                    ekrwVarI.X(eksq.a, "PduParser");
                                    ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 435, "PduParser.java")).r("Null pointer error parsing address for header field: %d", iB);
                                    return null;
                                }
                            }
                            try {
                                lqVar2.f(lgVarI, iB);
                            } catch (NullPointerException e2) {
                                ekrw ekrwVarI2 = a.i();
                                ekrwVarI2.X(eksq.a, "PduParser");
                                ((ekrd) ((ekrd) ((ekrd) ekrwVarI2).g(e2)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 444, "PduParser.java")).u("Null pointer error while appending string value to headers, redacted-pii[%d-chars], header field: %d", lgVarI.a(), iB);
                            } catch (RuntimeException e3) {
                                ekrw ekrwVarI3 = a.i();
                                ekrwVarI3.X(eksq.a, "PduParser");
                                ((ekrd) ((ekrd) ((ekrd) ekrwVarI3).g(e3)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 449, "PduParser.java")).r("%d is not Encoded-String-Value header field!", iB);
                                return null;
                            }
                        }
                        i6 = i;
                        i5 = i6;
                    case 131:
                    case 139:
                    case 152:
                    case 158:
                    case 183:
                    case 184:
                    case 185:
                    case 189:
                    case 190:
                        i = 1;
                        byte[] bArrM = m(byteArrayInputStream, 0);
                        if (bArrM != null) {
                            try {
                                ekrw ekrwVarG2 = a.g();
                                ekrwVarG2.X(eksq.a, "PduParser");
                                ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarG2).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 370, "PduParser.java");
                                Integer numValueOf = Integer.valueOf(iB);
                                ekrdVar.I("parseHeaders: headerField: %d (%02x) CONTENT_LOCATION redacted-pii[%d-chars]", numValueOf, numValueOf, Integer.valueOf(bArrM.length));
                                lqVar2.j(bArrM, iB);
                            } catch (NullPointerException e4) {
                                ekrw ekrwVarI4 = a.i();
                                ekrwVarI4.X(eksq.a, "PduParser");
                                ((ekrd) ((ekrd) ((ekrd) ekrwVarI4).g(e4)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", (char) 375, "PduParser.java")).q("Null pointer error while parsing content location");
                            } catch (RuntimeException e5) {
                                ekrw ekrwVarI5 = a.i();
                                ekrwVarI5.X(eksq.a, "PduParser");
                                ((ekrd) ((ekrd) ((ekrd) ekrwVarI5).g(e5)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 378, "PduParser.java")).r("%d is not Text-String header field!", iB);
                                return null;
                            }
                        }
                        i6 = i;
                        i5 = i6;
                    case 132:
                        SparseArray sparseArray = new SparseArray();
                        byte[] bArrL = l(byteArrayInputStream, sparseArray);
                        if (bArrL != null) {
                            try {
                                ekrw ekrwVarG3 = a.g();
                                ekrwVarG3.X(eksq.a, "PduParser");
                                ekrd ekrdVar2 = (ekrd) ((ekrd) ekrwVarG3).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 766, "PduParser.java");
                                Integer numValueOf2 = Integer.valueOf(iB);
                                ekrdVar2.I("parseHeaders: headerField: %d (%02x) CONTENT_TYPE %s", numValueOf2, numValueOf2, new String(bArrL));
                                lqVar2.j(bArrL, 132);
                                i3 = 131;
                            } catch (NullPointerException e6) {
                                ekrw ekrwVarI6 = a.i();
                                ekrwVarI6.X(eksq.a, "PduParser");
                                i3 = 131;
                                ((ekrd) ((ekrd) ((ekrd) ekrwVarI6).g(e6)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", (char) 771, "PduParser.java")).q("Null pointer error while setting the content type");
                            } catch (RuntimeException e7) {
                                ekrw ekrwVarI7 = a.i();
                                ekrwVarI7.X(eksq.a, "PduParser");
                                ((ekrd) ((ekrd) ((ekrd) ekrwVarI7).g(e7)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 774, "PduParser.java")).r("%d is not Text-String header field!", iB);
                                return null;
                            }
                            d = (byte[]) sparseArray.get(153);
                            c = (byte[]) sparseArray.get(i3);
                            i5 = 1;
                            i6 = 0;
                        } else {
                            i3 = 131;
                            d = (byte[]) sparseArray.get(153);
                            c = (byte[]) sparseArray.get(i3);
                            i5 = 1;
                            i6 = 0;
                        }
                    case 133:
                    case 142:
                    case 159:
                        i = 1;
                        try {
                            long jH = h(byteArrayInputStream);
                            ekrw ekrwVarG4 = a.g();
                            ekrwVarG4.X(eksq.a, "PduParser");
                            ekrd ekrdVar3 = (ekrd) ((ekrd) ekrwVarG4).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 317, "PduParser.java");
                            Integer numValueOf3 = Integer.valueOf(iB);
                            ekrdVar3.I("parseHeaders: headerField: %d (%02x) Octet value %d", numValueOf3, numValueOf3, Long.valueOf(jH));
                            lqVar2.h(jH, iB);
                            i6 = i;
                            i5 = i6;
                        } catch (RuntimeException e8) {
                            ekrw ekrwVarI8 = a.i();
                            ekrwVarI8.X(eksq.a, "PduParser");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarI8).g(e8)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 322, "PduParser.java")).r("%d is not Long-Integer header field!", iB);
                            return null;
                        }
                    case 134:
                    case 143:
                    case 144:
                    case 145:
                    case 146:
                    case 148:
                    case 149:
                    case 153:
                    case 155:
                    case 156:
                    case 162:
                    case 163:
                    case 165:
                    case 167:
                    case 169:
                    case 171:
                    case 177:
                    case 180:
                    case 186:
                    case 187:
                    case 188:
                    case 191:
                        i = 1;
                        int iB2 = b(byteArrayInputStream);
                        ekrw ekrwVarG5 = a.g();
                        ekrwVarG5.X(eksq.a, "PduParser");
                        ekrd ekrdVar4 = (ekrd) ((ekrd) ekrwVarG5).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 293, "PduParser.java");
                        Integer numValueOf4 = Integer.valueOf(iB);
                        ekrdVar4.I("parseHeaders: headerField: %d (%02x) Octet value %d", numValueOf4, numValueOf4, Integer.valueOf(iB2));
                        try {
                            lqVar2.i(iB2, iB);
                            i6 = i;
                            i5 = i6;
                        } catch (RuntimeException e9) {
                            ekrw ekrwVarI9 = a.i();
                            ekrwVarI9.X(eksq.a, "PduParser");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarI9).g(e9)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 304, "PduParser.java")).r("%d is not Octet header field!", iB);
                            return null;
                        } catch (li e10) {
                            ekrw ekrwVarI10 = a.i();
                            ekrwVarI10.X(eksq.a, "PduParser");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarI10).g(e10)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 300, "PduParser.java")).u("Set invalid Octet value: %d into the header filed: %d", iB2, iB);
                            return null;
                        }
                    case 135:
                    case 136:
                    case 157:
                        e(byteArrayInputStream);
                        int iB3 = b(byteArrayInputStream);
                        try {
                            long jH2 = h(byteArrayInputStream);
                            if (iB3 == 129) {
                                jH2 += System.currentTimeMillis() / 1000;
                            }
                            try {
                                ekrw ekrwVarG6 = a.g();
                                ekrwVarG6.X(eksq.a, "PduParser");
                                ekrd ekrdVar5 = (ekrd) ((ekrd) ekrwVarG6).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 485, "PduParser.java");
                                Integer numValueOf5 = Integer.valueOf(iB);
                                ekrdVar5.I("parseHeaders: headerField: %d (%02x) time value %d", numValueOf5, numValueOf5, Long.valueOf(jH2));
                                lqVar2.h(jH2, iB);
                                i6 = 1;
                                i5 = 1;
                            } catch (RuntimeException e11) {
                                ekrw ekrwVarI11 = a.i();
                                ekrwVarI11.X(eksq.a, "PduParser");
                                ((ekrd) ((ekrd) ((ekrd) ekrwVarI11).g(e11)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 490, "PduParser.java")).r("%d is not Long-Integer header field!", iB);
                                return null;
                            }
                        } catch (RuntimeException e12) {
                            ekrw ekrwVarI12 = a.i();
                            ekrwVarI12.X(eksq.a, "PduParser");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarI12).g(e12)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 474, "PduParser.java")).r("%d is not Long-Integer header field!", iB);
                            return null;
                        }
                    case 137:
                        e(byteArrayInputStream);
                        if (b(byteArrayInputStream) == 128) {
                            lgVar = i(byteArrayInputStream);
                            if (lgVar == null || (bArrE = lgVar.e()) == null) {
                                lqVar = null;
                            } else {
                                String str2 = new String(bArrE);
                                String[] strArr = b;
                                int i7 = 0;
                                while (true) {
                                    lqVar = lqVar3;
                                    if (i7 < 3) {
                                        String str3 = strArr[i7];
                                        int iIndexOf2 = str2.toLowerCase(Locale.US).indexOf(str3);
                                        String[] strArr2 = strArr;
                                        if (iIndexOf2 > 0) {
                                            i4 = i7;
                                            if (str2.length() == iIndexOf2 + str3.length()) {
                                                ekrw ekrwVarH = a.h();
                                                ekrwVarH.X(eksq.a, "PduParser");
                                                ((ekrd) ((ekrd) ekrwVarH).h("android/support/v7/mms/pdu/PduParser", "stripAddressingIndicator", 811, "PduParser.java")).t("Irregular addressing indicator found, removing %s", str3);
                                                str2 = str2.substring(0, iIndexOf2);
                                            }
                                        } else {
                                            i4 = i7;
                                        }
                                        i7 = i4 + 1;
                                        strArr = strArr2;
                                        lqVar3 = lqVar;
                                    } else {
                                        int iIndexOf3 = str2.indexOf("/TYPE=");
                                        int iLastIndexOf = str2.lastIndexOf(64);
                                        if (iIndexOf3 <= 0 || iLastIndexOf >= 0) {
                                            ekrw ekrwVarH2 = a.h();
                                            ekrwVarH2.X(eksq.a, "PduParser");
                                            ((ekrd) ((ekrd) ekrwVarH2).h("android/support/v7/mms/pdu/PduParser", "stripAddressingIndicator", 827, "PduParser.java")).q("No addressing indicator found, using phone number as is.");
                                        } else {
                                            ekrw ekrwVarH3 = a.h();
                                            ekrwVarH3.X(eksq.a, "PduParser");
                                            ((ekrd) ((ekrd) ekrwVarH3).h("android/support/v7/mms/pdu/PduParser", "stripAddressingIndicator", 823, "PduParser.java")).q("Phone number addressing indicator found, removing");
                                            str2 = str2.substring(0, iIndexOf3);
                                        }
                                    }
                                }
                                try {
                                    lgVar.d(str2.getBytes());
                                } catch (NullPointerException e13) {
                                    ekrw ekrwVarI13 = a.i();
                                    ekrwVarI13.X(eksq.a, "PduParser");
                                    ((ekrd) ((ekrd) ((ekrd) ekrwVarI13).g(e13)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", (char) 521, "PduParser.java")).q("Null pointer error while parsing From: address.");
                                    return lqVar;
                                }
                            }
                        } else {
                            lqVar = null;
                            try {
                                lgVar = new lg("insert-address-token".getBytes());
                            } catch (NullPointerException e14) {
                                ekrw ekrwVarI14 = a.i();
                                ekrwVarI14.X(eksq.a, "PduParser");
                                ((ekrd) ((ekrd) ((ekrd) ekrwVarI14).g(e14)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 531, "PduParser.java")).r("%d is not Encoded-String-Value header field!", iB);
                                return null;
                            }
                        }
                        lg lgVar2 = lgVar;
                        try {
                            ekrw ekrwVarG7 = a.g();
                            ekrwVarG7.X(eksq.a, "PduParser");
                            ekrd ekrdVar6 = (ekrd) ((ekrd) ekrwVarG7).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 538, "PduParser.java");
                            Integer numValueOf6 = Integer.valueOf(iB);
                            ekrdVar6.I("parseHeaders: headerField: %d (%02x) from address redacted-pii[%d-chars]", numValueOf6, numValueOf6, Integer.valueOf(lgVar2.a()));
                            lqVar2.g(lgVar2, 137);
                        } catch (NullPointerException e15) {
                            ekrw ekrwVarI15 = a.i();
                            ekrwVarI15.X(eksq.a, "PduParser");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarI15).g(e15)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 543, "PduParser.java")).r("Null pointer error while setting encoded string value for headers, from redacted-pii[%d-chars]", lgVar2.a());
                        } catch (RuntimeException e16) {
                            ekrw ekrwVarI16 = a.i();
                            ekrwVarI16.X(eksq.a, "PduParser");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarI16).g(e16)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 548, "PduParser.java")).r("%d is not Encoded-String-Value header field!", iB);
                            return lqVar;
                        }
                        i6 = 1;
                        i5 = 1;
                        break;
                    case 138:
                        byteArrayInputStream.mark(1);
                        int iB4 = b(byteArrayInputStream);
                        ekrw ekrwVarG8 = a.g();
                        ekrwVarG8.X(eksq.a, "PduParser");
                        ekrd ekrdVar7 = (ekrd) ((ekrd) ekrwVarG8).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 560, "PduParser.java");
                        Integer numValueOf7 = Integer.valueOf(iB);
                        ekrdVar7.I("parseHeaders: headerField: %d (%02x) MESSAGE_CLASS %d", numValueOf7, numValueOf7, Integer.valueOf(iB4));
                        if (iB4 < 128) {
                            byteArrayInputStream.reset();
                            byte[] bArrM2 = m(byteArrayInputStream, 0);
                            if (bArrM2 != null) {
                                try {
                                    lqVar2.j(bArrM2, 138);
                                } catch (NullPointerException e17) {
                                    ekrw ekrwVarI17 = a.i();
                                    ekrwVarI17.X(eksq.a, "PduParser");
                                    ((ekrd) ((ekrd) ((ekrd) ekrwVarI17).g(e17)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", (char) 599, "PduParser.java")).q("Null pointer error while setting non-personal message class");
                                } catch (RuntimeException e18) {
                                    ekrw ekrwVarI18 = a.i();
                                    ekrwVarI18.X(eksq.a, "PduParser");
                                    ((ekrd) ((ekrd) ((ekrd) ekrwVarI18).g(e18)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 602, "PduParser.java")).r("%d is not Text-String header field!", iB);
                                    return null;
                                }
                            }
                        } else if (iB4 == 128) {
                            try {
                                try {
                                    lqVar2.j("personal".getBytes(), 138);
                                } catch (RuntimeException e19) {
                                    ekrw ekrwVarI19 = a.i();
                                    ekrwVarI19.X(eksq.a, "PduParser");
                                    ((ekrd) ((ekrd) ((ekrd) ekrwVarI19).g(e19)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 587, "PduParser.java")).r("%d is not Text-String header field!", iB);
                                    return null;
                                }
                            } catch (NullPointerException e20) {
                                e = e20;
                                i2 = iB4;
                                ekrw ekrwVarI20 = a.i();
                                ekrwVarI20.X(eksq.a, "PduParser");
                                ((ekrd) ((ekrd) ((ekrd) ekrwVarI20).g(e)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 583, "PduParser.java")).r("Null pointer error while setting message class, message class: %d", i2);
                                i6 = 1;
                                i5 = i6;
                            }
                        } else if (iB4 == 129) {
                            lqVar2.j("advertisement".getBytes(), 138);
                        } else if (iB4 == 130) {
                            lqVar2.j("informational".getBytes(), 138);
                        } else {
                            i2 = 131;
                            if (iB4 == 131) {
                                try {
                                    lqVar2.j("auto".getBytes(), 138);
                                } catch (NullPointerException e21) {
                                    e = e21;
                                    ekrw ekrwVarI202 = a.i();
                                    ekrwVarI202.X(eksq.a, "PduParser");
                                    ((ekrd) ((ekrd) ((ekrd) ekrwVarI202).g(e)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 583, "PduParser.java")).r("Null pointer error while setting message class, message class: %d", i2);
                                    i6 = 1;
                                    i5 = i6;
                                }
                            }
                        }
                        i6 = 1;
                        i5 = i6;
                    case 140:
                        int iB5 = b(byteArrayInputStream);
                        ekrw ekrwVarG9 = a.g();
                        ekrwVarG9.X(eksq.a, "PduParser");
                        ((ekrd) ((ekrd) ekrwVarG9).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 229, "PduParser.java")).u("parseHeaders: messageType: %d headerField (%02x)", iB5, iB);
                        switch (iB5) {
                            case 137:
                            case 138:
                            case 139:
                            case 140:
                            case 141:
                            case 142:
                            case 143:
                            case 144:
                            case 145:
                            case 146:
                            case 147:
                            case 148:
                            case 149:
                            case 150:
                            case 151:
                                break;
                            default:
                                try {
                                    lqVar2.i(iB5, iB);
                                    break;
                                } catch (RuntimeException e22) {
                                    ekrw ekrwVarI21 = a.i();
                                    ekrwVarI21.X(eksq.a, "PduParser");
                                    ((ekrd) ((ekrd) ((ekrd) ekrwVarI21).g(e22)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 259, "PduParser.java")).r("%d is not Octet header field!", iB);
                                    return null;
                                } catch (li e23) {
                                    ekrw ekrwVarI22 = a.i();
                                    ekrwVarI22.X(eksq.a, "PduParser");
                                    ((ekrd) ((ekrd) ((ekrd) ekrwVarI22).g(e23)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 254, "PduParser.java")).u("Set invalid Octet value: %d into the header filed: %d", iB5, iB);
                                    return null;
                                }
                        }
                        i6 = 1;
                        i5 = 1;
                    case 141:
                        int iC = c(byteArrayInputStream);
                        try {
                            ekrw ekrwVarG10 = a.g();
                            ekrwVarG10.X(eksq.a, "PduParser");
                            ekrd ekrdVar8 = (ekrd) ((ekrd) ekrwVarG10).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 616, "PduParser.java");
                            Integer numValueOf8 = Integer.valueOf(iB);
                            ekrdVar8.I("parseHeaders: headerField: %d (%02x) MMS_VERSION %d", numValueOf8, numValueOf8, Integer.valueOf(iC));
                            lqVar2.i(iC, 141);
                            i6 = 1;
                            i5 = 1;
                        } catch (RuntimeException e24) {
                            ekrw ekrwVarI23 = a.i();
                            ekrwVarI23.X(eksq.a, "PduParser");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarI23).g(e24)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 625, "PduParser.java")).r("%d is not Octet header field!", iB);
                            return null;
                        } catch (li e25) {
                            ekrw ekrwVarI24 = a.i();
                            ekrwVarI24.X(eksq.a, "PduParser");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarI24).g(e25)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 621, "PduParser.java")).u("Set invalid Octet value: %d into the header field: %d", iC, iB);
                            return null;
                        }
                    case 147:
                    case 150:
                    case 154:
                    case 166:
                    case 181:
                    case 182:
                        lg lgVarI2 = i(byteArrayInputStream);
                        if (lgVarI2 != null) {
                            try {
                                ekrw ekrwVarG11 = a.g();
                                ekrwVarG11.X(eksq.a, "PduParser");
                                ekrd ekrdVar9 = (ekrd) ((ekrd) ekrwVarG11).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 399, "PduParser.java");
                                Integer numValueOf9 = Integer.valueOf(iB);
                                ekrdVar9.I("parseHeaders: headerField: %d (%02x) encoded string %s", numValueOf9, numValueOf9, lgVarI2.b());
                                lqVar2.g(lgVarI2, iB);
                            } catch (NullPointerException e26) {
                                ekrw ekrwVarI25 = a.i();
                                ekrwVarI25.X(eksq.a, "PduParser");
                                ((ekrd) ((ekrd) ((ekrd) ekrwVarI25).g(e26)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", (char) 404, "PduParser.java")).q("Null pointer error while parsing response text.");
                            } catch (RuntimeException e27) {
                                ekrw ekrwVarI26 = a.i();
                                ekrwVarI26.X(eksq.a, "PduParser");
                                ((ekrd) ((ekrd) ((ekrd) ekrwVarI26).g(e27)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 407, "PduParser.java")).r("%d is not Encoded-String-Value header field!", iB);
                                return null;
                            }
                        }
                        i6 = 1;
                        i5 = 1;
                    case 160:
                        e(byteArrayInputStream);
                        try {
                            g(byteArrayInputStream);
                            lg lgVarI3 = i(byteArrayInputStream);
                            if (lgVarI3 != null) {
                                try {
                                    ekrw ekrwVarG12 = a.g();
                                    ekrwVarG12.X(eksq.a, "PduParser");
                                    ekrd ekrdVar10 = (ekrd) ((ekrd) ekrwVarG12).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 650, "PduParser.java");
                                    Integer numValueOf10 = Integer.valueOf(iB);
                                    ekrdVar10.I("parseHeaders: headerField: %d (%02x) PREVIOUSLY_SENT_BY: %s", numValueOf10, numValueOf10, lgVarI3.b());
                                    lqVar2.g(lgVarI3, 160);
                                } catch (NullPointerException e28) {
                                    ekrw ekrwVarI27 = a.i();
                                    ekrwVarI27.X(eksq.a, "PduParser");
                                    ((ekrd) ((ekrd) ((ekrd) ekrwVarI27).g(e28)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", (char) 655, "PduParser.java")).q("Null pointer error while setting previously_sent_by value");
                                } catch (RuntimeException e29) {
                                    ekrw ekrwVarI28 = a.i();
                                    ekrwVarI28.X(eksq.a, "PduParser");
                                    ((ekrd) ((ekrd) ((ekrd) ekrwVarI28).g(e29)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 658, "PduParser.java")).r("%d is not Encoded-String-Value header field!", iB);
                                    return null;
                                }
                            }
                            i6 = 1;
                            i5 = 1;
                        } catch (RuntimeException e30) {
                            ekrw ekrwVarI29 = a.i();
                            ekrwVarI29.X(eksq.a, "PduParser");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarI29).g(e30)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 642, "PduParser.java")).r("%d is not Integer-Value", iB);
                            return null;
                        }
                    case 161:
                        e(byteArrayInputStream);
                        try {
                            g(byteArrayInputStream);
                            try {
                                long jH3 = h(byteArrayInputStream);
                                ekrw ekrwVarG13 = a.g();
                                ekrwVarG13.X(eksq.a, "PduParser");
                                ekrd ekrdVar11 = (ekrd) ((ekrd) ekrwVarG13).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 684, "PduParser.java");
                                Integer numValueOf11 = Integer.valueOf(iB);
                                ekrdVar11.I("parseHeaders: headerField: %d (%02x) PREVIOUSLY_SENT_DATE %d", numValueOf11, numValueOf11, Long.valueOf(jH3));
                                lqVar2.h(jH3, 161);
                                i6 = 1;
                                i5 = 1;
                            } catch (RuntimeException e31) {
                                ekrw ekrwVarI30 = a.i();
                                ekrwVarI30.X(eksq.a, "PduParser");
                                ((ekrd) ((ekrd) ((ekrd) ekrwVarI30).g(e31)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 689, "PduParser.java")).r("%d is not Long-Integer header field!", iB);
                                return null;
                            }
                        } catch (RuntimeException e32) {
                            ekrw ekrwVarI31 = a.i();
                            ekrwVarI31.X(eksq.a, "PduParser");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarI31).g(e32)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 677, "PduParser.java")).r("%d is not Integer-Value", iB);
                            return null;
                        }
                    case 164:
                        ekrw ekrwVarG14 = a.g();
                        ekrwVarG14.X(eksq.a, "PduParser");
                        ((ekrd) ((ekrd) ekrwVarG14).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 703, "PduParser.java")).u("parseHeaders: headerField: %d (%02x) MM_FLAGS NOT REALLY SUPPORTED", iB, iB);
                        e(byteArrayInputStream);
                        b(byteArrayInputStream);
                        i(byteArrayInputStream);
                        i6 = 1;
                        i5 = 1;
                    case 168:
                    case 174:
                    case 176:
                    default:
                        i = 1;
                        ekrw ekrwVarI32 = a.i();
                        ekrwVarI32.X(eksq.a, "PduParser");
                        ((ekrd) ((ekrd) ekrwVarI32).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 795, "PduParser.java")).u("parseHeaders: Unknown header: %d (%02x)", iB, iB);
                        i6 = i;
                        i5 = i6;
                    case 170:
                    case 172:
                        ekrw ekrwVarG15 = a.g();
                        ekrwVarG15.X(eksq.a, "PduParser");
                        ((ekrd) ((ekrd) ekrwVarG15).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 726, "PduParser.java")).u("parseHeaders: headerField: %d (%02x) MBOX_", iB, iB);
                        e(byteArrayInputStream);
                        b(byteArrayInputStream);
                        try {
                            g(byteArrayInputStream);
                            i6 = 1;
                            i5 = 1;
                        } catch (RuntimeException e33) {
                            ekrw ekrwVarI33 = a.i();
                            ekrwVarI33.X(eksq.a, "PduParser");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarI33).g(e33)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 738, "PduParser.java")).r("%d is not Integer-Value", iB);
                            return null;
                        }
                    case 173:
                    case 175:
                    case 179:
                        try {
                            long jG = g(byteArrayInputStream);
                            ekrw ekrwVarG16 = a.g();
                            ekrwVarG16.X(eksq.a, "PduParser");
                            ekrd ekrdVar12 = (ekrd) ((ekrd) ekrwVarG16).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 336, "PduParser.java");
                            Integer numValueOf12 = Integer.valueOf(iB);
                            ekrdVar12.I("parseHeaders: headerField: %d (%02x) Octet value %d", numValueOf12, numValueOf12, Long.valueOf(jG));
                            lqVar2.h(jG, iB);
                            i6 = 1;
                            i5 = 1;
                        } catch (RuntimeException e34) {
                            ekrw ekrwVarI34 = a.i();
                            ekrwVarI34.X(eksq.a, "PduParser");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarI34).g(e34)).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 341, "PduParser.java")).r("%d is not Long-Integer header field!", iB);
                            return null;
                        }
                    case 178:
                        ekrw ekrwVarG17 = a.g();
                        ekrwVarG17.X(eksq.a, "PduParser");
                        ((ekrd) ((ekrd) ekrwVarG17).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 749, "PduParser.java")).u("parseHeaders: headerField: %d (%02x) ELEMENT_DESCRIPTOR", iB, iB);
                        l(byteArrayInputStream, null);
                        i6 = 1;
                        i5 = 1;
                }
                return null;
            }
            byteArrayInputStream.reset();
            byte[] bArrM3 = m(byteArrayInputStream, 0);
            ekrw ekrwVarG18 = a.g();
            ekrwVarG18.X(eksq.a, "PduParser");
            ((ekrd) ((ekrd) ekrwVarG18).h("android/support/v7/mms/pdu/PduParser", "parseHeaders", 221, "PduParser.java")).t("TextHeader: %s", new String(bArrM3));
        }
        return lqVar2;
    }

    private static byte[] l(ByteArrayInputStream byteArrayInputStream, SparseArray sparseArray) throws UnsupportedEncodingException {
        byte[] bArrM;
        int iAvailable;
        char c2;
        byteArrayInputStream.mark(1);
        int i = byteArrayInputStream.read();
        byteArrayInputStream.reset();
        int i2 = i & 255;
        if (i2 >= 32) {
            return i2 <= 127 ? m(byteArrayInputStream, 0) : lo.a[c(byteArrayInputStream)].getBytes();
        }
        int iE = e(byteArrayInputStream);
        int iAvailable2 = byteArrayInputStream.available();
        byteArrayInputStream.mark(1);
        int i3 = byteArrayInputStream.read();
        byteArrayInputStream.reset();
        int i4 = i3 & 255;
        if (i4 >= 32 && i4 <= 127) {
            bArrM = m(byteArrayInputStream, 0);
        } else {
            if (i4 <= 127) {
                ekrw ekrwVarI = a.i();
                ekrwVarI.X(eksq.a, "PduParser");
                ((ekrd) ((ekrd) ekrwVarI).h("android/support/v7/mms/pdu/PduParser", "parseContentType", 1522, "PduParser.java")).q("Corrupt content-type");
                return lo.a[0].getBytes();
            }
            int iC = c(byteArrayInputStream);
            String[] strArr = lo.a;
            if (iC < 83) {
                bArrM = lo.a[iC].getBytes();
            } else {
                byteArrayInputStream.reset();
                bArrM = m(byteArrayInputStream, 0);
            }
        }
        int iAvailable3 = iE - (iAvailable2 - byteArrayInputStream.available());
        if (iAvailable3 > 0) {
            Integer numValueOf = Integer.valueOf(iAvailable3);
            int iAvailable4 = byteArrayInputStream.available();
            numValueOf.getClass();
            int i5 = iAvailable3;
            while (i5 > 0) {
                int i6 = byteArrayInputStream.read();
                i5--;
                if (i6 != 129) {
                    if (i6 != 131) {
                        if (i6 == 133 || i6 == 151) {
                            byte[] bArrM2 = m(byteArrayInputStream, 0);
                            if (bArrM2 != null && sparseArray != null) {
                                sparseArray.put(151, bArrM2);
                            }
                            iAvailable = byteArrayInputStream.available();
                            numValueOf.getClass();
                        } else {
                            if (i6 != 153) {
                                if (i6 != 137) {
                                    if (i6 != 138) {
                                        ekrg ekrgVar = a;
                                        ekrw ekrwVarI2 = ekrgVar.i();
                                        ekrz ekrzVar = eksq.a;
                                        ekrwVarI2.X(ekrzVar, "PduParser");
                                        ((ekrd) ((ekrd) ekrwVarI2).h("android/support/v7/mms/pdu/PduParser", "parseContentTypeParams", 1461, "PduParser.java")).q("Not supported Content-Type parameter");
                                        if (f(byteArrayInputStream, i5) == -1) {
                                            ekrw ekrwVarI3 = ekrgVar.i();
                                            ekrwVarI3.X(ekrzVar, "PduParser");
                                            ((ekrd) ((ekrd) ekrwVarI3).h("android/support/v7/mms/pdu/PduParser", "parseContentTypeParams", 1463, "PduParser.java")).q("Corrupt Content-Type");
                                        } else {
                                            i5 = 0;
                                        }
                                    }
                                }
                            }
                            byte[] bArrM3 = m(byteArrayInputStream, 0);
                            if (bArrM3 != null && sparseArray != null) {
                                sparseArray.put(153, bArrM3);
                            }
                            iAvailable = byteArrayInputStream.available();
                            numValueOf.getClass();
                        }
                    }
                    byteArrayInputStream.mark(1);
                    int iB = b(byteArrayInputStream);
                    byteArrayInputStream.reset();
                    if (iB > 127) {
                        int iC2 = c(byteArrayInputStream);
                        String[] strArr2 = lo.a;
                        c2 = 'S';
                        if (iC2 < 83) {
                            sparseArray.put(131, lo.a[iC2].getBytes());
                        }
                    } else {
                        c2 = 'S';
                        byte[] bArrM4 = m(byteArrayInputStream, 0);
                        if (bArrM4 != null && sparseArray != null) {
                            sparseArray.put(131, bArrM4);
                        }
                    }
                    int iAvailable5 = byteArrayInputStream.available();
                    numValueOf.getClass();
                    i5 = iAvailable3 - (iAvailable4 - iAvailable5);
                } else {
                    byteArrayInputStream.mark(1);
                    int iB2 = b(byteArrayInputStream);
                    byteArrayInputStream.reset();
                    if ((iB2 <= 32 || iB2 >= 127) && iB2 != 0) {
                        int iG = (int) g(byteArrayInputStream);
                        if (sparseArray != null) {
                            sparseArray.put(129, Integer.valueOf(iG));
                        }
                    } else {
                        byte[] bArrM5 = m(byteArrayInputStream, 0);
                        try {
                            Integer num = (Integer) ((ekod) ld.a).d.get(new String(bArrM5));
                            if (num == null) {
                                throw new UnsupportedEncodingException();
                            }
                            num.intValue();
                            sparseArray.put(129, num);
                        } catch (UnsupportedEncodingException e) {
                            ekrw ekrwVarI4 = a.i();
                            ekrwVarI4.X(eksq.a, "PduParser");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarI4).g(e)).h("android/support/v7/mms/pdu/PduParser", "parseContentTypeParams", 1428, "PduParser.java")).t("unsupported encoding: %s", Arrays.toString(bArrM5));
                            sparseArray.put(129, 0);
                        }
                    }
                    iAvailable = byteArrayInputStream.available();
                    numValueOf.getClass();
                }
                i5 = iAvailable3 - (iAvailable4 - iAvailable);
            }
            if (i5 != 0) {
                ekrw ekrwVarI5 = a.i();
                ekrwVarI5.X(eksq.a, "PduParser");
                ((ekrd) ((ekrd) ekrwVarI5).h("android/support/v7/mms/pdu/PduParser", "parseContentTypeParams", 1472, "PduParser.java")).q("Corrupt Content-Type");
            }
        }
        if (iAvailable3 >= 0) {
            return bArrM;
        }
        ekrw ekrwVarI6 = a.i();
        ekrwVarI6.X(eksq.a, "PduParser");
        ((ekrd) ((ekrd) ekrwVarI6).h("android/support/v7/mms/pdu/PduParser", "parseContentType", 1533, "PduParser.java")).q("Corrupt MMS message");
        return lo.a[0].getBytes();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] m(java.io.ByteArrayInputStream r2, int r3) {
        /*
            r0 = 1
            r2.mark(r0)
            int r1 = r2.read()
            if (r3 != r0) goto L12
            r3 = 34
            if (r1 != r3) goto L1a
            r2.mark(r0)
            goto L1d
        L12:
            r3 = 127(0x7f, float:1.78E-43)
            if (r1 != r3) goto L1a
            r2.mark(r0)
            goto L1d
        L1a:
            r2.reset()
        L1d:
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            int r0 = r2.read()
        L26:
            r1 = -1
            if (r0 == r1) goto L51
            if (r0 == 0) goto L51
            r1 = 32
            if (r0 < r1) goto L33
            r1 = 126(0x7e, float:1.77E-43)
            if (r0 <= r1) goto L49
        L33:
            r1 = 128(0x80, float:1.794E-43)
            if (r0 < r1) goto L3c
            r1 = 255(0xff, float:3.57E-43)
            if (r0 > r1) goto L3c
            goto L49
        L3c:
            r1 = 9
            if (r0 == r1) goto L49
            r1 = 10
            if (r0 == r1) goto L49
            r1 = 13
            if (r0 == r1) goto L49
            goto L4c
        L49:
            r3.write(r0)
        L4c:
            int r0 = r2.read()
            goto L26
        L51:
            int r2 = r3.size()
            if (r2 <= 0) goto L5c
            byte[] r2 = r3.toByteArray()
            return r2
        L5c:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ls.m(java.io.ByteArrayInputStream, int):byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.lh a() {
        /*
            Method dump skipped, instructions count: 1720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ls.a():lh");
    }
}
