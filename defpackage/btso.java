package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btso {
    public static final btso a;
    public static final btso b;
    public static final btso c;
    private static final /* synthetic */ btso[] d;

    static {
        btso btsoVar = new btso("COPIED", 0);
        a = btsoVar;
        btso btsoVar2 = new btso("RESTORED", 1);
        b = btsoVar2;
        btso btsoVar3 = new btso("FAILED", 2);
        c = btsoVar3;
        btso[] btsoVarArr = {btsoVar, btsoVar2, btsoVar3};
        d = btsoVarArr;
        fczb.a(btsoVarArr);
    }

    private btso(String str, int i) {
    }

    public static btso[] values() {
        return (btso[]) d.clone();
    }
}
