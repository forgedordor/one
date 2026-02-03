package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwla extends dwlb {
    private final evqs a;

    public dwla(evqs evqsVar) {
        this.a = evqsVar;
    }

    @Override // defpackage.dwqo
    public final int a() {
        return 1;
    }

    @Override // defpackage.dwlb, defpackage.dwqo
    public final evqs e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwqo) {
            dwqo dwqoVar = (dwqo) obj;
            if (dwqoVar.a() == 1 && this.a.equals(dwqoVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageContent{unsupported=" + this.a.toString() + "}";
    }
}
