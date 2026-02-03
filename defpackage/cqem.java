package defpackage;

import android.content.Context;
import android.content.Intent;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqem extends cqgi {
    public final cqhd a;
    public eigp b;
    private final eosc c;

    public cqem(eosc eoscVar, cqhd cqhdVar) {
        this.c = eoscVar;
        this.a = cqhdVar;
    }

    @Override // defpackage.cldb
    protected final int a() {
        return 18;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return this.b.c("ConnectivityBroadcastReceiver Receive broadcast", "com/google/android/apps/messaging/shared/util/connectivity/ConnectivityBroadcastReceiver", "beginRootTrace", 45);
    }

    @Override // defpackage.cldb
    public final eiju c(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null || action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            auvh.h(eijx.f(new Runnable() { // from class: cqel
                @Override // java.lang.Runnable
                public final void run() {
                    final cqhd cqhdVar = this.a.a;
                    synchronized (cqhdVar.j) {
                        Collection.EL.stream(cqhdVar.i.values()).flatMap(new Function() { // from class: cqgy
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return Collection.EL.stream((List) obj);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).forEach(new Consumer() { // from class: cqgz
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                cqew cqewVar = (cqew) obj;
                                cqewVar.getClass();
                                auvh.h(eijx.f(new cqhb(cqewVar), cqhdVar.b));
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                }
            }, this.c));
        }
        return eijx.e(null);
    }

    @Override // defpackage.cldb
    public final String d() {
        return null;
    }
}
