package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eilx extends eimm {
    public final fejw a;
    private final dzfh b;
    private final boolean c;

    public eilx(fejw fejwVar, dzfh dzfhVar, boolean z) {
        this.a = fejwVar;
        this.b = dzfhVar;
        this.c = z;
    }

    @Override // defpackage.eimm
    public final dzfh a() {
        return this.b;
    }

    @Override // defpackage.eimm
    public final fejw b() {
        return this.a;
    }

    @Override // defpackage.eimm
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eimm) {
            eimm eimmVar = (eimm) obj;
            if (this.a.equals(eimmVar.b()) && this.b.equals(eimmVar.a()) && this.c == eimmVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "ConvertedTraceRecordWithMetadata{traceRecord=" + this.a.toString() + ", eventName=" + this.b.a + ", isEmpty=" + this.c + "}";
    }
}
