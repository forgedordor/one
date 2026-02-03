package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class kji {
    public static final kji a;
    public static final kji b;
    private static final /* synthetic */ kji[] c;

    static {
        kji kjiVar = new kji("Ltr", 0);
        a = kjiVar;
        kji kjiVar2 = new kji("Rtl", 1);
        b = kjiVar2;
        kji[] kjiVarArr = {kjiVar, kjiVar2};
        c = kjiVarArr;
        fczb.a(kjiVarArr);
    }

    private kji(String str, int i) {
    }

    public static kji[] values() {
        return (kji[]) c.clone();
    }
}
