package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnlw {
    public static final dnlw a;
    public static final dnlw b;
    public static final dnlw c;
    private static final /* synthetic */ dnlw[] d;

    static {
        dnlw dnlwVar = new dnlw("PER_EMOJI", 0);
        a = dnlwVar;
        dnlw dnlwVar2 = new dnlw("PER_GROUP", 1);
        b = dnlwVar2;
        dnlw dnlwVar3 = new dnlw("GLOBAL", 2);
        c = dnlwVar3;
        dnlw[] dnlwVarArr = {dnlwVar, dnlwVar2, dnlwVar3};
        d = dnlwVarArr;
        fczb.a(dnlwVarArr);
    }

    private dnlw(String str, int i) {
    }

    public static dnlw[] values() {
        return (dnlw[]) d.clone();
    }
}
