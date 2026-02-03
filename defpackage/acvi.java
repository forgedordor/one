package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acvi implements acve {
    private static final egyj b = new egyb("GROUP_UPGRADE_SETTINGS_DATA_SERVICE_KEY");
    public final cmfo a;
    private final fcyh c;
    private final egzh d;

    public acvi(fdjx fdjxVar, fcyh fcyhVar, cmfo cmfoVar, egzh egzhVar) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        egzhVar.getClass();
        this.c = fcyhVar;
        this.a = cmfoVar;
        this.d = egzhVar;
    }

    @Override // defpackage.acve
    public final Object a(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.c), new acvh(null, this), fcxyVar);
    }

    @Override // defpackage.acve
    public final void b(final int i) {
        final fdap fdapVar = new fdap() { // from class: acvf
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                acvc acvcVar = (acvc) acvd.a.createBuilder();
                acvcVar.getClass();
                acvcVar.copyOnWrite();
                acvd acvdVar = (acvd) acvcVar.instance;
                acvdVar.b |= 1;
                acvdVar.c = i;
                evsn evsnVarBuild = acvcVar.build();
                evsnVarBuild.getClass();
                return (acvd) evsnVarBuild;
            }
        };
        this.d.a(this.a.j(new ejvr() { // from class: acvg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }
        }), b);
    }
}
