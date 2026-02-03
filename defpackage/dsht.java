package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dsht implements ejvr {
    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        evix evixVar = (evix) obj;
        etkp etkpVar = (etkp) etkr.a.createBuilder();
        if ((evixVar.b & 1) != 0) {
            boolean z = evixVar.e;
            etkpVar.copyOnWrite();
            etkr etkrVar = (etkr) etkpVar.instance;
            etkrVar.b |= 1;
            etkrVar.e = z;
        }
        if (evixVar.c == 2 && eviw.a(2) == 3) {
            Object objApply = dsju.b.apply((evjc) evixVar.d);
            etkpVar.copyOnWrite();
            etkr etkrVar2 = (etkr) etkpVar.instance;
            objApply.getClass();
            etkrVar2.d = objApply;
            etkrVar2.c = 2;
        }
        if (evixVar.c == 3 && eviw.a(3) == 4) {
            Object objApply2 = dsju.a.apply((evip) evixVar.d);
            etkpVar.copyOnWrite();
            etkr etkrVar3 = (etkr) etkpVar.instance;
            objApply2.getClass();
            etkrVar3.d = objApply2;
            etkrVar3.c = 3;
        }
        if (evixVar.c == 5 && eviw.a(5) == 6) {
            Object objApply3 = dsju.c.apply((evij) evixVar.d);
            etkpVar.copyOnWrite();
            etkr etkrVar4 = (etkr) etkpVar.instance;
            objApply3.getClass();
            etkrVar4.d = objApply3;
            etkrVar4.c = 5;
        }
        return (etkr) etkpVar.build();
    }
}
