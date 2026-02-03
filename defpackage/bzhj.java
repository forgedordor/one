package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzhj extends bzhn {
    private final byiv a;
    private final cbog b;

    public bzhj(byiv byivVar, cbog cbogVar) {
        this.a = byivVar;
        this.b = cbogVar;
    }

    @Override // defpackage.bzhn
    public final byiv a() {
        return this.a;
    }

    @Override // defpackage.bzhn
    public final cbog b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzhn) {
            bzhn bzhnVar = (bzhn) obj;
            if (this.a.equals(bzhnVar.a()) && this.b.equals(bzhnVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        cbog cbogVar = this.b;
        return "BatchSchedulingResult{scheduledItem=" + this.a.toString() + ", requestExtras=" + cbogVar.toString() + "}";
    }
}
