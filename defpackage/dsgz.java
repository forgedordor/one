package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dsgz extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        etjz etjzVar = (etjz) obj;
        evnl evnlVar = (evnl) evno.a.createBuilder();
        if ((etjzVar.b & 1) != 0) {
            String str = etjzVar.c;
            evnlVar.copyOnWrite();
            evno evnoVar = (evno) evnlVar.instance;
            str.getClass();
            evnoVar.b |= 1;
            evnoVar.c = str;
        }
        if ((etjzVar.b & 2) != 0) {
            String str2 = etjzVar.d;
            evnlVar.copyOnWrite();
            evno evnoVar2 = (evno) evnlVar.instance;
            str2.getClass();
            evnoVar2.b |= 2;
            evnoVar2.d = str2;
        }
        if ((etjzVar.b & 4) != 0) {
            String str3 = etjzVar.e;
            evnlVar.copyOnWrite();
            evno evnoVar3 = (evno) evnlVar.instance;
            str3.getClass();
            evnoVar3.b |= 4;
            evnoVar3.e = str3;
        }
        if ((etjzVar.b & 8) != 0) {
            String str4 = etjzVar.f;
            evnlVar.copyOnWrite();
            evno evnoVar4 = (evno) evnlVar.instance;
            str4.getClass();
            evnoVar4.b |= 8;
            evnoVar4.f = str4;
        }
        if ((etjzVar.b & 16) != 0) {
            ejvj ejvjVarFH = dsiq.a.fH();
            etjy etjyVarB = etjy.b(etjzVar.g);
            if (etjyVarB == null) {
                etjyVarB = etjy.UNKNOWN;
            }
            evnn evnnVar = (evnn) ejvjVarFH.fM(etjyVarB);
            evnlVar.copyOnWrite();
            evno evnoVar5 = (evno) evnlVar.instance;
            evnoVar5.g = evnnVar.f;
            evnoVar5.b |= 16;
        }
        Iterator<E> it = etjzVar.h.iterator();
        while (it.hasNext()) {
            evoj evojVar = (evoj) dsiq.b.fH().fM((etmt) it.next());
            evnlVar.copyOnWrite();
            evno evnoVar6 = (evno) evnlVar.instance;
            evojVar.getClass();
            evtg evtgVar = evnoVar6.h;
            if (!evtgVar.c()) {
                evnoVar6.h = evsn.mutableCopy(evtgVar);
            }
            evnoVar6.h.add(evojVar);
        }
        if ((etjzVar.b & 32) != 0) {
            int i = etjzVar.i;
            evnlVar.copyOnWrite();
            evno evnoVar7 = (evno) evnlVar.instance;
            evnoVar7.b |= 32;
            evnoVar7.i = i;
        }
        return (evno) evnlVar.build();
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        evno evnoVar = (evno) obj;
        etjw etjwVar = (etjw) etjz.a.createBuilder();
        if ((evnoVar.b & 1) != 0) {
            String str = evnoVar.c;
            etjwVar.copyOnWrite();
            etjz etjzVar = (etjz) etjwVar.instance;
            str.getClass();
            etjzVar.b |= 1;
            etjzVar.c = str;
        }
        if ((evnoVar.b & 2) != 0) {
            String str2 = evnoVar.d;
            etjwVar.copyOnWrite();
            etjz etjzVar2 = (etjz) etjwVar.instance;
            str2.getClass();
            etjzVar2.b |= 2;
            etjzVar2.d = str2;
        }
        if ((evnoVar.b & 4) != 0) {
            String str3 = evnoVar.e;
            etjwVar.copyOnWrite();
            etjz etjzVar3 = (etjz) etjwVar.instance;
            str3.getClass();
            etjzVar3.b |= 4;
            etjzVar3.e = str3;
        }
        if ((evnoVar.b & 8) != 0) {
            String str4 = evnoVar.f;
            etjwVar.copyOnWrite();
            etjz etjzVar4 = (etjz) etjwVar.instance;
            str4.getClass();
            etjzVar4.b |= 8;
            etjzVar4.f = str4;
        }
        if ((evnoVar.b & 16) != 0) {
            ejvj ejvjVar = dsiq.a;
            evnn evnnVarB = evnn.b(evnoVar.g);
            if (evnnVarB == null) {
                evnnVarB = evnn.UNKNOWN;
            }
            etjy etjyVar = (etjy) ejvjVar.fM(evnnVarB);
            etjwVar.copyOnWrite();
            etjz etjzVar5 = (etjz) etjwVar.instance;
            etjzVar5.g = etjyVar.f;
            etjzVar5.b |= 16;
        }
        Iterator<E> it = evnoVar.h.iterator();
        while (it.hasNext()) {
            etmt etmtVar = (etmt) dsiq.b.fM((evoj) it.next());
            etjwVar.copyOnWrite();
            etjz etjzVar6 = (etjz) etjwVar.instance;
            etmtVar.getClass();
            evtg evtgVar = etjzVar6.h;
            if (!evtgVar.c()) {
                etjzVar6.h = evsn.mutableCopy(evtgVar);
            }
            etjzVar6.h.add(etmtVar);
        }
        if ((evnoVar.b & 32) != 0) {
            int i = evnoVar.i;
            etjwVar.copyOnWrite();
            etjz etjzVar7 = (etjz) etjwVar.instance;
            etjzVar7.b |= 32;
            etjzVar7.i = i;
        }
        return (etjz) etjwVar.build();
    }
}
