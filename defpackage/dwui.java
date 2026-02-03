package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwui extends dwuj {
    private final dwwd a;

    public dwui(dwwd dwwdVar) {
        this.a = dwwdVar;
    }

    @Override // defpackage.dwwj
    public final dwwl a() {
        return dwwl.STATUS_BADGE;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwwj) {
            dwwj dwwjVar = (dwwj) obj;
            if (dwwl.STATUS_BADGE == dwwjVar.a() && this.a.equals(dwwjVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dwuj, defpackage.dwwj
    public final dwwd h() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Element{statusBadge=" + this.a.toString() + "}";
    }
}
