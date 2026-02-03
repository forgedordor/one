package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsuc implements dsud {
    public final eosc a;
    public final Set b;

    public dsuc(eosc eoscVar, Set set) {
        this.a = eoscVar;
        this.b = set;
    }

    @Override // defpackage.dsud
    public final ListenableFuture a(final dsuj dsujVar) {
        return eork.n(eiid.c(new eooy() { // from class: dsua
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                dsuc dsucVar = this.a;
                Set set = dsucVar.b;
                final ArrayList arrayList = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((dsud) it.next()).a(dsujVar));
                }
                return eork.c(arrayList).a(new Callable() { // from class: dsub
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Iterator it2 = arrayList.iterator();
                        dsty dstyVar = null;
                        while (it2.hasNext()) {
                            dsty dstyVar2 = (dsty) eork.q((ListenableFuture) it2.next());
                            if (dstyVar2 != null) {
                                ejwl.m(dstyVar == null, "More than one auth provider provided result.");
                                dstyVar = dstyVar2;
                            }
                        }
                        if (dstyVar != null) {
                            return dstyVar;
                        }
                        throw new UnsupportedOperationException("Unknown LogAuthSpec or Missing Module.");
                    }
                }, dsucVar.a);
            }
        }), this.a);
    }
}
