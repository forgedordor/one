package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjtw {
    private final cjxi a;
    private final cogw b;
    private final cebq c;

    public cjtw(cjxi cjxiVar, cogw cogwVar, cebq cebqVar) {
        this.a = cjxiVar;
        this.b = cogwVar;
        this.c = cebqVar;
    }

    public final cjtu a(String str, boolean z, String str2) {
        cjtl cjtlVar = (cjtl) cjtu.a.createBuilder();
        cjtlVar.copyOnWrite();
        cjtu cjtuVar = (cjtu) cjtlVar.instance;
        cjtuVar.b |= 1;
        cjtuVar.c = str;
        if (z) {
            cjtn cjtnVar = (cjtn) cjto.a.createBuilder();
            evvp evvpVarC = evxc.c(this.b.f().toEpochMilli());
            cjtnVar.copyOnWrite();
            cjto cjtoVar = (cjto) cjtnVar.instance;
            evvpVarC.getClass();
            cjtoVar.c = evvpVarC;
            cjtoVar.b |= 1;
            cjto cjtoVar2 = (cjto) cjtnVar.build();
            cjtm cjtmVar = (cjtm) cjtt.a.createBuilder();
            cjtmVar.copyOnWrite();
            cjtt cjttVar = (cjtt) cjtmVar.instance;
            cjtoVar2.getClass();
            cjttVar.c = cjtoVar2;
            cjttVar.b |= 1;
            if (!dfpi.z() ? dfog.z() : this.c.c(str2).y) {
                cjtmVar.copyOnWrite();
                cjtt cjttVar2 = (cjtt) cjtmVar.instance;
                cjttVar2.e = cjts.a(4);
                cjttVar2.b = 4 | cjttVar2.b;
            }
            cjtlVar.b((cjtt) cjtmVar.build());
        }
        return cjtlVar.build();
    }

    public final eiju b(String str, cjtu cjtuVar) {
        return this.a.e(str, cjtuVar);
    }
}
