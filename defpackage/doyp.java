package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doyp {
    public static final dohm a(etyb etybVar) {
        int iB = etxz.b(etybVar.e);
        if (iB == 0) {
            iB = 1;
        }
        int i = iB - 2;
        return i != 1 ? i != 2 ? i != 3 ? dohm.b : dogt.a : dohd.a : dohj.a;
    }

    public static final doau b(etyp etypVar) {
        etyb etybVar = etypVar.e;
        if (etybVar == null) {
            etybVar = etyb.a;
        }
        if (etybVar == null) {
            return null;
        }
        doin doinVar = doin.d;
        dohm dohmVarA = a(etybVar);
        String str = etybVar.c;
        str.getClass();
        etxy etxyVar = etybVar.f;
        if (etxyVar == null) {
            etxyVar = etxy.a;
        }
        int i = etxyVar.b;
        etxy etxyVar2 = etybVar.f;
        if (etxyVar2 == null) {
            etxyVar2 = etxy.a;
        }
        return new doau(doinVar, dohmVarA, str, i, etxyVar2.c, 100L, doys.a);
    }
}
