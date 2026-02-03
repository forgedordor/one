package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwue extends dwuj {
    private final dwvp a;

    public dwue(dwvp dwvpVar) {
        this.a = dwvpVar;
    }

    @Override // defpackage.dwwj
    public final dwwl a() {
        return dwwl.IMAGE_ELEMENT;
    }

    @Override // defpackage.dwuj, defpackage.dwwj
    public final dwvp d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwwj) {
            dwwj dwwjVar = (dwwj) obj;
            if (dwwl.IMAGE_ELEMENT == dwwjVar.a() && this.a.equals(dwwjVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Element{imageElement=" + this.a.toString() + "}";
    }
}
