package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhh extends bkn {
    private final Object a;

    public bhh(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.bkn
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bkn) {
            return this.a.equals(((bkn) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Identifier{value=" + this.a + "}";
    }
}
