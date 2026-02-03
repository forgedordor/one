package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwky extends dwlb {
    private final dwsa a;

    public dwky(dwsa dwsaVar) {
        this.a = dwsaVar;
    }

    @Override // defpackage.dwqo
    public final int a() {
        return 4;
    }

    @Override // defpackage.dwlb, defpackage.dwqo
    public final dwsa c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwqo) {
            dwqo dwqoVar = (dwqo) obj;
            if (dwqoVar.a() == 4 && this.a.equals(dwqoVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageContent{richText=" + this.a.toString() + "}";
    }
}
