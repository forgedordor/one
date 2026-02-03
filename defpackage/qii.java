package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qii extends pdn {
    public qii(pex pexVar) {
        super(pexVar);
    }

    @Override // defpackage.pdn
    protected final /* bridge */ /* synthetic */ void b(pkl pklVar, Object obj) {
        qig qigVar = (qig) obj;
        pklVar.g(1, qigVar.a);
        pklVar.e(2, qigVar.b.longValue());
    }

    @Override // defpackage.pfn
    protected final String c() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }
}
