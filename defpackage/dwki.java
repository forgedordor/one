package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwki extends dwkk {
    private final dwpr a;

    public dwki(dwpr dwprVar) {
        this.a = dwprVar;
    }

    @Override // defpackage.dwkk, defpackage.dwjl
    public final dwpr b() {
        return this.a;
    }

    @Override // defpackage.dwjl
    public final int c() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwjl) {
            dwjl dwjlVar = (dwjl) obj;
            if (dwjlVar.c() == 3 && this.a.equals(dwjlVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EventCallbackDestination{groupId=" + this.a.toString() + "}";
    }
}
