package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afhj {
    public final crqv a;
    public final Resources b;
    public final egyt c;
    public final eosc d;
    public final crqx e;
    public final eosc f;
    public final afgn g;
    private final egzh h;

    public afhj(crqv crqvVar, crqx crqxVar, Context context, egyt egytVar, eosc eoscVar, eosc eoscVar2, egzh egzhVar, afgn afgnVar) {
        this.a = crqvVar;
        this.e = crqxVar;
        this.b = context.getResources();
        this.c = egytVar;
        this.d = eoscVar;
        this.f = eoscVar2;
        this.h = egzhVar;
        this.g = afgnVar;
    }

    public final eiju a(final boolean z) {
        eiju eijuVarF = eijx.f(new Runnable() { // from class: afhc
            @Override // java.lang.Runnable
            public final void run() {
                afhj afhjVar = this.a;
                afhjVar.a.g(afhjVar.b.getString(R.string.rich_cards_settings_enable_all_pref_key), z);
            }
        }, this.d);
        ejvr ejvrVar = new ejvr() { // from class: afhd
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.b();
                return null;
            }
        };
        eosc eoscVar = this.f;
        return eijuVarF.h(ejvrVar, eoscVar).i(new eooz() { // from class: afgx
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!z) {
                    return eijx.e(null);
                }
                final afhj afhjVar = this.a;
                return eijx.f(new Runnable() { // from class: afha
                    @Override // java.lang.Runnable
                    public final void run() {
                        afhjVar.e.c();
                    }
                }, afhjVar.d).h(new ejvr() { // from class: afhb
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        afhjVar.b();
                        return null;
                    }
                }, afhjVar.f);
            }
        }, eoscVar);
    }

    public final void b() {
        this.h.a(eijx.e(null), "richcardsettings");
    }
}
