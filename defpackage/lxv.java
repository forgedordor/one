package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxv implements fdap {
    final /* synthetic */ fdjq a;
    final /* synthetic */ lvc b;
    final /* synthetic */ lxw c;

    public lxv(fdjq fdjqVar, lvc lvcVar, lxw lxwVar) {
        this.a = fdjqVar;
        this.b = lvcVar;
        this.c = lxwVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        fdjq fdjqVar = this.a;
        fcyi fcyiVar = fcyi.a;
        if (fdjqVar.ey(fcyiVar)) {
            fdjqVar.a(fcyiVar, new lxu(this.b, this.c));
        } else {
            this.b.d(this.c);
        }
        return fctx.a;
    }
}
