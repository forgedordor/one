package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwug extends dwuj {
    private final dwri a;

    public dwug(dwri dwriVar) {
        this.a = dwriVar;
    }

    @Override // defpackage.dwwj
    public final dwwl a() {
        return dwwl.RICH_CARD_BUTTONS;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwwj) {
            dwwj dwwjVar = (dwwj) obj;
            if (dwwl.RICH_CARD_BUTTONS == dwwjVar.a() && this.a.equals(dwwjVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dwuj, defpackage.dwwj
    public final dwri f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Element{richCardButtons=" + this.a.toString() + "}";
    }
}
