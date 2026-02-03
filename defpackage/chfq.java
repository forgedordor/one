package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chfq extends chfs {
    public final int a;
    public final int b;
    private final chft c;

    public chfq(chft chftVar, int i, int i2) {
        chftVar.getClass();
        this.c = chftVar;
        this.b = i;
        this.a = i2;
    }

    @Override // defpackage.chfs
    public final chft a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chfq)) {
            return false;
        }
        chfq chfqVar = (chfq) obj;
        return fdbq.f(this.c, chfqVar.c) && this.b == chfqVar.b && this.a == chfqVar.a;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.b) * 31) + this.a;
    }

    public final String toString() {
        return "PipelineResult(sendingMessageData=" + this.c + ", result=" + ((Object) cgyf.a(this.b)) + ", sendStatus=" + this.a + ")";
    }
}
