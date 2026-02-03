package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctok {
    public final boolean a;
    public final String b;

    public ctok(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctok)) {
            return false;
        }
        ctok ctokVar = (ctok) obj;
        return this.a == ctokVar.a && fdbq.f(this.b, ctokVar.b);
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ChatBotInfo(isAvailable=" + this.a + ", uri=" + this.b + ")";
    }
}
