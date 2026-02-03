package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbfu implements cazi {
    public final fdkf a;
    public kog b;
    public final eiju c = eiju.g(kol.a(new koi() { // from class: cbfs
        @Override // defpackage.koi
        public final Object a(kog kogVar) {
            this.a.b = kogVar;
            return fctx.a;
        }
    }));
    private final fdjx d;

    public cbfu(fdkf fdkfVar, fdjx fdjxVar) {
        this.a = fdkfVar;
        this.d = fdjxVar;
    }

    @Override // defpackage.cazi
    public final eiju a() {
        return this.c;
    }

    @Override // defpackage.cazi
    public final eiju b() {
        return auvw.c(this.d, fcyi.a, fdjz.a, new cbft(this, null));
    }

    public final kog c() {
        kog kogVar = this.b;
        if (kogVar != null) {
            return kogVar;
        }
        fdbq.c("completerForFirstAttempt");
        return null;
    }
}
