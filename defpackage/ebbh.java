package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebbh implements ehwh {
    private static final ekrg a = ekrg.c("com/google/android/libraries/privatetelemetry/mobalt/workers/uploader/LogUploader");
    private final boolean b;
    private final ebac c;
    private final eayh d;
    private final diep e;

    public ebbh(boolean z, ebac ebacVar, eayh eayhVar, diep diepVar) {
        this.b = z;
        this.c = ebacVar;
        this.d = eayhVar;
        this.e = diepVar;
    }

    @Override // defpackage.ehwh
    public final ListenableFuture a() {
        eiju eijuVarA;
        if (!this.b) {
            return this.d.a(this.e.f());
        }
        ((ekrd) ((ekrd) a.h()).h("com/google/android/libraries/privatetelemetry/mobalt/workers/uploader/LogUploader", "sync", 41, "LogUploader.java")).q("Mobalt: enqueue sending logs to the Cobalt Server");
        final ebac ebacVar = this.c;
        if (ebacVar.f) {
            ((ekrd) ((ekrd) ebac.a.h()).h("com/google/android/libraries/privatetelemetry/mobalt/impl/MobaltPeriodicJobImpl", "generateAggregatedObservations", 129, "MobaltPeriodicJobImpl.java")).q("Mobalt: start sending logs to the Cobalt Server");
            ((ecoe) ebacVar.n.b.get()).a(Integer.valueOf(ebacVar.c), Integer.valueOf((int) ebacVar.d));
            final eiju eijuVarB = ebacVar.g.b(ebacVar.l.f());
            eijw eijwVarM = eijx.m(eijuVarB, ebacVar.m.a());
            eooy eooyVar = new eooy() { // from class: eazz
                /* JADX WARN: Removed duplicated region for block: B:59:0x01b9  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x01bc  */
                @Override // defpackage.eooy
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final com.google.common.util.concurrent.ListenableFuture a() {
                    /*
                        Method dump skipped, instructions count: 674
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.eazz.a():com.google.common.util.concurrent.ListenableFuture");
                }
            };
            ExecutorService executorService = ebacVar.j;
            eiju eijuVarB2 = eijwVarM.b(eooyVar, executorService);
            eijuVarB2.k(new ebab(ebacVar), executorService);
            eijuVarA = eijuVarB2;
        } else {
            eijuVarA = ebacVar.g.a(ebacVar.l.f());
        }
        egoc.d("com/google/android/libraries/privatetelemetry/mobalt/workers/uploader/LogUploader", "sync", 42, eijuVarA, "Mobalt: failure in enqueued sending logs to the Cobalt server", new Object[0]);
        return eorv.a;
    }
}
