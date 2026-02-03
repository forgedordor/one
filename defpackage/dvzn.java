package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvzn extends dvzo {
    private final dwbm a;

    public dvzn(dwbm dwbmVar) {
        this.a = dwbmVar;
    }

    @Override // defpackage.dwbj
    public final int b() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwbj) {
            dwbj dwbjVar = (dwbj) obj;
            if (dwbjVar.b() == 4 && this.a.equals(dwbjVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dvzo, defpackage.dwbj
    public final dwbm g() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfType{typingIndicator=" + this.a.toString() + "}";
    }
}
