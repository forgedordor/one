package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwkh extends dwkk {
    private final dwpk a;

    public dwkh(dwpk dwpkVar) {
        this.a = dwpkVar;
    }

    @Override // defpackage.dwkk, defpackage.dwjl
    public final dwpk a() {
        return this.a;
    }

    @Override // defpackage.dwjl
    public final int c() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwjl) {
            dwjl dwjlVar = (dwjl) obj;
            if (dwjlVar.c() == 2 && this.a.equals(dwjlVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EventCallbackDestination{contactId=" + this.a.toString() + "}";
    }
}
