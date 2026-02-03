package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbnj extends fbnd {
    private final fbnd a;
    private final fbni b;

    public fbnj(fbnd fbndVar, fbni fbniVar) {
        this.a = fbndVar;
        fbniVar.getClass();
        this.b = fbniVar;
    }

    @Override // defpackage.fbnd
    public final fbnh a(fbrk fbrkVar, fbnc fbncVar) {
        return this.b.a(fbrkVar, fbncVar, this.a);
    }

    @Override // defpackage.fbnd
    public final String b() {
        return this.a.b();
    }
}
