package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzaz {
    public final int a;
    private final Object b;

    public bzaz(Object obj, int i) {
        this.b = obj;
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzaz)) {
            return false;
        }
        bzaz bzazVar = (bzaz) obj;
        return fdbq.f(this.b, bzazVar.b) && this.a == bzazVar.a;
    }

    public final int hashCode() {
        Object obj = this.b;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Skip(localRow=");
        sb.append(this.b);
        sb.append(", reason=");
        sb.append((Object) (this.a != 7 ? "BACKUP_ITEM_SKIPPED_EMPTY" : "BACKUP_ITEM_SKIPPED"));
        sb.append(")");
        return sb.toString();
    }
}
