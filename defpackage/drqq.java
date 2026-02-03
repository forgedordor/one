package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drqq implements eora {
    final /* synthetic */ drsd a;
    final /* synthetic */ int b;
    final /* synthetic */ drqt c;

    public drqq(drqt drqtVar, drsd drsdVar, int i) {
        this.a = drsdVar;
        this.b = i;
        this.c = drqtVar;
    }

    @Override // defpackage.eora
    public final /* synthetic */ void b(Object obj) {
        ekgb ekgbVarR = (ekgb) obj;
        ((ekrd) ((ekrd) drqt.a.h()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController$6", "onSuccess", 980, "EmojiPickerController.java")).r("Emoji picker pageable data loaded %d items.", ekgbVarR.size());
        drqt drqtVar = this.c;
        drpv drpvVarF = drqtVar.f();
        drqtVar.r++;
        drsd drsdVar = this.a;
        if (drsdVar.f()) {
            ekfw ekfwVar = new ekfw();
            ekfwVar.j(ekgbVarR);
            ekfwVar.h(drsw.a);
            ekgbVarR = ekfwVar.g();
        } else if (ekgbVarR.isEmpty()) {
            String strD = drsdVar.d();
            strD.getClass();
            ekgbVarR = ekgb.r(new drsv(strD));
        }
        drsa.a(drqtVar.l, ekgbVarR, drqtVar.q, drqtVar.t, drqtVar.f, drqtVar.e);
        boolean z = drpvVarF.e;
        drqtVar.m.set(false);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ((ekrd) ((ekrd) ((ekrd) drqt.a.j()).g(th)).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController$6", "onFailure", 990, "EmojiPickerController.java")).r("Emoji picker pageable data loading page %d failed.", this.b);
        drqt drqtVar = this.c;
        drpv drpvVarF = drqtVar.f();
        int i = drrq.c;
        drqtVar.f().F(drqtVar.q);
        this.a.h();
        boolean z = drpvVarF.e;
        drqtVar.m.set(false);
    }
}
