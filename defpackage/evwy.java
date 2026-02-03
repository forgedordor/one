package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evwy {
    public static final evrj a;

    static {
        evri evriVar = (evri) evrj.a.createBuilder();
        evriVar.copyOnWrite();
        ((evrj) evriVar.instance).b = -315576000000L;
        evriVar.copyOnWrite();
        ((evrj) evriVar.instance).c = -999999999;
        evri evriVar2 = (evri) evrj.a.createBuilder();
        evriVar2.copyOnWrite();
        ((evrj) evriVar2.instance).b = 315576000000L;
        evriVar2.copyOnWrite();
        ((evrj) evriVar2.instance).c = 999999999;
        evri evriVar3 = (evri) evrj.a.createBuilder();
        evriVar3.copyOnWrite();
        ((evrj) evriVar3.instance).b = 0L;
        evriVar3.copyOnWrite();
        ((evrj) evriVar3.instance).c = 0;
        a = (evrj) evriVar3.build();
    }

    public static int a(evrj evrjVar, evrj evrjVar2) {
        h(evrjVar);
        h(evrjVar2);
        int iCompare = Long.compare(evrjVar.b, evrjVar2.b);
        return iCompare != 0 ? iCompare : Integer.compare(evrjVar.c, evrjVar2.c);
    }

    public static long b(evrj evrjVar) {
        h(evrjVar);
        return eolp.b(eolp.c(evrjVar.b, 1000L), evrjVar.c / 1000000);
    }

    public static evrj c(long j) {
        evri evriVar = (evri) evrj.a.createBuilder();
        long jC = eolp.c(j, 86400L);
        evriVar.copyOnWrite();
        ((evrj) evriVar.instance).b = jC;
        evriVar.copyOnWrite();
        ((evrj) evriVar.instance).c = 0;
        return (evrj) evriVar.build();
    }

    public static evrj d(long j) {
        return g(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static evrj e(long j) {
        return g(j / 1000000000, (int) (j % 1000000000));
    }

    public static evrj f(long j) {
        return g(j, 0);
    }

    public static evrj g(long j, int i) {
        if (i <= -1000000000 || i >= 1000000000) {
            j = eolp.b(j, i / 1000000000);
            i %= 1000000000;
        }
        if (j > 0 && i < 0) {
            i += 1000000000;
            j--;
        }
        if (j < 0 && i > 0) {
            i -= 1000000000;
            j++;
        }
        evri evriVar = (evri) evrj.a.createBuilder();
        evriVar.copyOnWrite();
        ((evrj) evriVar.instance).b = j;
        evriVar.copyOnWrite();
        ((evrj) evriVar.instance).c = i;
        evrj evrjVar = (evrj) evriVar.build();
        h(evrjVar);
        return evrjVar;
    }

    public static void h(evrj evrjVar) {
        long j = evrjVar.b;
        int i = evrjVar.c;
        if (j >= -315576000000L && j <= 315576000000L && i >= -999999999 && i < 1000000000) {
            if (j >= 0 && i >= 0) {
                return;
            }
            if (j <= 0 && i <= 0) {
                return;
            }
        }
        throw new IllegalArgumentException(ejxq.a("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j), Integer.valueOf(i)));
    }
}
