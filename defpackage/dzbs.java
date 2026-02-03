package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzbs extends dzcw {
    public final dzda a;
    public final dzcz b;
    public final dzcy c;
    public final dyyb d;
    public final dyrh e;

    public dzbs(dzda dzdaVar, dzcz dzczVar, dzcy dzcyVar, dyyb dyybVar, dyrh dyrhVar) {
        this.a = dzdaVar;
        this.b = dzczVar;
        this.c = dzcyVar;
        this.d = dyybVar;
        this.e = dyrhVar;
    }

    @Override // defpackage.dzcw
    public final dyrh a() {
        return this.e;
    }

    @Override // defpackage.dzcw
    public final dyyb b() {
        return this.d;
    }

    @Override // defpackage.dzcw
    public final dzcy c() {
        return this.c;
    }

    @Override // defpackage.dzcw
    public final dzcz d() {
        return this.b;
    }

    @Override // defpackage.dzcw
    public final dzda e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzcw) {
            dzcw dzcwVar = (dzcw) obj;
            if (this.a.equals(dzcwVar.e()) && this.b.equals(dzcwVar.d()) && this.c.equals(dzcwVar.c()) && this.d.equals(dzcwVar.b())) {
                dzcwVar.f();
                dzcwVar.g();
                if (this.e.equals(dzcwVar.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ 1) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "Configuration{onViewCreatedCallback=" + this.a.toString() + ", onDismissCallback=" + this.b.toString() + ", onDestroyCallback=" + this.c.toString() + ", visualElements=" + this.d.toString() + ", isExperimental=false, largeScreenDialogAlignment=ALIGN_CENTER, materialVersion=" + this.e.toString() + "}";
    }

    @Override // defpackage.dzcw
    public final void f() {
    }

    @Override // defpackage.dzcw
    public final void g() {
    }
}
