package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xph implements xoz {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/satellite/SatelliteStickyToolstoneAdapterImpl");
    public final Context b;
    public final fdjx c;
    public final clhx d;
    public final fcsu e;
    public final asad f;
    public final AtomicBoolean g;
    public final fdvc h;
    public final fctc i;
    private final fdjx j;
    private final ConversationId k;
    private final fduj l;
    private final fdpl m;

    public xph(Context context, fdjx fdjxVar, fdjx fdjxVar2, fdpl fdplVar, ConversationId conversationId, clhx clhxVar, fduj fdujVar, fcsu fcsuVar, asad asadVar) {
        context.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        fdplVar.getClass();
        conversationId.getClass();
        clhxVar.getClass();
        fcsuVar.getClass();
        this.b = context;
        this.c = fdjxVar;
        this.j = fdjxVar2;
        this.k = conversationId;
        this.d = clhxVar;
        this.l = fdujVar;
        this.e = fcsuVar;
        this.f = asadVar;
        fduf fdufVarA = fdvf.a(Boolean.valueOf(conversationId instanceof PenpalBotConversationId));
        this.m = fdufVarA;
        this.g = new AtomicBoolean(false);
        this.h = fdtg.b(fdud.a(fdqq.a(fdplVar), fdujVar, fdufVarA, new xpc(this, null)), fdjxVar2, fdur.a(0L, 3), null);
        this.i = fctd.a(new fdae() { // from class: xpa
            @Override // defpackage.fdae
            public final Object invoke() {
                int iO;
                final xph xphVar = this.a;
                Context context2 = xphVar.b;
                String string = context2.getString(R.string.satellite_toolstone_connect);
                string.getClass();
                String string2 = context2.getString(R.string.satellite_toolstone_connect_link);
                string2.getClass();
                int i = 0;
                if (((asam) xphVar.e.b()).a() && (iO = fdgn.O(string, string2, 0, false, 6)) != -1) {
                    i = iO;
                }
                return new dlls("SatelliteManualConnectToolstone", string, djrr.p, fcva.b(new diin(dijs.h, i, string2.length(), string, new fdap() { // from class: xpb
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        xph xphVar2 = xphVar;
                        if (!((eoth) ((aryw) xphVar2.f).a.b()).a("bugle.debounce_satellite_entry_point_click")) {
                            ekrw ekrwVarH = xph.a.h();
                            ekrwVarH.X(eksq.a, "BugleSatellite");
                            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/satellite/SatelliteStickyToolstoneAdapterImpl", "handleClick", 148, "SatelliteStickyToolstoneAdapterImpl.kt")).q("Handling click on satellite entry point in conversation.");
                            auvw.m(xphVar2.c, null, new xpg(xphVar2, null), 3);
                        } else if (xphVar2.g.getAndSet(true)) {
                            ekrw ekrwVarH2 = xph.a.h();
                            ekrwVarH2.X(eksq.a, "BugleSatellite");
                            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/satellite/SatelliteStickyToolstoneAdapterImpl", "handleClick", 125, "SatelliteStickyToolstoneAdapterImpl.kt")).q("Ignoring satellite entry point click: awaiting for satellite manager to complete previous invocation.");
                        } else {
                            ekrw ekrwVarH3 = xph.a.h();
                            ekrwVarH3.X(eksq.a, "BugleSatellite");
                            ((ekrd) ekrwVarH3.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/satellite/SatelliteStickyToolstoneAdapterImpl", "handleClick", 131, "SatelliteStickyToolstoneAdapterImpl.kt")).q("Handling click on satellite entry point in conversation.");
                            auvw.m(xphVar2.c, null, new xpe(xphVar2, null), 3);
                        }
                        return true;
                    }
                })), null, 16);
            }
        });
    }
}
