package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsjh extends dshk {
    static final ejvr a = new dskc();
    static final ejvr b = new dsix();

    @Override // defpackage.dshk
    public final void a(evjc evjcVar, etlb etlbVar) {
        int i = evjcVar.c;
        if (i == 1) {
            etkt etktVar = (etkt) etkv.a.createBuilder();
            Object objApply = b.apply(evjcVar.c == 1 ? (evir) evjcVar.d : evir.a);
            etktVar.copyOnWrite();
            etkv etkvVar = (etkv) etktVar.instance;
            objApply.getClass();
            etkvVar.c = objApply;
            etkvVar.b = 1;
            etlbVar.a(etktVar);
            return;
        }
        if (i == 2) {
            etkt etktVar2 = (etkt) etkv.a.createBuilder();
            Object objApply2 = a.apply(evjcVar.c == 2 ? (evlf) evjcVar.d : evlf.a);
            etktVar2.copyOnWrite();
            etkv etkvVar2 = (etkv) etktVar2.instance;
            objApply2.getClass();
            etkvVar2.c = objApply2;
            etkvVar2.b = 2;
            etlbVar.a(etktVar2);
        }
    }
}
