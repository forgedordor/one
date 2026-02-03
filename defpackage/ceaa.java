package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ceaa extends cead {
    public final String a;
    public final ekhx b;

    public ceaa(String str, ekhx ekhxVar) {
        this.a = str;
        if (ekhxVar == null) {
            throw new NullPointerException("Null cc");
        }
        this.b = ekhxVar;
    }

    @Override // defpackage.cead
    public final ekhx a() {
        return this.b;
    }

    @Override // defpackage.cead
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cead) {
            cead ceadVar = (cead) obj;
            String str = this.a;
            if (str != null ? str.equals(ceadVar.b()) : ceadVar.b() == null) {
                if (this.b.equals(ceadVar.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "IncomingMessageRecipients{to=" + this.a + ", cc=" + this.b.toString() + "}";
    }
}
