package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bznl {
    public static bzon a(int i, cpyb cpybVar) {
        bzoj bzojVar = (bzoj) bzon.b.createBuilder();
        bzojVar.copyOnWrite();
        bzon bzonVar = (bzon) bzojVar.instance;
        bzonVar.c |= 1;
        bzonVar.d = i;
        bzojVar.copyOnWrite();
        bzon bzonVar2 = (bzon) bzojVar.instance;
        bzonVar2.f = 1;
        bzonVar2.c |= 4;
        bzol bzolVar = bzol.GENERATE_KEY;
        bzojVar.copyOnWrite();
        bzon bzonVar3 = (bzon) bzojVar.instance;
        bzonVar3.e = bzolVar.g;
        bzonVar3.c |= 2;
        ArrayList arrayListC = ekjz.c(bzolVar, bzol.SYNC_BACKUP_KEY, bzol.SYNC_ENCRYPTION_KEY, bzol.SYNC_HMAC_KEY, bzol.COMPLETE_KEY_SYNC);
        bzojVar.copyOnWrite();
        bzon bzonVar4 = (bzon) bzojVar.instance;
        evsx evsxVar = bzonVar4.g;
        if (!evsxVar.c()) {
            bzonVar4.g = evsn.mutableCopy(evsxVar);
        }
        Iterator it = arrayListC.iterator();
        while (it.hasNext()) {
            bzonVar4.g.h(((bzol) it.next()).g);
        }
        cpyo cpyoVar = (cpyo) new tny().fM(cpybVar);
        bzojVar.copyOnWrite();
        bzon bzonVar5 = (bzon) bzojVar.instance;
        bzonVar5.h = cpyoVar.d;
        bzonVar5.c |= 8;
        return (bzon) bzojVar.build();
    }
}
