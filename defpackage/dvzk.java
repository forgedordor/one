package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvzk extends dvzo {
    private final dwbg a;

    public dvzk(dwbg dwbgVar) {
        this.a = dwbgVar;
    }

    @Override // defpackage.dwbj
    public final int b() {
        return 6;
    }

    @Override // defpackage.dvzo, defpackage.dwbj
    public final dwbg d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwbj) {
            dwbj dwbjVar = (dwbj) obj;
            if (dwbjVar.b() == 6 && this.a.equals(dwbjVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfType{profileUpdate=" + this.a.toString() + "}";
    }
}
