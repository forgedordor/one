package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkvj implements ixm {
    public static final dkvj a = new dkvj();

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
        Object obj;
        ixpVar.getClass();
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (fdbq.f(iwa.b((ixk) obj), "horizontal_card_media")) {
                break;
            }
            i2++;
        }
        ixk ixkVar = (ixk) obj;
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ixk ixkVar2 = (ixk) list.get(i3);
            if (fdbq.f(iwa.b(ixkVar2), "horizontal_text_content")) {
                int iD = ixkVar != null ? ixkVar.d(Alert.DURATION_SHOW_INDEFINITELY) : 0;
                int iF = fddu.f(kil.b(j) - iD, 0);
                int iMin = Math.min(ixkVar2.c(iF), kil.a(j));
                final ArrayList arrayList = new ArrayList(fcva.p(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ixk ixkVar3 = (ixk) it.next();
                    Object objB = iwa.b(ixkVar3);
                    Integer numValueOf = fdbq.f(objB, "horizontal_text_content") ? Integer.valueOf(iF) : fdbq.f(objB, "horizontal_card_media") ? Integer.valueOf(iD) : null;
                    arrayList.add(ixkVar3.e(kil.m(j, numValueOf != null ? numValueOf.intValue() : kil.d(j), numValueOf != null ? numValueOf.intValue() : kil.b(j), 0, iMin, 4)));
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    i += ((iyl) it2.next()).a;
                }
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
                return ixpVar.ej(i, i4, fcvp.a, new fdap() { // from class: dkvd
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        iyk iykVar = (iyk) obj2;
                        iykVar.getClass();
                        int i6 = 0;
                        for (iyl iylVar : arrayList) {
                            iyk.A(iykVar, iylVar, i6, 0);
                            i6 += iylVar.a;
                        }
                        return fctx.a;
                    }
                });
            }
        }
        kjw.a("Collection contains no element matching the predicate.");
        throw new fcta();
    }
}
