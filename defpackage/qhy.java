package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qhy implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ qia b;

    public qhy(qia qiaVar, String str) {
        this.b = qiaVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qjn qjnVar;
        qcu qcuVar = this.b.b.g;
        Object obj = qcuVar.j;
        String str = this.a;
        synchronized (obj) {
            qfa qfaVarB = qcuVar.b(str);
            qjnVar = qfaVarB != null ? qfaVarB.a : null;
        }
        if (qjnVar == null || !qjnVar.d()) {
            return;
        }
        qia qiaVar = this.b;
        synchronized (qiaVar.c) {
            qiaVar.f.put(qkl.a(qjnVar), qjnVar);
            qiaVar.g.put(qkl.a(qjnVar), qgu.a(qiaVar.h, qjnVar, qiaVar.j.b, qiaVar));
        }
    }
}
