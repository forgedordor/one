package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hbh implements ixm {
    public static final hbh a = new hbh();

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
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ixk ixkVar = (ixk) list.get(i);
            if (fdbq.f(iwa.b(ixkVar), "Spacer")) {
                final iyl iylVarE = ixkVar.e(kil.m(j, 0, 0, 0, ixpVar.ep(1.0f), 3));
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Object obj = list.get(i2);
                    if (!fdbq.f(iwa.b((ixk) obj), "Spacer")) {
                        arrayList.add(obj);
                    }
                }
                final ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    arrayList2.add(((ixk) arrayList.get(i3)).e(kil.m(j, 0, 0, 0, kil.a(j) >> 1, 3)));
                }
                return ixpVar.ej(kil.b(j), kil.a(j), fcvp.a, new fdap() { // from class: hbg
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        List list2 = arrayList2;
                        iyk iykVar = (iyk) obj2;
                        iykVar.s((iyl) list2.get(0), 0, 0, 0.0f);
                        iykVar.s((iyl) list2.get(1), 0, ((iyl) list2.get(0)).b, 0.0f);
                        int i4 = ((iyl) list2.get(0)).b;
                        iyl iylVar = iylVarE;
                        iykVar.s(iylVar, 0, i4 - (iylVar.b / 2), 0.0f);
                        return fctx.a;
                    }
                });
            }
        }
        kjw.a("Collection contains no element matching the predicate.");
        throw new fcta();
    }
}
