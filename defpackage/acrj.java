package defpackage;

import android.os.Bundle;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
class acrj implements egzv<Integer> {
    final /* synthetic */ Bundle a;
    final /* synthetic */ acrt b;

    public acrj(acrt acrtVar, Bundle bundle) {
        this.a = bundle;
        this.b = acrtVar;
    }

    @Override // defpackage.egzv
    public final void a(Throwable th) {
        ekrw ekrwVarJ = acrt.a.j();
        ekrwVarJ.X(eksq.a, "HomeFragmentFlogger");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/home/HomeFragmentPeer$2", "onError", (char) 1290, "HomeFragmentPeer.java")).q("Error in popup callback");
    }

    @Override // defpackage.egzv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Integer num = (Integer) obj;
        ekrw ekrwVarE = acrt.a.e();
        ekrwVarE.X(eksq.a, "HomeFragmentFlogger");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/home/HomeFragmentPeer$2", "onNewData", 1278, "HomeFragmentPeer.java")).t("Popup callback new data: %d", num);
        if (num.intValue() != -1) {
            acrt acrtVar = this.b;
            acom acomVar = acrtVar.b;
            eg egVarFg = acomVar.fg();
            ViewGroup viewGroupE = acrt.e(acomVar);
            int iIntValue = num.intValue();
            boolean z = this.a != null;
            if (((Boolean) agzy.a.e()).booleanValue()) {
                return;
            }
            agzy agzyVar = acrtVar.aw;
            agzt[] agztVarArr = agzyVar.h;
            int length = agztVarArr.length;
            if (iIntValue >= length) {
                agzy.b.r(a.s(length, iIntValue, "Index out of length: ", " size: "));
                return;
            }
            agzt agztVar = agztVarArr[iIntValue];
            if (!agzyVar.d()) {
                if (agztVar.e(egVarFg, viewGroupE, z)) {
                    agzy.b.m(a.g(iIntValue, "showing popup: "));
                    agzyVar.k = agztVar;
                    ((crqv) agzyVar.d.b()).k("conversation_list_last_popup_show_timestamp_ms", agzyVar.e.f().toEpochMilli());
                    return;
                }
                return;
            }
            agzy.b.m("Don't show popup as it's showing: " + agzyVar.j);
            ahac ahacVar = (ahac) agzyVar.g.b();
            int iF = agztVar.f();
            agzyVar.k.getClass();
            fcsu fcsuVar = ahacVar.a;
            ((ains) fcsuVar.b()).e("Bugle.HomeScreen.PopupHost.Show.Suppressed", iF - 1);
            ((ains) fcsuVar.b()).e("Bugle.HomeScreen.PopupHost.Show.Suppressor", r0.f() - 1);
        }
    }

    @Override // defpackage.egzv
    public final void hn() {
    }
}
