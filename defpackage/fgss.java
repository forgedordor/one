package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgss extends fgst {
    public fgss() {
        this.h = 2;
    }

    @Override // defpackage.fgst, defpackage.fgsu
    public final /* bridge */ /* synthetic */ void a() {
        a();
    }

    final void b(fgrh fgrhVar) {
        this.a = "input";
        this.g = fgrhVar;
        this.b = fgsj.a(this.a);
    }

    @Override // defpackage.fgst
    /* renamed from: c */
    public final void a() {
        super.a();
        this.g = null;
    }

    public final String toString() {
        if (p()) {
            fgrh fgrhVar = this.g;
            if (fgrhVar.a > 0) {
                return "<" + e() + " " + fgrhVar.f() + ">";
            }
        }
        return "<" + e() + ">";
    }
}
