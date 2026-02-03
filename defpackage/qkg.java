package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qkg extends pfn {
    public qkg(pex pexVar) {
        super(pexVar);
    }

    @Override // defpackage.pfn
    public final String c() {
        return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
    }
}
