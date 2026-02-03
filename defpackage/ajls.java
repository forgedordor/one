package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajls {
    public static final ajls a;
    public static final ajls b;
    private static final /* synthetic */ ajls[] c;

    static {
        ajls ajlsVar = new ajls("SIMPLE", 0);
        a = ajlsVar;
        ajls ajlsVar2 = new ajls("RICH", 1);
        b = ajlsVar2;
        ajls[] ajlsVarArr = {ajlsVar, ajlsVar2};
        c = ajlsVarArr;
        fczb.a(ajlsVarArr);
    }

    private ajls(String str, int i) {
    }

    public static ajls[] values() {
        return (ajls[]) c.clone();
    }
}
