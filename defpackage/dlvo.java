package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlvo {
    public static final dlvo a;
    public static final dlvo b;
    private static final /* synthetic */ dlvo[] c;

    static {
        dlvo dlvoVar = new dlvo("MINIMUM", 0);
        a = dlvoVar;
        dlvo dlvoVar2 = new dlvo("MAXIMUM", 1);
        b = dlvoVar2;
        dlvo[] dlvoVarArr = {dlvoVar, dlvoVar2};
        c = dlvoVarArr;
        fczb.a(dlvoVarArr);
    }

    private dlvo(String str, int i) {
    }

    public static dlvo[] values() {
        return (dlvo[]) c.clone();
    }
}
