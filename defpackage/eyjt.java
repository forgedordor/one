package defpackage;

import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyjt {
    private static final Logger a = Logger.getLogger(eyjt.class.getName());

    private eyjt() {
    }

    public static eyjm a(fcsu fcsuVar, fcsu fcsuVar2) {
        eyjl eyjrVar;
        try {
            Collection collection = (Collection) ((eyig) fcsuVar2).a;
            if (collection.isEmpty()) {
                eyjrVar = eyjl.a;
            } else {
                eyjrVar = collection.size() == 1 ? new eyjr((eyjl) ekis.l(collection)) : new eyjo(collection);
            }
            return eyjrVar.a(((eyig) fcsuVar).a);
        } catch (RuntimeException e) {
            a.logp(Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "createMonitorForComponent", "RuntimeException while constructing monitor factories.", (Throwable) e);
            return eyjm.a;
        }
    }

    public static void b(RuntimeException runtimeException, eyjl eyjlVar, Object obj) {
        a.logp(Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "logCreateException", a.i(obj, eyjlVar, "RuntimeException while calling ProductionComponentMonitor.Factory.create on factory ", " with component "), (Throwable) runtimeException);
    }

    public static void c(RuntimeException runtimeException, eyjh eyjhVar, String str, Object obj) {
        a.logp(Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "logProducerMonitorArgMethodException", "RuntimeException while calling ProducerMonitor." + str + " on monitor " + eyjhVar + " with " + obj, (Throwable) runtimeException);
    }

    public static void d(RuntimeException runtimeException, eyjm eyjmVar, eyji eyjiVar) {
        a.logp(Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "logProducerMonitorForException", a.i(eyjiVar, eyjmVar, "RuntimeException while calling ProductionComponentMonitor.producerMonitorFor on monitor ", " with token "), (Throwable) runtimeException);
    }

    public static void e(RuntimeException runtimeException, eyjh eyjhVar, String str) {
        a.logp(Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "logProducerMonitorMethodException", a.m(eyjhVar, str, "RuntimeException while calling ProducerMonitor.", " on monitor "), (Throwable) runtimeException);
    }
}
