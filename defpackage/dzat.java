package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dzat implements ejvr {
    public void a(ddxa ddxaVar, dyyq dyyqVar) {
        throw null;
    }

    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        ddxa ddxaVar = (ddxa) obj;
        dyyq dyyqVarM = dyys.m();
        if (ddxaVar.e() != null) {
            dyyqVarM.b(ddxaVar.e());
        }
        if (ddxaVar.g() != null) {
            ((dyyi) dyyqVarM).a = ddxaVar.g();
        }
        if (ddxaVar.i() != null) {
            b(ddxaVar, dyyqVarM);
        }
        if (ddxaVar.h() != null) {
            a(ddxaVar, dyyqVarM);
        }
        if (ddxaVar.c() != null) {
            ((dyyi) dyyqVarM).d = ddxaVar.c();
        }
        c(ddxaVar, dyyqVarM);
        if (ddxaVar.f() != null) {
            ((dyyi) dyyqVarM).e = ddxaVar.f();
        }
        return dyyqVarM.a();
    }

    public void b(ddxa ddxaVar, dyyq dyyqVar) {
        throw null;
    }

    public abstract void c(ddxa ddxaVar, dyyq dyyqVar);
}
