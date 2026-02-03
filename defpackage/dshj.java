package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dshj implements ejvr {
    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        evmh evmhVar = (evmh) obj;
        etlz etlzVar = (etlz) etma.a.createBuilder();
        if ((evmhVar.b & 1) != 0) {
            String str = evmhVar.c;
            etlzVar.copyOnWrite();
            etma etmaVar = (etma) etlzVar.instance;
            str.getClass();
            etmaVar.b |= 1;
            etmaVar.c = str;
        }
        if ((evmhVar.b & 4) != 0) {
            evqe evqeVar = evmhVar.d;
            if (evqeVar == null) {
                evqeVar = evqe.a;
            }
            etlzVar.copyOnWrite();
            etma etmaVar2 = (etma) etlzVar.instance;
            evqeVar.getClass();
            etmaVar2.d = evqeVar;
            etmaVar2.b |= 2;
        }
        return (etma) etlzVar.build();
    }
}
