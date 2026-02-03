package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqef {
    public static final eqef a;
    public static final eqef b;
    public static final eqef c;
    private static final /* synthetic */ eqef[] d;

    static {
        eqef eqefVar = new eqef("UNKNOWN", 0);
        a = eqefVar;
        eqef eqefVar2 = new eqef("DEFAULT", 1);
        b = eqefVar2;
        eqef eqefVar3 = new eqef("ADMINISTRATED", 2);
        c = eqefVar3;
        eqef[] eqefVarArr = {eqefVar, eqefVar2, eqefVar3};
        d = eqefVarArr;
        fczb.a(eqefVarArr);
    }

    private eqef(String str, int i) {
    }

    public static eqef[] values() {
        return (eqef[]) d.clone();
    }

    public final boolean a(eqdo eqdoVar) {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return eqdn.d != ((eqdf) eqdoVar).a;
            }
            if (iOrdinal != 2) {
                throw null;
            }
        }
        return true;
    }
}
