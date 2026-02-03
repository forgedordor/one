package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qis extends pfn {
    public qis(pex pexVar) {
        super(pexVar);
    }

    @Override // defpackage.pfn
    public final String c() {
        return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
    }
}
