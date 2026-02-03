package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ilo {
    private static final imp A;
    private static final imp B;
    public static final float[] a;
    public static final float[] b;
    public static final imp c;
    public static final imp d;
    public static final imn e;
    public static final imn f;
    public static final imn g;
    public static final imn h;
    public static final imn i;
    public static final imn j;
    public static final imn k;
    public static final imn l;
    public static final imn m;
    public static final imn n;
    public static final imn o;
    public static final imn p;
    public static final imn q;
    public static final imn r;
    public static final ilg s;
    public static final ilg t;
    public static final imn u;
    public static final imn v;
    public static final imn w;
    public static final ilg x;
    public static final ilg[] y;
    private static final float[] z;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        z = fArr3;
        imp impVar = new imp(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        A = impVar;
        imp impVar2 = new imp(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        B = impVar2;
        imp impVar3 = new imp(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = impVar3;
        imp impVar4 = new imp(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = impVar4;
        imq imqVar = ilu.a;
        imn imnVar = new imn("sRGB IEC61966-2.1", fArr, ilu.d, impVar, 0);
        e = imnVar;
        imn imnVar2 = new imn("sRGB IEC61966-2.1 (Linear)", fArr, ilu.d, 1.0d, 0.0f, 1.0f, 1);
        f = imnVar2;
        imn imnVar3 = new imn("scRGB-nl IEC 61966-2-2:2003", fArr, ilu.d, null, new ilt() { // from class: ili
            @Override // defpackage.ilt
            public final double a(double d2) {
                float[] fArr4 = ilo.a;
                return Math.copySign(ilh.a(d2 < 0.0d ? -d2 : d2, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d), d2);
            }
        }, new ilt() { // from class: ilj
            @Override // defpackage.ilt
            public final double a(double d2) {
                float[] fArr4 = ilo.a;
                return Math.copySign(ilh.b(d2 < 0.0d ? -d2 : d2, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d), d2);
            }
        }, -0.799f, 2.399f, impVar, 2);
        g = imnVar3;
        imn imnVar4 = new imn("scRGB IEC 61966-2-2:2003", fArr, ilu.d, 1.0d, -0.5f, 7.499f, 3);
        h = imnVar4;
        imn imnVar5 = new imn("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, ilu.d, new imp(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = imnVar5;
        imn imnVar6 = new imn("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, ilu.d, new imp(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = imnVar6;
        imn imnVar7 = new imn("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new imq(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = imnVar7;
        imn imnVar8 = new imn("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, ilu.d, impVar, 7);
        l = imnVar8;
        imn imnVar9 = new imn("NTSC (1953)", fArr2, ilu.a, new imp(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        m = imnVar9;
        imn imnVar10 = new imn("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, ilu.d, new imp(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        n = imnVar10;
        imn imnVar11 = new imn("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, ilu.d, 2.2d, 0.0f, 1.0f, 10);
        o = imnVar11;
        imn imnVar12 = new imn("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, ilu.b, new imp(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = imnVar12;
        imn imnVar13 = new imn("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, ilu.c, 1.0d, -65504.0f, 65504.0f, 12);
        q = imnVar13;
        imn imnVar14 = new imn("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, ilu.c, 1.0d, -65504.0f, 65504.0f, 13);
        r = imnVar14;
        imr imrVar = new imr();
        s = imrVar;
        ilv ilvVar = new ilv();
        t = ilvVar;
        imn imnVar15 = new imn("None", fArr, ilu.d, impVar2, 16);
        u = imnVar15;
        imn imnVar16 = new imn("Hybrid Log Gamma encoding", fArr3, ilu.d, null, new ilt() { // from class: ilk
            @Override // defpackage.ilt
            public final double a(double d2) {
                return ilo.b(ilo.c, d2);
            }
        }, new ilt() { // from class: ill
            @Override // defpackage.ilt
            public final double a(double d2) {
                return ilo.a(ilo.c, d2);
            }
        }, 0.0f, 1.0f, impVar3, 17);
        v = imnVar16;
        imn imnVar17 = new imn("Perceptual Quantizer encoding", fArr3, ilu.d, null, new ilt() { // from class: ilm
            @Override // defpackage.ilt
            public final double a(double d2) {
                return ilo.d(ilo.d, d2);
            }
        }, new ilt() { // from class: iln
            @Override // defpackage.ilt
            public final double a(double d2) {
                return ilo.c(ilo.d, d2);
            }
        }, 0.0f, 1.0f, impVar4, 18);
        w = imnVar17;
        ilw ilwVar = new ilw();
        x = ilwVar;
        y = new ilg[]{imnVar, imnVar2, imnVar3, imnVar4, imnVar5, imnVar6, imnVar7, imnVar8, imnVar9, imnVar10, imnVar11, imnVar12, imnVar13, imnVar14, imrVar, ilvVar, imnVar15, imnVar16, imnVar17, ilwVar};
    }

    public static final double a(imp impVar, double d2) {
        double dExp;
        double d3 = impVar.g + 1.0d;
        double d4 = d2 < 0.0d ? -1.0d : 1.0d;
        double d5 = d2 * d4;
        double d6 = impVar.b * d5;
        if (d6 <= 1.0d) {
            dExp = Math.pow(d6, impVar.c);
        } else {
            dExp = Math.exp((d5 - impVar.f) * impVar.d) + impVar.e;
        }
        return d3 * d4 * dExp;
    }

    public static final double b(imp impVar, double d2) {
        double d3 = 1.0d / impVar.b;
        double d4 = 1.0d / impVar.c;
        double d5 = 1.0d / impVar.d;
        double d6 = impVar.g + 1.0d;
        double d7 = d2 < 0.0d ? -1.0d : 1.0d;
        double d8 = (d2 * d7) / d6;
        return d7 * (d8 <= 1.0d ? d3 * Math.pow(d8, d4) : impVar.f + (d5 * Math.log(d8 - impVar.e)));
    }

    public static final double c(imp impVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = impVar.d;
        return d3 * Math.pow(fddu.a(impVar.b + (impVar.c * Math.pow(d4, d5)), 0.0d) / (impVar.e + (impVar.f * Math.pow(d4, d5))), impVar.g);
    }

    public static final double d(imp impVar, double d2) {
        double d3 = -impVar.b;
        double d4 = 1.0d / impVar.g;
        double d5 = -impVar.f;
        double d6 = 1.0d / impVar.d;
        double d7 = d2 < 0.0d ? -1.0d : 1.0d;
        double d8 = d2 * d7;
        return d7 * Math.pow(Math.max(d3 + (impVar.e * Math.pow(d8, d4)), 0.0d) / (impVar.c + (d5 * Math.pow(d8, d4))), d6);
    }
}
