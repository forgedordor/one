package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agnm implements actm, egps {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/otp/deletion/banner/NegativeButtonOnClickListener");
    private final agnw b;
    private final egzh c;
    private final agoo d;

    public agnm(agnw agnwVar, egzh egzhVar, agoo agooVar) {
        this.b = agnwVar;
        this.c = egzhVar;
        this.d = agooVar;
    }

    @Override // defpackage.actm
    public final void a(egpr egprVar, View view) {
        egprVar.g(egpq.b(this.b.c()), this);
        this.d.c(3);
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleOtp");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/otp/deletion/banner/NegativeButtonOnClickListener", "onSuccess", 64, "NegativeButtonOnClickListener.java")).q("Banner was dismissed.");
        this.c.a(eijx.e(null), acto.a);
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleOtp");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/otp/deletion/banner/NegativeButtonOnClickListener", "onFailure", 'G', "NegativeButtonOnClickListener.java")).q("Failed to dismiss banner.");
    }

    @Override // defpackage.egps
    public final /* synthetic */ void b(Object obj) {
    }
}
