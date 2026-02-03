package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aalx implements aalu {
    private static final eksp a = eksp.c("Forking");
    private final aalw b;
    private final aano c;
    private final fcsu d;

    public aalx(aalw aalwVar, aano aanoVar, fcsu fcsuVar) {
        this.b = aalwVar;
        this.c = aanoVar;
        this.d = fcsuVar;
    }

    @Override // defpackage.aalu
    public final synchronized void a() {
        aalw aalwVar = this.b;
        if (aalwVar.b()) {
            aalwVar.a();
            ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/custodian/inspectors/forking/Forking", "startAnalysis", 41, "Forking.java")).q("Starting analysis.");
            aano aanoVar = this.c;
            aanoVar.b.M(aanoVar);
            aanu aanuVar = (aanu) this.d.b();
            ((eksl) aanu.a.n().h("com/google/android/apps/messaging/custodian/inspectors/forking/conversationstable/NewConversationCreatedChangeListener", "startListening", 75, "NewConversationCreatedChangeListener.java")).q("Starting New Conversation created change listener.");
            if (((Boolean) ((cczi) aanu.b.get()).e()).booleanValue() || ((Boolean) ((cczi) aanu.c.get()).e()).booleanValue()) {
                aanuVar.g.M(aanuVar);
            }
        }
    }
}
