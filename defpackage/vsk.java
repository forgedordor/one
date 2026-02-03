package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vsk {
    public final djgb a;
    public final dpdy b;
    public final fdap c;
    public final fdpl d;
    public final wgl e;

    public vsk(djgb djgbVar, dpdy dpdyVar, fdap fdapVar, fdpl fdplVar, wgl wglVar) {
        this.a = djgbVar;
        this.b = dpdyVar;
        this.c = fdapVar;
        this.d = fdplVar;
        this.e = wglVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsk)) {
            return false;
        }
        vsk vskVar = (vsk) obj;
        return fdbq.f(this.a, vskVar.a) && fdbq.f(this.b, vskVar.b) && fdbq.f(this.c, vskVar.c) && fdbq.f(this.d, vskVar.d) && fdbq.f(this.e, vskVar.e);
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        wgl wglVar = this.e;
        return (iHashCode * 31) + (wglVar == null ? 0 : wglVar.hashCode());
    }

    public final String toString() {
        return "ComposeRowHolderUiData(composeRow=" + this.a + ", hugo=" + this.b + ", onInteractive=" + this.c + ", effectIsRunning=" + this.d + ", disabledComposeRow=" + this.e + ")";
    }
}
