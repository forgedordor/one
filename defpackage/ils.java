package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ils {
    public static final cuh a;

    static {
        float[] fArr = ilo.a;
        imn imnVar = ilo.e;
        int i = imnVar.c;
        ilp ilpVar = new ilp(imnVar);
        imn imnVar2 = ilo.e;
        int i2 = imnVar2.c;
        ilg ilgVar = ilo.x;
        int i3 = i2 | (ilgVar.c << 6);
        ilr ilrVar = new ilr(imnVar2, ilgVar);
        ilg ilgVar2 = ilo.x;
        int i4 = ilgVar2.c;
        imn imnVar3 = ilo.e;
        int i5 = i4 | (imnVar3.c << 6);
        ilr ilrVar2 = new ilr(ilgVar2, imnVar3);
        cuh cuhVar = ctk.a;
        cuh cuhVar2 = new cuh((byte[]) null);
        cuhVar2.f(i | (i << 6), ilpVar);
        cuhVar2.f(i3, ilrVar);
        cuhVar2.f(i5, ilrVar2);
        a = cuhVar2;
    }
}
