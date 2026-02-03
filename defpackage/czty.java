package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czty {
    public final Context a;
    public final Executor b;
    public final fcsu c;
    public final fcsu d;
    private final fcsu e;

    public czty(Context context, Executor executor, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.a = context;
        this.b = executor;
        this.c = fcsuVar;
        this.e = fcsuVar2;
        this.d = fcsuVar3;
    }

    public final void a(final String str, final emfc emfcVar) {
        cjtk cjtkVar = (cjtk) this.e.b();
        final cjsa cjsaVar = cjsa.PROMO_BANNER;
        cjtkVar.d(str).h(new ejvr() { // from class: cjsl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekgb ekgbVar = (ekgb) obj;
                return new cjqk(cjtk.b(ekgbVar), cjtk.a(ekgbVar, cjsaVar));
            }
        }, cjtkVar.i).h(new ejvr() { // from class: cztv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cjti cjtiVar = (cjti) obj;
                cjya cjyaVar = (cjya) this.a.d.b();
                emfe emfeVar = emfe.PROVISIONING_UI_TYPE_PHONE_NUMBER_PROMO_BANNER;
                emet emetVar = (emet) emeu.a.createBuilder();
                int iA = cjtiVar.a() + 1;
                emetVar.copyOnWrite();
                emeu emeuVar = (emeu) emetVar.instance;
                emeuVar.b |= 8;
                emeuVar.e = iA;
                cjyaVar.i(emfeVar, emfcVar, 3, (emeu) emetVar.build(), cjtiVar.b() + 1, str);
                return null;
            }
        }, this.b).k(auvh.b(), eoqg.a);
    }
}
