package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwuc extends dwuj {
    private final dwvl a;

    public dwuc(dwvl dwvlVar) {
        this.a = dwvlVar;
    }

    @Override // defpackage.dwwj
    public final dwwl a() {
        return dwwl.HORIZONTAL_LAYOUT_BUTTONS;
    }

    @Override // defpackage.dwuj, defpackage.dwwj
    public final dwvl b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwwj) {
            dwwj dwwjVar = (dwwj) obj;
            if (dwwl.HORIZONTAL_LAYOUT_BUTTONS == dwwjVar.a() && this.a.equals(dwwjVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Element{horizontalLayoutButtons=" + this.a.toString() + "}";
    }
}
