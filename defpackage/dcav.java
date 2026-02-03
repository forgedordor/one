package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.clearcut.internal.IClearcutLoggerService;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcav extends dcfm implements dbym {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public dcav(Context context) {
        dcfe dcfeVar = dbyl.c;
        dcez dcezVar = dcfa.q;
        dcfk dcfkVar = new dcfk();
        dcfkVar.a = new dcgk();
        super(context, dcfeVar, dcezVar, dcfkVar.a());
    }

    public static boolean e(ListenableFuture listenableFuture) {
        if (listenableFuture.isDone() && !listenableFuture.isCancelled()) {
            try {
                eote.a(listenableFuture);
                return true;
            } catch (RuntimeException | ExecutionException unused) {
            }
        }
        return false;
    }

    private final defn o(dbyd dbydVar, final dbye dbyeVar) {
        return dbyeVar != null ? p(dbydVar, new ejvr() { // from class: dcam
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dbzy dbzyVar;
                final dbyd dbydVar2 = (dbyd) obj;
                ListenableFuture listenableFutureD = dbydVar2.d(dbyeVar);
                boolean zE = dcav.e(listenableFutureD);
                final dcav dcavVar = this.a;
                if (!zE) {
                    return drgf.a(listenableFutureD).e(eoqg.a, new deeq() { // from class: dcao
                        @Override // defpackage.deeq
                        public final Object a(defn defnVar) {
                            dbzy dbzyVar2;
                            if (defnVar.m()) {
                                dbzyVar2 = (dbzy) defnVar.i();
                            } else {
                                Log.e("ClearcutLoggerApiImpl", "Error sampling log.", defnVar.h());
                                dbzyVar2 = dbzy.b;
                            }
                            return dcavVar.d(dbydVar2, dbzyVar2);
                        }
                    });
                }
                try {
                    dbzyVar = (dbzy) eote.a(listenableFutureD);
                } catch (ExecutionException unused) {
                    dbzyVar = dbzy.b;
                }
                return dcavVar.d(dbydVar2, dbzyVar);
            }
        }) : p(dbydVar, new ejvr() { // from class: dcan
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return this.a.d((dbyd) obj, dbzy.d);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final defpackage.defn p(final defpackage.dbyd r8, final defpackage.ejvr r9) {
        /*
            boolean r0 = r8.o
            java.lang.String r1 = "AbstractLogEventBuilder"
            if (r0 == 0) goto Lf
            java.lang.String r0 = "resolveComplianceData should not be invoked more than once per log."
            android.util.Log.e(r1, r0)
            com.google.common.util.concurrent.ListenableFuture r0 = defpackage.eorv.a
            goto Lc1
        Lf:
            r0 = 1
            r8.o = r0
            dbyw r0 = r8.n
            r2 = 0
            if (r0 == 0) goto L24
            eyen r3 = r0.b()
            eyen r4 = defpackage.eyen.EVENT_OVERRIDE
            if (r3 != r4) goto L24
            r8.f(r0)
            goto L9e
        L24:
            dbya r3 = r8.a
            dbyu r3 = r3.l
            if (r3 == 0) goto L2f
            dbyw r3 = r3.a()
            goto L30
        L2f:
            r3 = r2
        L30:
            if (r3 == 0) goto L6d
            eyen r4 = defpackage.eyen.LOGGER_OVERRIDE_PROVIDER
            r5 = r3
            dbyf r5 = (defpackage.dbyf) r5
            eyen r5 = r5.a
            if (r5 == r4) goto L6d
            eyen r6 = defpackage.eyen.LOGGER_DEFERRING_PROVIDER
            if (r5 == r6) goto L6d
            java.lang.String r3 = r5.toString()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = java.lang.String.valueOf(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "The provided logger-level ProductIdOrigin value "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r3 = " is not one of the values expected for a logger-level provider: "
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = " or "
            r6.append(r3)
            r6.append(r5)
            java.lang.String r3 = r6.toString()
            android.util.Log.e(r1, r3)
            r3 = r2
        L6d:
            if (r3 == 0) goto L7c
            eyen r1 = defpackage.eyen.LOGGER_OVERRIDE_PROVIDER
            r4 = r3
            dbyf r4 = (defpackage.dbyf) r4
            eyen r4 = r4.a
            if (r4 != r1) goto L7c
            r8.f(r3)
            goto L9e
        L7c:
            dbyw r1 = r8.m
            if (r1 == 0) goto L8d
            eyen r4 = defpackage.eyen.CPS_APP_PROCESS_GLOBAL_PROVIDER
            r5 = r1
            dbyf r5 = (defpackage.dbyf) r5
            eyen r5 = r5.a
            if (r5 != r4) goto L8d
            r8.f(r1)
            goto L9e
        L8d:
            if (r0 == 0) goto L93
            r8.f(r0)
            goto L9e
        L93:
            if (r3 == 0) goto L99
            r8.f(r3)
            goto L9e
        L99:
            if (r1 == 0) goto L9e
            r8.f(r1)
        L9e:
            dbya r0 = r8.a
            boolean r0 = r0.e()
            if (r0 != 0) goto Lbf
            com.google.common.util.concurrent.ListenableFuture r0 = defpackage.eork.i(r2)
            dbyb r1 = new dbyb
            r1.<init>()
            eoqg r2 = defpackage.eoqg.a
            com.google.common.util.concurrent.ListenableFuture r0 = defpackage.eooq.g(r0, r1, r2)
            dbyc r1 = new dbyc
            r1.<init>()
            com.google.common.util.concurrent.ListenableFuture r0 = defpackage.eooq.f(r0, r1, r2)
            goto Lc1
        Lbf:
            com.google.common.util.concurrent.ListenableFuture r0 = defpackage.eorv.a
        Lc1:
            boolean r1 = e(r0)
            if (r1 == 0) goto Lce
            java.lang.Object r8 = r9.apply(r8)
            defn r8 = (defpackage.defn) r8
            return r8
        Lce:
            defn r0 = defpackage.drgf.a(r0)
            eoqg r1 = defpackage.eoqg.a
            dcak r2 = new dcak
            r2.<init>()
            defn r8 = r0.e(r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcav.p(dbyd, ejvr):defn");
    }

    @Override // defpackage.dbym
    public final defn a(dbyk dbykVar) {
        return o(dbykVar, ((dbyl) dbykVar.a).o);
    }

    @Override // defpackage.dbym
    public final defn b(dcaf dcafVar) {
        return o(dcafVar, null);
    }

    @Override // defpackage.dbym
    public final void c(TimeUnit timeUnit) {
        try {
            degc.g(j(new dcap()), 1100L, timeUnit);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException | TimeoutException unused2) {
        }
    }

    public final defn d(dbyd dbydVar, dbzy dbzyVar) {
        dcau dcauVar = new dcau(this, dbydVar, this.k, dbzyVar);
        super.n(2, dcauVar);
        return dclg.b(dcauVar);
    }

    public final void f(final BatchedLogErrorParcelable batchedLogErrorParcelable) {
        if (batchedLogErrorParcelable.a.isEmpty()) {
            degc.c(Status.a);
            return;
        }
        dciz dcizVar = new dciz();
        dcizVar.a = new dcir() { // from class: dcal
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                AtomicBoolean atomicBoolean = dcav.a;
                ((IClearcutLoggerService) ((dcaw) obj).w()).logError(new dcaq((defr) obj2), batchedLogErrorParcelable);
            }
        };
        dcizVar.b = new Feature[]{dbzu.a};
        dcizVar.b();
        i(dcizVar.a());
    }
}
