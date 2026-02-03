package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddu {
    public static final /* synthetic */ int a = 0;
    private static final dgi b = dea.b(0.0f, 0.0f, null, 7);
    private static final dgi c;
    private static final dgi d;

    static {
        ihu ihuVar = djm.a;
        c = dea.b(0.0f, 0.0f, new kir(0.1f), 3);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        d = dea.b(0.0f, 0.0f, 1, 3);
    }

    public static final hsf a(final Object obj, dib dibVar, ddz ddzVar, Object obj2, fdap fdapVar, hml hmlVar, int i, int i2) {
        if ((i2 & 4) != 0) {
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = dea.b(0.0f, 0.0f, null, 7);
                hmlVar.y(objF);
            }
            ddzVar = (dgi) objF;
        }
        if ((i2 & 8) != 0) {
            obj2 = null;
        }
        Object objF2 = hmlVar.f();
        Object obj3 = hmk.a;
        if (objF2 == obj3) {
            Object hplVar = new hpl(null, hsi.a);
            hmlVar.y(hplVar);
            objF2 = hplVar;
        }
        hox hoxVar = (hox) objF2;
        Object objF3 = hmlVar.f();
        if (objF3 == obj3) {
            objF3 = new ddp(obj, dibVar, obj2);
            hmlVar.y(objF3);
        }
        ddp ddpVar = (ddp) objF3;
        hsf hsfVarA = hsc.a(fdapVar, hmlVar);
        if (obj2 != null && (ddzVar instanceof dgi)) {
            dgi dgiVar = (dgi) ddzVar;
            if (!fdbq.f(dgiVar.c, obj2)) {
                ddzVar = new dgi(dgiVar.a, dgiVar.b, obj2);
            }
        }
        hsf hsfVarA2 = hsc.a(ddzVar, hmlVar);
        Object objF4 = hmlVar.f();
        if (objF4 == obj3) {
            objF4 = fdod.a(-1, 0, 6);
            hmlVar.y(objF4);
        }
        final fdoa fdoaVar = (fdoa) objF4;
        boolean zF = hmlVar.F(fdoaVar) | ((((i & 14) ^ 6) > 4 && hmlVar.F(obj)) || (6 & i) == 4);
        Object objF5 = hmlVar.f();
        if (zF || objF5 == obj3) {
            objF5 = new fdae() { // from class: ddr
                @Override // defpackage.fdae
                public final Object invoke() {
                    int i3 = ddu.a;
                    fdoaVar.b(obj);
                    return fctx.a;
                }
            };
            hmlVar.y(objF5);
        }
        hob.i((fdae) objF5, hmlVar);
        boolean zF2 = hmlVar.F(fdoaVar) | hmlVar.F(ddpVar) | hmlVar.D(hsfVarA2) | hmlVar.D(hsfVarA);
        Object objF6 = hmlVar.f();
        if (zF2 || objF6 == obj3) {
            Object ddtVar = new ddt(fdoaVar, ddpVar, hsfVarA2, hsfVarA, null);
            hmlVar.y(ddtVar);
            objF6 = ddtVar;
        }
        hob.g(fdoaVar, (fdat) objF6, hmlVar);
        hsf hsfVar = (hsf) hoxVar.a();
        return hsfVar == null ? ddpVar.a : hsfVar;
    }

    public static final hsf b(float f, ddz ddzVar, hml hmlVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            ddzVar = c;
        }
        ddz ddzVar2 = ddzVar;
        kir kirVar = new kir(f);
        int i3 = i & 14;
        int i4 = i << 3;
        return a(kirVar, diu.c, ddzVar2, null, null, hmlVar, i3 | (i4 & 896) | (57344 & (i << 6)), 8);
    }

    public static final hsf c(float f, ddz ddzVar, fdap fdapVar, hml hmlVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            ddzVar = b;
        }
        float f2 = (i2 & 4) != 0 ? 0.01f : 0.0f;
        if ((i2 & 16) != 0) {
            fdapVar = null;
        }
        fdap fdapVar2 = fdapVar;
        if (ddzVar == b) {
            hmlVar.v(1144107839);
            boolean z = true;
            if ((((i & 896) ^ 384) <= 256 || !hmlVar.A(f2)) && (i & 384) != 256) {
                z = false;
            }
            Object objF = hmlVar.f();
            if (z || objF == hmk.a) {
                objF = dea.b(0.0f, 0.0f, Float.valueOf(f2), 3);
                hmlVar.y(objF);
            }
            ddzVar = (dgi) objF;
            hmlVar.o();
        } else {
            hmlVar.v(1144217765);
            hmlVar.o();
        }
        int i3 = i << 3;
        return a(Float.valueOf(f), diu.a, ddzVar, Float.valueOf(f2), fdapVar2, hmlVar, (i & 14) | (i3 & 7168) | (i3 & 57344), 0);
    }

    public static final hsf d(int i, ddz ddzVar, fdap fdapVar, hml hmlVar, int i2, int i3) {
        if ((i3 & 2) != 0) {
            ddzVar = d;
        }
        ddz ddzVar2 = ddzVar;
        if ((i3 & 8) != 0) {
            fdapVar = null;
        }
        fdap fdapVar2 = fdapVar;
        int i4 = i2 << 6;
        return a(Integer.valueOf(i), diu.b, ddzVar2, null, fdapVar2, hmlVar, (i2 & 14) | ((i2 << 3) & 896) | (57344 & i4) | (458752 & i4), 8);
    }
}
