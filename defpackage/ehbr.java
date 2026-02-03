package defpackage;

import com.google.android.apps.messaging.R;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehbr extends ehbl implements lun {
    private final ehbl a;
    private final egzo b;
    private final Executor c;
    private final Map d;

    public ehbr(ehbl ehblVar, ehpg ehpgVar, egzo egzoVar, Executor executor, lvj lvjVar) {
        this.a = ehblVar;
        this.b = egzoVar;
        this.c = executor;
        this.d = (Map) ehpgVar.c(R.id.result_propagator_map, lvjVar, new ehow() { // from class: ehbo
            @Override // defpackage.ehow
            public final Object a() {
                return new csq();
            }
        }, new ehov() { // from class: ehbp
            @Override // defpackage.ehov
            public final void a(Object obj) {
                csq csqVar = (csq) obj;
                for (ehco ehcoVar : csqVar.values()) {
                    ecem.c();
                    ejwl.l(!ehcoVar.e);
                    ehcn ehcnVar = ehcoVar.b;
                    if (ehcnVar != null) {
                        ehcoVar.a.e(ehcnVar.a, ehcnVar);
                        ehcoVar.b.close();
                        ehcoVar.b = null;
                    }
                    ehcoVar.e = true;
                }
                csqVar.clear();
            }
        });
        lvjVar.P().c(this);
    }

    @Override // defpackage.lun
    public final void f(lvj lvjVar) {
        ecem.c();
        for (ehco ehcoVar : this.d.values()) {
            ecem.c();
            ehcoVar.d = false;
        }
    }

    @Override // defpackage.lun
    public final void fh(lvj lvjVar) {
        ecem.c();
        for (ehco ehcoVar : this.d.values()) {
            ecem.c();
            ejwl.l(!ehcoVar.e);
            ehcoVar.c = null;
        }
    }

    @Override // defpackage.lun
    public final void gG(lvj lvjVar) {
        ecem.c();
        for (ehco ehcoVar : this.d.values()) {
            ecem.c();
            ehcoVar.d = true;
            ehcn ehcnVar = ehcoVar.b;
            if (ehcnVar != null) {
                ehcnVar.b();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [ehaw, java.lang.Object] */
    @Override // defpackage.ehbl
    public final ehba i(int i, ehay ehayVar, ejwi ejwiVar) {
        ecem.c();
        Map map = this.d;
        ehba ehbaVarI = this.a.i(i, ehayVar, ejwiVar);
        Integer numValueOf = Integer.valueOf(i);
        ehco ehcoVar = (ehco) map.get(numValueOf);
        if (ehcoVar == null) {
            ehco ehcoVar2 = new ehco(this.b, this.c);
            map.put(numValueOf, ehcoVar2);
            if (ejwiVar.g()) {
                ehcoVar2.a(ejwiVar.c());
            }
            ehcoVar = ehcoVar2;
        }
        ecem.c();
        ejwl.l(!ehcoVar.e);
        ehcoVar.c = ehbaVarI;
        ehcn ehcnVar = ehcoVar.b;
        if (ehcnVar != null) {
            ehcnVar.b();
        }
        return new ehbq(ehbaVarI, ehcoVar);
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void d(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gF(lvj lvjVar) {
    }
}
