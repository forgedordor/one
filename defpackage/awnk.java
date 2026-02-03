package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awnk {
    public final awjl a;
    private final int b;

    public awnk(awjl awjlVar) {
        awjlVar.getClass();
        this.a = awjlVar;
        this.b = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awnk)) {
            return false;
        }
        awnk awnkVar = (awnk) obj;
        if (!fdbq.f(this.a, awnkVar.a)) {
            return false;
        }
        int i = awnkVar.b;
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 2;
    }

    public final String toString() {
        return "GroupMember(destinationToken=" + this.a + ", role=MEMBER)";
    }
}
