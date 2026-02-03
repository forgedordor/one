package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vwl {
    public static final vwl a;
    public static final vwl b;
    public static final vwl c;
    public static final vwl d;
    private static final /* synthetic */ vwl[] e;

    static {
        vwl vwlVar = new vwl("CONVERSATION_COMPOSE_ROW", 0);
        a = vwlVar;
        vwl vwlVar2 = new vwl("DIRECT_SEND", 1);
        b = vwlVar2;
        vwl vwlVar3 = new vwl("SMART_REPLY", 2);
        c = vwlVar3;
        vwl vwlVar4 = new vwl("MEDIA_VIEWER", 3);
        d = vwlVar4;
        vwl[] vwlVarArr = {vwlVar, vwlVar2, vwlVar3, vwlVar4};
        e = vwlVarArr;
        fczb.a(vwlVarArr);
    }

    private vwl(String str, int i) {
    }

    public static vwl[] values() {
        return (vwl[]) e.clone();
    }
}
