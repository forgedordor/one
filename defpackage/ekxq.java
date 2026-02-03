package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekxq implements Iterable, Serializable, ekzg {
    private static final long serialVersionUID = 1;
    public ArrayList a = new ArrayList();

    static {
        int i = ekxr.a;
    }

    public static int a(List list, ekxp ekxpVar, int i) {
        int size = list.size() - 1;
        while (i <= size) {
            int i2 = (i + size) >> 1;
            int iCompareTo = ((ekxp) list.get(i2)).compareTo(ekxpVar);
            if (iCompareTo < 0) {
                i = i2 + 1;
            } else {
                if (iCompareTo <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return i;
    }

    public final int b() {
        return this.a.size();
    }

    public final void c() {
        ArrayList arrayList = this.a;
        Collections.sort(arrayList);
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ekxp ekxpVar = (ekxp) arrayList.get(i2);
            if (i <= 0 || !((ekxp) arrayList.get(i - 1)).B(ekxpVar)) {
                while (i > 0) {
                    int i3 = i - 1;
                    if (!ekxpVar.B((ekxp) arrayList.get(i3))) {
                        break;
                    } else {
                        i = i3;
                    }
                }
                while (i >= 3) {
                    int i4 = i - 3;
                    int i5 = i - 2;
                    int i6 = i - 1;
                    long j = (((ekxp) arrayList.get(i4)).d ^ ((ekxp) arrayList.get(i5)).d) ^ ((ekxp) arrayList.get(i6)).d;
                    long j2 = ekxpVar.d;
                    if (j != j2) {
                        break;
                    }
                    long jL = ekxpVar.l();
                    long j3 = jL + jL;
                    long j4 = ((ekxp) arrayList.get(i4)).d;
                    long j5 = ~(j3 + j3 + j3);
                    long j6 = j2 & j5;
                    if ((j4 & j5) != j6 || (((ekxp) arrayList.get(i5)).d & j5) != j6 || (j5 & ((ekxp) arrayList.get(i6)).d) != j6 || ekxpVar.E()) {
                        break;
                    }
                    ekxpVar = new ekxp(ekxp.n(j2));
                    i = i4;
                }
                arrayList.set(i, ekxpVar);
                i++;
            }
        }
        int size = arrayList.size();
        while (i < size) {
            size--;
            arrayList.remove(size);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ekxq) {
            return this.a.equals(((ekxq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Iterator<ekxp> it = iterator();
        int iHashCode = 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 37) + it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public final Iterator<ekxp> iterator() {
        return this.a.iterator();
    }

    public final String toString() {
        return this.a.toString();
    }
}
