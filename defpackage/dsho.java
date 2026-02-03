package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dsho extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        etmr etmrVarB;
        etmt etmtVar = (etmt) obj;
        evof evofVar = (evof) evoj.a.createBuilder();
        if ((etmtVar.b & 1) != 0) {
            String str = etmtVar.e;
            evofVar.copyOnWrite();
            evoj evojVar = (evoj) evofVar.instance;
            str.getClass();
            evojVar.b |= 1;
            evojVar.e = str;
        }
        if (etmtVar.c == 2 && etms.a(2) == 1) {
            String str2 = (String) etmtVar.d;
            evofVar.copyOnWrite();
            evoj evojVar2 = (evoj) evofVar.instance;
            str2.getClass();
            evojVar2.c = 2;
            evojVar2.d = str2;
        }
        if (etmtVar.c == 4 && etms.a(4) == 2) {
            Integer num = (Integer) etmtVar.d;
            num.intValue();
            evofVar.copyOnWrite();
            evoj evojVar3 = (evoj) evofVar.instance;
            evojVar3.c = 4;
            evojVar3.d = num;
        }
        if (etmtVar.c == 5 && etms.a(5) == 3) {
            Boolean bool = (Boolean) etmtVar.d;
            bool.booleanValue();
            evofVar.copyOnWrite();
            evoj evojVar4 = (evoj) evofVar.instance;
            evojVar4.c = 5;
            evojVar4.d = bool;
        }
        if (etmtVar.c == 3 && etms.a(3) == 4) {
            ejvj ejvjVarFH = dsjn.a.fH();
            if (etmtVar.c != 3 || (etmrVarB = etmr.b(((Integer) etmtVar.d).intValue())) == null) {
                etmrVarB = etmr.CLIENT_VALUE_UNKNOWN;
            }
            evoh evohVar = (evoh) ejvjVarFH.fM(etmrVarB);
            evofVar.copyOnWrite();
            evoj evojVar5 = (evoj) evofVar.instance;
            evojVar5.d = Integer.valueOf(evohVar.c);
            evojVar5.c = 3;
        }
        return (evoj) evofVar.build();
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        evoj evojVar = (evoj) obj;
        etmp etmpVar = (etmp) etmt.a.createBuilder();
        if ((evojVar.b & 1) != 0) {
            String str = evojVar.e;
            etmpVar.copyOnWrite();
            etmt etmtVar = (etmt) etmpVar.instance;
            str.getClass();
            etmtVar.b |= 1;
            etmtVar.e = str;
        }
        if (evojVar.c == 2 && evoi.a(2) == 3) {
            String str2 = (String) evojVar.d;
            etmpVar.copyOnWrite();
            etmt etmtVar2 = (etmt) etmpVar.instance;
            str2.getClass();
            etmtVar2.c = 2;
            etmtVar2.d = str2;
        }
        if (evojVar.c == 4 && evoi.a(4) == 5) {
            Integer num = (Integer) evojVar.d;
            num.intValue();
            etmpVar.copyOnWrite();
            etmt etmtVar3 = (etmt) etmpVar.instance;
            etmtVar3.c = 4;
            etmtVar3.d = num;
        }
        if (evojVar.c == 5 && evoi.a(5) == 6) {
            Boolean bool = (Boolean) evojVar.d;
            bool.booleanValue();
            etmpVar.copyOnWrite();
            etmt etmtVar4 = (etmt) etmpVar.instance;
            etmtVar4.c = 5;
            etmtVar4.d = bool;
        }
        if (evojVar.c == 3 && evoi.a(3) == 4) {
            ejvj ejvjVar = dsjn.a;
            evoh evohVarB = evoh.b(((Integer) evojVar.d).intValue());
            if (evohVarB == null) {
                evohVarB = evoh.CLIENT_VALUE_UNKNOWN;
            }
            etmr etmrVar = (etmr) ejvjVar.fM(evohVarB);
            etmpVar.copyOnWrite();
            etmt etmtVar5 = (etmt) etmpVar.instance;
            etmtVar5.d = Integer.valueOf(etmrVar.c);
            etmtVar5.c = 3;
        }
        return (etmt) etmpVar.build();
    }
}
