package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alec implements anpj {
    public final fdjx a;
    public final anpj b;
    public cquc c;
    public final cqtq d;
    public final Object e = new Object();
    public final AtomicBoolean f = new AtomicBoolean(true);
    public final anpj g;
    public final anpj h;
    public final anpj i;
    private final fdjx j;
    private final cqtp k;
    private final alaq l;
    private final akzu m;
    private final alcn n;

    public alec(fdjx fdjxVar, fdjx fdjxVar2, cqtp cqtpVar, alcn alcnVar, alaq alaqVar, akzu akzuVar, anpj anpjVar, anpj anpjVar2, anpj anpjVar3, BugleConversationId bugleConversationId) {
        this.j = fdjxVar;
        this.a = fdjxVar2;
        this.k = cqtpVar;
        this.n = alcnVar;
        this.l = alaqVar;
        this.m = akzuVar;
        this.b = anpjVar;
        this.d = cqtpVar.a(new aldz(this));
        this.g = alcnVar.a(null, bugleConversationId, anpjVar2, anpjVar3, anpjVar);
        fdjx fdjxVar3 = (fdjx) alaqVar.a.b();
        fdjxVar3.getClass();
        fdjx fdjxVar4 = (fdjx) alaqVar.b.b();
        fdjxVar4.getClass();
        cqtp cqtpVar2 = (cqtp) alaqVar.c.b();
        cqtpVar2.getClass();
        bbmo bbmoVar = (bbmo) alaqVar.d.b();
        bbmoVar.getClass();
        this.h = new alap(fdjxVar3, fdjxVar4, cqtpVar2, bbmoVar, bugleConversationId);
        fdjx fdjxVar5 = (fdjx) akzuVar.a.b();
        fdjxVar5.getClass();
        fdjx fdjxVar6 = (fdjx) akzuVar.b.b();
        fdjxVar6.getClass();
        cqtp cqtpVar3 = (cqtp) akzuVar.c.b();
        cqtpVar3.getClass();
        bbmo bbmoVar2 = (bbmo) akzuVar.d.b();
        bbmoVar2.getClass();
        this.i = new akzt(fdjxVar5, fdjxVar6, cqtpVar3, bbmoVar2, bugleConversationId);
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.d.a(new cqtk() { // from class: aldq
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "SuggestionObservableSupplier::register", "SuggestionObservableSupplier::callback", "SuggestionObservableSupplier::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.a, fcyi.a, fdjz.a, new aldu(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final eiju d() {
        return auvw.c(this.j, fcyi.a, fdjz.a, new aleb(this, null));
    }
}
