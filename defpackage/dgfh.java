package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgfh implements dfyw {
    @Override // defpackage.dfyw
    public final void h(dfyu dfyuVar) {
        ewmv ewmvVarA = dfzb.a(dfyuVar.k);
        ewms ewmsVarF = dfyuVar.f();
        int iA = dfyuVar.a();
        boolean z = dfyuVar.d;
        dhja.o("Logging NIF selected: %s, %s, IPv%d, hasDns:%b", ewmvVarA, ewmsVarF, Integer.valueOf(iA), Boolean.valueOf(z));
        deym deymVar = dfyuVar.i;
        ewmq ewmqVarP = deymVar.p(3, ewmvVarA, ewmsVarF, iA);
        ewmqVarP.copyOnWrite();
        ewmw ewmwVar = (ewmw) ewmqVarP.instance;
        ewmw ewmwVar2 = ewmw.a;
        ewmwVar.b |= 16;
        ewmwVar.g = z;
        deymVar.m((ewmw) ewmqVarP.build());
    }

    @Override // defpackage.dfyw
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.dfyw
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.dfyw
    public final /* synthetic */ void m() {
    }

    @Override // defpackage.dfyw
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.dfyw
    public final /* synthetic */ void j(String str) {
    }

    @Override // defpackage.dfyw
    public final /* synthetic */ void k(String str) {
    }
}
