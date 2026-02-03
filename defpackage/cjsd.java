package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjsd {
    public final eosc a;
    private final cjxi b;
    private final cogw c;

    public cjsd(cjxi cjxiVar, eosc eoscVar, cogw cogwVar) {
        this.b = cjxiVar;
        this.a = eoscVar;
        this.c = cogwVar;
    }

    public final eiju a(String str, cjsb cjsbVar) {
        return this.b.b(str, cjsbVar);
    }

    public final cjrw b(int i, int i2) {
        cjrw cjrwVar = (cjrw) cjsb.a.createBuilder();
        evvp evvpVarC = evxc.c(this.c.f().toEpochMilli());
        cjrwVar.copyOnWrite();
        cjsb cjsbVar = (cjsb) cjrwVar.instance;
        evvpVarC.getClass();
        cjsbVar.e = evvpVarC;
        cjsbVar.b |= 4;
        cjrwVar.copyOnWrite();
        cjsb cjsbVar2 = (cjsb) cjrwVar.instance;
        cjsbVar2.c = cjrz.a(i);
        cjsbVar2.b |= 1;
        cjrwVar.copyOnWrite();
        cjsb cjsbVar3 = (cjsb) cjrwVar.instance;
        cjsbVar3.d = cjrx.a(i2);
        cjsbVar3.b |= 2;
        return cjrwVar;
    }

    public final void c(String str, cjsa cjsaVar, int i) {
        cjrw cjrwVarB = b(i, 4);
        cjrwVarB.copyOnWrite();
        cjsb cjsbVar = (cjsb) cjrwVarB.instance;
        cjsb cjsbVar2 = cjsb.a;
        cjsbVar.h = cjsaVar.a();
        cjsbVar.b |= 64;
        a(str, cjrwVarB.build()).k(auvh.b(), this.a);
    }
}
