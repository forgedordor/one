package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aytg {
    public final aytd a;
    public final String b;
    public final emng c;

    public aytg(aytd aytdVar, String str, emng emngVar) {
        emngVar.getClass();
        this.a = aytdVar;
        this.b = str;
        this.c = emngVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aytg)) {
            return false;
        }
        aytg aytgVar = (aytg) obj;
        return fdbq.f(this.a, aytgVar.a) && fdbq.f(this.b, aytgVar.b) && this.c == aytgVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "BackupTableWriterWithLogTag(backupTableWriter=" + this.a + ", logTag=" + this.b + ", table=" + this.c + ")";
    }
}
