package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wvu implements wvk {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/mentions/MentionSuggestionsUiAdapterImpl");
    public final fdjx b;
    public final dnih c;
    public final cphz d;
    public final fdpl e;
    public final ains f;
    public final fctc g;
    public fdvc h;
    private final wvj i;

    public wvu(fdjx fdjxVar, wvj wvjVar, dnih dnihVar, cphz cphzVar, fdpl fdplVar, ains ainsVar) {
        fdjxVar.getClass();
        wvjVar.getClass();
        dnihVar.getClass();
        fdplVar.getClass();
        ainsVar.getClass();
        this.b = fdjxVar;
        this.i = wvjVar;
        this.c = dnihVar;
        this.d = cphzVar;
        this.e = fdplVar;
        this.f = ainsVar;
        this.g = fctd.a(new fdae() { // from class: wvl
            @Override // defpackage.fdae
            public final Object invoke() {
                wvu wvuVar = this.a;
                return fdtg.a(new wvt(wvuVar.e), wvuVar.b, fdur.a(0L, 3), 1);
            }
        });
    }

    @Override // defpackage.wvk
    public final fdvc a() {
        dnih dnihVar = this.c;
        fdvc fdvcVarA = this.i.a(dnihVar.b(true), dnihVar.a());
        this.h = fdvcVarA;
        wvn wvnVar = new wvn(null, this);
        int i = fdsn.a;
        return fdtg.b(new fdwg(wvnVar, fdvcVarA), this.b, fdur.a(0L, 3), null);
    }
}
