package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.libraries.performance.primes.transmitter.LifeboatReceiver;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzxf implements dzwn {
    public final Context a;
    public final ClearcutMetricSnapshotTransmitter b;
    private final ejxr c;
    private final boolean d;
    private final dzwx e;

    public dzxf(final Context context, ejwi ejwiVar, dzwx dzwxVar, ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter) {
        this.a = context;
        this.c = ejxx.a(new ejxr() { // from class: dzxd
            @Override // defpackage.ejxr
            public final Object get() {
                return Boolean.valueOf(fbij.a.get().b(context));
            }
        });
        this.d = ((Boolean) ejwiVar.e(false)).booleanValue();
        this.e = dzwxVar;
        this.b = clearcutMetricSnapshotTransmitter;
    }

    @Override // defpackage.dzwn
    public final dzwm a() {
        return new dzwm(9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dzwn
    public final ListenableFuture b(final feix feixVar) {
        int i;
        if (this.d) {
            fehu fehuVar = feixVar.i;
            if (fehuVar == null) {
                fehuVar = fehu.a;
            }
            if ((fehuVar.b & 1) != 0) {
                return eooq.f(this.e.a(), new ejvr() { // from class: dzxc
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        dzwj dzwjVar = (dzwj) ((dzwk) obj).toBuilder();
                        dzwjVar.copyOnWrite();
                        dzwk dzwkVar = (dzwk) dzwjVar.instance;
                        feix feixVar2 = feixVar;
                        feixVar2.getClass();
                        dzwkVar.c = feixVar2;
                        dzwkVar.b |= 1;
                        dzwk dzwkVar2 = (dzwk) dzwjVar.build();
                        dzxf dzxfVar = this.a;
                        String[] strArr = {dzxfVar.b.getClass().getName()};
                        Intent intent = new Intent();
                        Context context = dzxfVar.a;
                        intent.setComponent(new ComponentName(context, (Class<?>) LifeboatReceiver.class));
                        intent.setPackage(context.getPackageName());
                        intent.putExtra("Transmitters", strArr);
                        intent.putExtra("MetricSnapshot", dzwkVar2.toByteArray());
                        context.sendBroadcast(intent);
                        return null;
                    }
                }, eoqg.a);
            }
        }
        if ((feixVar.b & 1024) != 0 && ((Boolean) this.c.get()).booleanValue()) {
            feiw feiwVar = (feiw) feixVar.toBuilder();
            feig feigVar = feixVar.l;
            if (feigVar == null) {
                feigVar = feig.a;
            }
            evtg<feie> evtgVar = feigVar.k;
            if (!evtgVar.isEmpty()) {
                fein feinVar = (fein) feio.a.createBuilder();
                feie feieVar = null;
                for (feie feieVar2 : evtgVar) {
                    if (feieVar != null && (i = feieVar.e + 1) != feieVar2.d) {
                        feinVar.b(0);
                        feinVar.a(i);
                    }
                    feinVar.b(feieVar2.c);
                    feinVar.a(feieVar2.d);
                    feieVar = feieVar2;
                }
                if (feieVar != null && (feieVar.b & 4) != 0) {
                    int i2 = feieVar.e + 1;
                    feinVar.b(0);
                    feinVar.a(i2);
                }
                feif feifVar = (feif) feigVar.toBuilder();
                feifVar.copyOnWrite();
                ((feig) feifVar.instance).k = feig.emptyProtobufList();
                feifVar.copyOnWrite();
                feig feigVar2 = (feig) feifVar.instance;
                feio feioVar = (feio) feinVar.build();
                feioVar.getClass();
                feigVar2.j = feioVar;
                feigVar2.b |= 128;
                feigVar = (feig) feifVar.build();
            }
            feiwVar.copyOnWrite();
            feix feixVar2 = (feix) feiwVar.instance;
            feigVar.getClass();
            feixVar2.l = feigVar;
            feixVar2.b |= 1024;
            feixVar = (feix) feiwVar.build();
        }
        ListenableFuture listenableFutureA = this.e.a();
        eooz eoozVar = new eooz() { // from class: dzxb
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dzwj dzwjVar = (dzwj) ((dzwk) obj).toBuilder();
                dzwjVar.copyOnWrite();
                dzwk dzwkVar = (dzwk) dzwjVar.instance;
                feix feixVar3 = feixVar;
                feixVar3.getClass();
                dzwkVar.c = feixVar3;
                dzwkVar.b |= 1;
                dzwk dzwkVar2 = (dzwk) dzwjVar.build();
                dzxf dzxfVar = this.a;
                return dzxfVar.b.a(dzxfVar.a, dzwkVar2);
            }
        };
        eoqg eoqgVar = eoqg.a;
        ListenableFuture listenableFutureG = eooq.g(listenableFutureA, eoozVar, eoqgVar);
        if (Log.isLoggable("ClearcutMetricXmitter", 4)) {
            eork.r(listenableFutureG, new dzxe(), eoqgVar);
        }
        return listenableFutureG;
    }
}
