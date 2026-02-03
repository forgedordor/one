package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvzv extends dwas {
    private final dwar a;

    public dvzv(dwar dwarVar) {
        this.a = dwarVar;
    }

    @Override // defpackage.dwas
    public final dwar a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwas) {
            return this.a.equals(((dwas) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "CloudUpdate{oneOfType=" + this.a.toString() + "}";
    }
}
