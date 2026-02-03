package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public final class ckld extends cayv {
    public static final cqce a = cqce.g("Bugle", "UnregisterGoogleRcsCallWorkItemHandler");
    private final eosc b;
    private final fcsu c;
    private final cejp d;

    public ckld(eosc eoscVar, fcsu fcsuVar, cejp cejpVar) {
        this.b = eoscVar;
        this.c = fcsuVar;
        this.d = cejpVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.b(caze.WAKELOCK);
        caxzVarL.c(5);
        caxzVarL.g(5000L);
        caxzVarL.f(pza.a);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("UnregisterGoogleRcsCallWorkItemHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return ckkz.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        ckkz ckkzVar = (ckkz) evuhVar;
        if (ckkzVar.c == 0 || ckkzVar.d.isEmpty()) {
            a.r("[SR]: Bad call to UnregisterGoogleRcsCall, ignoring.");
            return eijx.e(cbcw.k());
        }
        final String strD = this.d.d(ckkzVar.c);
        if (TextUtils.isEmpty(strD)) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("[SR]: Failed to get phoneNumber for subId, will retry.");
            cqbdVarE.m(ckkzVar.c);
            cqbdVarE.r();
            return eijx.e(cbcw.m());
        }
        cqbd cqbdVarA = a.a();
        cqbdVarA.I("[SR]: Calling UnregisterGoogleRcsRPC.");
        cqbdVarA.k(strD);
        cqbdVarA.r();
        eiju eijuVarA = ((cema) this.c.b()).a(new cfgu(strD));
        ejvr ejvrVar = new ejvr() { // from class: cklb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqbd cqbdVarC = ckld.a.c();
                cqbdVarC.I("[SR]: Successfully called UnregisterGoogleRcsRPC.");
                cqbdVarC.k(strD);
                cqbdVarC.r();
                return cbcw.i();
            }
        };
        eosc eoscVar = this.b;
        return eijuVarA.h(ejvrVar, eoscVar).e(Throwable.class, new ejvr() { // from class: cklc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                boolean zD = cems.d(th);
                cqbd cqbdVarE2 = ckld.a.e();
                cqbdVarE2.I("[SR]: UnregisterGoogleRcs RPC failed.");
                cqbdVarE2.k(strD);
                cqbdVarE2.s(th);
                return zD ? cbcw.m() : cbcw.k();
            }
        }, eoscVar);
    }
}
