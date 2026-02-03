package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qje extends pfn {
    public qje(pex pexVar) {
        super(pexVar);
    }

    @Override // defpackage.pfn
    public final String c() {
        return "DELETE from WorkProgress where work_spec_id=?";
    }
}
