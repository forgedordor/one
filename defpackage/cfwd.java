package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfwd {
    public static final cfwd a;
    public static final cfwd b;
    private static final /* synthetic */ cfwd[] c;

    static {
        cfwd cfwdVar = new cfwd("AVAILABLE", 0);
        a = cfwdVar;
        cfwd cfwdVar2 = new cfwd("UNAVAILABLE", 1);
        b = cfwdVar2;
        cfwd[] cfwdVarArr = {cfwdVar, cfwdVar2};
        c = cfwdVarArr;
        fczb.a(cfwdVarArr);
    }

    private cfwd(String str, int i) {
    }

    public static cfwd[] values() {
        return (cfwd[]) c.clone();
    }
}
