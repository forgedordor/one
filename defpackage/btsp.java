package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btsp {
    public static final btsp a;
    public static final btsp b;
    private static final /* synthetic */ btsp[] c;

    static {
        btsp btspVar = new btsp("DATABASE", 0);
        a = btspVar;
        btsp btspVar2 = new btsp("ATTACHMENT", 1);
        b = btspVar2;
        btsp[] btspVarArr = {btspVar, btspVar2};
        c = btspVarArr;
        fczb.a(btspVarArr);
    }

    private btsp(String str, int i) {
    }

    public static btsp[] values() {
        return (btsp[]) c.clone();
    }
}
