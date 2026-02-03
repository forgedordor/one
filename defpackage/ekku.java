package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekku implements ekkk {
    public static final ekku a = new ekku();

    public static final ekkw g(Object obj, int i, ekkw ekkwVar) {
        return ekkwVar == null ? new ekkw(obj, i) : new ekkv(obj, i, ekkwVar);
    }

    @Override // defpackage.ekkk
    public final /* bridge */ /* synthetic */ ekkj a(ekkn ekknVar, ekkj ekkjVar, ekkj ekkjVar2) {
        ekkx ekkxVar = (ekkx) ekknVar;
        ekkw ekkwVar = (ekkw) ekkjVar;
        ekkw ekkwVar2 = (ekkw) ekkjVar2;
        if (ekkn.m(ekkwVar)) {
            return null;
        }
        ekkw ekkwVarG = g(ekkwVar.a, ekkwVar.b, ekkwVar2);
        ekkwVarG.c = ekkwVar.c.b(ekkxVar.g, ekkwVarG);
        return ekkwVarG;
    }

    @Override // defpackage.ekkk
    public final /* bridge */ /* synthetic */ ekkj b(ekkn ekknVar, Object obj, int i, ekkj ekkjVar) {
        return g(obj, i, (ekkw) ekkjVar);
    }

    @Override // defpackage.ekkk
    public final /* synthetic */ ekkn c(eklm eklmVar, int i) {
        return new ekkx(eklmVar, i);
    }

    @Override // defpackage.ekkk
    public final ekkp d() {
        return ekkp.STRONG;
    }

    @Override // defpackage.ekkk
    public final ekkp e() {
        return ekkp.WEAK;
    }

    @Override // defpackage.ekkk
    public final /* bridge */ /* synthetic */ void f(ekkn ekknVar, ekkj ekkjVar, Object obj) {
        ekkw ekkwVar = (ekkw) ekkjVar;
        eklj ekljVar = ekkwVar.c;
        ekkwVar.c = new eklk(((ekkx) ekknVar).g, obj, ekkwVar);
        ekljVar.clear();
    }
}
