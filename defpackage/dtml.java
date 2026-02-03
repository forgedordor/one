package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtml extends dtot {
    private final ekgp a;

    public dtml(ekgp ekgpVar) {
        this.a = ekgpVar;
    }

    @Override // defpackage.dtot
    public final ekgp a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dtot) {
            return this.a.equals(((dtot) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "DiagnosticInfo{backgroundTaskLastRunTimestamps=" + this.a.toString() + "}";
    }
}
