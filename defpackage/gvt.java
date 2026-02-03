package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvt {
    public static final gvt a;
    public static final gvt b;
    public static final gvt c;
    private static final /* synthetic */ gvt[] d;

    static {
        gvt gvtVar = new gvt("StartToEnd", 0);
        a = gvtVar;
        gvt gvtVar2 = new gvt("EndToStart", 1);
        b = gvtVar2;
        gvt gvtVar3 = new gvt("Settled", 2);
        c = gvtVar3;
        gvt[] gvtVarArr = {gvtVar, gvtVar2, gvtVar3};
        d = gvtVarArr;
        fczb.a(gvtVarArr);
    }

    private gvt(String str, int i) {
    }

    public static gvt[] values() {
        return (gvt[]) d.clone();
    }
}
