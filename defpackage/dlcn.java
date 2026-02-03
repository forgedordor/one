package defpackage;

/* compiled from: PG */
@fcsv
/* loaded from: classes4.dex */
public final class dlcn {
    public final dlco a;

    public dlcn(dlco dlcoVar) {
        this.a = dlcoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlcn) && fdbq.f(this.a, ((dlcn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SimBarUiData(simChipUiData=" + this.a + ")";
    }
}
