package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgt implements fic {
    final /* synthetic */ fdae a;
    final /* synthetic */ flr b;
    final /* synthetic */ long c;
    private long d = 0;

    public fgt(fdae fdaeVar, flr flrVar, long j) {
        this.a = fdaeVar;
        this.b = flrVar;
        this.c = j;
    }

    @Override // defpackage.fic
    public final void a() {
        this.b.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ivy, java.lang.Object] */
    @Override // defpackage.fic
    public final boolean b(long j, fit fitVar) {
        ?? Invoke = this.a.invoke();
        if (Invoke == 0) {
            return true;
        }
        flr flrVar = this.b;
        long j2 = this.c;
        if (!Invoke.u() || !fly.a(flrVar, j2)) {
            return false;
        }
        if (!flrVar.h(Invoke, j, this.d, fitVar, false)) {
            return true;
        }
        this.d = j;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ivy, java.lang.Object] */
    @Override // defpackage.fic
    public final boolean c(long j, fit fitVar) {
        ?? Invoke = this.a.invoke();
        if (Invoke == 0) {
            return false;
        }
        flr flrVar = this.b;
        long j2 = this.c;
        if (!Invoke.u()) {
            return false;
        }
        flrVar.f(Invoke, j, fitVar, false);
        this.d = j;
        return fly.a(flrVar, j2);
    }
}
