package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipv {
    public static final void a(ioe ioeVar, ipq ipqVar) {
        List list = ipqVar.j;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ips ipsVar = (ips) list.get(i);
            if (ipsVar instanceof ipw) {
                iol iolVar = new iol();
                ipw ipwVar = (ipw) ipsVar;
                iolVar.c = ipwVar.b;
                iolVar.m = true;
                iolVar.f();
                iolVar.p.m(ipwVar.c);
                iolVar.f();
                String str = ipwVar.a;
                iolVar.f();
                iolVar.a = ipwVar.d;
                iolVar.f();
                iolVar.b = ipwVar.e;
                iolVar.f();
                iolVar.f = ipwVar.f;
                iolVar.f();
                iolVar.d = ipwVar.g;
                iolVar.f();
                iolVar.e = ipwVar.h;
                iolVar.n = true;
                iolVar.f();
                iolVar.g = ipwVar.i;
                iolVar.n = true;
                iolVar.f();
                iolVar.h = ipwVar.j;
                iolVar.n = true;
                iolVar.f();
                iolVar.i = ipwVar.k;
                iolVar.n = true;
                iolVar.f();
                iolVar.j = ipwVar.l;
                iolVar.o = true;
                iolVar.f();
                iolVar.k = ipwVar.m;
                iolVar.o = true;
                iolVar.f();
                iolVar.l = ipwVar.n;
                iolVar.o = true;
                iolVar.f();
                ioeVar.c(i, iolVar);
            } else if (ipsVar instanceof ipq) {
                ioe ioeVar2 = new ioe();
                ipq ipqVar2 = (ipq) ipsVar;
                ioeVar2.f = ipqVar2.a;
                ioeVar2.f();
                ioeVar2.g = ipqVar2.b;
                ioeVar2.n = true;
                ioeVar2.f();
                ioeVar2.j = ipqVar2.e;
                ioeVar2.n = true;
                ioeVar2.f();
                ioeVar2.k = ipqVar2.f;
                ioeVar2.n = true;
                ioeVar2.f();
                ioeVar2.l = ipqVar2.g;
                ioeVar2.n = true;
                ioeVar2.f();
                ioeVar2.m = ipqVar2.h;
                ioeVar2.n = true;
                ioeVar2.f();
                ioeVar2.h = ipqVar2.c;
                ioeVar2.n = true;
                ioeVar2.f();
                ioeVar2.i = ipqVar2.d;
                ioeVar2.n = true;
                ioeVar2.f();
                ioeVar2.c = ipqVar2.i;
                ioeVar2.d = true;
                ioeVar2.f();
                a(ioeVar2, ipqVar2);
                ioeVar.c(i, ioeVar2);
            }
        }
    }

    public static final ipu b(ioi ioiVar, hml hmlVar) {
        kio kioVar = (kio) hmlVar.e(jmh.e);
        float f = ioiVar.m;
        boolean zC = hmlVar.C((Float.floatToRawIntBits(kioVar.ed()) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        Object objF = hmlVar.f();
        if (zC || objF == hmk.a) {
            ioe ioeVar = new ioe();
            a(ioeVar, ioiVar.i);
            float f2 = ioiVar.e;
            float f3 = ioiVar.f;
            float fEn = kioVar.en(f2);
            float fEn2 = kioVar.en(f3);
            long jFloatToRawIntBits = Float.floatToRawIntBits(fEn);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fEn2);
            float fIntBitsToFloat = ioiVar.g;
            float fIntBitsToFloat2 = ioiVar.h;
            long j = (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L);
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            }
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            }
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fIntBitsToFloat2);
            long j2 = jFloatToRawIntBits3 << 32;
            long j3 = 4294967295L & jFloatToRawIntBits4;
            ipu ipuVar = new ipu(ioeVar);
            String str = ioiVar.d;
            long j4 = ioiVar.j;
            iit iitVar = j4 != 16 ? new iit(j4, ioiVar.k) : null;
            boolean z = ioiVar.l;
            ipuVar.a.b(new ihz(j));
            ipuVar.b.b(Boolean.valueOf(z));
            ipo ipoVar = ipuVar.c;
            ipoVar.e.b(iitVar);
            ipoVar.f.b(new ihz(j2 | j3));
            ipoVar.b = str;
            hmlVar.y(ipuVar);
            objF = ipuVar;
        }
        return (ipu) objF;
    }
}
