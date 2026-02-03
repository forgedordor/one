package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwus {
    public static final bwus a;
    public static final bwus b;
    public static final bwus c;
    private static final /* synthetic */ bwus[] d;

    static {
        bwus bwusVar = new bwus("NONE", 0);
        a = bwusVar;
        bwus bwusVar2 = new bwus("ONE_ON_ONE", 1);
        b = bwusVar2;
        bwus bwusVar3 = new bwus("GROUP", 2);
        c = bwusVar3;
        bwus[] bwusVarArr = {bwusVar, bwusVar2, bwusVar3};
        d = bwusVarArr;
        fczb.a(bwusVarArr);
    }

    private bwus(String str, int i) {
    }

    public static bwus[] values() {
        return (bwus[]) d.clone();
    }
}
