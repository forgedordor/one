package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jcz extends jaj {
    public jcz(jak jakVar) {
        super(jakVar);
    }

    @Override // defpackage.jaj
    protected final int a(jer jerVar, itz itzVar) {
        jdf jdfVarC = jerVar.C();
        jdfVarC.getClass();
        return jdfVarC.ei(itzVar);
    }

    @Override // defpackage.jaj
    protected final long b(jer jerVar, long j) {
        jdf jdfVarC = jerVar.C();
        jdfVarC.getClass();
        long j2 = jdfVarC.h;
        int iA = kjb.a(j2);
        int iB = kjb.b(j2);
        return ihs.e((Float.floatToRawIntBits(iA) << 32) | (Float.floatToRawIntBits(iB) & 4294967295L), j);
    }

    @Override // defpackage.jaj
    protected final Map c(jer jerVar) {
        jdf jdfVarC = jerVar.C();
        jdfVarC.getClass();
        return jdfVarC.K().m();
    }
}
