package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qiz extends pdn {
    public qiz(pex pexVar) {
        super(pexVar);
    }

    @Override // defpackage.pdn
    protected final /* bridge */ /* synthetic */ void b(pkl pklVar, Object obj) {
        qix qixVar = (qix) obj;
        pklVar.g(1, qixVar.a);
        pklVar.g(2, qixVar.b);
    }

    @Override // defpackage.pfn
    protected final String c() {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }
}
