package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djur implements ixm {
    @Override // defpackage.ixm
    public final /* synthetic */ int a(ivu ivuVar, List list, int i) {
        return ixl.a(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final /* synthetic */ int b(ivu ivuVar, List list, int i) {
        return ixl.b(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final /* synthetic */ int c(ivu ivuVar, List list, int i) {
        return ixl.c(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final /* synthetic */ int d(ivu ivuVar, List list, int i) {
        return ixl.d(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final ixn e(ixp ixpVar, List list, long j) {
        ixpVar.getClass();
        final ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ixk) it.next()).e(j));
        }
        int i = 0;
        int i2 = ((iyl) arrayList.get(0)).a;
        Iterator it2 = arrayList.subList(1, arrayList.size()).iterator();
        while (it2.hasNext()) {
            i += ((iyl) it2.next()).a;
        }
        int i3 = i2 + ((int) (i * 0.62f));
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = ((iyl) it3.next()).b;
        while (it3.hasNext()) {
            int i5 = ((iyl) it3.next()).b;
            if (i4 < i5) {
                i4 = i5;
            }
        }
        return ixpVar.ej(i3, i4, fcvp.a, new fdap() { // from class: djuq
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                iyk iykVar = (iyk) obj;
                iykVar.getClass();
                Iterator it4 = arrayList.iterator();
                int i6 = 0;
                while (it4.hasNext()) {
                    iyk.A(iykVar, (iyl) it4.next(), i6, 0);
                    i6 += (int) (r3.a * 0.62f);
                }
                return fctx.a;
            }
        });
    }
}
