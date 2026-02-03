package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czug implements actm, egps {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/rcs/setup/manual/PositiveButtonOnClickListener");
    private final cjsd b;
    private final cjtk c;
    private final agzy d;

    public czug(cjsd cjsdVar, cjtk cjtkVar, agzy agzyVar) {
        this.b = cjsdVar;
        this.c = cjtkVar;
        this.d = agzyVar;
    }

    @Override // defpackage.actm
    public final void a(egpr egprVar, View view) {
        String str = (String) this.c.h().orElse(null);
        if (str != null) {
            cjsd cjsdVar = this.b;
            cjrw cjrwVarB = cjsdVar.b(3, 10);
            cjsa cjsaVar = cjsa.PROMO_BANNER;
            cjrwVarB.copyOnWrite();
            cjsb cjsbVar = (cjsb) cjrwVarB.instance;
            cjsb cjsbVar2 = cjsb.a;
            cjsbVar.h = cjsaVar.a();
            cjsbVar.b |= 64;
            egprVar.h(egpq.b(cjsdVar.a(str, cjrwVarB.build())), new egpo(null), this);
        }
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        agzt agztVar;
        agzy agzyVar = this.d;
        if (agzyVar.d() && (agztVar = agzyVar.k) != null) {
            agztVar.d();
        }
        ((ekrd) ((ekrd) a.e()).h("com/google/android/apps/messaging/ui/rcs/setup/manual/PositiveButtonOnClickListener", "onSuccess", 76, "PositiveButtonOnClickListener.java")).q("Successfully stored Banner Accepted event, triggering Input Bottomsheet Popup");
        agzyVar.e(6);
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
        ((ekrd) ((ekrd) ((ekrd) a.j()).g(th)).h("com/google/android/apps/messaging/ui/rcs/setup/manual/PositiveButtonOnClickListener", "onFailure", 'S', "PositiveButtonOnClickListener.java")).q("Failed to store PhoneNumberInputUIEvent");
    }

    @Override // defpackage.egps
    public final /* synthetic */ void b(Object obj) {
    }
}
