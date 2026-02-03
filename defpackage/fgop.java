package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fgop extends fgna implements Serializable {
    private static final long serialVersionUID = -2554245107589433218L;
    public final fgnc d;

    protected fgop(fgnc fgncVar) {
        this.d = fgncVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long jC = ((fgna) obj).c();
        long jC2 = c();
        if (jC2 == jC) {
            return 0;
        }
        return jC2 < jC ? -1 : 1;
    }

    @Override // defpackage.fgna
    public final fgnc d() {
        return this.d;
    }

    @Override // defpackage.fgna
    public final boolean f() {
        return true;
    }

    public final String toString() {
        return "DurationField[" + this.d.m + "]";
    }
}
