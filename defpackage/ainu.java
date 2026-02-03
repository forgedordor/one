package defpackage;

import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ainu implements aint {
    private final dbzq a;
    private final aior b;

    public ainu(dbzq dbzqVar, aior aiorVar) {
        this.a = dbzqVar;
        this.b = aiorVar;
    }

    private final void j(String str, Number number) {
        this.a.c(str).a(0L, number.longValue(), dbzq.b);
    }

    private final void k(String str, int i, long j) {
        this.a.d(str).a(i, j, dbzq.b);
    }

    @Override // defpackage.aint
    public final void a() throws NoSuchAlgorithmException {
        this.a.f();
    }

    @Override // defpackage.aint
    public final void b(String str, elgm elgmVar, long j) {
        str.getClass();
        elgmVar.getClass();
        elkq elkqVar = (elkq) elku.a.createBuilder();
        elkqVar.getClass();
        elkqVar.copyOnWrite();
        elku elkuVar = (elku) elkqVar.instance;
        elkuVar.t = elgmVar.bI;
        elkuVar.b |= 131072;
        elvg elvgVar = cqbe.a;
        elvgVar.getClass();
        elkqVar.copyOnWrite();
        elku elkuVar2 = (elku) elkqVar.instance;
        elkuVar2.u = elvgVar.x;
        elkuVar2.b |= 262144;
        evsn evsnVarBuild = elkqVar.build();
        evsnVarBuild.getClass();
        dbzn dbznVarE = this.a.e(str);
        dbzj dbzjVarA = dbzj.a((elku) evsnVarBuild);
        dbzh dbzhVar = dbznVarE.f;
        dbznVarE.a(j, 1L, dbzjVarA);
    }

    @Override // defpackage.aint
    public final void c(String str) {
        j(str, 1);
    }

    @Override // defpackage.aint
    public final void d(String str, Number number) {
        j(str, Long.valueOf(number.longValue()));
    }

    @Override // defpackage.aint
    public final void e(String str, int i) {
        k(str, i, 1L);
    }

    @Override // defpackage.aint
    public final void f(String str, int i, long j) {
        str.getClass();
        k(str, i, j);
    }

    @Override // defpackage.aint
    public final void g(String str, long j) {
        str.getClass();
        dbzn dbznVarE = this.a.e(str);
        dbzh dbzhVar = dbznVarE.f;
        dbznVarE.a(j, 1L, dbzq.b);
    }

    @Override // defpackage.aint
    public final void h(String str, long j, String str2) {
        str2.getClass();
        dbzn dbznVarE = this.b.a(str2).e(str);
        dbzh dbzhVar = dbznVarE.f;
        dbznVarE.a(j, 1L, dbzq.b);
    }

    @Override // defpackage.aint
    public final void i() {
        this.b.a("112855188").c("Bugle.BugOccurrence.Counts").a(0L, 1L, dbzq.b);
    }
}
