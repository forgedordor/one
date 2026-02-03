package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rio implements rit {
    int a;
    public Class b;
    private final rip c;

    public rio(rip ripVar) {
        this.c = ripVar;
    }

    @Override // defpackage.rit
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rio) {
            rio rioVar = (rio) obj;
            if (this.a == rioVar.a && this.b == rioVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Class cls = this.b;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.a + "array=" + String.valueOf(this.b) + "}";
    }
}
