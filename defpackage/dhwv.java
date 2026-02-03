package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dhwv implements dhwu {
    private final Object a = new Object();

    @Override // defpackage.dhwu
    public final Object a(fdae fdaeVar) {
        Object objInvoke;
        synchronized (this.a) {
            objInvoke = fdaeVar.invoke();
        }
        return objInvoke;
    }

    @Override // defpackage.dhwu
    public final void b(fdae fdaeVar) {
        synchronized (this.a) {
            fdaeVar.invoke();
        }
    }
}
