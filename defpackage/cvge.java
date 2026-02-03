package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvge implements fdap {
    final /* synthetic */ cvgs a;
    final /* synthetic */ ckci b;

    public cvge(cvgs cvgsVar, ckci ckciVar) {
        this.a = cvgsVar;
        this.b = ckciVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool.booleanValue();
        ckci ckciVar = this.b;
        boolean z = false;
        if (ckciVar.h && ckciVar.g) {
            z = true;
        }
        dggn dggnVar = ckciVar.b;
        cvgs cvgsVar = this.a;
        ((ekrd) cvgs.a.e().h("com/google/android/apps/messaging/ui/appsettings/rcssettings/RcsStatusUiAdapter", "onRcsSimCheckboxChanged", 178, "RcsStatusUiAdapter.kt")).I("onRcsSimCheckboxChanged: %s, rcsEnabled: %s, shouldShowGoogleTosDialog: %s", cvgb.a(dggnVar), bool, Boolean.valueOf(z));
        if (!zBooleanValue) {
            auvw.m(cvgsVar.d, null, new cvgd(cvgsVar, dggnVar, ckciVar.e, null), 3);
        } else if (z) {
            auvw.m(cvgsVar.d, null, new cvgc(cvgsVar, null), 3);
        } else {
            auvw.m(cvgsVar.c, null, new cvgr(dggnVar, cvgsVar, null), 3);
        }
        return fctx.a;
    }
}
