package defpackage;

import com.google.android.apps.messaging.ui.ditto.DittoActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cynt implements eind {
    final /* synthetic */ cyns a;

    public cynt(cyns cynsVar) {
        this.a = cynsVar;
    }

    @Override // defpackage.eind
    public final /* bridge */ /* synthetic */ eine a(einb einbVar) {
        cyns cynsVar = this.a;
        dcdt dcdtVar = ((cqcz) cynsVar.f.b()).b;
        DittoActivity dittoActivity = cynsVar.e;
        int iH = dcdtVar.h(dittoActivity.getApplicationContext(), 12200000);
        if (iH != 0) {
            if (!dcdtVar.c(dittoActivity, iH, 100)) {
            }
            return eine.a;
        }
        ekrw ekrwVarG = cqcz.a.g();
        ekrwVarG.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/util/common/PlayServicesUtil", "showResolutionDialog", 74, "PlayServicesUtil.java")).q("Play services are already available, nothing to resolve.");
        cynsVar.d();
        return eine.a;
    }
}
