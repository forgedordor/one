package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alcm implements anpj {
    public final bbmo a;
    public final cmxz b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final cmyk f;
    public final BugleConversationId g;
    public final anpj h;
    public final anpj i;
    public final anpj j;
    public cquc k;
    public final cqtq l;
    private final fdjx m;
    private final cqtp n;

    public alcm(fdjx fdjxVar, cqtp cqtpVar, bbmo bbmoVar, cmxz cmxzVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cmyk cmykVar, BugleConversationId bugleConversationId, anpj anpjVar, anpj anpjVar2, anpj anpjVar3) {
        this.m = fdjxVar;
        this.n = cqtpVar;
        this.a = bbmoVar;
        this.b = cmxzVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = cmykVar;
        this.g = bugleConversationId;
        this.h = anpjVar;
        this.i = anpjVar2;
        this.j = anpjVar3;
        this.l = cqtpVar.a(new alcj(this));
    }

    public static final ekgb e() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.l.a(new cqtk() { // from class: albw
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "SmartSuggestionObservableSupplier::register", "SmartSuggestionObservableSupplier::callback", "SmartSuggestionObservableSupplier::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.m, fcyi.a, fdjz.a, new alcf(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        return e();
    }

    public final eiju d() {
        return auvw.c(this.m, fcyi.a, fdjz.a, new alcl(this, null));
    }
}
