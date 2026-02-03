package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crye {
    private final fcsu c;
    private static final cczi b = cdag.h(cdag.b, "disable_logging_spam_folder_event_logger", false);
    public static final cczi a = cdag.f(cdag.b, "spam_folder_log_max_conversation_count", 1000);

    public crye(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.c = fcsuVar;
    }

    public final void a(fdap fdapVar) {
        if (((Boolean) b.e()).booleanValue()) {
            return;
        }
        ailn ailnVarA = ((aimb) this.c.b()).a();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.SPAM_FOLDER_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        eoef eoefVar = (eoef) eoeg.a.createBuilder();
        eoefVar.getClass();
        eofh eofhVar = new eofh(eoefVar);
        fdapVar.invoke(eofhVar);
        evsn evsnVarBuild = eofhVar.a.build();
        evsnVarBuild.getClass();
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        ellhVar2.ah = (eoeg) evsnVarBuild;
        ellhVar2.d |= 8;
        ailnVarA.j(ellgVar, aioj.LOG_SPEC_SPAM_EVENTS);
    }
}
