package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qju extends pfn {
    public qju(pex pexVar) {
        super(pexVar);
    }

    @Override // defpackage.pfn
    public final String c() {
        return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
    }
}
