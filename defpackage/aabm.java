package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabm implements divg {
    public final List a;
    private final boolean b = true;
    private final fdae c;

    public aabm(List list, fdae fdaeVar) {
        this.a = list;
        this.c = fdaeVar;
    }

    @Override // defpackage.divg
    public final divg a(fdae fdaeVar) {
        return new aabm(this.a, fdaeVar);
    }

    @Override // defpackage.divg
    public final fdae b() {
        return this.c;
    }

    @Override // defpackage.divg
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aabm)) {
            return false;
        }
        aabm aabmVar = (aabm) obj;
        if (!fdbq.f(this.a, aabmVar.a)) {
            return false;
        }
        boolean z = aabmVar.b;
        return fdbq.f(this.c, aabmVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + 1231) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ReactionsSummaryUiData(reactions=" + this.a + ", includeScrim=true, onDismiss=" + this.c + ")";
    }
}
