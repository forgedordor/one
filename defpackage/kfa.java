package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class kfa {
    public static final kfa a;
    public static final kfa b;
    public static final kfa c;
    public static final kfa d;
    private static final /* synthetic */ kfa[] e;

    static {
        kfa kfaVar = new kfa("StartInput", 0);
        a = kfaVar;
        kfa kfaVar2 = new kfa("StopInput", 1);
        b = kfaVar2;
        kfa kfaVar3 = new kfa("ShowKeyboard", 2);
        c = kfaVar3;
        kfa kfaVar4 = new kfa("HideKeyboard", 3);
        d = kfaVar4;
        kfa[] kfaVarArr = {kfaVar, kfaVar2, kfaVar3, kfaVar4};
        e = kfaVarArr;
        fczb.a(kfaVarArr);
    }

    private kfa(String str, int i) {
    }

    public static kfa[] values() {
        return (kfa[]) e.clone();
    }
}
