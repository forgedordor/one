package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nmi {
    public static final float[] a = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] b = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] c = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public int d;
    public nmh e;
    public met f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    public static boolean a(nmf nmfVar) {
        nmd nmdVar = nmfVar.a;
        if (nmdVar.a() != 1 || nmdVar.b().a != 0) {
            return false;
        }
        nmd nmdVar2 = nmfVar.b;
        return nmdVar2.a() == 1 && nmdVar2.b().a == 0;
    }
}
