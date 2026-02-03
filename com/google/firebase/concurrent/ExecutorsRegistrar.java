package com.google.firebase.concurrent;

import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import defpackage.erzx;
import defpackage.erzy;
import defpackage.erzz;
import defpackage.esaa;
import defpackage.esbz;
import defpackage.esca;
import defpackage.escf;
import defpackage.escx;
import defpackage.esde;
import defpackage.esdv;
import defpackage.esgu;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final escx a = new escx(new esgu() { // from class: esdz
        @Override // defpackage.esgu
        public final Object a() {
            StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
            builderDetectNetwork.detectResourceMismatches();
            builderDetectNetwork.detectUnbufferedIo();
            return ExecutorsRegistrar.a(Executors.newFixedThreadPool(4, new esdi("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())));
        }
    });
    public static final escx b = new escx(new esgu() { // from class: esea
        @Override // defpackage.esgu
        public final Object a() {
            return ExecutorsRegistrar.a(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new esdi("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())));
        }
    });
    public static final escx c = new escx(new esgu() { // from class: eseb
        @Override // defpackage.esgu
        public final Object a() {
            return ExecutorsRegistrar.a(Executors.newCachedThreadPool(new esdi("Firebase Blocking", 11, null)));
        }
    });
    static final escx d = new escx(new esgu() { // from class: esec
        @Override // defpackage.esgu
        public final Object a() {
            return Executors.newSingleThreadScheduledExecutor(new esdi("Firebase Scheduler", 0, null));
        }
    });

    public static ScheduledExecutorService a(ExecutorService executorService) {
        return new esdv(executorService, (ScheduledExecutorService) d.a());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<esca<?>> getComponents() {
        esbz esbzVar = new esbz(new esde(erzx.class, ScheduledExecutorService.class), new esde(erzx.class, ExecutorService.class), new esde(erzx.class, Executor.class));
        esbzVar.c = new escf() { // from class: esed
            @Override // defpackage.escf
            public final Object a(escc esccVar) {
                return (ScheduledExecutorService) ExecutorsRegistrar.a.a();
            }
        };
        esbz esbzVar2 = new esbz(new esde(erzy.class, ScheduledExecutorService.class), new esde(erzy.class, ExecutorService.class), new esde(erzy.class, Executor.class));
        esbzVar2.c = new escf() { // from class: esee
            @Override // defpackage.escf
            public final Object a(escc esccVar) {
                return (ScheduledExecutorService) ExecutorsRegistrar.c.a();
            }
        };
        esbz esbzVar3 = new esbz(new esde(erzz.class, ScheduledExecutorService.class), new esde(erzz.class, ExecutorService.class), new esde(erzz.class, Executor.class));
        esbzVar3.c = new escf() { // from class: esef
            @Override // defpackage.escf
            public final Object a(escc esccVar) {
                return (ScheduledExecutorService) ExecutorsRegistrar.b.a();
            }
        };
        esbz esbzVarA = esca.a(new esde(esaa.class, Executor.class));
        esbzVarA.c = new escf() { // from class: eseg
            @Override // defpackage.escf
            public final Object a(escc esccVar) {
                return eseh.a;
            }
        };
        return Arrays.asList(esbzVar.a(), esbzVar2.a(), esbzVar3.a(), esbzVarA.a());
    }
}
