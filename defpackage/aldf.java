package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aldf implements anpj {
    public final Context a;
    public final bbmo b;
    public final cmxz c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final BugleConversationId g;
    public final anpj h;
    public final anpj i;
    public final anpj j;
    public final cmyk k;
    public cquc l;
    public final cqtq m;
    private final fdjx n;
    private final cqtp o;

    public aldf(Context context, fdjx fdjxVar, cqtp cqtpVar, bbmo bbmoVar, cmxz cmxzVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, BugleConversationId bugleConversationId, anpj anpjVar, anpj anpjVar2, anpj anpjVar3, cmyk cmykVar) {
        this.a = context;
        this.n = fdjxVar;
        this.o = cqtpVar;
        this.b = bbmoVar;
        this.c = cmxzVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = bugleConversationId;
        this.h = anpjVar;
        this.i = anpjVar2;
        this.j = anpjVar3;
        this.k = cmykVar;
        this.m = cqtpVar.a(new aldc(this));
    }

    public static final ekgb e() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.m.a(new cqtk() { // from class: alcp
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "SmartSuggestionObservableSupplierV2::register", "SmartSuggestionObservableSupplierV2::callback", "SmartSuggestionObservableSupplierV2::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.n, fcyi.a, fdjz.a, new alcy(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        return e();
    }

    public final eiju d() {
        return auvw.c(this.n, fcyi.a, fdjz.a, new alde(this, null));
    }
}
