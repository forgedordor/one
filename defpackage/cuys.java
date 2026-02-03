package defpackage;

import com.google.android.apps.messaging.ui.appsettings.SettingsActivity;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuys extends cuyt {
    public final SettingsActivity a;
    public final aijh b;
    public final crny c;
    private final fcsu e;

    public cuys(SettingsActivity settingsActivity, aijh aijhVar, crny crnyVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, Optional optional) {
        this.a = settingsActivity;
        this.b = aijhVar;
        this.c = crnyVar;
        this.e = fcsuVar3;
        if (!abxb.a()) {
            efxf efxfVar = (efxf) fcsuVar.b();
            egap egapVarE = egaq.e(settingsActivity);
            egapVarE.d(sqx.class);
            efxfVar.e(a());
            efxfVar.g(egapVarE.a());
            optional.ifPresent(new Consumer() { // from class: cuyq
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
        egap egapVarE2 = egaq.e(settingsActivity);
        egapVarE2.d(egkc.class);
        efxfVar2.e(new egkb((egkc) fcsuVar2.b()));
        egapVarE2.d(eghx.class);
        efxfVar2.g(egapVarE2.a());
        efxfVar2.e(a());
    }

    private final efzm a() {
        return new cuyr(this, this.e);
    }
}
