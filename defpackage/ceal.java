package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceal {
    private static final cqce d = cqce.g("Bugle", "PduComposer");
    private static final cvw e = new cvw();
    public int b;
    private final lh f;
    private final ContentResolver g;
    private final lq h;
    public final ceai c = new ceai(this);
    public ByteArrayOutputStream a = new ByteArrayOutputStream();

    static {
        int i = 0;
        while (true) {
            String[] strArr = lo.a;
            if (i >= 83) {
                return;
            }
            e.put(lo.a[i], Integer.valueOf(i));
            i++;
        }
    }

    public ceal(Context context, lh lhVar) {
        this.b = 0;
        this.f = lhVar;
        this.g = context.getContentResolver();
        this.h = lhVar.a;
        this.b = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0139 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0165 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int d(int r9) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceal.d(int):int");
    }

    private final int e() throws IOException {
        int iD;
        ceai ceaiVar = this.c;
        ceaiVar.c();
        lq lqVar = this.h;
        ceak ceakVarA = ceaiVar.a();
        byte[] bArrK = lqVar.k(132);
        Integer num = (Integer) e.get(bArrK == null ? "" : new String(bArrK));
        int i = 1;
        if (num == null) {
            return 1;
        }
        j(num.intValue());
        ln lnVar = ((lk) this.f).b;
        int i2 = 0;
        if (lnVar == null || lnVar.a() == 0) {
            l(0L);
            ceaiVar.d();
            ceaiVar.b();
            return 0;
        }
        byte b = 62;
        byte b2 = 60;
        try {
            lt ltVarB = lnVar.b(0);
            byte[] bArrL = ltVarB.l();
            if (bArrL != null) {
                a(138);
                if (bArrL[0] == 60 && bArrL[bArrL.length - 1] == 62) {
                    k(bArrL);
                } else {
                    k(("<" + new String(bArrL) + ">").getBytes());
                }
            }
            a(137);
            k(ltVarB.n());
        } catch (ArrayIndexOutOfBoundsException e2) {
            d.o("cannot make message body", e2);
        }
        int iA = ceakVarA.a();
        ceai ceaiVar2 = this.c;
        ceaiVar2.d();
        m(iA);
        ceaiVar2.b();
        int iA2 = lnVar.a();
        l(iA2);
        int i3 = 0;
        while (i3 < iA2) {
            lt ltVarB2 = lnVar.b(i3);
            ceaiVar2.c();
            ceak ceakVarA2 = ceaiVar2.a();
            ceaiVar2.c();
            ceak ceakVarA3 = ceaiVar2.a();
            byte[] bArrN = ltVarB2.n();
            if (bArrN == null) {
                return i;
            }
            int i4 = i;
            int i5 = i2;
            Integer num2 = (Integer) e.get(new String(bArrN));
            if (num2 == null) {
                k(bArrN);
            } else {
                j(num2.intValue());
            }
            byte[] bArrP = ltVarB2.p();
            if (bArrP == null && (bArrP = ltVarB2.o()) == null && (bArrP = ltVarB2.m()) == null) {
                bArrP = "smil.xml".getBytes();
            }
            a(133);
            k(bArrP);
            int iA3 = ltVarB2.a();
            if (iA3 != 0) {
                a(129);
                j(iA3);
            }
            int iA4 = ceakVarA3.a();
            ceaiVar2.d();
            m(iA4);
            ceaiVar2.b();
            byte[] bArrL2 = ltVarB2.l();
            if (bArrL2 != null) {
                a(192);
                if (bArrL2[i5] == b2 && bArrL2[bArrL2.length - 1] == b) {
                    i(bArrL2);
                } else {
                    i(("<" + new String(bArrL2) + ">").getBytes());
                }
            }
            byte[] bArrM = ltVarB2.m();
            if (bArrM != null) {
                a(142);
                k(bArrM);
            }
            int iA5 = ceakVarA2.a();
            evqs evqsVar = ltVarB2.f;
            if (evqsVar != null) {
                try {
                    evqsVar.q(this.a);
                    this.b += evqsVar.d();
                    iD = evqsVar.d();
                } catch (IOException e3) {
                    throw new IllegalStateException("ByteArrayOutputStream shouldn't throw IOException when written to.", e3);
                }
            } else {
                InputStream inputStream = null;
                try {
                    byte[] bArr = new byte[1024];
                    Uri uri = ltVarB2.e;
                    if (uri == null) {
                        return i4;
                    }
                    InputStream inputStreamOpenInputStream = this.g.openInputStream(uri);
                    if (inputStreamOpenInputStream == null) {
                        return i4;
                    }
                    int i6 = i5;
                    while (true) {
                        int i7 = inputStreamOpenInputStream.read(bArr);
                        if (i7 != -1) {
                            this.a.write(bArr, i5, i7);
                            this.b += i7;
                            i6 += i7;
                            i5 = 0;
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    inputStreamOpenInputStream.close();
                    iD = i6;
                } catch (IOException | RuntimeException unused2) {
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return i4;
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            }
            if (iD != ceakVarA2.a() - iA5) {
                throw new RuntimeException("BUG: Length sanity check failed");
            }
            ceai ceaiVar3 = this.c;
            ceaiVar3.d();
            l(iA5);
            l(iD);
            ceaiVar3.b();
            i3++;
            i = i4;
            i2 = 0;
            b = 62;
            b2 = 60;
        }
        return i2;
    }

    private static lg f(lg lgVar) {
        String strB = lgVar.b();
        char c = strB.matches("[0-9]{1,3}\\.{1}[0-9]{1,3}\\.{1}[0-9]{1,3}\\.{1}[0-9]{1,3}") ? (char) 3 : strB.matches("\\+?[0-9|\\.|\\-]+") ? (char) 1 : strB.matches("[a-zA-Z| ]*\\<{0,1}[a-zA-Z| ]+@{1}[a-zA-Z| ]+\\.{1}[a-zA-Z| ]+\\>{0,1}") ? (char) 2 : strB.matches("[a-fA-F]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}\\:{1}[a-fA-F0-9]{4}") ? (char) 4 : (char) 5;
        lg lgVar2 = new lg(lgVar.a, lgVar.b);
        if (c == 1) {
            lgVar2.c("/TYPE=PLMN".getBytes());
            return lgVar2;
        }
        if (c == 3) {
            lgVar2.c("/TYPE=IPV4".getBytes());
            return lgVar2;
        }
        if (c == 4) {
            lgVar2.c("/TYPE=IPV6".getBytes());
        }
        return lgVar2;
    }

    private final void g(lg lgVar) {
        byte[] bArrE = lgVar.e();
        if (bArrE == null) {
            return;
        }
        int i = lgVar.a;
        ceai ceaiVar = this.c;
        ceaiVar.c();
        ceak ceakVarA = ceaiVar.a();
        j(i);
        k(bArrE);
        int iA = ceakVarA.a();
        ceaiVar.d();
        m(iA);
        ceaiVar.b();
    }

    private final void h(long j) {
        int i = 0;
        long j2 = j;
        int i2 = 0;
        while (j2 != 0 && i2 < 8) {
            j2 >>>= 8;
            i2++;
        }
        a(i2);
        int i3 = (i2 - 1) * 8;
        while (i < i2) {
            a((int) ((j >>> i3) & 255));
            i++;
            i3 -= 8;
        }
    }

    private final void i(byte[] bArr) {
        a(34);
        c(bArr, bArr.length);
        a(0);
    }

    private final void j(int i) {
        a((i | 128) & 255);
    }

    private final void k(byte[] bArr) {
        if ((bArr[0] & 255) > 127) {
            a(127);
        }
        c(bArr, bArr.length);
        a(0);
    }

    private final void l(long j) {
        int i = 0;
        long j2 = 127;
        while (i < 5 && j >= j2) {
            j2 = (j2 << 7) | 127;
            i++;
        }
        while (i > 0) {
            a((int) (((j >>> (i * 7)) & 127) | 128));
            i--;
        }
        a((int) (j & 127));
    }

    private final void m(long j) {
        if (j < 31) {
            a((int) j);
        } else {
            a(31);
            l(j);
        }
    }

    protected final void a(int i) {
        this.a.write(i);
        this.b++;
    }

    public final byte[] b() {
        switch (this.f.a()) {
            case 128:
                if (this.a == null) {
                    this.a = new ByteArrayOutputStream();
                    this.b = 0;
                }
                a(140);
                a(128);
                a(152);
                byte[] bArrK = this.h.k(152);
                if (bArrK == null) {
                    throw new IllegalArgumentException("Transaction-ID is null.");
                }
                k(bArrK);
                if (d(141) != 0) {
                    return null;
                }
                d(133);
                if (d(137) != 0) {
                    return null;
                }
                boolean z = d(151) != 1;
                boolean z2 = !(d(130) == 1);
                boolean z3 = !(d(129) == 1);
                if (d(186) == 1 && (!(z | z2) && !z3)) {
                    return null;
                }
                d(150);
                d(138);
                d(136);
                d(143);
                d(134);
                d(144);
                a(132);
                if (e() != 0) {
                    return null;
                }
                break;
            case 129:
            case 134:
            default:
                return null;
            case 130:
                if (this.a == null) {
                    this.a = new ByteArrayOutputStream();
                    this.b = 0;
                }
                a(140);
                a(130);
                if (d(152) != 0 || d(141) != 0 || d(137) != 0) {
                    return null;
                }
                d(150);
                if (d(138) != 0 || d(142) != 0 || d(136) != 0 || d(131) != 0) {
                    return null;
                }
                break;
            case 131:
                if (this.a == null) {
                    this.a = new ByteArrayOutputStream();
                    this.b = 0;
                }
                a(140);
                a(131);
                if (d(152) != 0 || d(141) != 0 || d(149) != 0) {
                    return null;
                }
                break;
            case 132:
                if (this.a == null) {
                    this.a = new ByteArrayOutputStream();
                    this.b = 0;
                }
                a(140);
                a(132);
                if (d(152) != 0 || d(141) != 0 || d(139) != 0 || d(133) != 0 || d(137) != 0) {
                    return null;
                }
                int iD = d(186);
                if (iD != 0 && iD != 2) {
                    return null;
                }
                int iD2 = d(151);
                if (iD2 != 0 && iD2 != 2) {
                    return null;
                }
                int iD3 = d(153);
                if (iD3 != 0 && iD3 != 2) {
                    return null;
                }
                a(132);
                if (e() != 0) {
                    return null;
                }
                break;
            case 133:
                if (this.a == null) {
                    this.a = new ByteArrayOutputStream();
                    this.b = 0;
                }
                a(140);
                a(133);
                if (d(152) != 0 || d(141) != 0) {
                    return null;
                }
                d(145);
                break;
                break;
            case 135:
                if (this.a == null) {
                    this.a = new ByteArrayOutputStream();
                    this.b = 0;
                }
                a(140);
                a(135);
                if (d(141) != 0 || d(139) != 0 || d(151) != 0 || d(137) != 0) {
                    return null;
                }
                d(133);
                if (d(155) != 0) {
                    return null;
                }
                break;
        }
        return this.a.toByteArray();
    }

    protected final void c(byte[] bArr, int i) {
        this.a.write(bArr, 0, i);
        this.b += i;
    }
}
