package defpackage;

import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ln {
    public final Vector a = new Vector();
    private final cvw b = new cvw();
    private final cvw c = new cvw();
    private final cvw d = new cvw();
    private final cvw e = new cvw();

    private final void e(lt ltVar) {
        byte[] bArrL = ltVar.l();
        if (bArrL != null) {
            this.b.put(new String(bArrL), ltVar);
        }
        byte[] bArrM = ltVar.m();
        if (bArrM != null) {
            this.c.put(new String(bArrM), ltVar);
        }
        byte[] bArrP = ltVar.p();
        if (bArrP != null) {
            this.d.put(new String(bArrP), ltVar);
        }
        byte[] bArrO = ltVar.o();
        if (bArrO != null) {
            this.e.put(new String(bArrO), ltVar);
        }
    }

    public final int a() {
        return this.a.size();
    }

    public final lt b(int i) {
        return (lt) this.a.get(i);
    }

    public final void c(lt ltVar) {
        ltVar.getClass();
        e(ltVar);
        this.a.add(0, ltVar);
    }

    public final void d(lt ltVar) {
        ltVar.getClass();
        e(ltVar);
        this.a.add(ltVar);
    }
}
