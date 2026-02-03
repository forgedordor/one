package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxiu {
    public static final dxiu a;
    public static final dxiu b;
    public static final dxiu c;
    private static final /* synthetic */ dxiu[] d;

    static {
        dxiu dxiuVar = new dxiu("INVALID", 0);
        a = dxiuVar;
        dxiu dxiuVar2 = new dxiu("SYSTEM_TRAY", 1);
        b = dxiuVar2;
        dxiu dxiuVar3 = new dxiu("IN_APP", 2);
        c = dxiuVar3;
        dxiu[] dxiuVarArr = {dxiuVar, dxiuVar2, dxiuVar3};
        d = dxiuVarArr;
        fczb.a(dxiuVarArr);
    }

    private dxiu(String str, int i) {
    }

    public static dxiu[] values() {
        return (dxiu[]) d.clone();
    }
}
