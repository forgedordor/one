package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avhj extends cayv {
    public static final eksp a = eksp.c("BugleContacts");
    public final cmfo b;
    public final avjf c;
    public final cogw d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    private final fdjx i;

    public avhj(fdjx fdjxVar, cmfo cmfoVar, avjf avjfVar, cogw cogwVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fdjxVar.getClass();
        cmfoVar.getClass();
        avjfVar.getClass();
        cogwVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.i = fdjxVar;
        this.b = cmfoVar;
        this.c = avjfVar;
        this.d = cogwVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
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
        return eiiy.a("IncrementalContactsImportHandler");
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
        return auvw.c(this.i, fcyi.a, fdjz.a, new avhi(this, cayyVar, null));
    }

    public final void k() {
        ((dzuc) this.e.b()).g(avbv.g, null, null, dzua.ERROR);
        if (((Boolean) this.h.b()).booleanValue()) {
            return;
        }
        ((awlc) this.g.b()).d(new Consumer() { // from class: avhe
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                avhc avhcVar = (avhc) obj;
                eksp ekspVar = avhj.a;
                avhcVar.getClass();
                avhcVar.b();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
