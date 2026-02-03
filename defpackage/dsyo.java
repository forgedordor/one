package defpackage;

import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsyo {
    public static final void a(int i, boolean z, emmw[] emmwVarArr, dsxy dsxyVar, Map map, emkx emkxVar, emlr emlrVar) {
        emmw emmwVar = emmwVarArr[i];
        evsl evslVar = emll.a;
        if (emmwVar.c(evslVar)) {
            z = true;
        } else if (z) {
            emmz emmzVar = (emmz) emmwVar.instance;
            emmwVar.e(evslVar, Long.valueOf((emmzVar.c << 32) | (emmzVar.d & 4294967295L)));
        }
        boolean z2 = z;
        Iterator it = DesugarCollections.unmodifiableList(((emmz) emmwVar.instance).e).iterator();
        while (it.hasNext()) {
            a(((Integer) it.next()).intValue(), z2, emmwVarArr, dsxyVar, map, emkxVar, emlrVar);
        }
    }

    public static final void b(eohz eohzVar, dsxx dsxxVar, dsxy dsxyVar, emkx emkxVar) {
        if (dsxyVar.b.size() == 1) {
            emkxVar.copyOnWrite();
            emky emkyVar = (emky) emkxVar.instance;
            emky emkyVar2 = emky.a;
            emkyVar.e = eohzVar;
            emkyVar.b |= 2;
            return;
        }
        eohx eohxVar = dsxv.a(dsxxVar).d;
        if (eohxVar == null) {
            eohxVar = eohx.a;
        }
        eohz eohzVar2 = eohxVar.e;
        if (eohzVar2 == null) {
            eohzVar2 = eohz.a;
        }
        emkxVar.copyOnWrite();
        emky emkyVar3 = (emky) emkxVar.instance;
        emky emkyVar4 = emky.a;
        eohzVar2.getClass();
        emkyVar3.e = eohzVar2;
        emkyVar3.b |= 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(emlo emloVar, emmw[] emmwVarArr) {
        if (emmwVarArr == null) {
            return;
        }
        emlb emlbVar = (emlb) emlc.a.createBuilder();
        for (int i = 1; i < emmwVarArr.length; i++) {
            emmz emmzVar = (emmz) emmwVarArr[i].build();
            emlbVar.copyOnWrite();
            emlc emlcVar = (emlc) emlbVar.instance;
            emmzVar.getClass();
            evtg evtgVar = emlcVar.b;
            if (!evtgVar.c()) {
                emlcVar.b = evsn.mutableCopy(evtgVar);
            }
            emlcVar.b.add(emmzVar);
        }
        emloVar.e(emld.a, (emlc) emlbVar.build());
    }
}
