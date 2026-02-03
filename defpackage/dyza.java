package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyza implements eyif {
    public static dyyv a(Context context, ejwi ejwiVar, ejwi ejwiVar2, ejwi ejwiVar3, ejwi ejwiVar4) {
        final dyyz dyyzVar = new dyyz();
        dyyzVar.a = context.getApplicationContext();
        dyyzVar.b = (ExecutorService) ((ejwt) ejwiVar2).a;
        dyyzVar.c = (ScheduledExecutorService) ((ejwt) ejwiVar3).a;
        dyyzVar.d = (Handler) ((ejwt) ejwiVar).a;
        dyyzVar.f = (dvdg) ((ejwt) ejwiVar4).a;
        dyyzVar.a.getClass();
        if (dyyzVar.b == null) {
            ExecutorService executorServiceNewCachedThreadPool = dyyzVar.c;
            if (executorServiceNewCachedThreadPool == null) {
                executorServiceNewCachedThreadPool = Executors.newCachedThreadPool((ThreadFactory) dyyzVar.h.get());
            }
            dyyzVar.b = executorServiceNewCachedThreadPool;
        }
        if (dyyzVar.c == null) {
            dyyzVar.c = Executors.newSingleThreadScheduledExecutor((ThreadFactory) dyyzVar.h.get());
        }
        return new dyzm(dyyzVar.b, new ejxr() { // from class: dyyx
            @Override // defpackage.ejxr
            public final Object get() {
                final dyyz dyyzVar2 = dyyzVar;
                final dywf dywfVar = new dywf(dyyzVar2.a, dyyzVar2.c);
                ejxr ejxrVar = new ejxr() { // from class: dyyy
                    @Override // defpackage.ejxr
                    public final Object get() {
                        dyyz dyyzVar3 = dyyzVar2;
                        Context applicationContext = dyyzVar3.a.getApplicationContext();
                        ExecutorService executorService = dyyzVar3.b;
                        applicationContext.getClass();
                        executorService.getClass();
                        dduw dduwVar = new dduw();
                        dduwVar.a = 641;
                        dclh.b(true, "Must provide valid client application ID!");
                        ddux dduxVar = new ddux(dduwVar);
                        ddun ddunVar = new ddun(applicationContext, dduxVar);
                        dcfd dcfdVar = dduy.a;
                        return new dzbi(new dzbb(applicationContext, ddunVar, new ddut(applicationContext, dduxVar), new ddup(applicationContext, dduxVar), new dyyp(applicationContext, executorService), executorService, dcdt.a), 2, dywfVar, applicationContext.getPackageName());
                    }
                };
                if (dyyzVar2.e.h(dyyzVar2.a, 19621000) != 0) {
                    Log.i("OneGoogle", "MDI is not available. Forcing Menagerie");
                    return ejxrVar.get();
                }
                dyzm dyzmVar = new dyzm(dyyzVar2.b, ejxrVar);
                if (dyyzVar2.f == null) {
                    ddtg ddtgVar = new ddtg(dyyzVar2.a);
                    ecex ecexVar = new ecex(dyyzVar2.a);
                    ecexVar.b = ddtgVar;
                    ecev ecevVar = new ecev(ekgb.r(new ecey(ecexVar)));
                    eclv eclvVar = eclv.a;
                    HashMap map = new HashMap();
                    ExecutorService executorService = dyyzVar2.b;
                    ecjm.a(eckk.a, map);
                    ecjl ecjlVar = new ecjl(executorService, ecevVar, eclvVar, map);
                    Context context2 = dyyzVar2.a;
                    context2.getClass();
                    ExecutorService executorService2 = dyyzVar2.b;
                    executorService2.getClass();
                    Handler handler = dyyzVar2.d;
                    if (handler == null) {
                        handler = null;
                    }
                    dvfk dvfkVar = new dvfk(context2);
                    dvdc dvdcVar = new dvdc();
                    dieu dieuVar = new dieu();
                    if (handler == null) {
                        HandlerThread handlerThread = new HandlerThread("ProtoDataStore-Message-Handler");
                        handlerThread.start();
                        handler = new Handler(handlerThread.getLooper());
                    }
                    ecii eciiVar = new ecii();
                    eciiVar.b(context2);
                    eciiVar.a();
                    eciiVar.b = new eooz() { // from class: dvdb
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            return eork.h(new IllegalStateException());
                        }
                    };
                    eciiVar.d = handler;
                    ecil ecilVar = new ecil(eciiVar);
                    dcfd dcfdVar = deaa.a;
                    dyyzVar2.f = new dvfe(context2, executorService2, "OneGoogle", ecevVar, ecjlVar, dvfkVar, dvdcVar, dieuVar, dcdt.a, ecilVar, new deae(context2));
                }
                return new dzas(new dzbi(new dyzx(dyyzVar2.a, dyyzVar2.f, new dyyp(dyyzVar2.a, dyyzVar2.b), ejwi.j(dywfVar)), 1, dywfVar, dyyzVar2.a.getPackageName()), dyzmVar);
            }
        });
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
