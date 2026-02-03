package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctqu implements fdau {
    final /* synthetic */ ctqe a;

    public ctqu(ctqe ctqeVar) {
        this.a = ctqeVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        edk edkVar = (edk) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        edkVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(edkVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            final float fD = edkVar.d() * 0.5f;
            ics icsVarD = efy.d(ics.e, 16.0f);
            hmlVar.v(-1633490746);
            final ctqe ctqeVar = this.a;
            boolean zD = hmlVar.D(ctqeVar) | hmlVar.A(fD);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdat() { // from class: ctqt
                    @Override // defpackage.fdat
                    public final Object a(Object obj4, Object obj5) {
                        int i;
                        float f;
                        int iEp;
                        izm izmVar = (izm) obj4;
                        izmVar.getClass();
                        final long j = ((kil) obj5).a;
                        ctqe ctqeVar2 = ctqeVar;
                        List listA = izmVar.a("EmergencyBannerButton", new hxd(-881947874, true, new ctqy(ctqeVar2)));
                        final ArrayList arrayList = new ArrayList(fcva.p(listA, 10));
                        Iterator it = listA.iterator();
                        while (true) {
                            i = 0;
                            if (!it.hasNext()) {
                                break;
                            }
                            arrayList.add(((ixk) it.next()).e(kim.k(0, kil.b(j), 0, 13)));
                        }
                        iyl iylVar = (iyl) fcva.P(arrayList);
                        int iB = kil.b(j) - ctra.a(iylVar != null ? Integer.valueOf(iylVar.a) : null);
                        List listA2 = izmVar.a("EmergencyBannerIconAndText", new hxd(175433914, true, new ctqz(ctqeVar2)));
                        final ArrayList arrayList2 = new ArrayList(fcva.p(listA2, 10));
                        Iterator it2 = listA2.iterator();
                        while (true) {
                            f = fD;
                            if (!it2.hasNext()) {
                                break;
                            }
                            arrayList2.add(((ixk) it2.next()).e(iB < izmVar.ep(f) ? kim.k(0, kil.b(j), 0, 13) : kim.k(izmVar.ep(f), iB, 0, 12)));
                        }
                        final boolean z = iB >= izmVar.ep(f);
                        if (z) {
                            iyl iylVar2 = (iyl) fcva.P(arrayList2);
                            int iA = ctra.a(iylVar2 != null ? Integer.valueOf(iylVar2.b) : null);
                            iyl iylVar3 = (iyl) fcva.P(arrayList);
                            iEp = Math.max(iA, ctra.a(iylVar3 != null ? Integer.valueOf(iylVar3.b) : null));
                        } else {
                            Iterator it3 = arrayList2.iterator();
                            int i2 = 0;
                            while (it3.hasNext()) {
                                i2 += ((iyl) it3.next()).b;
                            }
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                i += ((iyl) it4.next()).b;
                            }
                            iEp = izmVar.ep(16.0f) + i2 + i;
                        }
                        final int i3 = iEp;
                        return izmVar.ej(kil.b(j), i3, fcvp.a, new fdap() { // from class: ctqh
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj6) {
                                iyk iykVar = (iyk) obj6;
                                iykVar.getClass();
                                List list = arrayList2;
                                List<iyl> list2 = arrayList;
                                long j2 = j;
                                int i4 = 0;
                                if (z) {
                                    Iterator it5 = list.iterator();
                                    int i5 = 0;
                                    while (it5.hasNext()) {
                                        i5 += ((iyl) it5.next()).b;
                                    }
                                    int i6 = i3;
                                    int i7 = i6 - i5;
                                    Iterator it6 = list.iterator();
                                    while (it6.hasNext()) {
                                        iyk.A(iykVar, (iyl) it6.next(), 0, i7 / 2);
                                    }
                                    Iterator it7 = list2.iterator();
                                    while (it7.hasNext()) {
                                        i4 += ((iyl) it7.next()).b;
                                    }
                                    int i8 = (i6 - i4) / 2;
                                    for (iyl iylVar4 : list2) {
                                        iyk.A(iykVar, iylVar4, kil.b(j2) - iylVar4.a, i8);
                                    }
                                } else {
                                    Iterator it8 = list.iterator();
                                    while (it8.hasNext()) {
                                        iyk.A(iykVar, (iyl) it8.next(), 0, 0);
                                    }
                                    Iterator it9 = list.iterator();
                                    while (it9.hasNext()) {
                                        i4 += ((iyl) it9.next()).b;
                                    }
                                    for (iyl iylVar5 : list2) {
                                        iyk.A(iykVar, iylVar5, kil.b(j2) - iylVar5.a, kin.f(iykVar, 16.0f) + i4);
                                    }
                                }
                                return fctx.a;
                            }
                        });
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            izg.a(icsVarD, (fdat) objF, hmlVar, 6, 0);
        }
        return fctx.a;
    }
}
