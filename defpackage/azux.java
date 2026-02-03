package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azux {
    public static final azux a;
    public static final azux b;
    public static final azux c;
    public static final azux d;
    public static final /* synthetic */ fcza e;
    private static final /* synthetic */ azux[] g;
    public final long f;

    static {
        azux azuxVar = new azux("VERSION_60", 0, 60L);
        a = azuxVar;
        azux azuxVar2 = new azux("VERSION_100", 1, 100L);
        b = azuxVar2;
        azux azuxVar3 = new azux("VERSION_120", 2, 120L);
        c = azuxVar3;
        azux azuxVar4 = new azux("VERSION_150", 3, 150L);
        d = azuxVar4;
        azux[] azuxVarArr = {azuxVar, azuxVar2, azuxVar3, azuxVar4};
        g = azuxVarArr;
        e = fczb.a(azuxVarArr);
    }

    private azux(String str, int i, long j) {
        this.f = j;
    }

    public static azux[] values() {
        return (azux[]) g.clone();
    }
}
