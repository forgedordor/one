package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ian {
    public final fdap a;
    public Object b;
    public cuq c;
    public int d = -1;
    public final cuz e;
    public final cuz f;
    public final cva g;
    public final hum h;
    public final hnv i;
    public int j;
    public final cuz k;
    public final HashMap l;

    public ian(fdap fdapVar) {
        this.a = fdapVar;
        long[] jArr = cvp.a;
        this.e = new cuz((byte[]) null);
        this.f = new cuz((byte[]) null);
        this.g = new cva((byte[]) null);
        this.h = new hum(new hnu[16]);
        this.i = new iam(this);
        this.k = new cuz((byte[]) null);
        this.l = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r21, int r22, java.lang.Object r23, defpackage.cuq r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            int r3 = r0.j
            if (r3 <= 0) goto Lc
            goto L91
        Lc:
            r3 = r24
            int r3 = r3.d(r1, r2)
            boolean r4 = r1 instanceof defpackage.hnu
            r5 = 2
            if (r4 == 0) goto L7d
            if (r3 == r2) goto L7d
            r2 = r1
            hnu r2 = (defpackage.hnu) r2
            hns r2 = r2.f()
            java.util.HashMap r4 = r0.l
            java.lang.Object r6 = r2.e
            r4.put(r1, r6)
            cve r2 = r2.d
            cuz r4 = r0.k
            defpackage.huq.b(r4, r1)
            java.lang.Object[] r6 = r2.b
            long[] r2 = r2.a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7d
            r9 = 0
        L38:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            r13 = 0
        L4c:
            int r14 = r12 >>> 31
            r15 = 8
            int r14 = 8 - r14
            if (r13 >= r14) goto L76
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r10 & r16
            r18 = 128(0x80, double:6.32E-322)
            int r14 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r14 >= 0) goto L72
            int r14 = r9 << 3
            int r14 = r14 + r13
            r14 = r6[r14]
            iaw r14 = (defpackage.iaw) r14
            boolean r8 = r14 instanceof defpackage.iax
            if (r8 == 0) goto L6f
            r8 = r14
            iax r8 = (defpackage.iax) r8
            r8.j(r5)
        L6f:
            defpackage.huq.a(r4, r14, r1)
        L72:
            long r10 = r10 >> r15
            int r13 = r13 + 1
            goto L4c
        L76:
            if (r14 != r15) goto L7d
        L78:
            if (r9 == r7) goto L7d
            int r9 = r9 + 1
            goto L38
        L7d:
            r2 = -1
            if (r3 != r2) goto L91
            boolean r2 = r1 instanceof defpackage.iax
            if (r2 == 0) goto L8a
            r2 = r1
            iax r2 = (defpackage.iax) r2
            r2.j(r5)
        L8a:
            cuz r2 = r0.e
            r3 = r23
            defpackage.huq.a(r2, r1, r3)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ian.a(java.lang.Object, int, java.lang.Object, cuq):void");
    }

    public final void b(Object obj, Object obj2) {
        cuz cuzVar = this.e;
        huq.c(cuzVar, obj2, obj);
        if (!(obj2 instanceof hnu) || cuzVar.h(obj2)) {
            return;
        }
        huq.b(this.k, obj2);
        this.l.remove(obj2);
    }

    public final boolean c() {
        return this.f.k();
    }
}
