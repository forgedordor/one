package defpackage;

import j$.time.Duration;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aisw implements aisp {
    public final aite a;
    private final fdjx b;
    private final dsvn c;
    private final cogw d;
    private final fcsu e;
    private final fcsu f;
    private final eksp g;
    private final ConcurrentHashMap h;
    private final ConcurrentHashMap i;
    private final AtomicInteger j;

    public aisw(fdjx fdjxVar, dsvn dsvnVar, cogw cogwVar, fcsu fcsuVar, fcsu fcsuVar2, aite aiteVar) {
        fdjxVar.getClass();
        dsvnVar.getClass();
        cogwVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        aiteVar.getClass();
        this.b = fdjxVar;
        this.c = dsvnVar;
        this.d = cogwVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.a = aiteVar;
        this.g = eksp.c("BugleSemanticLogger");
        this.h = new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
        this.j = new AtomicInteger(1);
    }

    @Override // defpackage.aisp
    public final void a(int i, enko enkoVar) {
        auvw.k(this.b, null, null, new aiss(i, enkoVar, this, null), 3);
    }

    @Override // defpackage.aisp
    public final aisq b(int i, Duration duration) {
        int andIncrement = this.j.getAndIncrement();
        aisq aisqVar = new aisq(this, andIncrement, i, this.d.a());
        this.h.put(Integer.valueOf(andIncrement), aisqVar);
        this.i.put(Integer.valueOf(aisqVar.a), auvw.k(this.b, null, null, new aisu(this, aisqVar, duration != null ? Long.valueOf(duration.toMillis()) : (Long) this.e.b(), null), 3));
        return aisqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.dsvm r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.aist
            if (r0 == 0) goto L13
            r0 = r6
            aist r0 = (defpackage.aist) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aist r0 = new aist
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dsvm r5 = r0.d
            defpackage.fctl.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            fcsu r6 = r4.f
            java.lang.Object r6 = r6.b()
            aisn r6 = (defpackage.aisn) r6
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 == r1) goto L56
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L53
            dsvn r6 = r4.c
            r6.a(r5)
        L53:
            fctx r5 = defpackage.fctx.a
            return r5
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aisw.c(dsvm, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.aisq r5, long r6, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.aisv
            if (r0 == 0) goto L13
            r0 = r8
            aisv r0 = (defpackage.aisv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aisv r0 = new aisv
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            aisq r5 = r0.d
            defpackage.fctl.b(r8)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r8)
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.fdkj.c(r6, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            exmt r6 = defpackage.exmt.DEADLINE_EXCEEDED
            r4.f(r5, r6)
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aisw.d(aisq, long, fcxy):java.lang.Object");
    }

    public final void f(aisq aisqVar, exmt exmtVar) {
        int i = aisqVar.b;
        fdlr fdlrVar = (fdlr) this.i.remove(Integer.valueOf(i));
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        if (((aisq) this.h.remove(Integer.valueOf(aisqVar.a))) == null) {
            ((eksl) this.g.j()).q("Received stop event for a CUI tracker that was not started or is already stopped!");
            return;
        }
        cogw cogwVar = this.d;
        auvw.k(this.b, null, null, new aisr(i, exmtVar, cogwVar.a() - aisqVar.c, this, null), 3);
    }
}
