package defpackage;

import com.google.communication.synapse.security.scytale.Scope;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwmg extends cayv {
    public static final cqce a = cqce.g("BugleE2eeEtouffee", "EncryptedMessageDeletionWorkHandler");
    public final fcsu b;
    private final fcsu c;
    private final eygg d;
    private final fdjx e;

    public bwmg(fcsu fcsuVar, fcsu fcsuVar2, eygg eyggVar, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        eyggVar.getClass();
        fdjxVar.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = eyggVar;
        this.e = fdjxVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("EncryptedMessageDeletionWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = bwmd.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        bwmd bwmdVar = (bwmd) evuhVar;
        bwmdVar.getClass();
        this.d.b();
        return auvw.c(this.e, fcyi.a, fdjz.a, new bwmf(bwmdVar, this, Scope.create(((bwkr) this.c.b()).b()), null));
    }
}
