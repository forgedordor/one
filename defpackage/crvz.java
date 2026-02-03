package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crvz {
    public static final crvz a;
    public static final crvz b;
    public static final crvz c;
    public static final crvz d;
    public static final crvz e;
    public static final crvz f;
    private static final /* synthetic */ crvz[] g;

    static {
        crvz crvzVar = new crvz("UNKNOWN", 0);
        a = crvzVar;
        crvz crvzVar2 = new crvz("UNSUBSCRIBE_TOOLSTONE", 1);
        b = crvzVar2;
        crvz crvzVar3 = new crvz("TOMBSTONE_ANNOTATION", 2);
        c = crvzVar3;
        crvz crvzVar4 = new crvz("OVERFLOW_MENU", 3);
        d = crvzVar4;
        crvz crvzVar5 = new crvz("SEND_MESSAGE", 4);
        e = crvzVar5;
        crvz crvzVar6 = new crvz("INCOMING_MESSAGE", 5);
        f = crvzVar6;
        crvz[] crvzVarArr = {crvzVar, crvzVar2, crvzVar3, crvzVar4, crvzVar5, crvzVar6};
        g = crvzVarArr;
        fczb.a(crvzVarArr);
    }

    private crvz(String str, int i) {
    }

    public static crvz[] values() {
        return (crvz[]) g.clone();
    }
}
