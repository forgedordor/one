package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvzl extends dvzo {
    private final dwbd a;

    public dvzl(dwbd dwbdVar) {
        this.a = dwbdVar;
    }

    @Override // defpackage.dwbj
    public final int b() {
        return 2;
    }

    @Override // defpackage.dvzo, defpackage.dwbj
    public final dwbd e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwbj) {
            dwbj dwbjVar = (dwbj) obj;
            if (dwbjVar.b() == 2 && this.a.equals(dwbjVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfType{push=" + this.a.toString() + "}";
    }
}
