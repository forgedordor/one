package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afon implements afog {
    public final asif a;
    public final asgv b;
    private final fdjx c;
    private final aqgx d;
    private final djcv e;
    private final djcy f;
    private final djgb g;
    private final fdvc h;

    public afon(fdjx fdjxVar, afqn afqnVar, afoo afooVar, afpv afpvVar, aqgt aqgtVar, aqgx aqgxVar, asif asifVar, aqhb aqhbVar, asgv asgvVar) {
        fdjxVar.getClass();
        afqnVar.getClass();
        afooVar.getClass();
        afpvVar.getClass();
        this.c = fdjxVar;
        this.d = aqgxVar;
        this.a = asifVar;
        this.b = asgvVar;
        djcv djcvVar = new djcv(new dpfy(null), "", "", null, 0, false, null, new djcu(aqgtVar.a(), aqgxVar.a()), 120);
        this.e = djcvVar;
        fcvo fcvoVar = fcvo.a;
        djcy djcyVar = new djcy(djcvVar, new djcq(fcvoVar, new fdap() { // from class: afoh
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((Integer) obj).intValue();
                return fctx.a;
            }
        }, new fdap() { // from class: afoi
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((Integer) obj).intValue();
                return fctx.a;
            }
        }), null, new djew(djrr.dA, new fdae() { // from class: afoj
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, (fdae) null, (String) null, false, new djev(aqhbVar.a(), 1), 60), new djcx(asifVar.a()), 52);
        this.f = djcyVar;
        djfn djfnVar = new djfn(fcvoVar, null, new fdap() { // from class: afok
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((djex) obj).getClass();
                return fctx.a;
            }
        });
        boolean zA = asgvVar.a();
        djgb djgbVar = new djgb(djcyVar, djfnVar, null, true == zA ? 4 : 1, 0.0f, false, new djga(true, false, false, false, false, false, 62), 48);
        this.g = djgbVar;
        this.h = fdtg.b(fdud.a(afqnVar.a(), afooVar.a(), afpvVar.a(), new afom(this, null)), fdjxVar, fdur.b, djgbVar);
    }

    @Override // defpackage.afog
    public final fdvc a() {
        return this.h;
    }
}
