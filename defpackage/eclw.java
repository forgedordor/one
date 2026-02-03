package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eclw extends eclx {
    public final evuh a;
    private final evrr b;

    public eclw(evuh evuhVar, evrr evrrVar) {
        this.a = evuhVar;
        if (evrrVar == null) {
            throw new NullPointerException("Null extensionRegistryLite");
        }
        this.b = evrrVar;
    }

    @Override // defpackage.eclx
    public final evrr b() {
        return this.b;
    }

    @Override // defpackage.eclx
    public final evuh c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eclx) {
            eclx eclxVar = (eclx) obj;
            if (this.a.equals(eclxVar.c()) && this.b.equals(eclxVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        evrr evrrVar = this.b;
        return "ProtoSerializer{defaultValue=" + this.a.toString() + ", extensionRegistryLite=" + evrrVar.toString() + "}";
    }
}
