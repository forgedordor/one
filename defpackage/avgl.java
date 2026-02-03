package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avgl extends cayv {
    public static final eksp a = eksp.c("BugleContacts");
    public final avdr b;
    public final avdm c;
    public final avhk d;
    public final fcsu e;
    public final avkx f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final byeq j;
    private final fdjx k;

    public avgl(fdjx fdjxVar, byeq byeqVar, avdr avdrVar, avdm avdmVar, avhk avhkVar, fcsu fcsuVar, avkx avkxVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fdjxVar.getClass();
        byeqVar.getClass();
        avdrVar.getClass();
        avdmVar.getClass();
        fcsuVar.getClass();
        avkxVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.k = fdjxVar;
        this.j = byeqVar;
        this.b = avdrVar;
        this.c = avdmVar;
        this.d = avhkVar;
        this.e = fcsuVar;
        this.f = avkxVar;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
        this.i = fcsuVar4;
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
        return eiiy.a("BatchContactsImportHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = avgn.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        avgn avgnVar = (avgn) evuhVar;
        avgnVar.getClass();
        return auvw.c(this.k, fcyi.a, fdjz.a, new avgk(avgnVar, this, cayyVar, null));
    }

    public final void k(avgn avgnVar) {
        fcsu fcsuVar = this.g;
        ajfo ajfoVar = (ajfo) fcsuVar.b();
        dzfh dzfhVar = avbv.g;
        dzua dzuaVar = dzua.ERROR;
        ajfoVar.f(dzfhVar, dzuaVar);
        ((ajfo) fcsuVar.b()).f(avbv.h, dzuaVar);
        if (avgnVar.c == avgnVar.d) {
            ((awlc) this.i.b()).d(new Consumer() { // from class: avgh
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    avhc avhcVar = (avhc) obj;
                    eksp ekspVar = avgl.a;
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
