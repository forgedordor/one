package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cydk implements cyeh {
    public static final cqce a = cqce.g("BugleCms", "CmsFolsomKeyManagerPage");
    public final axky b;
    public final Context c;
    public final fdkf d;
    public final fdkf e;
    private final fdjx f;
    private final String g;

    /* compiled from: PG */
    public interface a {
        cycn fV();
    }

    public cydk(axky axkyVar, fdjx fdjxVar, Context context) {
        axkyVar.getClass();
        fdjxVar.getClass();
        context.getClass();
        this.b = axkyVar;
        this.f = fdjxVar;
        this.c = context;
        this.g = "CmsFolsomKeyManager";
        fdjz fdjzVar = fdjz.b;
        fcyi fcyiVar = fcyi.a;
        this.d = fdin.b(fdjxVar, eicg.a(fcyiVar), fdjzVar, new cydl(null, this));
        this.e = fdin.b(fdjxVar, eicg.a(fcyiVar), fdjzVar, new cydm(null, this));
    }

    @Override // defpackage.cyeh
    public final String a() {
        return this.g;
    }

    public final void b(final fdjx fdjxVar, final hox hoxVar, final String str, final fdap fdapVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        fdjxVar.getClass();
        fdapVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(413014568);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdjxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(hoxVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(str) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVarC.v(-1224400529);
            boolean zF = hmlVarC.F(fdapVar) | ((i2 & 896) == 256) | hmlVarC.F(fdjxVar) | ((i2 & 112) == 32);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new fdae() { // from class: cydc
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        auvw.k(fdjxVar, null, null, new cyde(hoxVar, str, fdapVar, null), 3);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            dtdi.a((fdae) objS, joj.a(ics.e, str.concat("Button")), false, null, null, null, null, null, hxe.d(-932426696, new cydf(str), hmlVarC), hmlVar2, 805306368, 508);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cydd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cydk cydkVar = this.a;
                    fdjx fdjxVar2 = fdjxVar;
                    hox hoxVar2 = hoxVar;
                    String str2 = str;
                    cydkVar.b(fdjxVar2, hoxVar2, str2, fdapVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    @Override // defpackage.cyeh
    public final void c(hox hoxVar, hml hmlVar, final int i) {
        int i2;
        final hox hoxVar2;
        hoxVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1475206201);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(hoxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(this) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hoxVar2 = hoxVar;
        } else {
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = hob.a(fcyi.a, hmlVarC);
                hmwVar.af(objS);
            }
            fdjx fdjxVar = (fdjx) objS;
            ibx ibxVar = ibw.k;
            ics icsVarC = dpc.c(ics.e, dpc.a(0, hmlVarC, 0, 1), false & ((14 & 8) == 0), (14 & 2) != 0, true);
            ixm ixmVarA = edl.a(ecr.c, ibxVar, hmlVarC, 48);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarC);
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
                Object objValueOf = Integer.valueOf(i4);
                hmwVar.af(objValueOf);
                hmlVarC.h(objValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            hmlVarC.v(5004770);
            boolean zF = hmlVarC.F(this);
            Object objS2 = hmwVar.S();
            if (zF || objS2 == obj) {
                objS2 = new cydg(this, null);
                hmwVar.af(objS2);
            }
            fdap fdapVar = (fdap) objS2;
            hmwVar.ab();
            int i5 = ((i2 << 3) & 112) | 384 | ((i2 << 9) & 57344);
            hoxVar2 = hoxVar;
            b(fdjxVar, hoxVar2, "existsUsableFolsomKeys", fdapVar, hmlVarC, i5);
            hmlVarC.v(5004770);
            boolean zF2 = hmlVarC.F(this);
            Object objS3 = hmwVar.S();
            if (zF2 || objS3 == obj) {
                objS3 = new cydh(this, null);
                hmwVar.af(objS3);
            }
            hmwVar.ab();
            b(fdjxVar, hoxVar2, "setConsentAndGetEncryptionReadinessForBnr", (fdap) objS3, hmlVarC, i5);
            hmlVarC.v(5004770);
            boolean zF3 = hmlVarC.F(this);
            Object objS4 = hmwVar.S();
            if (zF3 || objS4 == obj) {
                objS4 = new cydi(this, null);
                hmwVar.af(objS4);
            }
            hmwVar.ab();
            b(fdjxVar, hoxVar2, "encryptCmsBackupAndUpdateCmsBoxState", (fdap) objS4, hmlVarC, i5);
            hmlVarC.v(5004770);
            boolean zF4 = hmlVarC.F(this);
            Object objS5 = hmwVar.S();
            if (zF4 || objS5 == obj) {
                objS5 = new cydj(this, null);
                hmwVar.af(objS5);
            }
            hmwVar.ab();
            b(fdjxVar, hoxVar2, "runStarlight", (fdap) objS5, hmlVarC, i5);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cydb
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    cydk cydkVar = this.a;
                    int i6 = i;
                    cydkVar.c(hoxVar2, (hml) obj2, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    @Override // defpackage.cyeh
    public final /* synthetic */ void d(hml hmlVar) {
        cyee.a(this, hmlVar);
    }

    @Override // defpackage.cyeh
    public final /* synthetic */ void e(String str, hml hmlVar) {
        cyee.b(str, hmlVar);
    }
}
