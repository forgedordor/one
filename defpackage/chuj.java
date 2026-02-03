package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chuj extends chxu {
    private final String a;

    public chuj(String str) {
        this.a = str;
    }

    @Override // defpackage.chxu
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof chxu) {
            return this.a.equals(((chxu) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "LegacyTransactionId{transactionId=" + this.a + "}";
    }
}
