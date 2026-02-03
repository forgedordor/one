package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atup implements coir {
    public static final atup a = new atup();
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/chatapi/groups/icon/upload/GroupIconFileUploadProgressHandler");

    private atup() {
    }

    @Override // defpackage.coir
    public final eiju a(atir atirVar, coik coikVar) {
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleGroupManagement");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(coie.a, atirVar.a);
        cohj cohjVar = (cohj) coikVar;
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/chatapi/groups/icon/upload/GroupIconFileUploadProgressHandler", "onTransferProgress", 146, "GroupIconUploaderImpl.kt")).z("Icon upload progress: %s/%s", cohjVar.a, cohjVar.b);
        eiju eijuVarE = eijx.e(null);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.coir
    public final eiju b(String str, coik coikVar) {
        str.getClass();
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleGroupManagement");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(coie.a, str);
        cohj cohjVar = (cohj) coikVar;
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/chatapi/groups/icon/upload/GroupIconFileUploadProgressHandler", "onTransferProgress", 135, "GroupIconUploaderImpl.kt")).z("Icon upload progress: %s/%s", cohjVar.a, cohjVar.b);
        eiju eijuVarE = eijx.e(null);
        eijuVarE.getClass();
        return eijuVarE;
    }
}
