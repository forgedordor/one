package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chcx implements chcy {
    public final chcp a;

    public chcx(chcp chcpVar) {
        this.a = chcpVar;
    }

    @Override // defpackage.chcy
    public final chcp a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chcx) && fdbq.f(this.a, ((chcx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Refresh(context=" + this.a + ")";
    }
}
