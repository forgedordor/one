package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwud extends dwuj {
    private final dwvn a;

    public dwud(dwvn dwvnVar) {
        this.a = dwvnVar;
    }

    @Override // defpackage.dwwj
    public final dwwl a() {
        return dwwl.HORIZONTAL_LINE;
    }

    @Override // defpackage.dwuj, defpackage.dwwj
    public final dwvn c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwwj) {
            dwwj dwwjVar = (dwwj) obj;
            if (dwwl.HORIZONTAL_LINE == dwwjVar.a() && this.a.equals(dwwjVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Element{horizontalLine=" + this.a.toString() + "}";
    }
}
