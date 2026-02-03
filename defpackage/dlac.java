package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlac {
    public static final void a(final dkzw dkzwVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(181274209);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkzwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarA = iex.a(egq.h(icoVar, 40.0f), glz.c(hmlVarC).c);
            if (dkzwVar instanceof dkzs) {
                hmlVarC.v(-1889137277);
                ics icsVarA2 = dkl.a(iex.a(egq.h(icoVar, 40.0f), evn.a), glz.a(hmlVarC).a, ikj.a);
                ixm ixmVarA = ecz.a(ibw.e, false);
                long jB = hmg.b(hmlVarC);
                long j = jB ^ (jB >>> 32);
                hmw hmwVar = (hmw) hmlVarC;
                hxi hxiVarAk = hmwVar.ak();
                ics icsVarB = icj.b(hmlVarC, icsVarA2);
                fdae fdaeVar = jbb.a;
                hmlVarC.x();
                if (hmwVar.z) {
                    hmlVarC.j(fdaeVar);
                } else {
                    hmlVarC.z();
                }
                int i4 = (int) j;
                hsk.b(hmlVarC, ixmVarA, jbb.e);
                hsk.b(hmlVarC, hxiVarAk, jbb.d);
                fdat fdatVar = jbb.f;
                if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i4))) {
                    Integer numValueOf = Integer.valueOf(i4);
                    hmwVar.af(numValueOf);
                    hmlVarC.h(numValueOf, fdatVar);
                }
                hsk.b(hmlVarC, icsVarB, jbb.c);
                dtfn.a(djrs.b(((dkzs) dkzwVar).a, hmlVarC), null, joj.a(efy.j(icoVar, 0.0f, 8.0f, 0.0f, 8.0f, 5), "snippet_icon_thumbnail"), glz.a(hmlVarC).b, hmlVarC, 384, 0);
                hmlVarC.n();
                hmwVar.ab();
            } else if (dkzwVar instanceof dkzt) {
                hmlVarC.v(1566794308);
                djrv.a(((dkzt) dkzwVar).a, "", icsVarA, null, null, null, iuz.a, null, 0.0f, null, null, null, "snippet_image_thumbnail", null, null, null, hmlVarC, 12582960, 196608, 491384);
                hmlVarC = hmlVarC;
                ((hmw) hmlVarC).ab();
            } else {
                if (dkzwVar instanceof dkzu) {
                    hmlVarC.v(1567051639);
                    joj.a(egq.h(icoVar, 40.0f), "snippet_monogram_thumbnail");
                    throw null;
                }
                if (!(dkzwVar instanceof dkzv)) {
                    hmlVarC.v(-1889138281);
                    ((hmw) hmlVarC).ab();
                    throw new fctg();
                }
                hmlVarC.v(1567228804);
                djrv.a(((dkzv) dkzwVar).a, "", icsVarA, null, null, null, iuz.a, null, 0.0f, null, null, null, "snippet_video_thumbnail", null, null, null, hmlVarC, 12582960, 196608, 491384);
                hmlVarC = hmlVarC;
                ((hmw) hmlVarC).ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlab
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    dlac.a(dkzwVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
