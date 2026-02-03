package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aafo implements aafi {
    static final /* synthetic */ fdeh[] a;
    public final ConversationId b;
    public final Optional c;
    public final aafh d;
    public final ajfx e;
    public final fduf f;
    public final fduf g;
    public final AtomicInteger h;
    private final fdjx i;
    private final fcsu j;
    private final fdcz k;
    private final fdpl l;

    static {
        fdbv fdbvVar = new fdbv(aafo.class, "timerState", "getTimerState()Lcom/google/android/apps/messaging/conversation2/search/ConversationSearchResultsImpl$TimerState;", 0);
        int i = fdcj.a;
        a = new fdeh[]{fdbvVar};
    }

    public aafo(fdjx fdjxVar, ConversationId conversationId, fcsu fcsuVar, Optional optional, aafh aafhVar, ajfx ajfxVar) {
        fdjxVar.getClass();
        conversationId.getClass();
        fcsuVar.getClass();
        ajfxVar.getClass();
        this.i = fdjxVar;
        this.b = conversationId;
        this.j = fcsuVar;
        this.c = optional;
        this.d = aafhVar;
        this.e = ajfxVar;
        fduf fdufVarA = fdvf.a(null);
        this.f = fdufVarA;
        fduf fdufVarA2 = fdvf.a(-1);
        this.g = fdufVarA2;
        this.h = new AtomicInteger();
        this.k = new aafl(aafj.b, this);
        auyh auyhVar = new auyh("ConversationSearchResults::SearchResults", fdufVarA);
        auyh auyhVar2 = new auyh("ConversationSearchResults::CurrentResult", fdufVarA2);
        long j = fdhi.a;
        Object objB = fcsuVar.b();
        objB.getClass();
        this.l = avac.c(auyhVar, auyhVar2, fdjxVar, fdhk.g(((Number) objB).longValue(), fdhl.c), new aafk(null));
    }

    @Override // defpackage.aafi
    public final fdpl a() {
        return this.l;
    }

    @Override // defpackage.aafi
    public final /* synthetic */ fdpl b() {
        return this.f;
    }

    @Override // defpackage.aafi
    public final void c() {
        aafp aafpVar = (aafp) this.f.c();
        if (aafpVar != null) {
            fduf fdufVar = this.g;
            fdufVar.f(Integer.valueOf(((Number) fdufVar.c()).intValue() == 0 ? fcva.e(aafpVar.b) : ((Number) fdufVar.c()).intValue() - 1));
        }
    }

    @Override // defpackage.aafi
    public final void d() {
        aafp aafpVar = (aafp) this.f.c();
        if (aafpVar != null) {
            fduf fdufVar = this.g;
            fdufVar.f(Integer.valueOf(((Number) fdufVar.c()).intValue() == fcva.e(aafpVar.b) ? 0 : ((Number) fdufVar.c()).intValue() + 1));
        }
    }

    @Override // defpackage.aafi
    public final void e() {
        auvw.k(this.i, null, null, new aafn(this, null), 3);
    }

    public final void f(aafj aafjVar) {
        this.k.d(a[0], aafjVar);
    }

    public final void g(String str, ekgb ekgbVar) {
        this.f.f(new aafp(str, ekgbVar));
        this.g.f(Integer.valueOf(true != ekgbVar.isEmpty() ? 0 : -1));
    }
}
