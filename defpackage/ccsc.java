package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccsc implements cmpi {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/outgoing/MlsRcsChatMessageSender");
    public final cmsm b;
    public final cmss c;
    private final fdjx d;
    private final ccap e;
    private final ccpm f;
    private final cmnp g;
    private final ccrt h;
    private final ccer i;
    private final cmpi j;

    public ccsc(fdjx fdjxVar, cbqj cbqjVar, ccap ccapVar, ccpm ccpmVar, cmnp cmnpVar, ccrt ccrtVar, cmsm cmsmVar, cmss cmssVar, ccer ccerVar, cmpi cmpiVar) {
        fdjxVar.getClass();
        cbqjVar.getClass();
        ccapVar.getClass();
        ccpmVar.getClass();
        cmnpVar.getClass();
        ccerVar.getClass();
        this.d = fdjxVar;
        this.e = ccapVar;
        this.f = ccpmVar;
        this.g = cmnpVar;
        this.h = ccrtVar;
        this.b = cmsmVar;
        this.c = cmssVar;
        this.i = ccerVar;
        this.j = cmpiVar;
    }

    @Override // defpackage.cmpi
    public final eiju a(MessageCoreData messageCoreData, asrg asrgVar, Optional optional) {
        messageCoreData.getClass();
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleE2eeMls");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/e2ee/mls/outgoing/MlsRcsChatMessageSender", "sendChatMessage", 58, "MlsRcsChatMessageSender.kt")).t("SendChatMessage %s", messageCoreData.F());
        return messageCoreData.cY() ? this.j.a(messageCoreData, asrgVar, optional) : auvw.c(this.d, fcyi.a, fdjz.a, new ccsb(this, messageCoreData, asrgVar, null));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:0|2|(2:4|(1:6)(1:7))(0)|8|(1:90)|(3:(2:85|(1:(7:13|14|15|49|50|51|52)(2:16|17))(6:18|19|20|83|45|(1:47)(2:57|(2:59|60)(2:61|(2:63|64)(2:65|66)))))(4:23|88|24|25)|79|80)(5:28|91|29|(1:32)|67)|95|33|34|86|35|36|93|37|(1:39)|40|41|81|42|(4:44|83|45|(0)(0))|67|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(22:0|2|(2:4|(1:6)(1:7))(0)|8|90|(3:(2:85|(1:(7:13|14|15|49|50|51|52)(2:16|17))(6:18|19|20|83|45|(1:47)(2:57|(2:59|60)(2:61|(2:63|64)(2:65|66)))))(4:23|88|24|25)|79|80)(5:28|91|29|(1:32)|67)|95|33|34|86|35|36|93|37|(1:39)|40|41|81|42|(4:44|83|45|(0)(0))|67|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0125, code lost:
    
        if (r0 != r4) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x019e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x019f, code lost:
    
        r7 = r19;
        r2 = r2;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01a2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a3, code lost:
    
        r21 = r2;
        r3 = "com/google/android/apps/messaging/shared/e2ee/mls/outgoing/MlsRcsChatMessageSender";
        r2 = "BugleE2eeMls";
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01aa, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01ab, code lost:
    
        r21 = r2;
        r2 = "BugleE2eeMls";
        r3 = "com/google/android/apps/messaging/shared/e2ee/mls/outgoing/MlsRcsChatMessageSender";
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b2, code lost:
    
        r21 = r2;
        r3 = "com/google/android/apps/messaging/shared/e2ee/mls/outgoing/MlsRcsChatMessageSender";
        r2 = "BugleE2eeMls";
        r7 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010c A[Catch: Exception -> 0x014d, TryCatch #1 {Exception -> 0x014d, blocks: (B:49:0x0127, B:45:0x0106, B:47:0x010c), top: B:83:0x0106 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0152 A[Catch: Exception -> 0x014a, TryCatch #5 {Exception -> 0x014a, blocks: (B:51:0x0138, B:57:0x0152, B:59:0x0159, B:61:0x0163, B:63:0x0167, B:65:0x0197, B:66:0x019c), top: B:90:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r21, defpackage.asrg r22, defpackage.aubx r23, defpackage.fdae r24, defpackage.fcxy r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccsc.b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, asrg, aubx, fdae, fcxy):java.lang.Object");
    }
}
