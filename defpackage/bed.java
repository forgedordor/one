package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bed extends ben {
    public final bti a;
    public final int b;

    public bed(bti btiVar, int i) {
        this.a = btiVar;
        this.b = i;
    }

    @Override // defpackage.ben
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ben
    public final bti b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ben) {
            ben benVar = (ben) obj;
            if (this.a.equals(benVar.b()) && this.b == benVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "In{packet=" + this.a + ", jpegQuality=" + this.b + "}";
    }
}
