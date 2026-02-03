package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvza extends dvzb {
    public final dwau a;

    public dvza(dwau dwauVar) {
        this.a = dwauVar;
    }

    @Override // defpackage.dvzb, defpackage.dwar
    public final dwau a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwar) {
            dwar dwarVar = (dwar) obj;
            dwarVar.b();
            if (this.a.equals(dwarVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfType{deleteConversation=" + this.a.toString() + "}";
    }

    @Override // defpackage.dwar
    public final void b() {
    }
}
