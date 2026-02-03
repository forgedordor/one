package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgqe implements fgqd {
    public final fgqd a;

    private fgqe(fgqd fgqdVar) {
        this.a = fgqdVar;
    }

    static fgqe b(fgqd fgqdVar) {
        if (fgqdVar instanceof fgqa) {
            return ((fgqa) fgqdVar).a;
        }
        if (fgqdVar instanceof fgqe) {
            return (fgqe) fgqdVar;
        }
        if (fgqdVar == null) {
            return null;
        }
        return new fgqe(fgqdVar);
    }

    @Override // defpackage.fgqd
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.fgqd
    public final int c(fgpz fgpzVar, CharSequence charSequence, int i) {
        return this.a.c(fgpzVar, charSequence, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fgqe) {
            return this.a.equals(((fgqe) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
