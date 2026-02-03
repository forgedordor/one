package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class qqq {
    public static /* synthetic */ Object a(qqr qqrVar, qnm qnmVar, float f, fcxy fcxyVar, int i) {
        if ((i & 1) != 0) {
            qnmVar = qqrVar.j();
        }
        return qqrVar.c(qnmVar, f, f != qqrVar.e(), fcxyVar);
    }

    public static /* synthetic */ Object b(qqr qqrVar, qnm qnmVar, int i, float f, qrn qrnVar, float f2, int i2, fcxy fcxyVar, int i3) {
        int iG = (i3 & 2) != 0 ? qqrVar.g() : 0;
        if ((i3 & 4) != 0) {
            i = qqrVar.h();
        }
        int i4 = i;
        boolean zP = (i3 & 8) != 0 ? qqrVar.p() : false;
        float f3 = (i3 & 16) != 0 ? qqrVar.f() : f;
        qrn qrnVarK = (i3 & 32) != 0 ? qqrVar.k() : qrnVar;
        return qqrVar.b(qnmVar, iG, i4, zP, f3, qrnVarK, (i3 & 64) != 0 ? qrb.a(qnmVar, qrnVarK, f3) : f2, (((i3 & 256) == 0 ? 1 : 0) ^ 1) | i2, fcxyVar);
    }
}
