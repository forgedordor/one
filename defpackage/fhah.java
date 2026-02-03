package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhah implements Serializable {
    private static final long serialVersionUID = -125354057735389003L;
    private TreeSet a = new TreeSet();

    private fhah() {
    }

    private static void c(fgxe fgxeVar, TreeSet treeSet, int i) {
        int iIntValue = ((((Integer) treeSet.last()).intValue() & 255) >> 3) + 1;
        int[] iArr = new int[iIntValue];
        fgxeVar.g(i);
        fgxeVar.g(iIntValue);
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Integer) it.next()).intValue();
            int i2 = (iIntValue2 & 255) >> 3;
            iArr[i2] = (1 << (7 - (iIntValue2 % 8))) | iArr[i2];
        }
        for (int i3 = 0; i3 < iIntValue; i3++) {
            fgxeVar.g(iArr[i3]);
        }
    }

    public final void a(fgxe fgxeVar) {
        if (this.a.size() == 0) {
            return;
        }
        TreeSet treeSet = new TreeSet();
        Iterator it = this.a.iterator();
        int i = -1;
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            int i2 = iIntValue >> 8;
            if (i2 != i) {
                if (treeSet.size() > 0) {
                    c(fgxeVar, treeSet, i);
                    treeSet.clear();
                }
                i = i2;
            }
            treeSet.add(new Integer(iIntValue));
        }
        c(fgxeVar, treeSet, i);
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            stringBuffer.append(fhag.a(((Integer) it.next()).intValue()));
            if (it.hasNext()) {
                stringBuffer.append(' ');
            }
        }
        return stringBuffer.toString();
    }

    public fhah(fgxc fgxcVar) throws fhao {
        while (fgxcVar.d() > 0) {
            if (fgxcVar.d() < 2) {
                throw new fhao("invalid bitmap descriptor");
            }
            int iC = fgxcVar.c();
            int iC2 = fgxcVar.c();
            if (iC2 > fgxcVar.d()) {
                throw new fhao("invalid bitmap");
            }
            for (int i = 0; i < iC2; i++) {
                int iC3 = fgxcVar.c();
                if (iC3 != 0) {
                    for (int i2 = 0; i2 < 8; i2++) {
                        if (((1 << (7 - i2)) & iC3) != 0) {
                            this.a.add(fgyj.b((iC * 256) + (i * 8) + i2));
                        }
                    }
                }
            }
        }
    }
}
