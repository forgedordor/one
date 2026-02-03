package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wwc implements fdap {
    final /* synthetic */ vvw a;
    final /* synthetic */ vvw b;

    public wwc(vvw vvwVar, vvw vvwVar2) {
        this.a = vvwVar;
        this.b = vvwVar2;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        vvw vvwVar = (vvw) obj;
        vvwVar.getClass();
        vvw vvwVar2 = this.a;
        if (!fdbq.f(vvwVar2, vvwVar)) {
            ekrw ekrwVarJ = wwd.a.j();
            ekrwVarJ.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/replacer/DraftReplacerImpl$replaceDraft$2$1", "invoke", 65, "DraftReplacerImpl.kt")).D("Replacer encountered different existing drafts between emptiness check and update: %s, %s", vvwVar2, vvwVar);
        }
        return this.b;
    }
}
