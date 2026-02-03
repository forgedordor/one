package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chah {
    public static final chah a;
    public static final chah b;
    private static final /* synthetic */ chah[] c;

    static {
        chah chahVar = new chah("NOT_MET", 0);
        a = chahVar;
        chah chahVar2 = new chah("MET", 1);
        b = chahVar2;
        chah[] chahVarArr = {chahVar, chahVar2};
        c = chahVarArr;
        fczb.a(chahVarArr);
    }

    private chah(String str, int i) {
    }

    public static chah[] values() {
        return (chah[]) c.clone();
    }
}
