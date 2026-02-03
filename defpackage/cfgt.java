package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfgt implements cfrj {
    private static final eksp a = eksp.c("BugleNetwork");
    private final fcsu b;
    private final cfre c;
    private final String d;
    private String e;

    public cfgt(fcsu fcsuVar, cfre cfreVar, String str) {
        str.getClass();
        this.b = fcsuVar;
        this.c = cfreVar;
        this.d = str;
        this.e = "";
    }

    public static final eiju o(eznc ezncVar) {
        ezncVar.getClass();
        ezpr ezprVar = ezncVar.b;
        if (ezprVar == null) {
            ezprVar = ezpr.a;
        }
        long j = ezprVar.b;
        a.n().t("Unlink identity response is [%s]", ezncVar);
        eiju eijuVarE = eijx.e(ezncVar);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cfrj
    public final long a() {
        return a();
    }

    @Override // defpackage.cfrj
    public final cfrh b() {
        return this.c;
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture e(evuh evuhVar) {
        return o((eznc) evuhVar);
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "UnlinkIdentityHandler";
    }

    @Override // defpackage.cfrj
    public final String g() {
        return this.e;
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void h(Throwable th) {
        cfri.c(this);
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void i() {
        cfri.a(this);
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void j() {
        cfri.b(this);
    }

    @Override // defpackage.cfrj
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final eiju c(ezpp ezppVar) {
        ezppVar.getClass();
        String str = ezppVar.c;
        str.getClass();
        this.e = str;
        ezok ezokVar = (ezok) ezol.a.createBuilder();
        String str2 = ezppVar.e;
        ezokVar.copyOnWrite();
        ezol ezolVar = (ezol) ezokVar.instance;
        str2.getClass();
        ezolVar.d = str2;
        felm felmVar = felm.EMAIL;
        ezokVar.copyOnWrite();
        ((ezol) ezokVar.instance).b = felmVar.a();
        ezokVar.copyOnWrite();
        ((ezol) ezokVar.instance).c = this.d;
        evsn evsnVarBuild = ezokVar.build();
        evsnVarBuild.getClass();
        ezmz ezmzVar = (ezmz) ezna.a.createBuilder();
        ezmzVar.getClass();
        ezmzVar.copyOnWrite();
        ezna eznaVar = (ezna) ezmzVar.instance;
        eznaVar.c = ezppVar;
        eznaVar.b |= 1;
        ezmzVar.copyOnWrite();
        ezna eznaVar2 = (ezna) ezmzVar.instance;
        eznaVar2.d = (ezol) evsnVarBuild;
        eznaVar2.b |= 2;
        evsn evsnVarBuild2 = ezmzVar.build();
        evsnVarBuild2.getClass();
        eiju eijuVarE = eijx.e((ezna) evsnVarBuild2);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cfrj
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final eiju d(cezv cezvVar, ezna eznaVar) {
        cezvVar.getClass();
        eznaVar.getClass();
        ((eksl) a.h()).t("Unlink identity Request Id is [%s]", this.e);
        try {
            eson esonVarB = ((esol) this.b.b()).b(new esoo(this.d, "google"), new ekph("https://www.googleapis.com/auth/tachyon"));
            ezok ezokVar = (ezok) ezol.a.createBuilder();
            cfre cfreVar = this.c;
            ezokVar.copyOnWrite();
            ezol ezolVar = (ezol) ezokVar.instance;
            String str = cfreVar.b;
            str.getClass();
            ezolVar.c = str;
            eiju eijuVarH = cezvVar.d((ezol) ezokVar.build()).h(eznaVar, esonVarB);
            eijuVarH.getClass();
            return eijuVarH;
        } catch (esom e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.cfxa
    public final void k() {
    }

    @Override // defpackage.cfxa
    public final /* synthetic */ void l() {
    }
}
