package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvzj extends dvzo {
    private final dwqw a;

    public dvzj(dwqw dwqwVar) {
        this.a = dwqwVar;
    }

    @Override // defpackage.dwbj
    public final int b() {
        return 1;
    }

    @Override // defpackage.dvzo, defpackage.dwbj
    public final dwqw c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwbj) {
            dwbj dwbjVar = (dwbj) obj;
            if (dwbjVar.b() == 1 && this.a.equals(dwbjVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfType{message=" + this.a.toString() + "}";
    }
}
