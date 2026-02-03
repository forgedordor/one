package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amdv implements anpi {
    final /* synthetic */ amdx a;
    private final String b;
    private final ajmg c;

    public amdv(amdx amdxVar, String str, ajmg ajmgVar) {
        this.a = amdxVar;
        this.b = str;
        this.c = ajmgVar;
    }

    @Override // defpackage.anpi
    public final eiju a() {
        ekrw ekrwVarH = amdx.a.h();
        ekrwVarH.X(eksq.a, "BugleMapi");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.t, this.a.k);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository$OnDataChangedHandlerWithLogs", "onChanged", 2353, "CoreBugleMessageRepository.java")).t("firing onAllMessagesChanged, source: %s.", this.b);
        return this.c.b();
    }
}
