package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qjy extends pfn {
    public qjy(pex pexVar) {
        super(pexVar);
    }

    @Override // defpackage.pfn
    public final String c() {
        return "UPDATE workspec SET stop_reason=? WHERE id=?";
    }
}
