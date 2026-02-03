package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egcq {
    public final fcsu a;
    public final egcd b;
    public final ecjh c;
    public final diep d;
    public final fcsu e;
    public final int f;
    public final Executor g;
    private final eoqr h = new eoqr();

    public egcq(fcsu fcsuVar, egcd egcdVar, ecjh ecjhVar, diep diepVar, fcsu fcsuVar2, int i, Executor executor) {
        this.a = fcsuVar;
        this.b = egcdVar;
        this.c = ecjhVar;
        this.d = diepVar;
        this.e = fcsuVar2;
        this.f = i;
        this.g = executor;
    }

    public final ListenableFuture a() {
        final long epochMilli = this.d.f().toEpochMilli();
        return this.h.b(eiid.c(new eooy() { // from class: egch
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final egcq egcqVar = this.a;
                fcsu fcsuVar = egcqVar.a;
                boolean zIsEmpty = ekhx.o(((egct) fcsuVar.b()).a().values()).isEmpty();
                final long j = epochMilli;
                if (zIsEmpty) {
                    return egcqVar.c(j);
                }
                egct egctVar = (egct) fcsuVar.b();
                ekgp ekgpVarA = egctVar.a();
                ArrayList arrayList = new ArrayList();
                ekqg ekqgVarListIterator = ekgpVarA.entrySet().listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
                    arrayList.add(egctVar.c((String) entry.getKey(), (egce) entry.getValue()));
                }
                eoqt eoqtVarT = eoqt.t(egctVar.b(arrayList));
                eooz eoozVarD = eiid.d(new eooz() { // from class: egcm
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return egcqVar.b.k((ekgb) obj);
                    }
                });
                Executor executor = egcqVar.g;
                return eooq.g(eooq.g(eoqtVarT, eoozVarD, executor), eiid.d(new eooz() { // from class: egcn
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return egcqVar.c(j);
                    }
                }), executor);
            }
        }), this.g);
    }

    public final ListenableFuture b(final ekhx ekhxVar) {
        return this.h.b(eiid.c(new eooy() { // from class: egcj
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final egcq egcqVar = this.a;
                egct egctVar = (egct) egcqVar.a.b();
                ekgp ekgpVarA = egctVar.a();
                ArrayList arrayList = new ArrayList(1);
                final ekhx ekhxVar2 = ekhxVar;
                ekqg ekqgVarListIterator = ekhxVar2.listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    String str = (String) ekqgVarListIterator.next();
                    ejwl.f(ekgpVarA.containsKey(str), "No AccountProvider found for type: %s", str);
                    arrayList.add(egctVar.c(str, (egce) ekgpVarA.get(str)));
                }
                return eooq.g(egctVar.b(arrayList), eiid.d(new eooz() { // from class: egco
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return egcqVar.b.l((ekgb) obj, ekhxVar2);
                    }
                }), egcqVar.g);
            }
        }), this.g);
    }

    public final ListenableFuture c(final long j) {
        return this.c.b(new ejvr() { // from class: egck
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                egcx egcxVar = (egcx) obj;
                int i = egcxVar.b;
                int i2 = i & 1;
                long j2 = j;
                if (i2 == 0 && (i & 2) != 0 && egcxVar.d > j2) {
                    return egcxVar;
                }
                egcq egcqVar = this.a;
                egcw egcwVar = (egcw) egcxVar.toBuilder();
                egcwVar.copyOnWrite();
                egcx egcxVar2 = (egcx) egcwVar.instance;
                egcxVar2.b |= 1;
                egcxVar2.c = j2;
                egcwVar.copyOnWrite();
                egcx egcxVar3 = (egcx) egcwVar.instance;
                egcxVar3.b |= 4;
                egcxVar3.e = egcqVar.f;
                egcwVar.copyOnWrite();
                egcx egcxVar4 = (egcx) egcwVar.instance;
                egcxVar4.b &= -3;
                egcxVar4.d = 0L;
                return (egcx) egcwVar.build();
            }
        }, eoqg.a);
    }

    public final void d(ListenableFuture listenableFuture) {
        eork.r(listenableFuture, eiid.h(new egcp(this)), this.g);
    }

    public final ListenableFuture e() {
        return this.c.a();
    }

    public final ListenableFuture f() {
        return this.c.b(new ejvr() { // from class: egcl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                egcw egcwVar = (egcw) ((egcx) obj).toBuilder();
                egcwVar.clear();
                long epochMilli = this.a.d.f().toEpochMilli();
                egcwVar.copyOnWrite();
                egcx egcxVar = (egcx) egcwVar.instance;
                egcxVar.b |= 2;
                egcxVar.d = epochMilli;
                return (egcx) egcwVar.build();
            }
        }, eoqg.a);
    }
}
