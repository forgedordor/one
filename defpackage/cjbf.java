package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjbf {
    public static final ejxr a = cdag.v("enable_xsl_smapi_send_message_method");
    public static final ejxr b = cdag.v("enable_xsl_smapi_send_service_chat");
    public static final ejxr c = cdag.v("enable_xsl_smapi_update_sent_intent");
    public static final ejxr d = cdag.v("enable_xsl_smapi_process_intent_chat");
    public static final ejxr e = cdag.v("enable_xsl_smapi_get_incoming_messages");
    public static final ejxr f = cdag.v("enable_xsl_smapi_update_incoming_intent");
    private final fcsu g;
    private final cogw h;
    private final atau i;

    public cjbf(fcsu fcsuVar, cogw cogwVar, atau atauVar) {
        this.g = fcsuVar;
        this.h = cogwVar;
        this.i = atauVar;
    }

    private final void d(febx febxVar) {
        aill aillVar = (aill) this.g.b();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.XSL_REQUEST_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        fecc feccVar = (fecc) febxVar.build();
        feccVar.getClass();
        ellhVar2.aS = feccVar;
        ellhVar2.e |= 16777216;
        aillVar.j(ellgVar);
    }

    @Deprecated
    public final void a(auib auibVar, basd basdVar) {
        c(auibVar, basdVar, 9, 16);
    }

    public final void b(basd basdVar, int i, int i2) {
        febx febxVar = (febx) fecc.a.createBuilder();
        if (basd.l(basdVar)) {
            febv febvVar = (febv) febw.a.createBuilder();
            febvVar.a(basdVar.f());
            febxVar.copyOnWrite();
            fecc feccVar = (fecc) febxVar.instance;
            febw febwVar = (febw) febvVar.build();
            febwVar.getClass();
            feccVar.d = febwVar;
            feccVar.b |= 2;
        }
        febxVar.copyOnWrite();
        ((fecc) febxVar.instance).f = fhba.a(23);
        febxVar.copyOnWrite();
        ((fecc) febxVar.instance).e = fecb.a(i);
        febxVar.copyOnWrite();
        ((fecc) febxVar.instance).g = feca.a(i2);
        evvp evvpVarC = evxc.c(this.h.f().toEpochMilli());
        febxVar.copyOnWrite();
        fecc feccVar2 = (fecc) febxVar.instance;
        evvpVarC.getClass();
        feccVar2.h = evvpVarC;
        feccVar2.b |= 4;
        d(febxVar);
    }

    public final void c(auib auibVar, basd basdVar, int i, int i2) {
        febx febxVar = (febx) fecc.a.createBuilder();
        if (!auibVar.equals(auib.a)) {
            fhaz fhazVar = (fhaz) this.i.fH().fM(auibVar);
            if (!cqdz.a(fhazVar)) {
                return;
            }
            febxVar.copyOnWrite();
            fecc feccVar = (fecc) febxVar.instance;
            fhazVar.getClass();
            feccVar.c = fhazVar;
            feccVar.b |= 1;
        }
        if (basd.l(basdVar)) {
            febv febvVar = (febv) febw.a.createBuilder();
            febvVar.a(basdVar.f());
            febxVar.copyOnWrite();
            fecc feccVar2 = (fecc) febxVar.instance;
            febw febwVar = (febw) febvVar.build();
            febwVar.getClass();
            feccVar2.d = febwVar;
            feccVar2.b |= 2;
        }
        febxVar.copyOnWrite();
        ((fecc) febxVar.instance).f = fhba.a(23);
        febxVar.copyOnWrite();
        ((fecc) febxVar.instance).e = fecb.a(i);
        febxVar.copyOnWrite();
        ((fecc) febxVar.instance).g = feca.a(i2);
        evvp evvpVarC = evxc.c(this.h.f().toEpochMilli());
        febxVar.copyOnWrite();
        fecc feccVar3 = (fecc) febxVar.instance;
        evvpVarC.getClass();
        feccVar3.h = evvpVarC;
        feccVar3.b |= 4;
        d(febxVar);
    }
}
