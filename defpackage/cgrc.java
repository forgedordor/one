package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgrc {
    public static final cgrc a;
    public static final cgrc b;
    public static final cgrc c;
    public static final cgrc d;
    public static final cgrc e;
    private static final /* synthetic */ cgrc[] f;

    static {
        cgrc cgrcVar = new cgrc("UNKNOWN", 0);
        a = cgrcVar;
        cgrc cgrcVar2 = new cgrc("MUTE_NONE", 1);
        b = cgrcVar2;
        cgrc cgrcVar3 = new cgrc("MUTE_FEW", 2);
        c = cgrcVar3;
        cgrc cgrcVar4 = new cgrc("MUTE_MOST", 3);
        d = cgrcVar4;
        cgrc cgrcVar5 = new cgrc("MUTE_ALL", 4);
        e = cgrcVar5;
        cgrc[] cgrcVarArr = {cgrcVar, cgrcVar2, cgrcVar3, cgrcVar4, cgrcVar5};
        f = cgrcVarArr;
        fczb.a(cgrcVarArr);
    }

    private cgrc(String str, int i) {
    }

    public static cgrc[] values() {
        return (cgrc[]) f.clone();
    }
}
