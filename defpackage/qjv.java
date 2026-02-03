package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qjv extends pfn {
    public qjv(pex pexVar) {
        super(pexVar);
    }

    @Override // defpackage.pfn
    public final String c() {
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }
}
