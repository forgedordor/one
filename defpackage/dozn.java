package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dozn {
    public static final dozn a;
    public static final dozn b;
    public static final dozn c;
    private static final /* synthetic */ dozn[] d;

    static {
        dozn doznVar = new dozn("RECENTS", 0);
        a = doznVar;
        dozn doznVar2 = new dozn("FAVORITES", 1);
        b = doznVar2;
        dozn doznVar3 = new dozn("ALL_PACKS", 2);
        c = doznVar3;
        dozn[] doznVarArr = {doznVar, doznVar2, doznVar3};
        d = doznVarArr;
        fczb.a(doznVarArr);
    }

    private dozn(String str, int i) {
    }

    public static dozn[] values() {
        return (dozn[]) d.clone();
    }
}
