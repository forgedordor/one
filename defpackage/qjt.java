package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qjt extends pfn {
    public qjt(pex pexVar) {
        super(pexVar);
    }

    @Override // defpackage.pfn
    public final String c() {
        return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
    }
}
