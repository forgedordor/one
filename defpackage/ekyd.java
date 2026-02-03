package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekyd extends ekye {
    public ekyd(ekxe ekxeVar, ekxk ekxkVar) {
        super(ekxeVar, ekxkVar);
    }

    public static ekyd c(ekxa ekxaVar) throws IOException {
        byte bA = ekxaVar.a();
        if (bA != 1) {
            throw new IOException(a.g(bA, "Unsupported S2LatLngRect encoding version "));
        }
        ekxe ekxeVar = new ekxe(ekxaVar.b(), ekxaVar.b());
        ekxk ekxkVar = new ekxk(ekxaVar.b(), ekxaVar.b());
        if (k(ekxeVar, ekxkVar)) {
            return new ekyd(ekxeVar, ekxkVar);
        }
        throw new IOException("Decoded lat and lng intervals do not form a valid S2LatLngRect.");
    }

    public static ekyd d() {
        return new ekyd(new ekxe(1.0d, 0.0d), ekxk.c());
    }

    public static ekyd f() {
        return new ekyd(new ekxe(-1.5707963267948966d, 1.5707963267948966d), ekxk.d());
    }

    @Override // defpackage.ekye
    public final ekxe a() {
        return this.a;
    }

    @Override // defpackage.ekye
    public final ekxk b() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ekyd e(defpackage.ekyb r12) {
        /*
            r11 = this;
            ekyd r0 = new ekyd
            ekxi r1 = r12.a()
            double r1 = r1.c
            ekxe r3 = r11.a
            ekxe r1 = r3.b(r1)
            ekxe r2 = new ekxe
            r3 = -4613618979930100456(0xbff921fb54442d18, double:-1.5707963267948966)
            r5 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            r2.<init>(r3, r5)
            ekxe r3 = new ekxe
            double r4 = r1.a
            double r6 = r2.a
            double r4 = java.lang.Math.max(r4, r6)
            double r6 = r1.b
            double r1 = r2.b
            double r1 = java.lang.Math.min(r6, r1)
            r3.<init>(r4, r1)
            ekxi r12 = r12.b()
            double r1 = r12.c
            ekxk r4 = new ekxk
            ekxk r12 = r11.b
            r4.<init>(r12)
            r5 = 0
            int r12 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r12 < 0) goto L63
            boolean r12 = r4.l()
            if (r12 == 0) goto L4c
            goto L9f
        L4c:
            double r5 = r1 + r1
            double r7 = r4.a()
            double r7 = r7 + r5
            r5 = 4377498837804122112(0x3cc0000000000000, double:4.440892098500626E-16)
            double r7 = r7 + r5
            r5 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            int r12 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r12 < 0) goto L7b
            r4.h()
            goto L9f
        L63:
            boolean r12 = r4.m()
            if (r12 != 0) goto L9f
            double r7 = r1 + r1
            double r9 = r4.a()
            double r9 = r9 + r7
            r7 = -4845873199050653696(0xbcc0000000000000, double:-4.440892098500626E-16)
            double r9 = r9 + r7
            int r12 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r12 > 0) goto L7b
            r4.g()
            goto L9f
        L7b:
            double r5 = r4.a
            double r5 = r5 - r1
            double r5 = defpackage.ekxc.b(r5)
            double r7 = r4.b
            double r7 = r7 + r1
            double r7 = defpackage.ekxc.b(r7)
            r9 = 0
            r4.f(r5, r7, r9)
            double r1 = r4.a
            r5 = -4609115380302729960(0xc00921fb54442d18, double:-3.141592653589793)
            int r12 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r12 > 0) goto L9f
            r1 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            r4.a = r1
        L9f:
            r0.<init>(r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekyd.e(ekyb):ekyd");
    }

    public final ekyd g() {
        ekxe ekxeVar = this.a;
        return (ekxeVar.a == -1.5707963267948966d || ekxeVar.b == 1.5707963267948966d) ? new ekyd(ekxeVar, ekxk.d()) : this;
    }
}
