package defpackage;

import androidx.car.app.model.Alert;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgwr {
    public fgwn a;
    public int b;
    public int c;

    public fgwr() {
        this(null);
    }

    public static int a(long j, long j2) {
        if (j2 >= 0 && j2 < j) {
            j = j2;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) + j;
        return (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 2147483647L) ? Alert.DURATION_SHOW_INDEFINITELY : (int) jCurrentTimeMillis;
    }

    public static void f(fgze fgzeVar, Set set) {
        if (fgzeVar.h().hU() == null) {
            return;
        }
        Iterator itF = fgzeVar.f();
        while (itF.hasNext()) {
            fgyu fgyuVarHU = ((fgzh) itF.next()).hU();
            if (fgyuVarHU != null) {
                set.add(fgyuVarHU);
            }
        }
    }

    public static final int g(int i, boolean z) {
        if (i == 1 || i == 2) {
            return z ? 4 : 3;
        }
        return 1;
    }

    private final synchronized Object h(fgyu fgyuVar) {
        return this.a.get(fgyuVar);
    }

    private final synchronized fgwp i(fgyu fgyuVar, Object obj, int i, int i2) {
        fgwp fgwpVar;
        if (i == 255) {
            throw new IllegalArgumentException("oneElement(ANY)");
        }
        if (obj instanceof List) {
            List list = (List) obj;
            for (int i3 = 0; i3 < list.size(); i3++) {
                fgwpVar = (fgwp) list.get(i3);
                if (fgwpVar.c() == i) {
                    break;
                }
            }
            fgwpVar = null;
        } else {
            fgwpVar = (fgwp) obj;
            if (fgwpVar.c() != i) {
                fgwpVar = null;
            }
        }
        if (fgwpVar == null) {
            return null;
        }
        if (fgwpVar.b()) {
            k(fgyuVar, i);
            return null;
        }
        if (fgwpVar.a(i2) < 0) {
            return null;
        }
        return fgwpVar;
    }

    private final synchronized void j(fgyu fgyuVar, fgwp fgwpVar) {
        Object obj = this.a.get(fgyuVar);
        if (obj == null) {
            this.a.put(fgyuVar, fgwpVar);
            return;
        }
        int iC = fgwpVar.c();
        if (obj instanceof List) {
            List list = (List) obj;
            for (int i = 0; i < list.size(); i++) {
                if (((fgwp) list.get(i)).c() == iC) {
                    list.set(i, fgwpVar);
                    return;
                }
            }
            list.add(fgwpVar);
            return;
        }
        fgwp fgwpVar2 = (fgwp) obj;
        if (fgwpVar2.c() == iC) {
            this.a.put(fgyuVar, fgwpVar);
            return;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(fgwpVar2);
        linkedList.add(fgwpVar);
        this.a.put(fgyuVar, linkedList);
    }

    private final synchronized void k(fgyu fgyuVar, int i) {
        Object obj = this.a.get(fgyuVar);
        if (obj != null) {
            if (obj instanceof List) {
                List list = (List) obj;
                int i2 = 0;
                while (true) {
                    if (i2 >= list.size()) {
                        break;
                    }
                    if (((fgwp) list.get(i2)).c() == i) {
                        list.remove(i2);
                        if (list.size() == 0) {
                            this.a.remove(fgyuVar);
                            return;
                        }
                    } else {
                        i2++;
                    }
                }
            } else if (((fgwp) obj).c() == i) {
                this.a.remove(fgyuVar);
            }
        }
    }

    private final synchronized fgwp[] l(Object obj) {
        if (!(obj instanceof List)) {
            return new fgwp[]{(fgwp) obj};
        }
        List list = (List) obj;
        return (fgwp[]) list.toArray(new fgwp[list.size()]);
    }

    private final synchronized fgwp m(fgyu fgyuVar, int i) {
        Object objH = h(fgyuVar);
        if (objH == null) {
            return null;
        }
        return i(fgyuVar, objH, i, 0);
    }

    protected final synchronized fgzt b(fgyu fgyuVar, int i, int i2) {
        int iA = fgyuVar.a();
        int i3 = iA;
        while (i3 > 0) {
            boolean z = i3 == iA;
            fgyu fgyuVar2 = i3 == 1 ? fgyu.a : z ? fgyuVar : new fgyu(fgyuVar, iA - i3);
            Object obj = this.a.get(fgyuVar2);
            if (obj != null) {
                if (z && i == 255) {
                    fgzt fgztVar = new fgzt(6);
                    int i4 = 0;
                    for (fgwp fgwpVar : l(obj)) {
                        if (fgwpVar.b()) {
                            k(fgyuVar2, fgwpVar.c());
                        } else if ((fgwpVar instanceof fgwo) && fgwpVar.a(i2) >= 0) {
                            fgztVar.a((fgwo) fgwpVar);
                            i4++;
                        }
                    }
                    if (i4 > 0) {
                        return fgztVar;
                    }
                } else if (z) {
                    fgwp fgwpVarI = i(fgyuVar2, obj, i, i2);
                    if (fgwpVarI != null && (fgwpVarI instanceof fgwo)) {
                        fgzt fgztVar2 = new fgzt(6);
                        fgztVar2.a((fgwo) fgwpVarI);
                        return fgztVar2;
                    }
                    if (fgwpVarI != null) {
                        return new fgzt(2);
                    }
                    fgwp fgwpVarI2 = i(fgyuVar2, obj, 5, i2);
                    if (fgwpVarI2 != null && (fgwpVarI2 instanceof fgwo)) {
                        return new fgzt(4, (fgwo) fgwpVarI2);
                    }
                } else {
                    fgwp fgwpVarI3 = i(fgyuVar2, obj, 39, i2);
                    if (fgwpVarI3 != null && (fgwpVarI3 instanceof fgwo)) {
                        return new fgzt(5, (fgwo) fgwpVarI3);
                    }
                }
                fgwp fgwpVarI4 = i(fgyuVar2, obj, 2, i2);
                if (fgwpVarI4 != null && (fgwpVarI4 instanceof fgwo)) {
                    return new fgzt(3, (fgwo) fgwpVarI4);
                }
                if (z && i(fgyuVar2, obj, 0, i2) != null) {
                    return fgzt.b;
                }
            }
            i3--;
        }
        return fgzt.a;
    }

    public final synchronized void c(fgyu fgyuVar, int i, fgzo fgzoVar, int i2) {
        long j;
        if (fgzoVar != null) {
            try {
                j = fgzoVar.i;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            j = 0;
        }
        fgwp fgwpVarM = m(fgyuVar, i);
        if (j != 0) {
            if (fgwpVarM == null || fgwpVarM.a(i2) <= 0) {
                fgwpVarM = null;
            }
            if (fgwpVarM == null) {
                j(fgyuVar, new fgwq(fgyuVar, i, fgzoVar, i2, this.b));
            }
        } else if (fgwpVarM != null && fgwpVarM.a(i2) <= 0) {
            k(fgyuVar, i);
        }
    }

    public final synchronized void d(fgze fgzeVar, int i) {
        long jE = fgzeVar.e();
        fgyu fgyuVarG = fgzeVar.g();
        int iC = fgzeVar.c();
        fgwp fgwpVarM = m(fgyuVarG, iC);
        if (jE != 0) {
            if (fgwpVarM == null || fgwpVarM.a(i) <= 0) {
                fgwpVarM = null;
            }
            if (fgwpVarM == null) {
                j(fgyuVarG, fgzeVar instanceof fgwo ? (fgwo) fgzeVar : new fgwo(fgzeVar, i, this.c));
            }
        } else if (fgwpVarM != null && fgwpVarM.a(i) <= 0) {
            k(fgyuVarG, iC);
        }
    }

    public final synchronized void e() {
        this.a.clear();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        synchronized (this) {
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                for (fgwp fgwpVar : l(it.next())) {
                    stringBuffer.append(fgwpVar);
                    stringBuffer.append("\n");
                }
            }
        }
        return stringBuffer.toString();
    }

    public fgwr(byte[] bArr) {
        this.b = -1;
        this.c = -1;
        this.a = new fgwn();
    }
}
