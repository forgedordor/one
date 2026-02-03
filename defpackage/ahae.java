package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.popup.federatedlearning.FederatedLearningPopupView;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahae implements agzt, ahai {
    public agzy a;
    public final Optional b;
    public final fcsu c;
    public final fcsu d;
    private cpdw e;
    private final eosc f;

    public ahae(Optional optional, fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar) {
        this.b = optional;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.f = eoscVar;
    }

    @Override // defpackage.agzt
    public final eiju b() {
        return eijx.g(new Callable() { // from class: ahad
            /* JADX WARN: Type inference failed for: r0v4, types: [fcsu, java.lang.Object] */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ahae ahaeVar = this.a;
                Optional optional = ahaeVar.b;
                optional.isPresent();
                boolean z = false;
                if (ahaeVar.a.c() && ((craw) optional.get().b()).i()) {
                    z = true;
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

    /* JADX WARN: Type inference failed for: r5v6, types: [fcsu, java.lang.Object] */
    @Override // defpackage.agzt
    public final boolean e(Context context, ViewGroup viewGroup, boolean z) {
        Optional optional = this.b;
        if (optional.isEmpty()) {
            return false;
        }
        cpdw cpdwVar = new cpdw(LayoutInflater.from(context).inflate(R.layout.federated_learning_popup_stub, viewGroup, true), R.id.federated_learning_popup_stub, R.id.federated_learning_popup);
        this.e = cpdwVar;
        ((FederatedLearningPopupView) cpdwVar.b()).d = this;
        this.e.g(0);
        ((craw) optional.get().b()).e();
        ((aise) this.d.b()).d(3);
        return true;
    }

    @Override // defpackage.agzt
    public final int f() {
        return 11;
    }

    @Override // defpackage.agzt
    public final int n() {
        return agzx.a(3);
    }

    @Override // defpackage.agzt
    public final /* synthetic */ void g() {
    }
}
