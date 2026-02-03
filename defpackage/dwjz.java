package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwjz extends dwkf {
    static final dwjz a = new dwjz();

    private dwjz() {
    }

    @Override // defpackage.dwji
    public final dwjj a() {
        return dwjj.NO_OP_ACTION;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "ActionPayload{noOpAction}";
    }
}
