package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qjs extends pfn {
    public qjs(pex pexVar) {
        super(pexVar);
    }

    @Override // defpackage.pfn
    public final String c() {
        return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
    }
}
