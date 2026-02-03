package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aibk {
    public final enoq a;
    public final UUID b;
    public final aibj c;

    public aibk(enoq enoqVar, UUID uuid, aibj aibjVar) {
        this.a = enoqVar;
        this.b = uuid;
        this.c = aibjVar;
    }

    public final boolean a() {
        return this.a == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aibk)) {
            return false;
        }
        aibk aibkVar = (aibk) obj;
        return this.a == aibkVar.a && fdbq.f(this.b, aibkVar.b) && fdbq.f(this.c, aibkVar.c);
    }

    public final int hashCode() {
        enoq enoqVar = this.a;
        return ((((enoqVar == null ? 0 : enoqVar.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "HandshakeResult(failureReason=" + this.a + ", sessionId=" + this.b + ", result=" + this.c + ")";
    }
}
