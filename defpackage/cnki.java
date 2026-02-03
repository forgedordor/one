package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnki {
    private final cqbm a;

    public cnki(cqbm cqbmVar) {
        this.a = cqbmVar;
    }

    public final int a() {
        ekhx ekhxVarH = ((cqey) this.a.a()).h();
        if (ekhxVarH.isEmpty()) {
            return 2;
        }
        if (ekhxVarH.contains(cqex.CELLULAR)) {
            return 3;
        }
        if (ekhxVarH.contains(cqex.WIFI)) {
            return 4;
        }
        return ekhxVarH.contains(cqex.ETHERNET) ? 5 : 1;
    }
}
