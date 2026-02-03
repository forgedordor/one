package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnfr implements dnga {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/core/data/usage/SQLiteUsageService");
    public final fcsu b;
    public final fdjx c;
    public final dngc d;
    public final dnea e;
    public final String f;
    public final fdue g;
    public final fctc h;
    public final fdue i;

    public dnfr(fcsu fcsuVar, fdjx fdjxVar, dngc dngcVar, dnea dneaVar) {
        this.b = fcsuVar;
        this.c = fdjxVar;
        this.d = dngcVar;
        this.e = dneaVar;
        String str = dneaVar.a;
        Locale locale = Locale.ROOT;
        locale.getClass();
        String upperCase = str.toUpperCase(locale);
        upperCase.getClass();
        this.f = upperCase;
        this.g = fdun.e(1, 0, 2, 2);
        this.h = fctd.a(new fdae() { // from class: dnfc
            @Override // defpackage.fdae
            public final Object invoke() {
                return fdun.e(0, 0, 0, 7);
            }
        });
        this.i = fdun.e(0, 0, 0, 7);
    }

    @Override // defpackage.dnga
    public final Object a(dneb dnebVar, fcxy fcxyVar) {
        Object objC = this.d.c("SQLiteUsageService#addUsage", new dnfg(this, dnebVar, null), fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    @Override // defpackage.dnga
    public final Object b(Object obj, fcxy fcxyVar) {
        Object objA = fdin.a(this.c.hE(), new dnfh(this, obj, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.dnga
    public final Object c(int i, fcxy fcxyVar) {
        return this.d.c("SQLiteUsageService#listEntities", new dnfm(this, i, null), fcxyVar);
    }

    public final fdue d() {
        return (fdue) this.h.a();
    }

    @Override // defpackage.dnga
    public final /* synthetic */ Object e(fcxy fcxyVar) {
        return dnfx.a(this, 1000, fcxyVar);
    }

    @Override // defpackage.dnga
    public final /* synthetic */ Object f(fcxy fcxyVar) {
        return dnfx.b(this, 1000, fcxyVar);
    }

    @Override // defpackage.dnga
    public final Object g(String str, fcxy fcxyVar) {
        return this.d.c("SQLiteUsageService#listSearches", new dnfq(str, this, null), fcxyVar);
    }

    @Override // defpackage.dnga
    public final Object h() {
        return this.g;
    }
}
