package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esyb extends esyv {
    final /* synthetic */ esyv a;

    public esyb(esyv esyvVar) {
        this.a = esyvVar;
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        etdbVar.l();
        while (etdbVar.r()) {
            arrayList.add(Long.valueOf(((Number) this.a.a(etdbVar)).longValue()));
        }
        etdbVar.n();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        etddVar.e();
        int length = atomicLongArray.length();
        for (int i = 0; i < length; i++) {
            this.a.b(etddVar, Long.valueOf(atomicLongArray.get(i)));
        }
        etddVar.g();
    }
}
