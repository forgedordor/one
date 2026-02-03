package defpackage;

import com.google.android.apps.messaging.ui.appsettings.ApplicationSettingsActivity;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cumf {
    public final ains a;
    public final ApplicationSettingsActivity b;
    private final fcsu c;

    public cumf(ApplicationSettingsActivity applicationSettingsActivity, ains ainsVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, Optional optional) {
        this.b = applicationSettingsActivity;
        this.a = ainsVar;
        this.c = fcsuVar3;
        if (!abxb.a()) {
            efxf efxfVar = (efxf) fcsuVar.b();
            egap egapVarE = egaq.e(applicationSettingsActivity);
            egapVarE.d(sqx.class);
            efxfVar.e(a());
            efxfVar.g(egapVarE.a());
            optional.ifPresent(new Consumer() { // from class: cumd
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((sqv) obj).a();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        efxf efxfVar2 = (efxf) fcsuVar.b();
        egap egapVarE2 = egaq.e(applicationSettingsActivity);
        egapVarE2.d(egkc.class);
        efxfVar2.e(new egkb((egkc) fcsuVar2.b()));
        egapVarE2.d(eghx.class);
        efxfVar2.g(egapVarE2.a());
        efxfVar2.e(a());
    }

    private final efzm a() {
        return new cume(this, this.c);
    }
}
