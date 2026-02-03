package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvzi extends dvzo {
    private final dwas a;

    public dvzi(dwas dwasVar) {
        this.a = dwasVar;
    }

    @Override // defpackage.dvzo, defpackage.dwbj
    public final dwas a() {
        return this.a;
    }

    @Override // defpackage.dwbj
    public final int b() {
        return 5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwbj) {
            dwbj dwbjVar = (dwbj) obj;
            if (dwbjVar.b() == 5 && this.a.equals(dwbjVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfType{cloudUpdate=" + this.a.toString() + "}";
    }
}
