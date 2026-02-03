package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ausm {
    public static final ausm a;
    public static final ausm b;
    public static final ausm c;
    public static final ausm d;
    private static final /* synthetic */ ausm[] f;
    public final int e;

    static {
        ausm ausmVar = new ausm("UNKNOWN", 0, 0);
        a = ausmVar;
        ausm ausmVar2 = new ausm("MISSING_LSKF_MEMBERS", 1, 1);
        b = ausmVar2;
        ausm ausmVar3 = new ausm("EXISTS_USABLE_LSKF", 2, 2);
        c = ausmVar3;
        ausm ausmVar4 = new ausm("USER_OUT_OF_ATTEMPTS", 3, 3);
        d = ausmVar4;
        ausm[] ausmVarArr = {ausmVar, ausmVar2, ausmVar3, ausmVar4};
        f = ausmVarArr;
        fczb.a(ausmVarArr);
    }

    private ausm(String str, int i, int i2) {
        this.e = i2;
    }

    public static ausm[] values() {
        return (ausm[]) f.clone();
    }
}
