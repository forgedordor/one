package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qir extends pdn {
    public qir(pex pexVar) {
        super(pexVar);
    }

    @Override // defpackage.pdn
    protected final /* bridge */ /* synthetic */ void b(pkl pklVar, Object obj) {
        pklVar.g(1, ((qio) obj).a);
        pklVar.e(2, r5.b);
        pklVar.e(3, r5.c);
    }

    @Override // defpackage.pfn
    protected final String c() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }
}
