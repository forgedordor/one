package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cari {
    public final int a;
    public final String b;

    public cari(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cari)) {
            return false;
        }
        cari cariVar = (cari) obj;
        return this.a == cariVar.a && fdbq.f(this.b, cariVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "StageNestingLevelData(nestingLevel=" + this.a + ", stageNameAndDuration=" + this.b + ")";
    }
}
