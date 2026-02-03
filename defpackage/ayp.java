package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayp extends azh {
    public final int a;
    private final Throwable b;

    public ayp(int i, Throwable th) {
        this.a = i;
        this.b = th;
    }

    @Override // defpackage.azh
    public final int a() {
        return this.a;
    }

    @Override // defpackage.azh
    public final Throwable b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Throwable th;
        if (obj == this) {
            return true;
        }
        if (obj instanceof azh) {
            azh azhVar = (azh) obj;
            if (this.a == azhVar.a() && ((th = this.b) != null ? th.equals(azhVar.b()) : azhVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.b;
        return (th == null ? 0 : th.hashCode()) ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "StateError{code=" + this.a + ", cause=" + this.b + "}";
    }
}
