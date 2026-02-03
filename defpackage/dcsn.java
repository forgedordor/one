package defpackage;

import j$.time.Duration;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcsn {
    static defn a(Executor executor, defn defnVar, final Duration duration) {
        return defnVar.l() ? defnVar : degc.e(defnVar, duration.toMillis(), TimeUnit.MILLISECONDS).e(executor, new deeq() { // from class: dcsm
            @Override // defpackage.deeq
            public final Object a(defn defnVar2) {
                Exception excH = defnVar2.h();
                return excH instanceof TimeoutException ? degc.b(dcrn.a(excH, 15, "Task timed out after ".concat(String.valueOf(String.valueOf(duration))))) : defnVar2;
            }
        });
    }
}
