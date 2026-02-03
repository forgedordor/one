package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acrx implements eind {
    final /* synthetic */ acrt a;

    public acrx(acrt acrtVar) {
        this.a = acrtVar;
    }

    @Override // defpackage.eind
    public final /* bridge */ /* synthetic */ eine a(einb einbVar) {
        cwvh cwvhVar = (cwvh) einbVar;
        boolean zB = cwvhVar.b();
        acrt acrtVar = this.a;
        if (zB) {
            ajln ajlnVar = (ajln) acrtVar.ak.b();
            ekgb ekgbVarR = ekgb.r(new BugleConversationId(cwvhVar.a()));
            cwvhVar.c();
            auvh.h(ajlnVar.I(ekgbVarR, 3));
        } else {
            ajln ajlnVar2 = (ajln) acrtVar.ak.b();
            ekgb ekgbVarR2 = ekgb.r(new BugleConversationId(cwvhVar.a()));
            cwvhVar.c();
            auvh.h(ajlnVar2.J(ekgbVarR2, 3));
        }
        eygg eyggVar = acrtVar.q;
        ((acwj) eyggVar.b()).q(((acwj) eyggVar.b()).G(cwvhVar.a().a()));
        return eine.a;
    }
}
