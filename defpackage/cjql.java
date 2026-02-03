package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjql extends cjtj {
    private final String a;
    private final cjsa b;

    public cjql(String str, cjsa cjsaVar) {
        if (str == null) {
            throw new NullPointerException("Null simId");
        }
        this.a = str;
        if (cjsaVar == null) {
            throw new NullPointerException("Null uiVariant");
        }
        this.b = cjsaVar;
    }

    @Override // defpackage.cjtj
    public final cjsa a() {
        return this.b;
    }

    @Override // defpackage.cjtj
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjtj) {
            cjtj cjtjVar = (cjtj) obj;
            if (this.a.equals(cjtjVar.b()) && this.b.equals(cjtjVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "PhoneNumberInputRequest{simId=" + this.a + ", uiVariant=" + this.b.toString() + "}";
    }
}
