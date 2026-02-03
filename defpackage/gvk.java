package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvk {
    public static final hpt a = new hnz(hsi.a, new fdae() { // from class: gvd
        @Override // defpackage.fdae
        public final Object invoke() {
            hpt hptVar = gvk.a;
            return new kir(0.0f);
        }
    });

    public static final ics a(ics icsVar, ikp ikpVar, long j, dky dkyVar, float f) {
        ikp ikpVar2;
        ics icsVarB;
        if (f > 0.0f) {
            ikpVar2 = ikpVar;
            icsVarB = ijn.b(ics.e, 0.0f, 0.0f, 0.0f, f, ikpVar2, 124895);
        } else {
            ikpVar2 = ikpVar;
            icsVarB = ics.e;
        }
        return iex.a(dkl.a(icsVar.a(icsVarB).a(dkyVar != null ? dkr.b(ics.e, dkyVar, ikpVar2) : ics.e), j, ikpVar2), ikpVar2);
    }

    public static final /* synthetic */ long b(long j, float f, hml hmlVar) {
        gda gdaVarA = glz.a(hmlVar);
        boolean zBooleanValue = ((Boolean) hmlVar.e(gdd.b)).booleanValue();
        long j2 = gdaVarA.p;
        long j3 = ije.a;
        return (fcts.a(j, j2) && zBooleanValue) ? gdd.b(gdaVarA, f) : j;
    }

    public static final void c(ics icsVar, ikp ikpVar, long j, long j2, float f, float f2, dky dkyVar, fdat fdatVar, hml hmlVar, int i) {
        if ((i & 1) != 0) {
            icsVar = ics.e;
        }
        if ((i & 2) != 0) {
            ikpVar = ikj.a;
        }
        if ((i & 4) != 0) {
            j = glz.a(hmlVar).p;
        }
        if ((i & 8) != 0) {
            j2 = gdd.c(j, hmlVar);
        }
        if ((i & 16) != 0) {
            f = 0.0f;
        }
        if ((i & 32) != 0) {
            f2 = 0.0f;
        }
        if ((i & 64) != 0) {
            dkyVar = null;
        }
        hpt hptVar = a;
        float f3 = f + ((kir) hmlVar.e(hptVar)).a;
        hnj.b(new hpu[]{gea.a.c(new ije(j2)), hptVar.c(new kir(f3))}, hxe.d(421772006, new gvg(icsVar, ikpVar, j, f3, dkyVar, f2, fdatVar), hmlVar), hmlVar, 56);
    }

    public static final void d(boolean z, fdae fdaeVar, ics icsVar, boolean z2, ikp ikpVar, long j, float f, dky dkyVar, ebk ebkVar, fdat fdatVar, hml hmlVar, int i) {
        hmw hmwVar;
        ics icsVar2 = (i & 4) != 0 ? ics.e : icsVar;
        boolean z3 = (!((i & 8) == 0)) | z2;
        ikp ikpVar2 = (i & 16) != 0 ? ikj.a : ikpVar;
        long j2 = (i & 32) != 0 ? glz.a(hmlVar).p : j;
        long jC = (i & 64) != 0 ? gdd.c(j2, hmlVar) : 0L;
        float f2 = (i & 256) != 0 ? 0.0f : f;
        dky dkyVar2 = (i & 512) != 0 ? null : dkyVar;
        ebk ebkVar2 = (i & 1024) == 0 ? ebkVar : null;
        if (ebkVar2 == null) {
            hmlVar.v(1528142344);
            hmwVar = (hmw) hmlVar;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new ebk();
                hmwVar.af(objS);
            }
            ebkVar2 = (ebk) objS;
        } else {
            hmlVar.v(-227800401);
            hmwVar = (hmw) hmlVar;
        }
        hmwVar.ab();
        hpt hptVar = a;
        float f3 = ((kir) hmlVar.e(hptVar)).a + 0.0f;
        hnj.b(new hpu[]{gea.a.c(new ije(jC)), hptVar.c(new kir(f3))}, hxe.d(1508735219, new gvi(icsVar2, ikpVar2, j2, f3, dkyVar2, z, ebkVar2, z3, fdaeVar, f2, fdatVar), hmlVar), hmlVar, 56);
    }

    public static final void e(fdae fdaeVar, ics icsVar, boolean z, ikp ikpVar, long j, long j2, float f, dky dkyVar, ebk ebkVar, fdat fdatVar, hml hmlVar, int i) {
        ics icsVar2 = (i & 2) != 0 ? ics.e : icsVar;
        boolean z2 = (!((i & 4) == 0)) | z;
        ikp ikpVar2 = (i & 8) != 0 ? ikj.a : ikpVar;
        long j3 = (i & 16) != 0 ? glz.a(hmlVar).p : j;
        long jC = (i & 32) != 0 ? gdd.c(j3, hmlVar) : j2;
        float f2 = (i & 128) != 0 ? 0.0f : f;
        dky dkyVar2 = (i & 256) != 0 ? null : dkyVar;
        ebk ebkVar2 = (i & 512) == 0 ? ebkVar : null;
        if (ebkVar2 == null) {
            hmlVar.v(-1701038196);
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = new ebk();
                hmlVar.y(objF);
            }
            ebkVar2 = (ebk) objF;
        } else {
            hmlVar.v(2023337131);
        }
        hmlVar.o();
        hpt hptVar = a;
        float f3 = ((kir) hmlVar.e(hptVar)).a + 0.0f;
        hnj.b(new hpu[]{gea.a.c(new ije(jC)), hptVar.c(new kir(f3))}, hxe.d(849208527, new gvh(icsVar2, ikpVar2, j3, f3, dkyVar2, ebkVar2, z2, fdaeVar, f2, fdatVar), hmlVar), hmlVar, 56);
    }
}
