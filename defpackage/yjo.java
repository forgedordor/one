package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yjo {
    public final yko a;
    public final yit b;
    public final fdjx c;

    public yjo(yko ykoVar, yit yitVar, fdjx fdjxVar) {
        this.a = ykoVar;
        this.b = yitVar;
        this.c = fdjxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjo)) {
            return false;
        }
        yjo yjoVar = (yjo) obj;
        return fdbq.f(this.a, yjoVar.a) && fdbq.f(this.b, yjoVar.b) && fdbq.f(this.c, yjoVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "CacheValue(messageBubbleArgs=" + this.a + ", uiDataWrapper=" + this.b + ", scope=" + this.c + ")";
    }
}
