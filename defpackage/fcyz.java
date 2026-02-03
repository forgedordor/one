package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fcyz extends fcyv implements fdbm {
    private final int a;

    public fcyz(int i, fcxy fcxyVar) {
        super(fcxyVar);
        this.a = i;
    }

    @Override // defpackage.fdbm
    public final int dS() {
        return this.a;
    }

    @Override // defpackage.fcyt
    public final String toString() {
        if (this.C != null) {
            return super.toString();
        }
        int i = fdcj.a;
        String strA = fdck.a(this);
        strA.getClass();
        return strA;
    }
}
