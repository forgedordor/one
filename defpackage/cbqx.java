package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbqx {
    public final String a;

    public cbqx(String str) {
        this.a = str;
    }

    public static final String a(cbqx cbqxVar) {
        if (cbqxVar != null) {
            return cbqxVar.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cbqx) && fdbq.f(this.a, ((cbqx) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "EncryptionId(value=" + this.a + ")";
    }
}
