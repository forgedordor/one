package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvox {
    public static final ejxr a = cdag.x("use_add_contact_logger");
    private final fcsu b;
    private final fcsu c;

    public cvox(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    public final void a(int i) {
        fcsu fcsuVar = this.c;
        if (!((ajjp) fcsuVar.b()).b()) {
            ((ajjp) fcsuVar.b()).a();
            return;
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_CONTACT_BANNER;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        eljq eljqVar = (eljq) eljr.a.createBuilder();
        elwg elwgVar = (elwg) elwh.a.createBuilder();
        elwgVar.copyOnWrite();
        elwh elwhVar = (elwh) elwgVar.instance;
        elwhVar.c = i - 1;
        elwhVar.b |= 1;
        eljqVar.copyOnWrite();
        eljr eljrVar = (eljr) eljqVar.instance;
        elwh elwhVar2 = (elwh) elwgVar.build();
        elwhVar2.getClass();
        eljrVar.c = elwhVar2;
        eljrVar.b = 2;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        eljr eljrVar2 = (eljr) eljqVar.build();
        eljrVar2.getClass();
        ellhVar2.E = eljrVar2;
        ellhVar2.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        ((aimb) this.b.b()).a().j(ellgVar, aioj.LOG_SPEC_CONVERSATION_SCREEN_EVENTS);
    }
}
