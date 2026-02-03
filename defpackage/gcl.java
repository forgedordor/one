package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gcl implements ixm {
    @Override // defpackage.ixm
    public final int a(ivu ivuVar, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((ivt) list.get(0)).a(i));
            int iE = fcva.e(list);
            if (iE > 0) {
                int i2 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((ivt) list.get(i2)).a(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iE) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.ixm
    public final int b(ivu ivuVar, List list, int i) {
        int size = list.size();
        int iB = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iB += ((ivt) list.get(i2)).b(i);
        }
        return iB;
    }

    @Override // defpackage.ixm
    public final int c(ivu ivuVar, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((ivt) list.get(0)).c(i));
            int iE = fcva.e(list);
            if (iE > 0) {
                int i2 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((ivt) list.get(i2)).c(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iE) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.ixm
    public final int d(ivu ivuVar, List list, int i) {
        int size = list.size();
        int iD = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iD += ((ivt) list.get(i2)).d(i);
        }
        return iD;
    }

    @Override // defpackage.ixm
    public final ixn e(ixp ixpVar, List list, long j) {
        Object obj;
        Object obj2;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (fdbq.f(iwa.b((ixk) obj), "leadingIcon")) {
                break;
            }
            i++;
        }
        ixk ixkVar = (ixk) obj;
        final iyl iylVarE = ixkVar != null ? ixkVar.e(kil.m(j, 0, 0, 0, 0, 10)) : null;
        int iB = hjf.b(iylVarE);
        final int iA = hjf.a(iylVarE);
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i2);
            if (fdbq.f(iwa.b((ixk) obj2), "trailingIcon")) {
                break;
            }
            i2++;
        }
        ixk ixkVar2 = (ixk) obj2;
        final iyl iylVarE2 = ixkVar2 != null ? ixkVar2.e(kil.m(j, 0, 0, 0, 0, 10)) : null;
        int iB2 = hjf.b(iylVarE2);
        final int iA2 = hjf.a(iylVarE2);
        int size3 = list.size();
        int i3 = 0;
        while (i3 < size3) {
            ixk ixkVar3 = (ixk) list.get(i3);
            if (fdbq.f(iwa.b(ixkVar3), ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL)) {
                final iyl iylVarE3 = ixkVar3.e(kim.l(j, -(iB + iB2), 0, 2));
                int i4 = iylVarE3.a + iB + iB2;
                final int iMax = Math.max(iA, Math.max(iylVarE3.b, iA2));
                final int i5 = iB;
                return ixpVar.ej(i4, iMax, fcvp.a, new fdap() { // from class: gck
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        iyk iykVar = (iyk) obj3;
                        iyl iylVar = iylVarE;
                        int i6 = iMax;
                        if (iylVar != null) {
                            iyk.A(iykVar, iylVar, 0, ibw.n.a(iA, i6));
                        }
                        iyl iylVar2 = iylVarE2;
                        int i7 = i5;
                        iyl iylVar3 = iylVarE3;
                        iyk.A(iykVar, iylVar3, i7, 0);
                        if (iylVar2 != null) {
                            iyk.A(iykVar, iylVar2, i7 + iylVar3.a, ibw.n.a(iA2, i6));
                        }
                        return fctx.a;
                    }
                });
            }
            i3++;
            iB = iB;
            iA = iA;
        }
        kjw.a("Collection contains no element matching the predicate.");
        throw new fcta();
    }
}
