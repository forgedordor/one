package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class escp {
    public final boolean a;
    private final esde b;

    public escp(esde esdeVar, boolean z) {
        this.b = esdeVar;
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof escp) {
            escp escpVar = (escp) obj;
            if (escpVar.b.equals(this.b) && escpVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.a).hashCode();
    }
}
