package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xrp implements xre {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/customthemes/CustomThemesSelectionUiAdapterImpl");
    public final ConversationId b;
    public final fdjx c;
    public final fdjx d;
    public final cogw e;
    public final ajln f;
    public final aqko g;
    private final fdpl h;
    private final fctc i;

    public xrp(ConversationId conversationId, fdjx fdjxVar, fdjx fdjxVar2, cogw cogwVar, ajln ajlnVar, fdpl fdplVar, final fcsu fcsuVar, aqko aqkoVar) {
        conversationId.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        cogwVar.getClass();
        ajlnVar.getClass();
        fdplVar.getClass();
        this.b = conversationId;
        this.c = fdjxVar;
        this.d = fdjxVar2;
        this.e = cogwVar;
        this.f = ajlnVar;
        this.h = fdplVar;
        this.g = aqkoVar;
        this.i = fctd.a(new fdae() { // from class: xrf
            @Override // defpackage.fdae
            public final Object invoke() {
                return (xsc) fcsuVar.b();
            }
        });
    }

    @Override // defpackage.xre
    public final xsn a(final ahat ahatVar) {
        ahatVar.getClass();
        return new xsn(this.g.a() ? new xrl(this.h) : b().f, new xsk(new fdap() { // from class: xrg
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                xsi xsiVar = (xsi) obj;
                ((ekrd) xrp.a.h().h("com/google/android/apps/messaging/conversation2/customthemes/CustomThemesSelectionUiAdapterImpl", "createUiData$lambda$2", 67, "CustomThemesSelectionUiAdapterImpl.kt")).t("Selected theme: %s", xsiVar);
                xrp xrpVar = this.a;
                if (xrpVar.g.a()) {
                    auvw.k(xrpVar.c, null, null, new xrm(xrpVar, xsiVar, null), 3);
                } else {
                    auvw.k(xrpVar.d, null, null, new xrn(xrpVar, xsiVar, null), 3);
                }
                ahatVar.a();
                return fctx.a;
            }
        }, new fdae() { // from class: xrh
            @Override // defpackage.fdae
            public final Object invoke() {
                ahatVar.a();
                return fctx.a;
            }
        }), new fdae() { // from class: xri
            @Override // defpackage.fdae
            public final Object invoke() {
                ahatVar.a();
                return fctx.a;
            }
        }, 10);
    }

    public final xsc b() {
        return (xsc) this.i.a();
    }
}
