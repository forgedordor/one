package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqdm {
    public static final eqdm a;
    public static final eqdm b;
    public static final eqdm c;
    private static final /* synthetic */ eqdm[] d;

    static {
        eqdm eqdmVar = new eqdm("UNKNOWN_RENAMING_POLICY", 0);
        a = eqdmVar;
        eqdm eqdmVar2 = new eqdm("NO_RENAMING_ALLOWED", 1);
        b = eqdmVar2;
        eqdm eqdmVar3 = new eqdm("RENAMING_ALLOWED", 2);
        c = eqdmVar3;
        eqdm[] eqdmVarArr = {eqdmVar, eqdmVar2, eqdmVar3};
        d = eqdmVarArr;
        fczb.a(eqdmVarArr);
    }

    private eqdm(String str, int i) {
    }

    public static eqdm[] values() {
        return (eqdm[]) d.clone();
    }
}
