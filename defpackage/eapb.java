package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class eapb extends eatm {
    public final String a;
    public final String b;

    public eapb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.eatm
    public final String a() {
        return this.a;
    }

    @Override // defpackage.eatm
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eatm) {
            eatm eatmVar = (eatm) obj;
            String str = this.a;
            if (str != null ? str.equals(eatmVar.a()) : eatmVar.a() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(eatmVar.b()) : eatmVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "PlusCode{compoundCode=" + this.a + ", globalCode=" + this.b + "}";
    }
}
