package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class jus {
    public static final jus a;
    public static final jus b;
    public static final jus c;
    public static final jus d;
    public static final jus e;
    public static final jus f;
    public static final jus g;
    private static final /* synthetic */ jus[] h;

    static {
        jus jusVar = new jus("Paragraph", 0);
        a = jusVar;
        jus jusVar2 = new jus("Span", 1);
        b = jusVar2;
        jus jusVar3 = new jus("VerbatimTts", 2);
        c = jusVar3;
        jus jusVar4 = new jus("Url", 3);
        d = jusVar4;
        jus jusVar5 = new jus("Link", 4);
        e = jusVar5;
        jus jusVar6 = new jus("Clickable", 5);
        f = jusVar6;
        jus jusVar7 = new jus("String", 6);
        g = jusVar7;
        jus[] jusVarArr = {jusVar, jusVar2, jusVar3, jusVar4, jusVar5, jusVar6, jusVar7};
        h = jusVarArr;
        fczb.a(jusVarArr);
    }

    private jus(String str, int i) {
    }

    public static jus[] values() {
        return (jus[]) h.clone();
    }
}
