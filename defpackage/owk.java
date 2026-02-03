package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class owk {
    public static final owk a;
    public static final owk b;
    private static final /* synthetic */ owk[] c;

    static {
        owk owkVar = new owk("LAUNCH_INITIAL_REFRESH", 0);
        a = owkVar;
        owk owkVar2 = new owk("SKIP_INITIAL_REFRESH", 1);
        b = owkVar2;
        owk[] owkVarArr = {owkVar, owkVar2};
        c = owkVarArr;
        fczb.a(owkVarArr);
    }

    private owk(String str, int i) {
    }

    public static owk[] values() {
        return (owk[]) c.clone();
    }
}
