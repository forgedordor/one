package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abzf {
    public static final abzf a;
    public static final abzf b;
    public static final abzf c;
    public static final abzf d;
    public static final abzf e;
    private static final /* synthetic */ abzf[] f;

    static {
        abzf abzfVar = new abzf("NOT_SIGNED_IN", 0);
        a = abzfVar;
        abzf abzfVar2 = new abzf("SHOULD_SHOW_TOOLTIP", 1);
        b = abzfVar2;
        abzf abzfVar3 = new abzf("SHOULD_SHOW_TOOLTIP_WHEN_UI_READY", 2);
        c = abzfVar3;
        abzf abzfVar4 = new abzf("TOOLTIP_SEEN", 3);
        d = abzfVar4;
        abzf abzfVar5 = new abzf("WELCOME_FLOW_NOT_SHOWN", 4);
        e = abzfVar5;
        abzf[] abzfVarArr = {abzfVar, abzfVar2, abzfVar3, abzfVar4, abzfVar5};
        f = abzfVarArr;
        fczb.a(abzfVarArr);
    }

    private abzf(String str, int i) {
    }

    public static abzf[] values() {
        return (abzf[]) f.clone();
    }
}
