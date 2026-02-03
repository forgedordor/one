package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class suh implements sub {
    public static final egyj a = new egyb("TRANSCRIPTION_SETTINGS_DATA_SERVICE_KEY");
    public final fdjx b;
    public final cmfo c;
    private final fcyh d;
    private final egzh e;
    private final ains f;

    public suh(fdjx fdjxVar, fcyh fcyhVar, cmfo cmfoVar, egzh egzhVar, ains ainsVar) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        egzhVar.getClass();
        ainsVar.getClass();
        this.b = fdjxVar;
        this.d = fcyhVar;
        this.c = cmfoVar;
        this.e = egzhVar;
        this.f = ainsVar;
    }

    @Override // defpackage.sub
    public final ehaw a() {
        return new sug(this);
    }

    @Override // defpackage.sub
    public final Object b(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.d), new sue(null, this), fcxyVar);
    }

    @Override // defpackage.sub
    public final void c(final boolean z) {
        final fdap fdapVar = new fdap() { // from class: suc
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                stz stzVar = (stz) sua.a.createBuilder();
                stzVar.getClass();
                stzVar.copyOnWrite();
                sua suaVar = (sua) stzVar.instance;
                suaVar.b |= 1;
                suaVar.c = z;
                evsn evsnVarBuild = stzVar.build();
                evsnVarBuild.getClass();
                return (sua) evsnVarBuild;
            }
        };
        this.e.a(this.c.j(new ejvr() { // from class: sud
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }
        }), a);
        this.f.c(true != z ? "Bugle.Vmt.OptOut.Count" : "Bugle.Vmt.OptIn.Count");
    }
}
