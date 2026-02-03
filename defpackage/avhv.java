package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avhv extends cayv {
    public static final eksp a = eksp.c("BugleContacts");
    public final cmfo b;
    public final avgo c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final byeq h;
    private final fdjx i;
    private final avdr j;
    private final avjf k;

    public avhv(fdjx fdjxVar, byeq byeqVar, cmfo cmfoVar, avdr avdrVar, avgo avgoVar, avjf avjfVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fdjxVar.getClass();
        byeqVar.getClass();
        cmfoVar.getClass();
        avdrVar.getClass();
        avjfVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.i = fdjxVar;
        this.h = byeqVar;
        this.b = cmfoVar;
        this.j = avdrVar;
        this.c = avgoVar;
        this.k = avjfVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        Object objE = avbs.f.e();
        objE.getClass();
        caxzVarL.c(((Number) objE).intValue());
        caxzVarL.f(pza.a);
        Object objE2 = avbs.g.e();
        objE2.getClass();
        caxzVarL.g(((Number) objE2).longValue());
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("ScheduleContactsImportHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = evrl.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        ((evrl) evuhVar).getClass();
        return auvw.c(this.i, fcyi.a, fdjz.a, new avhu(this, cayyVar, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r9 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fc, code lost:
    
        if (r9 != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.fcxy r9) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avhv.k(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.avhs
            if (r0 == 0) goto L13
            r0 = r6
            avhs r0 = (defpackage.avhs) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avhs r0 = new avhs
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L4b
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            cmfo r6 = r5.b
            avhp r2 = new avhp
            r2.<init>()
            avhq r4 = new avhq
            r4.<init>()
            eiju r6 = r6.j(r4)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            avjf r6 = r5.k
            r6.b()
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avhv.l(fcxy):java.lang.Object");
    }

    public final void m() {
        fcsu fcsuVar = this.d;
        ajfo ajfoVar = (ajfo) fcsuVar.b();
        dzfh dzfhVar = avbv.g;
        dzua dzuaVar = dzua.ERROR;
        ajfoVar.f(dzfhVar, dzuaVar);
        ((ajfo) fcsuVar.b()).f(avbv.h, dzuaVar);
        ((awlc) this.g.b()).d(new Consumer() { // from class: avhm
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                avhc avhcVar = (avhc) obj;
                eksp ekspVar = avhv.a;
                avhcVar.getClass();
                avhcVar.b();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
