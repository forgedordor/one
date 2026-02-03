package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwkz extends dwlb {
    private final String a;

    public dwkz(String str) {
        this.a = str;
    }

    @Override // defpackage.dwqo
    public final int a() {
        return 2;
    }

    @Override // defpackage.dwlb, defpackage.dwqo
    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwqo) {
            dwqo dwqoVar = (dwqo) obj;
            if (dwqoVar.a() == 2 && this.a.equals(dwqoVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageContent{text=" + this.a + "}";
    }
}
