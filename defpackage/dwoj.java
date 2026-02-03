package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwoj extends dwrp {
    public final String a;

    public dwoj(String str) {
        this.a = str;
    }

    @Override // defpackage.dwrp
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwrp) {
            return this.a.equals(((dwrp) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "HyperLink{url=" + this.a + "}";
    }
}
