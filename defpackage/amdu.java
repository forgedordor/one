package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amdu implements ajmg {
    final /* synthetic */ amdx a;
    private final String b;
    private final ajmg c;

    public amdu(amdx amdxVar, anbe anbeVar, ajmg ajmgVar) {
        this.a = amdxVar;
        this.b = anbeVar.a;
        this.c = ajmgVar;
    }

    @Override // defpackage.cqtk
    public final /* bridge */ /* synthetic */ eiju a(Object obj) {
        ajmf ajmfVar = (ajmf) obj;
        ekrw ekrwVarH = amdx.a.h();
        ekrwVarH.X(eksq.a, "BugleMapi");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.t, this.a.k);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository$MessagesChangedCallbackWithLogs", "onChange", 2328, "CoreBugleMessageRepository.java")).I("firing onChange, msg: %s %s, source: %s.", ajmfVar.b().a(), ajmfVar.a(), this.b);
        return this.c.a(ajmfVar);
    }

    @Override // defpackage.ajmg
    public final eiju b() {
        ekrw ekrwVarH = amdx.a.h();
        ekrwVarH.X(eksq.a, "BugleMapi");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.t, this.a.k);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository$MessagesChangedCallbackWithLogs", "onAllMessagesChanged", 2320, "CoreBugleMessageRepository.java")).t("firing onAllMessagesChanged, source: %s.", this.b);
        return this.c.b();
    }

    public amdu(amdx amdxVar, String str, ajmg ajmgVar) {
        this.a = amdxVar;
        this.b = str;
        this.c = ajmgVar;
    }
}
