package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fghs implements fgmm {
    @Override // defpackage.fgmm
    public final char a() {
        return '~';
    }

    @Override // defpackage.fgmm
    public final char b() {
        return '~';
    }

    @Override // defpackage.fgmm
    public final int c() {
        return 1;
    }

    @Override // defpackage.fgmm
    public final int d(fgij fgijVar, fgij fgijVar2) {
        if (fgijVar.a() != fgijVar2.a() || fgijVar.a() > 2) {
            return 0;
        }
        fglo fgloVarE = fgijVar.e();
        if (fgijVar.a() == 1) {
            String str = fgloVarE.a;
        } else {
            String str2 = fgloVarE.a;
        }
        fghq fghqVar = new fghq();
        fglm fglmVar = new fglm();
        fglmVar.c(fgijVar.c(fgijVar.a()));
        for (fgle fgleVar : fglh.a(fgloVarE, fgijVar2.d())) {
            fghqVar.h(fgleVar);
            fglmVar.b(fgleVar.f());
        }
        fglmVar.c(fgijVar2.b(fgijVar2.a()));
        fghqVar.j(fglmVar.a());
        fgloVarE.i(fghqVar);
        return fgijVar.a();
    }
}
