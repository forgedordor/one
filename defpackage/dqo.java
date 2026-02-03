package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqo {
    private final hox a;

    public dqo() {
        this(null);
    }

    public final dqn a() {
        return (dqn) this.a.a();
    }

    public final void b(dqn dqnVar) {
        this.a.b(dqnVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dqo) {
            return fdbq.f(((dqo) obj).a(), a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + a() + ')';
    }

    public /* synthetic */ dqo(byte[] bArr) {
        this.a = new hpl(dql.a, hsi.a);
    }
}
