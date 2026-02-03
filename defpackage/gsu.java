package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class gsu {
    public static final gsu a;
    public static final gsu b;
    private static final /* synthetic */ gsu[] c;

    static {
        gsu gsuVar = new gsu("THUMB", 0);
        a = gsuVar;
        gsu gsuVar2 = new gsu("TRACK", 1);
        b = gsuVar2;
        gsu[] gsuVarArr = {gsuVar, gsuVar2};
        c = gsuVarArr;
        fczb.a(gsuVarArr);
    }

    private gsu(String str, int i) {
    }

    public static gsu[] values() {
        return (gsu[]) c.clone();
    }
}
