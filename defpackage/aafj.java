package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
final class aafj {
    public static final aafj a;
    public static final aafj b;
    public static final aafj c;
    private static final /* synthetic */ aafj[] d;

    static {
        aafj aafjVar = new aafj("STARTED", 0);
        a = aafjVar;
        aafj aafjVar2 = new aafj("STOPPED", 1);
        b = aafjVar2;
        aafj aafjVar3 = new aafj("CANCELLED", 2);
        c = aafjVar3;
        aafj[] aafjVarArr = {aafjVar, aafjVar2, aafjVar3};
        d = aafjVarArr;
        fczb.a(aafjVarArr);
    }

    private aafj(String str, int i) {
    }

    public static aafj[] values() {
        return (aafj[]) d.clone();
    }
}
