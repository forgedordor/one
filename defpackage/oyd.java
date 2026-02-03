package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oyd {
    public static final oyd a;
    public static final oyd b;
    public static final oyd c;
    public static final oyd d;
    public static final oyd e;
    public static final oyd f;
    final float[] g;
    final float[] h;
    final float[] i = {0.24f, 0.52f, 0.24f};
    final boolean j = true;

    static {
        oyd oydVar = new oyd();
        a = oydVar;
        e(oydVar);
        h(oydVar);
        oyd oydVar2 = new oyd();
        b = oydVar2;
        g(oydVar2);
        h(oydVar2);
        oyd oydVar3 = new oyd();
        c = oydVar3;
        d(oydVar3);
        h(oydVar3);
        oyd oydVar4 = new oyd();
        d = oydVar4;
        e(oydVar4);
        f(oydVar4);
        oyd oydVar5 = new oyd();
        e = oydVar5;
        g(oydVar5);
        f(oydVar5);
        oyd oydVar6 = new oyd();
        f = oydVar6;
        d(oydVar6);
        f(oydVar6);
    }

    public oyd() {
        float[] fArr = new float[3];
        this.g = fArr;
        float[] fArr2 = new float[3];
        this.h = fArr2;
        i(fArr);
        i(fArr2);
    }

    private static void d(oyd oydVar) {
        float[] fArr = oydVar.h;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    private static void e(oyd oydVar) {
        float[] fArr = oydVar.h;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    private static void f(oyd oydVar) {
        float[] fArr = oydVar.g;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    private static void g(oyd oydVar) {
        float[] fArr = oydVar.h;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    private static void h(oyd oydVar) {
        float[] fArr = oydVar.g;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    private static void i(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    public final float a() {
        return this.i[1];
    }

    public final float b() {
        return this.i[2];
    }

    public final float c() {
        return this.i[0];
    }
}
