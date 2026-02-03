package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ceji implements eora {
    final /* synthetic */ String a;
    final /* synthetic */ cejj b;

    public ceji(cejj cejjVar, String str) {
        this.a = str;
        this.b = cejjVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ekrw ekrwVarJ = cejj.a.j();
        ekrwVarJ.X(eksq.a, "BugleNetwork");
        ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarJ).g(th);
        ekrdVar.Z(eksk.FULL);
        ekrz ekrzVar = cqnc.I;
        String str = this.a;
        ekrdVar.X(ekrzVar, str);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProviderCache$1", "onFailure", 143, "PhoneRegistrationProviderCache.java")).q("Failed to create phone registration provider cache.");
        cejj cejjVar = this.b;
        synchronized (cejjVar.c) {
            cejjVar.d.remove(str);
        }
    }
}
