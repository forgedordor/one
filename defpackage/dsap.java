package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dsap extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        etjd etjdVar = (etjd) obj;
        evnx evnxVar = (evnx) evoc.a.createBuilder();
        if ((etjdVar.b & 1) != 0) {
            ejvj ejvjVarFH = dsak.a.fH();
            etja etjaVarB = etja.b(etjdVar.c);
            if (etjaVarB == null) {
                etjaVarB = etja.ORIENTATION_UNKNOWN;
            }
            evnz evnzVar = (evnz) ejvjVarFH.fM(etjaVarB);
            evnxVar.copyOnWrite();
            evoc evocVar = (evoc) evnxVar.instance;
            evocVar.c = evnzVar.d;
            evocVar.b |= 1;
        }
        if ((etjdVar.b & 2) != 0) {
            ejvj ejvjVarFH2 = dsak.b.fH();
            etjc etjcVarB = etjc.b(etjdVar.d);
            if (etjcVarB == null) {
                etjcVarB = etjc.THEME_UNKNOWN;
            }
            evob evobVar = (evob) ejvjVarFH2.fM(etjcVarB);
            evnxVar.copyOnWrite();
            evoc evocVar2 = (evoc) evnxVar.instance;
            evocVar2.d = evobVar.d;
            evocVar2.b |= 2;
        }
        return (evoc) evnxVar.build();
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        evoc evocVar = (evoc) obj;
        etiy etiyVar = (etiy) etjd.a.createBuilder();
        if ((evocVar.b & 1) != 0) {
            ejvj ejvjVar = dsak.a;
            evnz evnzVarB = evnz.b(evocVar.c);
            if (evnzVarB == null) {
                evnzVarB = evnz.ORIENTATION_UNKNOWN;
            }
            etja etjaVar = (etja) ejvjVar.fM(evnzVarB);
            etiyVar.copyOnWrite();
            etjd etjdVar = (etjd) etiyVar.instance;
            etjdVar.c = etjaVar.d;
            etjdVar.b |= 1;
        }
        if ((evocVar.b & 2) != 0) {
            ejvj ejvjVar2 = dsak.b;
            evob evobVarB = evob.b(evocVar.d);
            if (evobVarB == null) {
                evobVarB = evob.THEME_UNKNOWN;
            }
            etjc etjcVar = (etjc) ejvjVar2.fM(evobVarB);
            etiyVar.copyOnWrite();
            etjd etjdVar2 = (etjd) etiyVar.instance;
            etjdVar2.d = etjcVar.d;
            etjdVar2.b |= 2;
        }
        return (etjd) etiyVar.build();
    }
}
