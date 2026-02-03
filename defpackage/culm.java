package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class culm implements culc {
    public static final egyj a = new egyb("EXPRESSIVE_ANIMATIONS_SETTINGS_DATA_SERVICE_KEY");
    public final cmfo b;
    public final fdjx c;
    public final fcyh d;
    private final egzh e;
    private final ains f;

    public culm(cmfo cmfoVar, fdjx fdjxVar, fcyh fcyhVar, egzh egzhVar, ains ainsVar) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        egzhVar.getClass();
        ainsVar.getClass();
        this.b = cmfoVar;
        this.c = fdjxVar;
        this.d = fcyhVar;
        this.e = egzhVar;
        this.f = ainsVar;
    }

    @Override // defpackage.culc
    public final ehaw a() {
        return new cull(this);
    }

    @Override // defpackage.culc
    public final fdpl b() {
        return new culj(this.b.e());
    }

    @Override // defpackage.culc
    public final void c(final boolean z) {
        final fdap fdapVar = new fdap() { // from class: culd
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                culr culrVarA = culq.a((culo) culp.a.createBuilder());
                culrVarA.b(z);
                return culrVarA.a();
            }
        };
        this.e.a(this.b.j(new ejvr() { // from class: cule
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }
        }), a);
        this.f.e("Bugle.ExpressiveAnimations.Settings.Count", true != z ? 2 : 1);
    }
}
