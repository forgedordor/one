package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwyx implements eora {
    final /* synthetic */ cwyy a;

    public cwyx(cwyy cwyyVar) {
        this.a = cwyyVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final Integer num = (Integer) obj;
        ecem.e(eiid.k(new Runnable() { // from class: cwyw
            @Override // java.lang.Runnable
            public final void run() {
                Integer num2 = num;
                cwyy cwyyVar = this.a.a;
                cwyyVar.a(num2.intValue());
                if (((cqba) cwyyVar.b.b()).a) {
                    ekrw ekrwVarE = cwyy.a.e();
                    ekrwVarE.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/ui/dark/DarkModeManager$1", "onSuccess", 112, "DarkModeManager.java")).q("DarkModeManager: Dark mode set after activity#onCreate");
                    ((ains) cwyyVar.c.b()).e("Bugle.DarkMode.Activity.LateRead", num2.intValue());
                }
            }
        }));
        ((ains) this.a.c.b()).c("Bugle.DarkMode.Activity.Recreate.InLaunch");
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ekrw ekrwVarJ = cwyy.a.j();
        ekrwVarJ.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/ui/dark/DarkModeManager$1", "onFailure", (char) 127, "DarkModeManager.java")).q("DarkModeManager: Get DarkMode error");
    }
}
