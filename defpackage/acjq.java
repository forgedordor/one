package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class acjq {
    private final eksp a = eksp.c("Bugle");

    public abstract acjr a();

    public abstract void b(acms acmsVar);

    public abstract void c(int i);

    public abstract void d(int i);

    public final acjr e() {
        acjr acjrVarA = a();
        acjl acjlVar = (acjl) acjrVarA;
        int i = acjlVar.a;
        if (i > 0 && acjlVar.b > 0) {
            return acjrVarA;
        }
        acjk acjkVar = new acjk();
        acjkVar.b(acjlVar.c);
        int i2 = acjlVar.b;
        acjkVar.d(i2);
        acjkVar.c(i);
        if (i2 <= 0) {
            int iIntValue = ((Integer) acjr.e.e()).intValue();
            acjkVar.d(iIntValue);
            ((eksl) ((eksl) this.a.j()).h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/dataservices/ProblematicConversationDataRequest$Builder", "build", 73, "ProblematicConversationDataRequest.java")).r("maxMessageCount is non-positive, default value [%d] is used instead", iIntValue);
        }
        if (i <= 0) {
            int iIntValue2 = ((Integer) acjr.d.e()).intValue();
            acjkVar.c(iIntValue2);
            ((eksl) ((eksl) this.a.j()).h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/dataservices/ProblematicConversationDataRequest$Builder", "build", 79, "ProblematicConversationDataRequest.java")).r("maxConversationCount is non-positive, default value [%d] is used instead", iIntValue2);
        }
        return acjkVar.e();
    }
}
