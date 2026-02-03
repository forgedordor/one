package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aujh {
    public static final aujh a;
    public static final aujh b;
    public static final aujh c;
    public static final aujh d;
    private static final /* synthetic */ aujh[] e;

    static {
        aujh aujhVar = new aujh("RECOVERY_SUCCESSFUL", 0);
        a = aujhVar;
        aujh aujhVar2 = new aujh("RECOVERY_SUCCESSFUL_NO_RETRY", 1);
        b = aujhVar2;
        aujh aujhVar3 = new aujh("RECOVERY_FAILED_TRANSIENTLY", 2);
        c = aujhVar3;
        aujh aujhVar4 = new aujh("RECOVERY_FAILED_PERMANENTLY", 3);
        d = aujhVar4;
        aujh[] aujhVarArr = {aujhVar, aujhVar2, aujhVar3, aujhVar4};
        e = aujhVarArr;
        fczb.a(aujhVarArr);
    }

    private aujh(String str, int i) {
    }

    public static aujh[] values() {
        return (aujh[]) e.clone();
    }
}
