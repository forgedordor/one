package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qkj extends pfn {
    public qkj(pex pexVar) {
        super(pexVar);
    }

    @Override // defpackage.pfn
    public final String c() {
        return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
    }
}
