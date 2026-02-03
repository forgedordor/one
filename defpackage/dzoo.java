package defpackage;

import java.lang.Thread;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzoo extends dzom implements dzlo {
    public final dzlm a;

    static {
        new LinkedHashSet();
    }

    public dzoo(dzln dzlnVar, eygg eyggVar, Executor executor) {
        this.a = dzlnVar.a(executor, eyggVar, null);
    }

    @Override // defpackage.dzlo
    public final void n() {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: dzon
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                dzoo dzooVar = this.a;
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                try {
                    try {
                        eiix eiixVarA = eict.a(th);
                        if (eiixVarA != null) {
                            eigx eigxVar = eiixVarA.a;
                            dzol dzolVarA = dzol.a(eigxVar.b());
                            if (dzolVarA != null && ((dzok) dzolVarA.b.get()) != null && !dzolVarA.c.get()) {
                                UUID uuidD = eigxVar.d();
                                long jA = eims.a(uuidD.getMostSignificantBits(), uuidD.getLeastSignificantBits());
                                long jA2 = eigxVar.a();
                                fedl fedlVar = (fedl) fedn.a.createBuilder();
                                fedlVar.copyOnWrite();
                                fedn fednVar = (fedn) fedlVar.instance;
                                fednVar.b |= 4;
                                fednVar.e = jA;
                                fedlVar.copyOnWrite();
                                fedn fednVar2 = (fedn) fedlVar.instance;
                                fednVar2.b |= 1;
                                fednVar2.c = 0;
                                evrj evrjVarD = evwy.d(jA2);
                                fedlVar.copyOnWrite();
                                fedn fednVar3 = (fedn) fedlVar.instance;
                                evrjVarD.getClass();
                                fednVar3.d = evrjVarD;
                                fednVar3.b |= 2;
                                fedlVar.copyOnWrite();
                                fedn fednVar4 = (fedn) fedlVar.instance;
                                fednVar4.f = 2;
                                fednVar4.b |= 8;
                                fedn fednVar5 = (fedn) fedlVar.build();
                                dzlm dzlmVar = dzooVar.a;
                                dzle dzleVarN = dzlf.n();
                                dzleVarN.d(true);
                                feiw feiwVar = (feiw) feix.a.createBuilder();
                                feiwVar.copyOnWrite();
                                feix feixVar = (feix) feiwVar.instance;
                                fednVar5.getClass();
                                feixVar.s = fednVar5;
                                feixVar.b |= 1048576;
                                dzleVarN.f((feix) feiwVar.build());
                                ((dzkw) dzleVarN).b = null;
                                dzlmVar.b(dzleVarN.a());
                            }
                        }
                    } catch (Exception e) {
                        ((ekrd) ((ekrd) ((ekrd) dzfq.a.j()).g(e)).h("com/google/android/libraries/performance/primes/metrics/cui/CuiMetricServiceImpl", "onApplicationStartup", 96, "CuiMetricServiceImpl.java")).q("Failed to end CUI.");
                    }
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                } catch (Throwable th2) {
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                    throw th2;
                }
            }
        });
    }
}
