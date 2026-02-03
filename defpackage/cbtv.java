package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbtv implements atyq {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/e2ee/incoming/EncryptedSinglePartIncomingChatMessageProcessor");
    private final fdjx b;
    private final atyq c;
    private final cbqh d;
    private final Map e;

    public cbtv(fdjx fdjxVar, atyq atyqVar, cbqh cbqhVar, Map map, apwn apwnVar) {
        fdjxVar.getClass();
        cbqhVar.getClass();
        apwnVar.getClass();
        this.b = fdjxVar;
        this.c = atyqVar;
        this.d = cbqhVar;
        this.e = map;
    }

    @Override // defpackage.atyq
    public final eiju a(atys atysVar) {
        aufh aufhVar = ((atuy) atysVar).a;
        if ((aufhVar.c & 4) != 0) {
            aubq aubqVar = aufhVar.f;
            if (aubqVar == null) {
                aubqVar = aubq.a;
            }
            aubp aubpVarB = aubp.b(aubqVar.c);
            if (aubpVarB == null) {
                aubpVarB = aubp.UNKNOWN_TYPE;
            }
            if (aubpVarB != aubp.GROUP || (aufhVar.c & 32) != 0) {
                aubx aubxVar = atysVar.e().c;
                if (aubxVar == null) {
                    aubxVar = aubx.a;
                }
                aubxVar.getClass();
                String str = aubxVar.c + "/" + aubxVar.d;
                cbtz cbtzVar = (cbtz) this.e.get(str);
                if (cbtzVar != null && cbtzVar.b()) {
                    return auvw.c(this.b, fcyi.a, fdjz.a, new cbtu(cbtzVar, atysVar, null));
                }
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleE2ee");
                ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/e2ee/incoming/EncryptedSinglePartIncomingChatMessageProcessor", "process", 53, "EncryptedSinglePartIncomingChatMessageProcessor.kt")).t("No processor found for content type: %s. Falling back to etouffee.", str);
                return this.c.a(atysVar);
            }
            this.d.c(basd.a(aufhVar.j), basd.a, 4, 24, 57);
        } else {
            this.d.c(basd.a(aufhVar.j), basd.a, 4, 24, 56);
        }
        ekrg ekrgVar = a;
        ekrw ekrwVarJ2 = ekrgVar.j();
        ekrz ekrzVar = eksq.a;
        ekrwVarJ2.X(ekrzVar, "BugleE2ee");
        ekrd ekrdVar = (ekrd) ekrwVarJ2;
        ekrz ekrzVar2 = cqnc.e;
        ekrdVar.X(ekrzVar2, aufhVar.j);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/incoming/EncryptedSinglePartIncomingChatMessageProcessor", "validateRequest", 68, "EncryptedSinglePartIncomingChatMessageProcessor.kt")).q("Skipping processing message because missing required group or destination token.");
        ekrw ekrwVarJ3 = ekrgVar.j();
        ekrwVarJ3.X(ekrzVar, "BugleE2ee");
        ekrd ekrdVar2 = (ekrd) ekrwVarJ3;
        ekrdVar2.X(ekrzVar2, aufhVar.j);
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/e2ee/incoming/EncryptedSinglePartIncomingChatMessageProcessor", "process", 43, "EncryptedSinglePartIncomingChatMessageProcessor.kt")).q("Skipping processing message because validation failed.");
        eiju eijuVarE = eijx.e(atav.FAIL_NO_RETRY);
        eijuVarE.getClass();
        return eijuVarE;
    }
}
