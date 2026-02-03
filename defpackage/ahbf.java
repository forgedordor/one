package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahbf implements ahay, ahax {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/popups/PopupsUiAdapterImpl");
    public final fduf a;
    public final ahbe b;
    private final fdvc d;

    public ahbf(fdjx fdjxVar) {
        fdjxVar.getClass();
        fduf fdufVarA = fdvf.a(null);
        this.a = fdufVarA;
        this.d = fdufVarA;
        this.b = new ahbe(this);
    }

    private final void h(fdae fdaeVar) {
        fduf fdufVar = this.a;
        if (((dktt) fdufVar.c()) != null) {
            ((ekrd) c.j().h("com/google/android/apps/messaging/popups/PopupsUiAdapterImpl", "checkAndSetUiData", 89, "PopupsUiAdapterImpl.kt")).q("Illegal popup state: Existing popup cannot be replaced with another popup. Dismiss the existing popup first.");
        } else {
            fdufVar.f(fdaeVar.invoke());
        }
    }

    @Override // defpackage.ahax
    public final /* synthetic */ void a(final divg divgVar) {
        b(new fdap() { // from class: ahav
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((ahat) obj).getClass();
                return divgVar;
            }
        });
    }

    @Override // defpackage.ahax
    public final void b(final fdap fdapVar) {
        h(new fdae() { // from class: ahba
            @Override // defpackage.fdae
            public final Object invoke() {
                fdap fdapVar2 = fdapVar;
                final ahbf ahbfVar = this;
                final divg divgVar = (divg) fdapVar2.invoke(ahbfVar.b);
                return divgVar.a(new fdae() { // from class: ahaz
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        ahbfVar.g();
                        divgVar.b().invoke();
                        return fctx.a;
                    }
                });
            }
        });
    }

    @Override // defpackage.ahax
    public final /* synthetic */ void c(final djmy djmyVar, boolean z) {
        d(z, new fdap() { // from class: ahau
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((ahat) obj).getClass();
                return djmyVar;
            }
        });
    }

    @Override // defpackage.ahax
    public final void d(final boolean z, final fdap fdapVar) {
        h(new fdae() { // from class: ahbc
            @Override // defpackage.fdae
            public final Object invoke() {
                fdap fdapVar2 = fdapVar;
                final ahbf ahbfVar = this;
                return ((djmy) fdapVar2.invoke(ahbfVar.b)).a(z, new fdae() { // from class: ahbd
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        ahbfVar.g();
                        return fctx.a;
                    }
                });
            }
        });
    }

    @Override // defpackage.ahax
    public final void e(final fdap fdapVar) {
        h(new fdae() { // from class: ahbb
            @Override // defpackage.fdae
            public final Object invoke() {
                return (dktt) fdapVar.invoke(this.b);
            }
        });
    }

    @Override // defpackage.ahay
    public final fdvc f() {
        return this.d;
    }

    public final void g() {
        this.a.f(null);
    }
}
