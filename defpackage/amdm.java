package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amdm implements cquc {
    final /* synthetic */ amdx a;
    private final cquc b;

    public amdm(amdx amdxVar, cquc cqucVar) {
        this.a = amdxVar;
        this.b = cqucVar;
    }

    @Override // defpackage.cquc
    public final void a() {
        this.b.a();
        ekrw ekrwVarH = amdx.a.h();
        ekrwVarH.X(eksq.a, "BugleMapi");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.t, this.a.k);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository$LogOnUnsubscribeToken", "unsubscribe", 2293, "CoreBugleMessageRepository.java")).q("Unsubscribed from message callbacks.");
    }

    @Override // defpackage.cquc, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        cqub.a(this);
    }
}
