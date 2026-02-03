package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dshh implements ejvr {
    public abstract void a(evnw evnwVar, etkz etkzVar);

    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        evnw evnwVar = (evnw) obj;
        etkz etkzVar = (etkz) etla.a.createBuilder();
        if (evnwVar.b == 1 && evnu.a(1) == 2) {
            etnl etnlVar = (etnl) dsjc.a.fM((evom) evnwVar.c);
            etkzVar.copyOnWrite();
            etla etlaVar = (etla) etkzVar.instance;
            etnlVar.getClass();
            etlaVar.c = etnlVar;
            etlaVar.b = 1;
        }
        if (evnwVar.b == 2 && evnu.a(2) == 3) {
            Object objApply = dsjc.b.apply((evnt) evnwVar.c);
            etkzVar.copyOnWrite();
            etla etlaVar2 = (etla) etkzVar.instance;
            objApply.getClass();
            etlaVar2.c = objApply;
            etlaVar2.b = 2;
        }
        if (evnwVar.b == 3 && evnu.a(3) == 4) {
            a(evnwVar, etkzVar);
        }
        return (etla) etkzVar.build();
    }
}
