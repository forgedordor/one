package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class antw {
    public static final antw a;
    public static final antw b;
    public static final antw c;
    public static final antw d;
    public static final antw e;
    public static final antw f;
    private static final /* synthetic */ antw[] h;
    public final int g;

    static {
        antw antwVar = new antw("UNKNOWN", 0, 0);
        a = antwVar;
        antw antwVar2 = new antw("CAN_SHARE", 1, 1);
        b = antwVar2;
        antw antwVar3 = new antw("CANNOT_SHARE", 2, 2);
        c = antwVar3;
        antw antwVar4 = new antw("SHOULD_NOT_SHARE", 3, 3);
        d = antwVar4;
        antw antwVar5 = new antw("SHARING", 4, 4);
        e = antwVar5;
        antw antwVar6 = new antw("SHOULD_SHARE_AGAIN", 5, 5);
        f = antwVar6;
        antw[] antwVarArr = {antwVar, antwVar2, antwVar3, antwVar4, antwVar5, antwVar6};
        h = antwVarArr;
        fczb.a(antwVarArr);
    }

    private antw(String str, int i, int i2) {
        this.g = i2;
    }

    public static antw[] values() {
        return (antw[]) h.clone();
    }
}
