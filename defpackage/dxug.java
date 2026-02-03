package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxug {
    public static final dxug a;
    public static final dxug b;
    public static final dxug c;
    public static final dxug d;
    public static final dxug e;
    public static final dxug f;
    private static final /* synthetic */ dxug[] g;

    static {
        dxug dxugVar = new dxug("DEFAULT", 0);
        a = dxugVar;
        dxug dxugVar2 = new dxug("TV", 1);
        b = dxugVar2;
        dxug dxugVar3 = new dxug("WEARABLE", 2);
        c = dxugVar3;
        dxug dxugVar4 = new dxug("AUTOMOTIVE", 3);
        d = dxugVar4;
        dxug dxugVar5 = new dxug("BATTLESTAR", 4);
        e = dxugVar5;
        dxug dxugVar6 = new dxug("CHROME_OS", 5);
        f = dxugVar6;
        dxug[] dxugVarArr = {dxugVar, dxugVar2, dxugVar3, dxugVar4, dxugVar5, dxugVar6};
        g = dxugVarArr;
        fczb.a(dxugVarArr);
    }

    private dxug(String str, int i) {
    }

    public static dxug[] values() {
        return (dxug[]) g.clone();
    }
}
