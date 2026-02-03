package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class gkt {
    public static final gkt a;
    public static final gkt b;
    private static final /* synthetic */ gkt[] c;

    static {
        gkt gktVar = new gkt("Selector", 0);
        a = gktVar;
        gkt gktVar2 = new gkt("InnerCircle", 1);
        b = gktVar2;
        gkt[] gktVarArr = {gktVar, gktVar2};
        c = gktVarArr;
        fczb.a(gktVarArr);
    }

    private gkt(String str, int i) {
    }

    public static gkt[] values() {
        return (gkt[]) c.clone();
    }
}
