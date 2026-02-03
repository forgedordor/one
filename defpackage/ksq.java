package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ksq extends ksp {
    public int m;

    public ksq(kta ktaVar) {
        super(ktaVar);
        this.l = true != (ktaVar instanceof ksv) ? 3 : 2;
    }

    @Override // defpackage.ksp
    public final void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((ksn) it.next()).f();
        }
    }
}
