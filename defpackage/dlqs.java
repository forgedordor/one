package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlqs {
    public static final Uri a(hox hoxVar) {
        return (Uri) hoxVar.a();
    }

    public static final Uri b(hox hoxVar) {
        return (Uri) hoxVar.a();
    }

    public static final void c(dlqu dlquVar, final Object obj, eve eveVar, hml hmlVar, final int i) {
        int i2;
        final eve eveVar2;
        final dlqu dlquVar2;
        Uri uri;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(207708283);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dlquVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(obj) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(eveVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            dlquVar2 = dlquVar;
            eveVar2 = eveVar;
        } else {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj2 = hmk.a;
            if (objS == obj2) {
                hpl hplVar = new hpl(Uri.EMPTY, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            hox hoxVar = (hox) objS;
            hmwVar.ab();
            hmlVarC.v(5004770);
            boolean zD = hmlVarC.D(obj);
            Object objS2 = hmwVar.S();
            if (zD || objS2 == obj2) {
                objS2 = new hpl(null, hsi.a);
                hmwVar.af(objS2);
            }
            hox hoxVar2 = (hox) objS2;
            hmwVar.ab();
            hmlVarC.v(1849434622);
            Object objS3 = hmwVar.S();
            if (objS3 == obj2) {
                hpl hplVar2 = new hpl(false, hsi.a);
                hmwVar.af(hplVar2);
                objS3 = hplVar2;
            }
            hox hoxVar3 = (hox) objS3;
            hmwVar.ab();
            Uri uri2 = dlquVar.a;
            if (!fdbq.f(uri2, Uri.EMPTY) && (fdbq.f(a(hoxVar), Uri.EMPTY) || !fdbq.f(a(hoxVar), uri2))) {
                hoxVar.b(uri2);
            }
            if (b(hoxVar2) == null && (uri = dlquVar.b) != null) {
                hoxVar2.b(uri);
            }
            eveVar2 = eveVar;
            dlquVar2 = dlquVar;
            dkew.a(dlquVar2, dihi.a(ics.e, dlquVar.f, true), eveVar2, b(hoxVar2) != null, hxe.d(1376109312, new dlqr(dlquVar, hoxVar3, hoxVar, hoxVar2), hmlVarC), hmlVarC, (i2 & 14) | 24576 | (i2 & 896), 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlqo
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    dlqu dlquVar3 = dlquVar2;
                    Object obj5 = obj;
                    int i4 = i;
                    dlqs.c(dlquVar3, obj5, eveVar2, (hml) obj3, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
