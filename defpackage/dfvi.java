package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfvi {
    public final eosd a;
    public final diep b;
    public final fcsu c;
    private final Map d = new ConcurrentHashMap();

    public dfvi(eosd eosdVar, fcsu fcsuVar, diep diepVar) {
        this.a = eosdVar;
        this.c = fcsuVar;
        this.b = diepVar;
    }

    public static void b(dfvh dfvhVar, cjjf cjjfVar) {
        cjjd cjjdVar = dfvhVar.b;
        cjgr cjgrVar = cjjdVar.e;
        if (cjgrVar == null) {
            cjgrVar = cjgr.a;
        }
        cjjr cjjrVar = cjgrVar.e;
        if (cjjrVar == null) {
            cjjrVar = cjjr.a;
        }
        String str = cjjrVar.c;
        evvp evvpVar = cjjdVar.f;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        Instant instantD = evwz.d(evvpVar);
        evvp evvpVar2 = cjjfVar.f;
        if (evvpVar2 == null) {
            evvpVar2 = evvp.a;
        }
        long millis = Duration.between(instantD, evwz.d(evvpVar2)).toMillis();
        int i = cjjdVar.c;
        if (i != 2) {
            if (i == 3) {
                cjkg cjkgVarB = cjkg.b((cjjfVar.c == 3 ? (cjjj) cjjfVar.d : cjjj.a).c);
                if (cjkgVarB == null) {
                    cjkgVarB = cjkg.RESPONSE_STATUS_UNKNOWN;
                }
                dhja.k("[conversationId:%s]: Notification for group failed permanently with result: %s, tries: %d, after: %d ms. Notification is removed from the queue.", str, cjkgVarB, Integer.valueOf(cjjdVar.h), Long.valueOf(millis));
                return;
            }
            return;
        }
        cjjd cjjdVar2 = dfvhVar.b;
        cjib cjibVar = (cjjdVar2.c == 2 ? (cjjl) cjjdVar2.d : cjjl.a).e;
        if (cjibVar == null) {
            cjibVar = cjib.b;
        }
        cjjw cjjwVar = cjibVar.d;
        if (cjjwVar == null) {
            cjjwVar = cjjw.a;
        }
        String str2 = cjjwVar.c;
        cjkg cjkgVarB2 = cjkg.b((cjjfVar.c == 2 ? (cjjn) cjjfVar.d : cjjn.a).c);
        if (cjkgVarB2 == null) {
            cjkgVarB2 = cjkg.RESPONSE_STATUS_UNKNOWN;
        }
        dhja.k("[conversationId:%s, messageId:%s]: Notification for message failed permanently with result: %s, tries: %d, after: %d ms. Notification is removed from the queue.", str, str2, cjkgVarB2, Integer.valueOf(cjjdVar.h), Long.valueOf(millis));
    }

    public static void c(dfvh dfvhVar, cjjf cjjfVar) {
        cjjd cjjdVar = dfvhVar.b;
        cjgr cjgrVar = cjjdVar.e;
        if (cjgrVar == null) {
            cjgrVar = cjgr.a;
        }
        cjjr cjjrVar = cjgrVar.e;
        if (cjjrVar == null) {
            cjjrVar = cjjr.a;
        }
        String str = cjjrVar.c;
        evvp evvpVar = cjjdVar.f;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        Instant instantD = evwz.d(evvpVar);
        evvp evvpVar2 = cjjfVar.f;
        if (evvpVar2 == null) {
            evvpVar2 = evvp.a;
        }
        long millis = Duration.between(instantD, evwz.d(evvpVar2)).toMillis();
        int i = cjjdVar.c;
        if (i != 2) {
            if (i == 3) {
                cjkg cjkgVarB = cjkg.b((cjjfVar.c == 3 ? (cjjj) cjjfVar.d : cjjj.a).c);
                if (cjkgVarB == null) {
                    cjkgVarB = cjkg.RESPONSE_STATUS_UNKNOWN;
                }
                dhja.k("[conversationId:%s]: Notification for group succeeded with result:  %s, tries: %d, after: %d ms", str, cjkgVarB, Integer.valueOf(cjjdVar.h), Long.valueOf(millis));
                return;
            }
            return;
        }
        cjjd cjjdVar2 = dfvhVar.b;
        cjib cjibVar = (cjjdVar2.c == 2 ? (cjjl) cjjdVar2.d : cjjl.a).e;
        if (cjibVar == null) {
            cjibVar = cjib.b;
        }
        cjjw cjjwVar = cjibVar.d;
        if (cjjwVar == null) {
            cjjwVar = cjjw.a;
        }
        String str2 = cjjwVar.c;
        cjkg cjkgVarB2 = cjkg.b((cjjfVar.c == 2 ? (cjjn) cjjfVar.d : cjjn.a).c);
        if (cjkgVarB2 == null) {
            cjkgVarB2 = cjkg.RESPONSE_STATUS_UNKNOWN;
        }
        dhja.k("[conversationId:%s, messageId:%s]: Notification for message succeeded with result:  %s, tries: %d, after: %d ms", str, str2, cjkgVarB2, Integer.valueOf(cjjdVar.h), Long.valueOf(millis));
    }

    public final ListenableFuture a(cjjd cjjdVar) {
        cjgr cjgrVar = cjjdVar.e;
        if (cjgrVar == null) {
            cjgrVar = cjgr.a;
        }
        cjjr cjjrVar = cjgrVar.e;
        if (cjjrVar == null) {
            cjjrVar = cjjr.a;
        }
        dfve dfveVar = (dfve) Map.EL.computeIfAbsent(this.d, cjjrVar.c, new Function() { // from class: dfvc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dfvi dfviVar = this.a;
                return new dfve(dfviVar, dfviVar.b);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dfvh dfvhVar = new dfvh(cjjdVar);
        dfveVar.a.add(dfvhVar);
        dfveVar.b();
        return dfvhVar.a;
    }
}
