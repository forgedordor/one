package defpackage;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etaz extends esyv {
    private final esyv a;
    private final etan b;

    public etaz(esyv esyvVar, etan etanVar) {
        this.a = esyvVar;
        this.b = etanVar;
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) throws IOException {
        if (etdbVar.t() == 9) {
            etdbVar.p();
            return null;
        }
        Collection collection = (Collection) this.b.a();
        etdbVar.l();
        while (etdbVar.r()) {
            collection.add(this.a.a(etdbVar));
        }
        etdbVar.n();
        return collection;
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        Collection collection = (Collection) obj;
        if (collection == null) {
            etddVar.j();
            return;
        }
        etddVar.e();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.a.b(etddVar, it.next());
        }
        etddVar.g();
    }
}
