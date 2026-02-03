package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fgze implements Serializable {
    private static final long serialVersionUID = -3270249290171239695L;
    private List a;
    private short b;
    private short c;

    public fgze() {
        this.a = new ArrayList(1);
        this.b = (short) 0;
        this.c = (short) 0;
    }

    private final synchronized Iterator a(boolean z, boolean z2) {
        int i;
        int size = this.a.size();
        int i2 = z ? size - this.b : this.b;
        if (i2 == 0) {
            return Collections.EMPTY_LIST.iterator();
        }
        if (!z) {
            i = size - this.b;
        } else if (z2) {
            i = this.c;
            if (i >= i2) {
                i = 0;
            }
            this.c = (short) (i + 1);
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList(i2);
        if (z) {
            arrayList.addAll(this.a.subList(i, i2));
            if (i != 0) {
                arrayList.addAll(this.a.subList(0, i));
            }
        } else {
            arrayList.addAll(this.a.subList(i, size));
        }
        return arrayList.iterator();
    }

    private final void b(fgzh fgzhVar) {
        if (fgzhVar instanceof fgzd) {
            this.a.add(fgzhVar);
            this.b = (short) (this.b + 1);
        } else if (this.b == 0) {
            this.a.add(fgzhVar);
        } else {
            List list = this.a;
            list.add(list.size() - this.b, fgzhVar);
        }
    }

    private static final String j(Iterator it) {
        StringBuffer stringBuffer = new StringBuffer();
        while (it.hasNext()) {
            fgzh fgzhVar = (fgzh) it.next();
            stringBuffer.append("[");
            stringBuffer.append(fgzhVar.a());
            stringBuffer.append("]");
            if (it.hasNext()) {
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }

    public final int c() {
        return h().g();
    }

    public final int d() {
        return h().h;
    }

    public final synchronized long e() {
        return h().i;
    }

    public final synchronized Iterator f() {
        return a(true, true);
    }

    public final fgyu g() {
        return h().f;
    }

    public final synchronized fgzh h() {
        if (this.a.size() == 0) {
            throw new IllegalStateException("rrset is empty");
        }
        return (fgzh) this.a.get(0);
    }

    public final synchronized void i(fgzh fgzhVar) {
        if (this.a.size() == 0) {
            b(fgzhVar);
            return;
        }
        fgzh fgzhVarH = h();
        if (fgzhVar.g() != fgzhVarH.g() || fgzhVar.h != fgzhVarH.h || !fgzhVar.f.equals(fgzhVarH.f)) {
            throw new IllegalArgumentException("record does not match rrset");
        }
        long j = fgzhVar.i;
        long j2 = fgzhVarH.i;
        if (j != j2) {
            if (j > j2) {
                fgzhVar = fgzhVar.j();
                fgzhVar.i = fgzhVarH.i;
            } else {
                for (int i = 0; i < this.a.size(); i++) {
                    fgzh fgzhVarJ = ((fgzh) this.a.get(i)).j();
                    fgzhVarJ.i = fgzhVar.i;
                    this.a.set(i, fgzhVarJ);
                }
            }
        }
        if (this.a.contains(fgzhVar)) {
            return;
        }
        b(fgzhVar);
    }

    public String toString() {
        if (this.a.size() == 0) {
            return "{empty}";
        }
        StringBuffer stringBuffer = new StringBuffer("{ ");
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(g());
        stringBuffer2.append(" ");
        stringBuffer.append(stringBuffer2.toString());
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(e());
        stringBuffer3.append(" ");
        stringBuffer.append(stringBuffer3.toString());
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append(fgwy.a(d()));
        stringBuffer4.append(" ");
        stringBuffer.append(stringBuffer4.toString());
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append(fhag.a(c()));
        stringBuffer5.append(" ");
        stringBuffer.append(stringBuffer5.toString());
        stringBuffer.append(j(a(true, false)));
        if (this.b > 0) {
            stringBuffer.append(" sigs: ");
            stringBuffer.append(j(a(false, false)));
        }
        stringBuffer.append(" }");
        return stringBuffer.toString();
    }

    public fgze(fgze fgzeVar) {
        synchronized (fgzeVar) {
            this.a = (List) ((ArrayList) fgzeVar.a).clone();
            this.b = fgzeVar.b;
            this.c = fgzeVar.c;
        }
    }

    public fgze(fgzh fgzhVar) {
        this.a = new ArrayList(1);
        this.b = (short) 0;
        this.c = (short) 0;
        b(fgzhVar);
    }
}
