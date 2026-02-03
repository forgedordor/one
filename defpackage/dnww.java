package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnww {
    public static final dnww a;
    public static final dnww b;
    public static final dnww c;
    private static final /* synthetic */ dnww[] d;

    static {
        dnww dnwwVar = new dnww("CANCELED", 0);
        a = dnwwVar;
        dnww dnwwVar2 = new dnww("ERROR", 1);
        b = dnwwVar2;
        dnww dnwwVar3 = new dnww("SENT", 2);
        c = dnwwVar3;
        dnww[] dnwwVarArr = {dnwwVar, dnwwVar2, dnwwVar3};
        d = dnwwVarArr;
        fczb.a(dnwwVarArr);
    }

    private dnww(String str, int i) {
    }

    public static dnww[] values() {
        return (dnww[]) d.clone();
    }
}
