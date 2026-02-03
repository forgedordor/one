package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avie extends cayv {
    public static final eksp a = eksp.c("BugleContacts");
    public final cmfo b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final byeq g;
    private final fdjx h;
    private final fcyh i;
    private final fcsu j;

    public avie(fdjx fdjxVar, fcyh fcyhVar, byeq byeqVar, cmfo cmfoVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        byeqVar.getClass();
        cmfoVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        this.h = fdjxVar;
        this.i = fcyhVar;
        this.g = byeqVar;
        this.b = cmfoVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.j = fcsuVar5;
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
        return eiiy.a("ScheduleDeleteAndImportContactsHandler");
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
        return auvw.c(this.h, fcyi.a, fdjz.a, new avid(this, cayyVar, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.fcxy r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.avic
            if (r0 == 0) goto L13
            r0 = r7
            avic r0 = (defpackage.avic) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            avic r0 = new avic
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r0 = r0.a
            defpackage.fctl.b(r7)
            goto L50
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            defpackage.fctl.b(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            fcyh r2 = r6.i
            fcyh r2 = defpackage.eicg.a(r2)
            avib r4 = new avib
            r5 = 0
            r4.<init>(r5, r7)
            r0.a = r7
            r0.d = r3
            java.lang.Object r0 = defpackage.fdin.a(r2, r4, r0)
            if (r0 == r1) goto L89
            r0 = r7
        L50:
            java.util.ArrayList r7 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.fcva.p(r0, r1)
            r7.<init>(r1)
            java.util.Iterator r1 = r0.iterator()
        L5f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            avgs r2 = (defpackage.avgs) r2
            int r3 = r0.size()
            r2.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r4 = r2.instance
            avgt r4 = (defpackage.avgt) r4
            avgt r5 = defpackage.avgt.a
            r4.d = r3
            evsn r2 = r2.build()
            avgt r2 = (defpackage.avgt) r2
            r7.add(r2)
            goto L5f
        L84:
            ekgb r7 = defpackage.ekfv.a(r7)
            return r7
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avie.k(fcxy):java.lang.Object");
    }

    public final void l() {
        Object objB = this.d.b();
        objB.getClass();
        avbu.a((ains) objB, 5);
    }

    public final void m() {
        fcsu fcsuVar = this.e;
        dzuc dzucVar = (dzuc) fcsuVar.b();
        dzfh dzfhVar = avbv.g;
        dzua dzuaVar = dzua.ERROR;
        dzucVar.g(dzfhVar, null, null, dzuaVar);
        ((dzuc) fcsuVar.b()).g(avbv.h, null, null, dzuaVar);
        ((awlc) this.j.b()).d(new Consumer() { // from class: avhy
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                avhc avhcVar = (avhc) obj;
                eksp ekspVar = avie.a;
                avhcVar.getClass();
                avhcVar.b();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
