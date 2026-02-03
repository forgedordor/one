package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehci {
    public ehcg a;

    public ehci(ehcg ehcgVar) {
        this.a = ehcgVar;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.concurrent.Future] */
    final void a() {
        Object ehauVar;
        ecem.c();
        ehcg ehcgVar = this.a;
        ehcgVar.getClass();
        ejwl.m(ehcgVar.a().g(), "LocalSubscriptionState detected an atomicity failure. Previous pendingResult was already cleared. If this Exception is ever thrown, it is a major bug, and should be reported to TikTok as a P1 along with the Sponge or Listnr error report. Please file at go/tiktok/bug.");
        try {
            ehauVar = new ehav(eork.q(ehcgVar.a().c()));
        } catch (ExecutionException e) {
            ehauVar = new ehau(e.getCause());
        }
        this.a = new ehat(ehcgVar.b(), ejud.a, ejwi.j(ehauVar), ehcgVar.d());
    }
}
