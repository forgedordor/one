package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfx {
    public static final dfx a;
    public static final dfx b;
    public static final dfx c;
    private static final /* synthetic */ dfx[] d;

    static {
        dfx dfxVar = new dfx("Default", 0);
        a = dfxVar;
        dfx dfxVar2 = new dfx("UserInput", 1);
        b = dfxVar2;
        dfx dfxVar3 = new dfx("PreventUserInput", 2);
        c = dfxVar3;
        dfx[] dfxVarArr = {dfxVar, dfxVar2, dfxVar3};
        d = dfxVarArr;
        fczb.a(dfxVarArr);
    }

    private dfx(String str, int i) {
    }

    public static dfx[] values() {
        return (dfx[]) d.clone();
    }
}
