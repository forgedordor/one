package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwuh extends dwuj {
    private final dwsa a;

    public dwuh(dwsa dwsaVar) {
        this.a = dwsaVar;
    }

    @Override // defpackage.dwwj
    public final dwwl a() {
        return dwwl.RICH_TEXT;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwwj) {
            dwwj dwwjVar = (dwwj) obj;
            if (dwwl.RICH_TEXT == dwwjVar.a() && this.a.equals(dwwjVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dwuj, defpackage.dwwj
    public final dwsa g() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Element{richText=" + this.a.toString() + "}";
    }
}
