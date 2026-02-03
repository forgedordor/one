package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dshp implements ejvr {
    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        evng evngVar = (evng) obj;
        etmz etmzVar = (etmz) etna.a.createBuilder();
        if ((evngVar.b & 1) != 0) {
            boolean z = evngVar.c;
            etmzVar.copyOnWrite();
            etna etnaVar = (etna) etmzVar.instance;
            etnaVar.b |= 1;
            etnaVar.c = z;
        }
        if ((evngVar.b & 2) != 0) {
            ejvr ejvrVar = dsjo.a;
            evmf evmfVar = evngVar.d;
            if (evmfVar == null) {
                evmfVar = evmf.a;
            }
            Object objApply = ejvrVar.apply(evmfVar);
            etmzVar.copyOnWrite();
            etna etnaVar2 = (etna) etmzVar.instance;
            objApply.getClass();
            etnaVar2.d = (etly) objApply;
            etnaVar2.b |= 2;
        }
        if ((evngVar.b & 8) != 0) {
            ejvr ejvrVar2 = dsjo.b;
            evne evneVar = evngVar.e;
            if (evneVar == null) {
                evneVar = evne.b;
            }
            Object objApply2 = ejvrVar2.apply(evneVar);
            etmzVar.copyOnWrite();
            etna etnaVar3 = (etna) etmzVar.instance;
            objApply2.getClass();
            etnaVar3.e = (etmy) objApply2;
            etnaVar3.b |= 8;
        }
        return (etna) etmzVar.build();
    }
}
