package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffat implements feyr {
    private final fexz a;

    public ffat(fexz fexzVar) {
        this.a = fexzVar;
    }

    @Override // defpackage.feyr
    public final fezh a(ffba ffbaVar) {
        fezk fezkVar;
        fezb fezbVar = ffbaVar.c;
        feza fezaVar = new feza(fezbVar);
        fezf fezfVar = fezbVar.d;
        if (fezfVar != null) {
            feyt feytVarB = fezfVar.b();
            if (feytVarB != null) {
                fezaVar.c(ffho.a, feytVarB.c);
            }
            long jA = fezfVar.a();
            if (jA != -1) {
                fezaVar.c("Content-Length", String.valueOf(jA));
                fezaVar.f("Transfer-Encoding");
            } else {
                fezaVar.c("Transfer-Encoding", "chunked");
                fezaVar.f("Content-Length");
            }
        }
        boolean z = false;
        if (fezbVar.a("Host") == null) {
            fezaVar.c("Host", fezr.l(fezbVar.a, false));
        }
        if (fezbVar.a("Connection") == null) {
            fezaVar.c("Connection", "Keep-Alive");
        }
        if (fezbVar.a("Accept-Encoding") == null && fezbVar.a("Range") == null) {
            fezaVar.c("Accept-Encoding", "gzip");
            z = true;
        }
        fexz fexzVar = this.a;
        feyq feyqVar = fezbVar.a;
        if (fezbVar.a("User-Agent") == null) {
            fezaVar.c("User-Agent", "okhttp/4.12.0");
        }
        fezh fezhVarB = ffbaVar.b(fezaVar.a());
        feyn feynVar = fezhVarB.f;
        ffay.a(fexzVar, feyqVar, feynVar);
        fezg fezgVar = new fezg(fezhVarB);
        fezgVar.a = fezbVar;
        if (z && fdgn.j("gzip", fezh.b(fezhVarB, "Content-Encoding"), true) && ffay.b(fezhVarB) && (fezkVar = fezhVarB.g) != null) {
            fffh fffhVar = new fffh(fezkVar.c());
            feyl feylVarE = feynVar.e();
            feylVarE.f("Content-Encoding");
            feylVarE.f("Content-Length");
            fezgVar.c(feylVarE.b());
            fezgVar.f = new ffbb(fezh.b(fezhVarB, ffho.a), -1L, new fffv(fffhVar));
        }
        return fezgVar.a();
    }
}
