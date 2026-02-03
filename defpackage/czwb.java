package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czwb {
    public final czxb a;

    public czwb(czxb czxbVar) {
        this.a = czxbVar;
    }

    public final ListenableFuture a() {
        return eika.j(this.a.a.a(), new ejvr() { // from class: czxa
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((czwy) obj).b;
            }
        }, eoqg.a);
    }

    public final void b(final List list) {
        eiju eijuVarG = eiju.g(a());
        ejvr ejvrVar = new ejvr() { // from class: czvz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(!list.equals((List) obj));
            }
        };
        eoqg eoqgVar = eoqg.a;
        cqnx.c(eijuVarG.h(ejvrVar, eoqgVar).i(new eooz() { // from class: czwa
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Boolean bool = (Boolean) obj;
                if (bool == null || !bool.booleanValue()) {
                    return eork.i(null);
                }
                final List list2 = list;
                czwb czwbVar = this.a;
                return czwbVar.a.a.b(new ejvr() { // from class: czwz
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        czwx czwxVar = (czwx) ((czwy) obj2).toBuilder();
                        czwxVar.copyOnWrite();
                        ((czwy) czwxVar.instance).b = evsn.emptyProtobufList();
                        czwxVar.copyOnWrite();
                        czwy czwyVar = (czwy) czwxVar.instance;
                        evtg evtgVar = czwyVar.b;
                        if (!evtgVar.c()) {
                            czwyVar.b = evsn.mutableCopy(evtgVar);
                        }
                        evpz.addAll(list2, czwyVar.b);
                        return (czwy) czwxVar.build();
                    }
                }, eoqg.a);
            }
        }, eoqgVar), "Bugle", "Failed to update current reminder notification reminder IDs");
    }
}
