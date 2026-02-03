package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aleq implements anpj {
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
    private final alba l;
    private final alaf m;
    private final aldh n;

    public aleq(fdjx fdjxVar, fdjx fdjxVar2, cqtp cqtpVar, aldh aldhVar, alba albaVar, alaf alafVar, anpj anpjVar, anpj anpjVar2, anpj anpjVar3, BugleConversationId bugleConversationId) {
        this.j = fdjxVar;
        this.a = fdjxVar2;
        this.k = cqtpVar;
        this.n = aldhVar;
        this.l = albaVar;
        this.m = alafVar;
        this.b = anpjVar;
        this.d = cqtpVar.a(new alen(this));
        this.g = aldhVar.a(bugleConversationId, anpjVar2, anpjVar3, anpjVar, null);
        fdjx fdjxVar3 = (fdjx) albaVar.a.b();
        fdjxVar3.getClass();
        fdjx fdjxVar4 = (fdjx) albaVar.b.b();
        fdjxVar4.getClass();
        cqtp cqtpVar2 = (cqtp) albaVar.c.b();
        cqtpVar2.getClass();
        bbmo bbmoVar = (bbmo) albaVar.d.b();
        bbmoVar.getClass();
        this.h = new alaz(fdjxVar3, fdjxVar4, cqtpVar2, bbmoVar, bugleConversationId);
        fdjx fdjxVar5 = (fdjx) alafVar.a.b();
        fdjxVar5.getClass();
        fdjx fdjxVar6 = (fdjx) alafVar.b.b();
        fdjxVar6.getClass();
        cqtp cqtpVar3 = (cqtp) alafVar.c.b();
        cqtpVar3.getClass();
        bbmo bbmoVar2 = (bbmo) alafVar.d.b();
        bbmoVar2.getClass();
        this.i = new alae(fdjxVar5, fdjxVar6, cqtpVar3, bbmoVar2, bugleConversationId);
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.d.a(new cqtk() { // from class: alee
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "SuggestionObservableSupplierV2::register", "SuggestionObservableSupplierV2::callback", "SuggestionObservableSupplierV2::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.a, fcyi.a, fdjz.a, new alei(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final eiju d() {
        return auvw.c(this.j, fcyi.a, fdjz.a, new alep(this, null));
    }
}
