package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cskz {
    public static final sck a(evyk evykVar) {
        sch schVar = (sch) sck.a.createBuilder();
        schVar.getClass();
        for (evyj evyjVar : evykVar.b) {
            sci sciVar = (sci) scj.a.createBuilder();
            float f = evyjVar.b;
            sciVar.copyOnWrite();
            scj scjVar = (scj) sciVar.instance;
            scjVar.b |= 1;
            scjVar.c = f;
            schVar.copyOnWrite();
            sck sckVar = (sck) schVar.instance;
            scj scjVar2 = (scj) sciVar.build();
            scjVar2.getClass();
            evtg evtgVar = sckVar.b;
            if (!evtgVar.c()) {
                sckVar.b = evsn.mutableCopy(evtgVar);
            }
            sckVar.b.add(scjVar2);
        }
        evsn evsnVarBuild = schVar.build();
        evsnVarBuild.getClass();
        return (sck) evsnVarBuild;
    }

    public static final Integer b(eoff eoffVar, int i, Integer num) {
        int iIntValue = num != null ? num.intValue() + 1 : 0;
        if (!((Boolean) csli.c.e()).booleanValue() && eoffVar == eoff.SPAM) {
            return null;
        }
        cczv cczvVar = csli.a;
        if (((ewtm) cczvVar.e()).b.size() <= iIntValue) {
            return null;
        }
        if (((Boolean) ((cczi) csli.d.get()).e()).booleanValue() && i == 14) {
            return null;
        }
        return Integer.valueOf(((ewtm) cczvVar.e()).b.d(iIntValue));
    }

    public static final csdo c(int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        int i2 = i - 2;
        return i2 != 2 ? i2 != 8 ? i2 != 4 ? i2 != 5 ? csdo.a : csdo.b : csdo.c : csdo.b : csdo.c;
    }

    static /* synthetic */ Integer d(eoff eoffVar, Integer num, int i) {
        if ((i & 4) != 0) {
            num = null;
        }
        return b(eoffVar, 0, num);
    }
}
