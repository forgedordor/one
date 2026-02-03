package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.popup.spam.SpamPopupView;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahan implements agzt, ahar {
    public agzy a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    private cpdw e;
    private final eosc f;

    public ahan(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, eosc eoscVar) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.f = eoscVar;
    }

    @Override // defpackage.agzt
    public final eiju b() {
        return eijx.g(new Callable() { // from class: aham
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ahan ahanVar = this.a;
                boolean z = false;
                if (ahanVar.a.c()) {
                    csel cselVar = (csel) ahanVar.b.b();
                    if (crxi.a()) {
                        csei cseiVar = (csei) cselVar.b.b();
                        if (!((crxn) cseiVar.a.b()).b()) {
                            crrd crrdVarA = cseiVar.a();
                            if (!crrdVarA.a() && !crrdVarA.d()) {
                                if (!cselVar.d()) {
                                    if (!cselVar.g()) {
                                        cselVar.c();
                                    }
                                    z = true;
                                }
                                cselVar.b();
                            }
                        }
                    } else {
                        crrd crrdVarA2 = ((crre) cselVar.e.b()).a("spam_protection_feature_consent");
                        if (!crrdVarA2.a() && !crrdVarA2.d() && (!crrdVarA2.c() || !cselVar.f(crrdVarA2, ((crqv) cselVar.d.b()).q(cselVar.a.getString(R.string.spam_detection_pref_key), false)))) {
                            if (!cselVar.d()) {
                                if (!cselVar.g()) {
                                    cselVar.c();
                                }
                                z = true;
                            }
                            cselVar.a(crrdVarA2);
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        }, this.f);
    }

    @Override // defpackage.agzt
    public final void c(agzy agzyVar, ViewGroup viewGroup) {
        this.a = agzyVar;
    }

    @Override // defpackage.agzt
    public final void d() {
        cpdw cpdwVar = this.e;
        if (cpdwVar != null) {
            cpdwVar.e();
        }
        this.a.b();
    }

    @Override // defpackage.agzt
    public final boolean e(Context context, ViewGroup viewGroup, boolean z) {
        cpdw cpdwVar = new cpdw(LayoutInflater.from(context).inflate(R.layout.spam_popup_stub, viewGroup, true), R.id.spam_popup_stub, R.id.spam_popup, R.layout.spam_popup_view);
        this.e = cpdwVar;
        ((SpamPopupView) cpdwVar.b()).e = this;
        this.e.g(0);
        csel cselVar = (csel) this.b.b();
        cqaz.g();
        fcsu fcsuVar = cselVar.d;
        if (((crqv) fcsuVar.b()).e("spam_popup_seen_timestamp", -1L) == -1) {
            ((crqv) fcsuVar.b()).k("spam_popup_seen_timestamp", cselVar.c.f().toEpochMilli());
        }
        if (crtr.d()) {
            ((aise) this.d.b()).d(2);
        }
        return true;
    }

    @Override // defpackage.agzt
    public final int f() {
        return 12;
    }

    @Override // defpackage.agzt
    public final int n() {
        return agzx.a(2);
    }

    @Override // defpackage.agzt
    public final /* synthetic */ void g() {
    }
}
