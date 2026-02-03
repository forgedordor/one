package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rvb implements rvc {
    final /* synthetic */ rvc a;
    private volatile Object b;

    public rvb(rvc rvcVar) {
        this.a = rvcVar;
    }

    @Override // defpackage.rvc
    public final Object a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    Object objA = this.a.a();
                    rvi.f(objA);
                    this.b = objA;
                }
            }
        }
        return this.b;
    }
}
