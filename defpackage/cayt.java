package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cayt extends cayv {
    public final evuo a;
    public final fdau b;
    private final fdjx c;

    public cayt(fdjx fdjxVar, evuo evuoVar, fdau fdauVar) {
        this.c = fdjxVar;
        this.a = evuoVar;
        this.b = fdauVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("SingleItemCoroutineWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return this.a;
    }

    @Override // defpackage.cayv
    protected final eiju j(cayy cayyVar, evuh evuhVar) {
        evuhVar.getClass();
        return auvw.c(this.c, fcyi.a, fdjz.a, new cays(this, evuhVar, cayyVar, null));
    }
}
