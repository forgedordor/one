package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avgr extends cayv {
    public static final eksp a = eksp.c("BugleContacts");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    private final fdjx g;
    private final fcsu h;

    public avgr(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar6.getClass();
        this.g = fdjxVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        this.h = fcsuVar6;
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
        return eiiy.a("BatchDeletedContactsSyncHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = avgt.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        avgt avgtVar = (avgt) evuhVar;
        avgtVar.getClass();
        return auvw.c(this.g, fcyi.a, fdjz.a, new avgq(avgtVar, this, cayyVar, null));
    }

    public final void k(avgt avgtVar) {
        fcsu fcsuVar = this.f;
        dzuc dzucVar = (dzuc) fcsuVar.b();
        dzfh dzfhVar = avbv.g;
        dzua dzuaVar = dzua.ERROR;
        dzucVar.g(dzfhVar, null, null, dzuaVar);
        ((dzuc) fcsuVar.b()).g(avbv.h, null, null, dzuaVar);
        if (avgtVar.c == avgtVar.d) {
            ((awlc) this.h.b()).d(new Consumer() { // from class: avgp
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    avhc avhcVar = (avhc) obj;
                    eksp ekspVar = avgr.a;
                    avhcVar.getClass();
                    avhcVar.b();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }
}
