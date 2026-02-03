package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcgj extends fbnd {
    final /* synthetic */ fcgr a;

    public fcgj(fcgr fcgrVar) {
        this.a = fcgrVar;
    }

    @Override // defpackage.fbnd
    public final fbnh a(fbrk fbrkVar, fbnc fbncVar) {
        fcgx fcgxVar = this.a.c;
        fcam fcamVar = new fcam(fbrkVar, fcgxVar.h(fbncVar), fbncVar, fcgxVar.T, fcgxVar.D ? null : fcgxVar.i.c(), fcgxVar.F);
        fcamVar.j = fcgxVar.n;
        fcamVar.k = fcgxVar.o;
        return fcamVar;
    }

    @Override // defpackage.fbnd
    public final String b() {
        return this.a.b;
    }
}
