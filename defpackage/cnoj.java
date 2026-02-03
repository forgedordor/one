package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnoj {
    public static final /* synthetic */ int b = 0;
    private final cogw e;
    private final cmfo f;
    private static final cqce c = cqce.g("Bugle", "ReverseTelephonySync");
    static final cczi a = cdag.e(cdag.b, "reverse_telephony_sync__max_number_of_attempts", 2);
    private static final cczi d = cdag.f(cdag.b, "reverse_telephony_sync__max_number_of_attempts_time_window_millis", 86400000);

    public cnoj(fcsu fcsuVar, cogw cogwVar) {
        this.e = cogwVar;
        cmgk cmgkVar = (cmgk) fcsuVar.b();
        cmgg cmggVarC = cmgh.c();
        cmggVarC.d(cmfn.REVERSE_TELEPHONY_SYNC_STATE);
        cmggVarC.f(cnoh.a);
        this.f = cmgkVar.a(cmggVarC.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean a() {
        try {
            cnoh cnohVar = (cnoh) this.f.l();
            cpff cpffVar = new cpff(((Integer) a.e()).intValue(), Duration.ofMillis(((Long) d.e()).longValue()));
            Stream map = Collection.EL.stream(cnohVar.d).map(new Function() { // from class: cnoi
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = cnoj.b;
                    return Instant.ofEpochMilli(evxc.a((evvp) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = ekgb.d;
            ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
            Instant instantF = this.e.f();
            int i2 = cpffVar.a;
            if (i2 != -1) {
                Instant instantMinus = instantF.minus(cpffVar.b);
                int size = ekgbVar.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    if (((Instant) ekgbVar.get(i4)).isAfter(instantMinus)) {
                        i3++;
                    }
                }
                if (i3 >= i2) {
                    return true;
                }
            }
        } catch (evtj e) {
            c.s("Unable to get state from data store", e);
        }
        return false;
    }
}
