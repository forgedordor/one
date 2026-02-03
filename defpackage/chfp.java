package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chfp extends chfs {
    public final chft a;
    public final chvf b;

    public chfp(chft chftVar, chvf chvfVar) {
        this.a = chftVar;
        this.b = chvfVar;
    }

    @Override // defpackage.chfs
    public final chft a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chfp)) {
            return false;
        }
        chfp chfpVar = (chfp) obj;
        return fdbq.f(this.a, chfpVar.a) && fdbq.f(this.b, chfpVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ChatApiResult(sendingMessageData=" + this.a + ", messageStatus=" + this.b + ")";
    }
}
