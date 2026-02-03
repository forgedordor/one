package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvc {
    public static final gvc a;
    public static final gvc b;
    private static final /* synthetic */ gvc[] c;

    static {
        gvc gvcVar = new gvc("Dismissed", 0);
        a = gvcVar;
        gvc gvcVar2 = new gvc("ActionPerformed", 1);
        b = gvcVar2;
        gvc[] gvcVarArr = {gvcVar, gvcVar2};
        c = gvcVarArr;
        fczb.a(gvcVarArr);
    }

    private gvc(String str, int i) {
    }

    public static gvc[] values() {
        return (gvc[]) c.clone();
    }
}
