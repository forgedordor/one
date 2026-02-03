package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caoh implements bzaa {
    private final cpmc a;
    private final byrw b;
    private final fdjx c;

    public caoh(cpmc cpmcVar, byrw byrwVar, fdjx fdjxVar) {
        cpmcVar.getClass();
        fdjxVar.getClass();
        this.a = cpmcVar;
        this.b = byrwVar;
        this.c = fdjxVar;
    }

    @Override // defpackage.bzaa
    public final aumn a() {
        return aumn.BACKUP_KEY;
    }

    @Override // defpackage.bzaa
    public final bmra b() {
        return bmra.BACKUP_KEY_OBJECT;
    }

    @Override // defpackage.bzaa
    public final /* synthetic */ bykl c() {
        return this.b;
    }

    @Override // defpackage.bzaa
    public final eiju d(String str) {
        if (str == null || fdgn.H(str)) {
            return this.a.y();
        }
        throw new IllegalArgumentException("Backup keys cannot be paginated.");
    }

    @Override // defpackage.bzaa
    public final eiju e(pzs pzsVar) {
        return auvw.c(this.c, fcyi.a, fdjz.a, new caog(null));
    }

    @Override // defpackage.bzaa
    public final emec f() {
        return emec.RESTORE_BACKUP_KEY;
    }

    @Override // defpackage.bzaa
    public final /* bridge */ /* synthetic */ String g(Object obj) {
        eqnd eqndVar = (eqnd) obj;
        eqndVar.getClass();
        String str = eqndVar.c;
        str.getClass();
        return str;
    }

    @Override // defpackage.bzaa
    public final String h() {
        return "Backup Key";
    }
}
