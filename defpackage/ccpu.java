package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccpu implements cfoy {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/incoming/MlsControlMessageInboxMessageHandler");

    public ccpu(fdjx fdjxVar, awjh awjhVar, awxo awxoVar, awnf awnfVar, apwn apwnVar) {
        fdjxVar.getClass();
        awjhVar.getClass();
        awxoVar.getClass();
        awnfVar.getClass();
        apwnVar.getClass();
    }

    @Override // defpackage.cfoy
    public final eiju a(ezjj ezjjVar) {
        ezjjVar.getClass();
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.e, ezjjVar.c);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/incoming/MlsControlMessageInboxMessageHandler", "handleInboxMessage", 54, "MlsControlMessageInboxMessageHandler.kt")).q("MLS is not enabled for the control message.");
        eiju eijuVarE = eijx.e(true);
        eijuVarE.getClass();
        return eijuVarE;
    }
}
