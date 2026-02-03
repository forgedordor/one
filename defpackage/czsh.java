package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czsh {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/rcs/setup/carriertos/CarrierTosPopupBottomSheetDialogFragmentPeer");
    public czsk b;
    public final String c;
    public final czse d;
    public final fcsu e;
    public final fcsu f;
    public final egpr g;
    public final ehbb h;
    public final fcsu i;
    public final eigp j;
    public final fcsu k;
    public final egps l = new egps<Boolean, Void>() { // from class: czsh.1
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void b(Object obj) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) throws Resources.NotFoundException {
            czsk czskVar;
            czsk czskVar2;
            Boolean bool = (Boolean) obj;
            cqca.j("Bugle", "CarrierTos: successfully updated consent: %s", bool);
            if (bool.booleanValue()) {
                czsh czshVar = czsh.this;
                czshVar.a();
                ((ckhg) czshVar.f.b()).k(czshVar.c, enxe.CARRIER_TOS_POPUP_BOTTOM_SHEET_DIALOG);
                if (czshVar.d.G() == null || (czskVar2 = czshVar.b) == null) {
                    return;
                }
                czskVar2.d();
                return;
            }
            czsh czshVar2 = czsh.this;
            czshVar2.a();
            ((ajhd) czshVar2.e.b()).r();
            ((ckhg) czshVar2.f.b()).k(czshVar2.c, enxe.CARRIER_TOS_POPUP_BOTTOM_SHEET_DIALOG);
            eg egVarG = czshVar2.d.G();
            if (egVarG == 0 || (czskVar = czshVar2.b) == null) {
                return;
            }
            czskVar.d();
            String string = egVarG.getResources().getString(R.string.fast_track_popup_declined_snack_bar_text_v2);
            if ((egVarG instanceof daih ? ((daih) egVarG).l() : null) == null) {
                int i = ekgb.d;
                ekgb ekgbVar = ekoe.a;
            }
            adci.b(egVarG, string);
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            cqca.g("Bugle", "CarrierTos: failed to update consent: %s due to: %s", (Boolean) obj, th.getMessage());
            czsk czskVar = czsh.this.b;
            if (czskVar != null) {
                czskVar.d();
            }
        }
    };
    private final fcsu m;

    public czsh(String str, czse czseVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, egpr egprVar, ehbb ehbbVar, fcsu fcsuVar4, eigp eigpVar, fcsu fcsuVar5) {
        this.c = str;
        this.d = czseVar;
        this.e = fcsuVar;
        this.m = fcsuVar2;
        this.f = fcsuVar3;
        this.g = egprVar;
        this.h = ehbbVar;
        this.i = fcsuVar4;
        this.j = eigpVar;
        this.k = fcsuVar5;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("CarrierTosPopupBottomSheetDialogFragment does not have a simId");
        }
        czseVar.p(false);
    }

    public final void a() {
        ((cjyi) this.i.b()).f(new dggp(this.c));
    }

    public final eiju b(int i) {
        return ((cjxi) this.m.b()).k(this.c, i);
    }
}
