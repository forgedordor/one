package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qjr extends pfn {
    public qjr(pex pexVar) {
        super(pexVar);
    }

    @Override // defpackage.pfn
    public final String c() {
        return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
    }
}
