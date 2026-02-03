package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evvu extends evvs {
    static final evvt k(Object obj) {
        return ((evsn) obj).unknownFields;
    }

    static final void l(Object obj, evvt evvtVar) {
        ((evsn) obj).unknownFields = evvtVar;
    }

    @Override // defpackage.evvs
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        evvt evvtVarK = k(obj);
        if (evvtVarK != evvt.a) {
            return evvtVarK;
        }
        evvt evvtVar = new evvt();
        l(obj, evvtVar);
        return evvtVar;
    }

    @Override // defpackage.evvs
    public final /* synthetic */ Object b() {
        return new evvt();
    }

    @Override // defpackage.evvs
    public final /* bridge */ /* synthetic */ void c(Object obj, int i, int i2) {
        ((evvt) obj).f(evwj.c(i, 5), Integer.valueOf(i2));
    }

    @Override // defpackage.evvs
    public final /* bridge */ /* synthetic */ void d(Object obj, int i, long j) {
        ((evvt) obj).f(evwj.c(i, 1), Long.valueOf(j));
    }

    @Override // defpackage.evvs
    public final /* bridge */ /* synthetic */ void e(Object obj, int i, Object obj2) {
        ((evvt) obj).f(evwj.c(i, 3), obj2);
    }

    @Override // defpackage.evvs
    public final /* bridge */ /* synthetic */ void f(Object obj, int i, evqs evqsVar) {
        ((evvt) obj).f(evwj.c(i, 2), evqsVar);
    }

    @Override // defpackage.evvs
    public final /* bridge */ /* synthetic */ void g(Object obj, int i, long j) {
        ((evvt) obj).f(evwj.c(i, 0), Long.valueOf(j));
    }

    @Override // defpackage.evvs
    public final void h(Object obj) {
        k(obj).e();
    }

    @Override // defpackage.evvs
    public final /* synthetic */ void j(Object obj) {
        ((evvt) obj).e();
    }
}
