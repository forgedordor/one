package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bqh implements bpu {
    final /* synthetic */ kog a;

    public bqh(kog kogVar) {
        this.a = kogVar;
    }

    @Override // defpackage.bpu
    public final void a(Throwable th) {
        this.a.c(th);
    }

    @Override // defpackage.bpu
    public final void b(Object obj) {
        try {
            this.a.b(obj);
        } catch (Throwable th) {
            this.a.c(th);
        }
    }
}
