package defpackage;

import android.content.Context;
import android.view.View;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.R;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhv {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/ShortcutsConfigurationProvider");
    public final fdjx a;
    public final cogw b;
    private final Context d;
    private final Map e;
    private final fcsu f;
    private final fcsu g;
    private final xhj h;
    private final ahog i;

    public xhv(fdjx fdjxVar, Context context, Map map, ahog ahogVar, @apnu fcsu fcsuVar, fcsu fcsuVar2, xhj xhjVar, cogw cogwVar) {
        fdjxVar.getClass();
        context.getClass();
        map.getClass();
        ahogVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        cogwVar.getClass();
        this.a = fdjxVar;
        this.d = context;
        this.e = map;
        this.i = ahogVar;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.h = xhjVar;
        this.b = cogwVar;
    }

    public final doxc a(List list) {
        doxa doxaVar;
        list.getClass();
        Integer numValueOf = this.h.b() ? Integer.valueOf(R.drawable.shortcuts_screen_background) : null;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xhh xhhVar = (xhh) it.next();
            xhr xhrVar = (xhr) this.e.get(xhhVar.getClass());
            if (xhrVar == null) {
                doxaVar = null;
            } else {
                final xgw xgwVar = new xgw(new vuw((aisc) this.i.a.a.b.hh.b()), xhrVar, xhhVar);
                if (xgwVar.f()) {
                    ekrw ekrwVarE = c.e();
                    ekrwVarE.X(eksq.a, "BugleComposeRow2");
                    ekrd ekrdVar = (ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/ShortcutsConfigurationProvider", "toHugoShortcutIfHandlerIsEnabled", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "ShortcutsConfigurationProvider.kt");
                    final Context context = this.d;
                    ekrdVar.t("Showing %s shortcut.", context.getString(xgwVar.a()));
                    final fdap fdapVar = new fdap() { // from class: xht
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            xhv xhvVar = this.a;
                            Instant instantF = xhvVar.b.f();
                            auvw.k(xhvVar.a, null, null, new xhu(xgwVar, (View) obj, instantF, null), 3);
                            return fctx.a;
                        }
                    };
                    doxaVar = new doxa(xgwVar.a(), xgwVar.b(), xgwVar.e(), new fdap() { // from class: xhk
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            ekrw ekrwVarE2 = xhm.b.e();
                            ekrwVarE2.X(eksq.a, "BugleComposeRow2");
                            ((ekrd) ekrwVarE2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/ShortcutHandler$Companion", "getShortcutConfiguration$lambda$0", 174, "ShortcutHandler.kt")).t("Clicked on %s shortcut.", context.getString(xgwVar.a()));
                            fdapVar.invoke((View) obj);
                            return fctx.a;
                        }
                    }, 4);
                } else {
                    ekrw ekrwVarE2 = c.e();
                    ekrwVarE2.X(eksq.a, "BugleComposeRow2");
                    ((ekrd) ekrwVarE2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/ShortcutsConfigurationProvider", "toHugoShortcutIfHandlerIsEnabled", 104, "ShortcutsConfigurationProvider.kt")).t("Hiding %s shortcut.", this.d.getString(xgwVar.a()));
                    doxaVar = null;
                }
            }
            if (doxaVar != null) {
                arrayList.add(doxaVar);
            }
        }
        return new doxc(arrayList, numValueOf);
    }

    public final List b() {
        fcww fcwwVar = new fcww((byte[]) null);
        fcwwVar.add(xgz.a);
        fcwwVar.add(xha.a);
        fcwwVar.add(xhg.a);
        fcwwVar.add(xhd.a);
        fcwwVar.add(xgy.a);
        fcwwVar.add(xhc.a);
        fcwwVar.add(xgx.a);
        fcwwVar.add(xhe.a);
        if (((Boolean) this.f.b()).booleanValue()) {
            fcwwVar.add(xhf.a);
        }
        return fcva.a(fcwwVar);
    }
}
