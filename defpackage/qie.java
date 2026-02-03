package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qie extends pdn {
    public qie(pex pexVar) {
        super(pexVar);
    }

    @Override // defpackage.pdn
    protected final /* bridge */ /* synthetic */ void b(pkl pklVar, Object obj) {
        qic qicVar = (qic) obj;
        pklVar.g(1, qicVar.a);
        pklVar.g(2, qicVar.b);
    }

    @Override // defpackage.pfn
    protected final String c() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }
}
