package defpackage;

import java.nio.FloatBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euxs {
    public static final FloatBuffer a = euxv.b(0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    public static final FloatBuffer b;
    private static final euxr h;
    private static final euxr i;
    private static final euxr j;
    private static final euxr k;
    private static final euxr[] l;
    public int d;
    public int e;
    public int c = 0;
    public final float[] f = new float[16];
    public final boolean g = true;

    static {
        euxv.b(0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        euxr euxrVar = new euxr(-1.0f, -1.0f);
        h = euxrVar;
        euxr euxrVar2 = new euxr(1.0f, -1.0f);
        i = euxrVar2;
        euxr euxrVar3 = new euxr(-1.0f, 1.0f);
        j = euxrVar3;
        euxr euxrVar4 = new euxr(1.0f, 1.0f);
        k = euxrVar4;
        euxr[] euxrVarArr = {euxrVar, euxrVar2, euxrVar3, euxrVar4};
        l = euxrVarArr;
        b = a(euxrVarArr, 0, 1, 2, 3);
        a(euxrVarArr, 2, 0, 3, 1);
        a(euxrVarArr, 3, 2, 1, 0);
        a(euxrVarArr, 1, 3, 0, 2);
    }

    private static FloatBuffer a(euxr[] euxrVarArr, int i2, int i3, int i4, int i5) {
        euxr euxrVar = euxrVarArr[i2];
        float f = euxrVar.a;
        float f2 = euxrVar.b;
        euxr euxrVar2 = euxrVarArr[i3];
        float f3 = euxrVar2.a;
        float f4 = euxrVar2.b;
        euxr euxrVar3 = euxrVarArr[i4];
        float f5 = euxrVar3.a;
        float f6 = euxrVar3.b;
        euxr euxrVar4 = euxrVarArr[i5];
        return euxv.b(f, f2, f3, f4, f5, f6, euxrVar4.a, euxrVar4.b);
    }
}
