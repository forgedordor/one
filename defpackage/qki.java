package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qki extends pfn {
    public qki(pex pexVar) {
        super(pexVar);
    }

    @Override // defpackage.pfn
    public final String c() {
        return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
    }
}
