package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qqk extends qxc {
    final /* synthetic */ qxb a;
    final /* synthetic */ qxc b;
    final /* synthetic */ qsq c;

    public qqk(qxb qxbVar, qxc qxcVar, qsq qsqVar) {
        this.a = qxbVar;
        this.b = qxcVar;
        this.c = qsqVar;
    }

    @Override // defpackage.qxc
    public final /* bridge */ /* synthetic */ Object a(qxb qxbVar) {
        float f = qxbVar.a;
        float f2 = qxbVar.b;
        String str = ((qsq) qxbVar.c).a;
        String str2 = ((qsq) qxbVar.d).a;
        qxb qxbVar2 = this.a;
        qxbVar2.a(f, f2, str, str2, qxbVar.e, qxbVar.f, qxbVar.g);
        String str3 = (String) this.b.a(qxbVar2);
        qsq qsqVar = (qsq) (qxbVar.f == 1.0f ? qxbVar.d : qxbVar.c);
        qsq qsqVar2 = this.c;
        qsqVar2.a(str3, qsqVar.b, qsqVar.c, qsqVar.m, qsqVar.d, qsqVar.e, qsqVar.f, qsqVar.g, qsqVar.h, qsqVar.i, qsqVar.j, qsqVar.k, qsqVar.l);
        return qsqVar2;
    }
}
