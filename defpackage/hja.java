package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class hja {
    public static final hja a;
    public static final hja b;
    public static final hja c;
    private static final /* synthetic */ hja[] d;

    static {
        hja hjaVar = new hja("Focused", 0);
        a = hjaVar;
        hja hjaVar2 = new hja("UnfocusedEmpty", 1);
        b = hjaVar2;
        hja hjaVar3 = new hja("UnfocusedNotEmpty", 2);
        c = hjaVar3;
        hja[] hjaVarArr = {hjaVar, hjaVar2, hjaVar3};
        d = hjaVarArr;
        fczb.a(hjaVarArr);
    }

    private hja(String str, int i) {
    }

    public static hja[] values() {
        return (hja[]) d.clone();
    }
}
