package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkcb {
    public static final void a(final String str, final boolean z, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-456817754);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVarC.v(-915194517);
            jul julVar = new jul((byte[]) null);
            int iA = julVar.a(glz.d(hmlVarC).j.b);
            try {
                julVar.f(str);
                julVar.h(iA);
                hmlVarC.v(-915191051);
                if (z) {
                    iA = julVar.a(glz.d(hmlVarC).o.b);
                    try {
                        julVar.f(" " + jqu.b(R.string.sim_default_subtitle, hmlVarC));
                    } finally {
                    }
                }
                hmw hmwVar = (hmw) hmlVarC;
                hmwVar.ab();
                juo juoVarB = julVar.b();
                hmwVar.ab();
                hmlVar2 = hmlVarC;
                dthx.a(juoVarB, null, 0L, 0L, 0L, null, 0L, 0, false, 0, null, null, null, hmlVar2, 0, 0, 131070);
            } finally {
            }
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkbw
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i4 = i;
                    dkcb.a(str2, z, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final dkcd dkcdVar, ics icsVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-992495957);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkcdVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new ebk();
                hmwVar.af(objS);
            }
            hmwVar.ab();
            icsVar2 = icsVar;
            ics icsVarC = dli.c(icsVar2, (ebk) objS, grb.a(false, 0.0f, 0L, 7), false, null, null, dkcdVar.e, 28);
            String str = dkcdVar.b;
            hmlVarC.v(-305859642);
            hwv hwvVarD = hxe.d(-61460188, new dkbx(str), hmlVarC);
            hmwVar.ab();
            dtfr.a(hxe.d(-195516531, new dkby(dkcdVar), hmlVarC), icsVarC, null, hwvVarD, hxe.d(-1940337655, new dkbz(dkcdVar), hmlVarC), hxe.d(-229059288, new dkca(dkcdVar), hmlVarC), dtfp.a(ije.g, hmlVarC, 510), hmlVarC, 221190, 388);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkbv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkcd dkcdVar2 = dkcdVar;
                    int i4 = i;
                    dkcb.b(dkcdVar2, icsVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
