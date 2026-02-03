package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzwx {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    private final dzwf e;
    private final dzwh f;
    private final dzwp g;

    public dzwx(Context context, ejwi ejwiVar) {
        String packageName = context.getPackageName();
        dzwf dzwfVar = dzwf.a;
        dzwh dzwhVar = dzwh.a;
        dzwp dzwpVar = dzwp.a;
        Boolean bool = false;
        bool.getClass();
        boolean zBooleanValue = ((Boolean) ejwiVar.e(bool)).booleanValue();
        this.c = "ANDROID_MESSAGING_PRIMES";
        this.e = dzwfVar;
        this.f = dzwhVar;
        this.g = dzwpVar;
        this.d = zBooleanValue;
        this.a = "com.google.android.libraries.performance.primes#".concat(String.valueOf(packageName));
        this.b = "com.google.android.client_error_logging#".concat(String.valueOf(packageName));
    }

    public final ListenableFuture a() {
        ejud ejudVar = ejud.a;
        final ListenableFuture listenableFutureI = eork.i(ejudVar);
        int i = ekgb.d;
        final ListenableFuture listenableFutureI2 = eork.i(ekoe.a);
        final ListenableFuture listenableFutureI3 = eork.i(ejudVar);
        return eork.b(listenableFutureI, listenableFutureI2, listenableFutureI3).a(new Callable() { // from class: dzww
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dzwu dzwuVar = (dzwu) dzwv.a.createBuilder();
                dzwuVar.copyOnWrite();
                dzwv dzwvVar = (dzwv) dzwuVar.instance;
                dzwvVar.c |= 1;
                dzwx dzwxVar = this.a;
                dzwvVar.d = dzwxVar.c;
                dzwuVar.a(dzwxVar.a);
                dzwuVar.a(dzwxVar.b);
                dzwuVar.copyOnWrite();
                dzwv dzwvVar2 = (dzwv) dzwuVar.instance;
                dzwvVar2.c |= 2;
                dzwvVar2.e = false;
                dzwuVar.copyOnWrite();
                dzwv dzwvVar3 = (dzwv) dzwuVar.instance;
                dzwvVar3.c |= 16;
                dzwvVar3.i = dzwxVar.d;
                ListenableFuture listenableFuture = listenableFutureI;
                ListenableFuture listenableFuture2 = listenableFutureI2;
                ListenableFuture listenableFuture3 = listenableFutureI3;
                try {
                    ejwi ejwiVar = (ejwi) eork.q(listenableFuture);
                    if (ejwiVar.g()) {
                        String str = (String) ejwiVar.c();
                        dzwuVar.copyOnWrite();
                        dzwv dzwvVar4 = (dzwv) dzwuVar.instance;
                        dzwvVar4.c |= 8;
                        dzwvVar4.g = str;
                    }
                } catch (Exception e) {
                    ((ekrd) ((ekrd) ((ekrd) dzfq.a.e()).g(e)).h("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotBuilder", "buildExtension", 'b', "ClearcutMetricSnapshotBuilder.java")).q("Failed to set Account Name, falling back to Zwieback logging.");
                }
                try {
                    List list = (List) eork.q(listenableFuture2);
                    dzwuVar.copyOnWrite();
                    dzwv dzwvVar5 = (dzwv) dzwuVar.instance;
                    evsx evsxVar = dzwvVar5.h;
                    if (!evsxVar.c()) {
                        dzwvVar5.h = evsn.mutableCopy(evsxVar);
                    }
                    evpz.addAll(list, dzwvVar5.h);
                } catch (Exception e2) {
                    ((ekrd) ((ekrd) ((ekrd) dzfq.a.e()).g(e2)).h("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotBuilder", "buildExtension", 'j', "ClearcutMetricSnapshotBuilder.java")).q("Failed to set external Experiment Ids.");
                }
                try {
                    ejwi ejwiVar2 = (ejwi) eork.q(listenableFuture3);
                    if (ejwiVar2.g()) {
                        String str2 = (String) ejwiVar2.c();
                        dzwuVar.copyOnWrite();
                        dzwv dzwvVar6 = (dzwv) dzwuVar.instance;
                        dzwvVar6.c |= 4;
                        dzwvVar6.f = str2;
                    }
                } catch (Exception e3) {
                    ((ekrd) ((ekrd) ((ekrd) dzfq.a.e()).g(e3)).h("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotBuilder", "buildExtension", 't', "ClearcutMetricSnapshotBuilder.java")).q("Failed to set Zwieback.");
                }
                dzwj dzwjVar = (dzwj) dzwk.a.createBuilder();
                dzwjVar.e(dzwv.b, (dzwv) dzwuVar.build());
                return (dzwk) dzwjVar.build();
            }
        }, eoqg.a);
    }
}
