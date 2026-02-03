package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akdm implements efoj {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/conversation/customtheme/transport/IncomingCustomThemesHandler");
    public final ajln a;
    public final anty b;
    private final fdjx d;

    public akdm(ajln ajlnVar, anty antyVar, fdjx fdjxVar) {
        ajlnVar.getClass();
        antyVar.getClass();
        fdjxVar.getClass();
        this.a = ajlnVar;
        this.b = antyVar;
        this.d = fdjxVar;
    }

    @Override // defpackage.efoj
    public final /* bridge */ /* synthetic */ void a(evuh evuhVar, efoi efoiVar) {
        cidt cidtVar = (cidt) evuhVar;
        ekrd ekrdVar = (ekrd) c.h();
        ekrdVar.X(new ekrz("custom_theme_id", Integer.class, false, false), Integer.valueOf(cidtVar.c));
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/customtheme/transport/IncomingCustomThemesHandler", "onMessageReceived", 31, "IncomingCustomThemesHandler.kt")).q("Received custom theme message.");
        if (efoiVar.a == null) {
            return;
        }
        auvw.k(this.d, null, null, new akdk(this, efoiVar, new akdl(cidtVar, efoiVar), null), 3);
    }
}
