package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csdb {
    public final sck a;

    public csdb(sck sckVar) {
        this.a = sckVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof csdb) && fdbq.f(this.a, ((csdb) obj).a);
    }

    public final int hashCode() {
        sck sckVar = this.a;
        if (sckVar == null) {
            return 0;
        }
        return sckVar.hashCode();
    }

    public final String toString() {
        return "ReinforcementParams(serverInfoParams=" + this.a + ")";
    }

    public csdb() {
        this(null);
    }
}
