package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epho implements ephi {
    public final etek a;
    public final etel b;

    public epho(etek etekVar, etel etelVar) {
        this.a = etekVar;
        this.b = etelVar;
    }

    public static etdn n(String str) {
        if (ejwk.c(str)) {
            return null;
        }
        etdn etdnVarB = etdn.b(str);
        return etdnVarB != null ? etdnVarB : etdn.ZZ;
    }

    public static int o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        if (i2 != 2) {
            return i2 != 3 ? 5 : 4;
        }
        return 3;
    }

    @Override // defpackage.ephi
    public final int a(String str) {
        throw null;
    }

    @Override // defpackage.ephi
    public final String b(ephf ephfVar, ephg ephgVar) {
        etfp etfpVar = ((ephn) ephfVar).a;
        int iOrdinal = ephgVar.ordinal();
        int i = 1;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                i = 3;
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw new RuntimeException(null, null);
                    }
                    i = 4;
                }
            } else {
                i = 2;
            }
        }
        return this.a.x(etfpVar, i);
    }

    @Override // defpackage.ephi
    public final String c(ephf ephfVar, String str) {
        throw null;
    }

    @Override // defpackage.ephi
    public final String d(ephf ephfVar) {
        throw null;
    }

    @Override // defpackage.ephi
    public final String e(int i) {
        throw null;
    }

    @Override // defpackage.ephi
    public final String f(ephf ephfVar) {
        throw null;
    }

    @Override // defpackage.ephi
    public final boolean g(ephf ephfVar) {
        return this.a.q(((ephn) ephfVar).a);
    }

    @Override // defpackage.ephi
    public final boolean h(String str, String str2) {
        throw null;
    }

    @Override // defpackage.ephi
    public final boolean i(ephf ephfVar) {
        throw null;
    }

    @Override // defpackage.ephi
    public final boolean j(ephf ephfVar) {
        etfp etfpVar = ((ephn) ephfVar).a;
        etek etekVar = this.a;
        etdn etdnVarD = etekVar.d(etfpVar);
        int i = etfpVar.c;
        etee eteeVarG = etekVar.g(i, etdnVarD);
        if (eteeVarG != null) {
            return (etek.g.equals(etdnVarD) || i == etekVar.a(etdnVarD)) && etekVar.v(etekVar.k(etfpVar), eteeVarG) != 12;
        }
        return false;
    }

    @Override // defpackage.ephi
    public final int k(ephf ephfVar, ephf ephfVar2) {
        throw null;
    }

    @Override // defpackage.ephi
    public final int l(String str, String str2) {
        throw null;
    }

    @Override // defpackage.ephi
    public final int m(ephf ephfVar) {
        throw null;
    }
}
