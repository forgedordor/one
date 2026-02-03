package defpackage;

import android.content.Context;
import j$.time.Instant;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class difi implements diff {
    public static final ekrg a = ekrg.c("com/google/android/libraries/communications/mobileconfiguration/api/accessor/MobileConfigurationAccessor");
    public final digf b;
    private final Context c;
    private final eosc d;
    private final eosc e;

    public difi(Context context, eosc eoscVar, eosc eoscVar2, digf digfVar) {
        this.c = context;
        this.d = eoscVar;
        this.e = eoscVar2;
        this.b = digfVar;
    }

    @Override // defpackage.diff
    public final Optional a(final String str) {
        Optional optionalD = this.b.d(str);
        if (!optionalD.isPresent() || (((digh) optionalD.get()).b & 2) == 0) {
            ((ekrd) ((ekrd) a.e()).h("com/google/android/libraries/communications/mobileconfiguration/api/accessor/MobileConfigurationAccessor", "getConfiguration", 83, "MobileConfigurationAccessor.java")).q("getConfiguration returning empty");
            return Optional.empty();
        }
        etsc etscVar = ((digh) optionalD.get()).d;
        if (etscVar == null) {
            etscVar = etsc.a;
        }
        if (fbgc.a.get().j(this.c)) {
            digg diggVar = (digg) ((evsn) optionalD.get()).toBuilder();
            evvp evvpVarB = evwz.b(Instant.now());
            diggVar.copyOnWrite();
            digh dighVar = (digh) diggVar.instance;
            evvpVarB.getClass();
            dighVar.f = evvpVarB;
            dighVar.b |= 8;
            final digh dighVar2 = (digh) diggVar.build();
            eork.r(this.d.submit(new Callable() { // from class: difg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    this.a.b.e(str, dighVar2);
                    return null;
                }
            }), new difh(), this.e);
        }
        evvp evvpVar = ((digh) optionalD.get()).e;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        Instant instantD = evwz.d(evvpVar);
        evrj evrjVar = etscVar.f;
        if (evrjVar == null) {
            evrjVar = evrj.a;
        }
        if (instantD.plus(evwz.c(evrjVar)).isBefore(Instant.now())) {
            ((ekrd) ((ekrd) a.e()).h("com/google/android/libraries/communications/mobileconfiguration/api/accessor/MobileConfigurationAccessor", "getConfiguration", 79, "MobileConfigurationAccessor.java")).q("getConfiguration returning expired config");
        }
        return Optional.of(etscVar);
    }

    @Override // defpackage.diff
    public final void b() {
        throw new UnsupportedOperationException("accessor does not support forceSyncConfigurations");
    }

    @Override // defpackage.diff
    public final void d(ekgp ekgpVar) {
        throw new UnsupportedOperationException("accessor does not support registerParameters");
    }
}
