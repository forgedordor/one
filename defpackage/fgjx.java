package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fgjx implements fgmm {
    private final char a;

    protected fgjx(char c) {
        this.a = c;
    }

    @Override // defpackage.fgmm
    public final char a() {
        return this.a;
    }

    @Override // defpackage.fgmm
    public final char b() {
        return this.a;
    }

    @Override // defpackage.fgmm
    public final int c() {
        return 1;
    }

    @Override // defpackage.fgmm
    public final int d(fgij fgijVar, fgij fgijVar2) {
        fgle fgksVar;
        if (fgijVar.e || fgijVar2.d) {
            int i = fgijVar2.c;
            if (i % 3 != 0 && (fgijVar.c + i) % 3 == 0) {
                return 0;
            }
        }
        int i2 = 2;
        if (fgijVar.a() < 2 || fgijVar2.a() < 2) {
            String.valueOf(this.a);
            fgksVar = new fgks();
            i2 = 1;
        } else {
            String.valueOf(this.a);
            fgksVar = new fgln();
        }
        fglm fglmVar = new fglm();
        fglmVar.c(fgijVar.c(i2));
        fglo fgloVarE = fgijVar.e();
        for (fgle fgleVar : fglh.a(fgloVarE, fgijVar2.d())) {
            fgksVar.h(fgleVar);
            fglmVar.b(fgleVar.f());
        }
        fglmVar.c(fgijVar2.b(i2));
        fgksVar.j(fglmVar.a());
        fgloVarE.i(fgksVar);
        return i2;
    }
}
