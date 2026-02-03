package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cilq implements Iterable, fdcn {
    public final List a;
    public final ekhu b;

    public cilq(List list) {
        list.getClass();
        this.a = list;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Expected list not to be empty");
        }
        if (!fdbq.f(list, fcva.ak(list))) {
            throw new IllegalArgumentException("Expected list to be sorted");
        }
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((cilo) it.next()).d);
        }
        this.b = ekhu.a(arrayList);
    }

    public final int a(int i) {
        Integer numValueOf = Integer.valueOf(i);
        final eknz eknzVarC = eknz.c(numValueOf, numValueOf);
        fdap fdapVar = new fdap() { // from class: cilp
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cilo ciloVar = (cilo) obj;
                ciloVar.getClass();
                return Integer.valueOf(cilo.a.compare(ciloVar.d, eknzVarC));
            }
        };
        List list = this.a;
        int iN = fcva.n(list, list.size(), fdapVar);
        return iN < 0 ? Math.abs(iN) - 1 : iN;
    }

    public final cilo b(int i) {
        int iA = a(i);
        if (iA == 0) {
            return null;
        }
        return (cilo) this.a.get(iA - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(int i) {
        Integer numValueOf = Integer.valueOf(i);
        ekhp ekhpVar = new ekhp();
        ekdw ekdwVar = new ekdw(numValueOf);
        ekno eknoVar = ekno.a;
        ekgb ekgbVar = this.b.c;
        int iB = ekpl.b(ekgbVar, ekhpVar, ekdwVar, eknoVar, 1, 1);
        eknz eknzVar = null;
        if (iB != -1) {
            eknz eknzVar2 = (eknz) ekgbVar.get(iB);
            if (eknzVar2.a(numValueOf)) {
                eknzVar = eknzVar2;
            }
        }
        return eknzVar == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cilq) && fdbq.f(this.a, ((cilq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<cilo> iterator() {
        return this.a.iterator();
    }

    public final String toString() {
        return this.a.toString();
    }
}
