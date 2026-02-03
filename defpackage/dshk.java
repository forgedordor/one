package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dshk implements ejvr {
    public abstract void a(evjc evjcVar, etlb etlbVar);

    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        evjc evjcVar = (evjc) obj;
        etlb etlbVar = (etlb) etlc.a.createBuilder();
        a(evjcVar, etlbVar);
        if ((evjcVar.b & 1) != 0) {
            int i = evjcVar.e;
            etlbVar.copyOnWrite();
            etlc etlcVar = (etlc) etlbVar.instance;
            etlcVar.b |= 1;
            etlcVar.d = i;
        }
        if ((evjcVar.b & 2) != 0) {
            int i2 = evjcVar.f;
            etlbVar.copyOnWrite();
            etlc etlcVar2 = (etlc) etlbVar.instance;
            etlcVar2.b |= 2;
            etlcVar2.e = i2;
        }
        return (etlc) etlbVar.build();
    }
}
