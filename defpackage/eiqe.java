package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiqe extends eiqq {
    private final eiwd a;

    public eiqe(eiwd eiwdVar) {
        this.a = eiwdVar;
    }

    @Override // defpackage.eiqq
    public final eiwd a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eiqq) {
            return this.a.equals(((eiqq) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Property{softwareInstruction=" + this.a.toString() + "}";
    }
}
