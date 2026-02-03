package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qlf implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ qlg b;

    public qlf(qlg qlgVar, Object obj) {
        this.b = qlgVar;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qlg qlgVar = this.b;
        synchronized (qlgVar.b) {
            Object objA = qlgVar.c.a(this.a);
            Object obj = qlgVar.a;
            if (obj == null && objA != null) {
                qlgVar.a = objA;
                qlgVar.d.j(objA);
            } else if (obj != null && !obj.equals(objA)) {
                qlgVar.a = objA;
                qlgVar.d.j(objA);
            }
        }
    }
}
