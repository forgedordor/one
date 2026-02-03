package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hcm implements ixm {
    public final ecq a;
    public final ibx b;
    private final hil c;
    private final float d;

    public hcm(hil hilVar, ecq ecqVar, ibx ibxVar, float f) {
        this.c = hilVar;
        this.a = ecqVar;
        this.b = ibxVar;
        this.d = f;
    }

    @Override // defpackage.ixm
    public final int a(ivu ivuVar, List list, int i) {
        Integer num;
        int iEp = ivuVar.ep(this.d);
        if (list.isEmpty()) {
            num = null;
        } else {
            Integer numValueOf = Integer.valueOf(((ivt) list.get(0)).a(i));
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
            num = numValueOf;
        }
        return Math.max(iEp, num != null ? num.intValue() : 0);
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
        Integer num;
        int iEp = ivuVar.ep(this.d);
        if (list.isEmpty()) {
            num = null;
        } else {
            Integer numValueOf = Integer.valueOf(((ivt) list.get(0)).c(i));
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
            num = numValueOf;
        }
        return Math.max(iEp, num != null ? num.intValue() : 0);
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
    public final ixn e(final ixp ixpVar, List list, final long j) {
        final hcm hcmVar = this;
        int size = list.size();
        int i = 0;
        while (i < size) {
            ixk ixkVar = (ixk) list.get(i);
            if (fdbq.f(iwa.b(ixkVar), "navigationIcon")) {
                final iyl iylVarE = ixkVar.e(kil.m(j, 0, 0, 0, 0, 14));
                int size2 = list.size();
                int i2 = 0;
                while (i2 < size2) {
                    ixk ixkVar2 = (ixk) list.get(i2);
                    if (fdbq.f(iwa.b(ixkVar2), "actionIcons")) {
                        final iyl iylVarE2 = ixkVar2.e(kil.m(j, 0, 0, 0, 0, 14));
                        int iB = kil.b(j) == Integer.MAX_VALUE ? kil.b(j) : fddu.f((kil.b(j) - iylVarE.a) - iylVarE2.a, 0);
                        int size3 = list.size();
                        int i3 = 0;
                        while (i3 < size3) {
                            ixk ixkVar3 = (ixk) list.get(i3);
                            if (fdbq.f(iwa.b(ixkVar3), ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE)) {
                                final iyl iylVarE3 = ixkVar3.e(kil.m(j, 0, iB, 0, 0, 12));
                                ivg ivgVar = iuc.b;
                                if (iylVarE3.ei(ivgVar) != Integer.MIN_VALUE) {
                                    iylVarE3.ei(ivgVar);
                                }
                                float fA = hcmVar.c.a();
                                int iB2 = Float.isNaN(fA) ? 0 : fdcu.b(fA);
                                int iMax = Math.max(ixpVar.ep(hcmVar.d), iylVarE3.b);
                                if (kil.a(j) != Integer.MAX_VALUE) {
                                    iMax = fddu.f(iMax + iB2, 0);
                                }
                                final int i4 = iMax;
                                return ixpVar.ej(kil.b(j), i4, fcvp.a, new fdap() { // from class: hcl
                                    @Override // defpackage.fdap
                                    public final Object invoke(Object obj) {
                                        int i5 = i4;
                                        iyk iykVar = (iyk) obj;
                                        iyl iylVar = iylVarE;
                                        int i6 = 0;
                                        iyk.A(iykVar, iylVar, 0, (i5 - iylVar.b) / 2);
                                        int iMax2 = Math.max(ixpVar.ep(fyx.a), iylVar.a);
                                        hcm hcmVar2 = hcmVar;
                                        ibx ibxVar = hcmVar2.b;
                                        long j2 = j;
                                        iyl iylVar2 = iylVarE3;
                                        iyl iylVar3 = iylVarE2;
                                        int i7 = iylVar3.a;
                                        int iA = ibxVar.a(iylVar2.a, kil.b(j2), kji.a);
                                        if (iA < iMax2) {
                                            iA += iMax2 - iA;
                                        } else {
                                            int i8 = iylVar2.a + iA;
                                            if (i8 > kil.b(j2) - i7) {
                                                iA += (kil.b(j2) - i7) - i8;
                                            }
                                        }
                                        ecq ecqVar = hcmVar2.a;
                                        if (fdbq.f(ecqVar, ecr.e)) {
                                            i6 = (i5 - iylVar2.b) / 2;
                                        } else if (fdbq.f(ecqVar, ecr.d)) {
                                            i6 = i5 - iylVar2.b;
                                        }
                                        iyk.A(iykVar, iylVar2, iA, i6);
                                        iyk.A(iykVar, iylVar3, kil.b(j2) - iylVar3.a, (i5 - iylVar3.b) / 2);
                                        return fctx.a;
                                    }
                                });
                            }
                            i3++;
                            hcmVar = this;
                        }
                        kjw.a("Collection contains no element matching the predicate.");
                        throw new fcta();
                    }
                    i2++;
                    hcmVar = this;
                }
                kjw.a("Collection contains no element matching the predicate.");
                throw new fcta();
            }
            i++;
            hcmVar = this;
        }
        kjw.a("Collection contains no element matching the predicate.");
        throw new fcta();
    }
}
