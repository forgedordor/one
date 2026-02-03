package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ephp extends ephr {
    private final CharSequence a;
    private final String b;

    public ephp(CharSequence charSequence, String str) {
        if (charSequence == null) {
            throw new NullPointerException("Null input");
        }
        this.a = charSequence;
        this.b = str;
    }

    @Override // defpackage.ephr
    public final CharSequence a() {
        return this.a;
    }

    @Override // defpackage.ephr
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ephr) {
            ephr ephrVar = (ephr) obj;
            if (this.a.equals(ephrVar.a()) && ((str = this.b) != null ? str.equals(ephrVar.b()) : ephrVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ParseParameters{input=" + ((String) this.a) + ", country=" + this.b + "}";
    }
}
