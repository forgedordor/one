package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qko extends pdn {
    public qko(pex pexVar) {
        super(pexVar);
    }

    @Override // defpackage.pdn
    protected final /* bridge */ /* synthetic */ void b(pkl pklVar, Object obj) {
        qkm qkmVar = (qkm) obj;
        pklVar.g(1, qkmVar.a);
        pklVar.g(2, qkmVar.b);
    }

    @Override // defpackage.pfn
    protected final String c() {
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }
}
