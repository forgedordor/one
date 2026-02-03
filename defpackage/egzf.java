package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egzf implements egyi {
    final /* synthetic */ egyi a;
    final /* synthetic */ egzg b;

    public egzf(egzg egzgVar, egyi egyiVar) {
        this.a = egyiVar;
        this.b = egzgVar;
    }

    @Override // defpackage.egyi
    public final eopy a() {
        eopy eopyVarA = this.a.a();
        final egzg egzgVar = this.b;
        return eopyVarA.e(eiid.g(new eopo() { // from class: egzd
            @Override // defpackage.eopo
            public final Object a(eopt eoptVar, Object obj) {
                egyh egyhVar = (egyh) obj;
                final egzg egzgVar2 = egzgVar;
                ejvr ejvrVar = new ejvr() { // from class: egze
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        ekgb ekgbVarN;
                        List list = egzgVar2.a;
                        synchronized (list) {
                            ekgbVarN = ekgb.n(list);
                        }
                        int size = ekgbVarN.size();
                        for (int i = 0; i < size; i++) {
                            obj2 = ((ejvr) ekgbVarN.get(i)).apply(obj2);
                        }
                        return obj2;
                    }
                };
                egyh egyhVar2 = egyh.a;
                return egyhVar != egyhVar2 ? egyhVar.f() ? egyh.a(ejvrVar.apply(egyhVar.d()), egyhVar.c()) : egyh.b(ejvrVar.apply(egyhVar.d())) : egyhVar2;
            }
        }), eoqg.a);
    }

    @Override // defpackage.egyi
    public final ListenableFuture b() {
        return eorv.a;
    }

    @Override // defpackage.egyi
    public final Object c() {
        return ((egys) this.a).b;
    }
}
