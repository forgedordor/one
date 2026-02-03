package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afnl implements afng {
    public final Context a;
    public final afmz b;
    public final fcsu c;
    private final fdjx d;
    private final fduf e;
    private final djmn f;

    public afnl(Context context, fdjx fdjxVar, afmz afmzVar, fcsu fcsuVar) {
        context.getClass();
        fdjxVar.getClass();
        afmzVar.getClass();
        fcsuVar.getClass();
        this.a = context;
        this.d = fdjxVar;
        this.b = afmzVar;
        this.c = fcsuVar;
        this.e = fdvf.a(null);
        this.f = new djmn("", fcvo.a, null, null, null, null, null, null, new fdae() { // from class: afnh
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, 252);
    }

    @Override // defpackage.afng
    public final fdvc a() {
        return fdtg.b(new fdua(this.e, this.b.b(), new afnk(this, null)), this.d, fdur.a(0L, 3), this.f);
    }

    @Override // defpackage.afng
    public final void b(ajou ajouVar) {
        if (((ekoe) ajouVar.b()).c <= 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.e.f(ajouVar);
    }

    public final void c() {
        this.e.f(null);
    }
}
