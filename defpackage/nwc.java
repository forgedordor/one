package defpackage;

import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class nwc implements nvb {
    private final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public long c;
    private final ArrayDeque d;
    private nwa e;
    private long f;
    private long g;

    public nwc() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new nwa());
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new nwb(new nvz(this)));
        }
        this.d = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    private final void k(nwa nwaVar) {
        nwaVar.eP();
        this.a.add(nwaVar);
    }

    @Override // defpackage.miu
    public final /* bridge */ /* synthetic */ Object a() {
        mee.c(this.e == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        nwa nwaVar = (nwa) arrayDeque.pollFirst();
        this.e = nwaVar;
        return nwaVar;
    }

    @Override // defpackage.miu
    public void c() {
        this.f = 0L;
        this.c = 0L;
        while (true) {
            ArrayDeque arrayDeque = this.d;
            if (arrayDeque.isEmpty()) {
                break;
            }
            nwa nwaVar = (nwa) arrayDeque.poll();
            String str = mgb.a;
            k(nwaVar);
        }
        nwa nwaVar2 = this.e;
        if (nwaVar2 != null) {
            k(nwaVar2);
            this.e = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    @Override // defpackage.miu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void d(java.lang.Object r7) {
        /*
            r6 = this;
            nwa r0 = r6.e
            if (r7 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            defpackage.mee.a(r0)
            nwa r7 = (defpackage.nwa) r7
            boolean r0 = r7.eS()
            if (r0 != 0) goto L2d
            long r0 = r7.f
            r2 = -9223372036854775808
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L2d
            long r2 = r6.g
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L2d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2d
            r6.k(r7)
            goto L3b
        L2d:
            long r0 = r6.f
            r2 = 1
            long r2 = r2 + r0
            r6.f = r2
            r7.i = r0
            java.util.ArrayDeque r0 = r6.d
            r0.add(r7)
        L3b:
            r7 = 0
            r6.e = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nwc.d(java.lang.Object):void");
    }

    @Override // defpackage.miu
    public final void f(long j) {
        this.g = j;
    }

    protected abstract nva g();

    @Override // defpackage.miu
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public nvh b() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.d;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            nwa nwaVar = (nwa) arrayDeque2.peek();
            String str = mgb.a;
            if (nwaVar.f > this.c) {
                return null;
            }
            nwa nwaVar2 = (nwa) arrayDeque2.poll();
            if (nwaVar2.eS()) {
                nvh nvhVar = (nvh) arrayDeque.pollFirst();
                nvhVar.eQ(4);
                k(nwaVar2);
                return nvhVar;
            }
            i(nwaVar2);
            if (j()) {
                nva nvaVarG = g();
                nvh nvhVar2 = (nvh) arrayDeque.pollFirst();
                nvhVar2.i(nwaVar2.f, nvaVarG, Long.MAX_VALUE);
                k(nwaVar2);
                return nvhVar2;
            }
            k(nwaVar2);
        }
    }

    protected abstract void i(nvg nvgVar);

    protected abstract boolean j();

    @Override // defpackage.nvb
    public final void q(long j) {
        this.c = j;
    }

    @Override // defpackage.miu
    public void e() {
    }
}
