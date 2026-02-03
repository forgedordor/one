package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjz extends lfs {
    final /* synthetic */ kkt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjz(kkt kktVar) {
        super(1);
        this.a = kktVar;
    }

    @Override // defpackage.lfs
    public final lfr b(lgb lgbVar, lfr lfrVar) {
        jer jerVarW = this.a.w.w();
        if (jerVarW.u()) {
            long jC = kjc.c(ivz.a(jerVarW));
            int iA = kjb.a(jC);
            if (iA < 0) {
                iA = 0;
            }
            int iB = kjb.b(jC);
            if (iB < 0) {
                iB = 0;
            }
            long jG = ivz.g(jerVarW).g();
            long j = jG >> 32;
            long j2 = jG & 4294967295L;
            long j3 = jerVarW.c;
            long jC2 = kjc.c(jerVarW.j((Float.floatToRawIntBits((int) (j3 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j3 & 4294967295L)) & 4294967295L)));
            int iA2 = ((int) j) - kjb.a(jC2);
            if (iA2 < 0) {
                iA2 = 0;
            }
            int iB2 = ((int) j2) - kjb.b(jC2);
            int i = iB2 >= 0 ? iB2 : 0;
            if (iA != 0 || iB != 0 || iA2 != 0 || i != 0) {
                return new lfr(kkt.l(lfrVar.a, iA, iB, iA2, i), kkt.l(lfrVar.b, iA, iB, iA2, i));
            }
        }
        return lfrVar;
    }

    @Override // defpackage.lfs
    public final lgt c(lgt lgtVar, List list) {
        return this.a.j(lgtVar);
    }
}
