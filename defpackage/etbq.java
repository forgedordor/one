package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etbq extends esyv {
    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        etdbVar.l();
        while (etdbVar.r()) {
            try {
                arrayList.add(Integer.valueOf(etdbVar.c()));
            } catch (NumberFormatException e) {
                throw new esyr(e);
            }
        }
        etdbVar.n();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        etddVar.e();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i = 0; i < length; i++) {
            etddVar.k(r6.get(i));
        }
        etddVar.g();
    }
}
