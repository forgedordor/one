package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfvl {
    public final cfth a;
    public final cfvj b;
    private final cfwc c;
    private final cfvy d;
    private final cfvo e;
    private final cfuz f;
    private final fctc g = fctd.a(new fdae() { // from class: cfvk
        @Override // defpackage.fdae
        public final Object invoke() {
            cfvl cfvlVar = this.a;
            cftd cftdVar = (cftd) cfvlVar.a.a.b();
            cftdVar.getClass();
            return new cftg(cftdVar, cfvlVar.b.a);
        }
    });

    public cfvl(cfwc cfwcVar, cfth cfthVar, cfvy cfvyVar, cfvo cfvoVar, cfuz cfuzVar, cfvj cfvjVar) {
        this.c = cfwcVar;
        this.a = cfthVar;
        this.d = cfvyVar;
        this.e = cfvoVar;
        this.f = cfuzVar;
        this.b = cfvjVar;
    }

    public final cfvh a(fddy fddyVar) {
        int i = fdcj.a;
        if (fdbq.f(fddyVar, new fdbi(cfuv.class))) {
            return new cfuv();
        }
        if (fdbq.f(fddyVar, new fdbi(cfux.class))) {
            return new cfux();
        }
        if (fdbq.f(fddyVar, new fdbi(cfuw.class))) {
            return new cfuw(this.b);
        }
        if (fdbq.f(fddyVar, new fdbi(cfve.class))) {
            cfuz cfuzVar = this.f;
            cfvj cfvjVar = this.b;
            Object objA = this.g.a();
            objA.getClass();
            return new cfve(cfuzVar, cfvjVar, (cftg) objA);
        }
        if (fdbq.f(fddyVar, new fdbi(cfvx.class))) {
            cfvy cfvyVar = this.d;
            cfuz cfuzVar2 = this.f;
            cfws cfwsVar = (cfws) cfvyVar.a.b();
            cfwsVar.getClass();
            fdjx fdjxVar = (fdjx) cfvyVar.b.b();
            fdjxVar.getClass();
            return new cfvx(cfwsVar, fdjxVar, cfuzVar2);
        }
        if (!fdbq.f(fddyVar, new fdbi(cfwb.class))) {
            if (fdbq.f(fddyVar, new fdbi(cfvg.class))) {
                return new cfvg(this.e, this.b);
            }
            if (!fdbq.f(fddyVar, new fdbi(cfvb.class))) {
                throw new IllegalArgumentException("Requested state is unrecognized");
            }
            Object objA2 = this.g.a();
            objA2.getClass();
            return new cfvb((cftg) objA2);
        }
        cfwc cfwcVar = this.c;
        cfuz cfuzVar3 = this.f;
        cfvj cfvjVar2 = this.b;
        fdjx fdjxVar2 = (fdjx) cfwcVar.a.b();
        fdjxVar2.getClass();
        Long l = (Long) cfwcVar.b.b();
        l.getClass();
        long jLongValue = l.longValue();
        evrj evrjVar = (evrj) cfwcVar.c.b();
        evrjVar.getClass();
        evrj evrjVar2 = (evrj) cfwcVar.d.b();
        evrjVar2.getClass();
        return new cfwb(fdjxVar2, jLongValue, evrjVar, evrjVar2, cfuzVar3, cfvjVar2);
    }
}
