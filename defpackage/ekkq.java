package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekkq implements ekkk {
    public static final ekkq a = new ekkq();

    public static final ekks g(Object obj, int i, ekks ekksVar) {
        return ekksVar == null ? new ekks(obj, i) : new ekkr(obj, i, ekksVar);
    }

    @Override // defpackage.ekkk
    public final /* bridge */ /* synthetic */ ekkj a(ekkn ekknVar, ekkj ekkjVar, ekkj ekkjVar2) {
        ekks ekksVar = (ekks) ekkjVar;
        ekks ekksVarG = g(ekksVar.a, ekksVar.b, (ekks) ekkjVar2);
        ekksVarG.c = ekksVar.c;
        return ekksVarG;
    }

    @Override // defpackage.ekkk
    public final /* bridge */ /* synthetic */ ekkj b(ekkn ekknVar, Object obj, int i, ekkj ekkjVar) {
        return g(obj, i, (ekks) ekkjVar);
    }

    @Override // defpackage.ekkk
    public final /* synthetic */ ekkn c(eklm eklmVar, int i) {
        return new ekkt(eklmVar, i);
    }

    @Override // defpackage.ekkk
    public final ekkp d() {
        return ekkp.STRONG;
    }

    @Override // defpackage.ekkk
    public final ekkp e() {
        return ekkp.STRONG;
    }

    @Override // defpackage.ekkk
    public final /* synthetic */ void f(ekkn ekknVar, ekkj ekkjVar, Object obj) {
        ((ekks) ekkjVar).c = obj;
    }
}
