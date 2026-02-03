package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvzm extends dvzo {
    private final dwbf a;

    public dvzm(dwbf dwbfVar) {
        this.a = dwbfVar;
    }

    @Override // defpackage.dwbj
    public final int b() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwbj) {
            dwbj dwbjVar = (dwbj) obj;
            if (dwbjVar.b() == 3 && this.a.equals(dwbjVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dvzo, defpackage.dwbj
    public final dwbf f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfType{receipt=" + this.a.toString() + "}";
    }
}
