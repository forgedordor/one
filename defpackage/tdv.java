package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdv {
    public static final tdv a;
    public static final tdv b;
    private static final /* synthetic */ tdv[] c;

    static {
        tdv tdvVar = new tdv("UNKNOWN", 0);
        a = tdvVar;
        tdv tdvVar2 = new tdv("HIDDEN", 1);
        b = tdvVar2;
        tdv[] tdvVarArr = {tdvVar, tdvVar2};
        c = tdvVarArr;
        fczb.a(tdvVarArr);
    }

    private tdv(String str, int i) {
    }

    public static tdv[] values() {
        return (tdv[]) c.clone();
    }
}
