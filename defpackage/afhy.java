package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afhy implements afia {
    public final String a;

    public afhy(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afhy) && fdbq.f(this.a, ((afhy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Conversation(id=" + this.a + ")";
    }
}
