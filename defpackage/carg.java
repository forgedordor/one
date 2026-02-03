package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class carg {
    public final cogw a;
    public long b = -1;
    public String c = "";
    public final List d;
    public final List e;
    public String f;
    private final int g;
    private final long h;
    private final long i;

    public carg(cogw cogwVar, int i, long j) {
        this.a = cogwVar;
        this.g = i;
        this.h = j;
        this.i = cogwVar.a();
        ArrayList arrayList = new ArrayList(11);
        for (int i2 = 0; i2 < 11; i2++) {
            arrayList.add(null);
        }
        this.d = arrayList;
        this.e = new ArrayList();
    }

    public final carf a(int i) {
        Integer numB = b(i);
        if (numB != null) {
            return (carf) this.d.get(numB.intValue());
        }
        return null;
    }

    public final Integer b(int i) {
        int i2 = i - 1;
        if (i2 < 0 || i2 >= this.d.size()) {
            return null;
        }
        return Integer.valueOf(i2);
    }

    public final String toString() {
        Object next;
        List list = this.d;
        Iterator it = list.iterator();
        Object next2 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                carf carfVar = (carf) next;
                long j = carfVar != null ? carfVar.a : Long.MAX_VALUE;
                do {
                    Object next3 = it.next();
                    carf carfVar2 = (carf) next3;
                    long j2 = carfVar2 != null ? carfVar2.a : Long.MAX_VALUE;
                    if (j > j2) {
                        j = j2;
                    }
                    if (j > j2) {
                        next = next3;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        carf carfVar3 = (carf) next;
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                carf carfVar4 = (carf) next2;
                long j3 = carfVar4 != null ? carfVar4.f : Long.MIN_VALUE;
                do {
                    Object next4 = it2.next();
                    carf carfVar5 = (carf) next4;
                    long j4 = carfVar5 != null ? carfVar5.f : Long.MIN_VALUE;
                    if (j3 < j4) {
                        j3 = j4;
                    }
                    if (j3 < j4) {
                        next2 = next4;
                    }
                } while (it2.hasNext());
            }
        }
        long j5 = this.h;
        carf carfVar6 = (carf) next2;
        Object objValueOf = j5 == -1 ? "Unknown" : Long.valueOf(this.i - j5);
        long j6 = this.b;
        long j7 = this.i;
        long j8 = j6 - j7;
        long j9 = (carfVar3 != null ? carfVar3.a : j7) - j7;
        List list2 = this.e;
        card cardVar = (card) fcva.P(list2);
        long j10 = cardVar != null ? cardVar.a : this.b;
        if (carfVar6 != null) {
            j7 = carfVar6.f;
        }
        long j11 = j10 - j7;
        long j12 = this.b;
        card cardVar2 = (card) fcva.T(list2);
        long j13 = j12 - (cardVar2 != null ? cardVar2.d : this.b);
        String str = this.c;
        int i = this.g;
        String strG = i == 0 ? "" : a.g(i, ". Max prior attempts: ");
        String strAF = fcva.aF(fcva.ae(list), "\n", null, null, null, 62);
        String str2 = strG;
        String strAF2 = fcva.aF(list2, "\n", null, null, null, 62);
        String str3 = this.f;
        return fdgn.c("\n\n      #. OS/PWQ scheduling overhead (wait time). typeName: " + str + " - " + objValueOf + " (ms)\n      #" + str2 + "\n      #. Batch duration (work time) - " + j8 + " (ms)\n      #.. Setup - " + j9 + " (ms)\n      #" + strAF + "\n      #.. Batch result transformations - " + j11 + " (ms)\n      #" + strAF2 + "\n      #.. Result propagation - " + j13 + " (ms)\n      #" + (str3 != null ? ". Exception: ".concat(str3) : "") + "\n\n      ", "#");
    }
}
