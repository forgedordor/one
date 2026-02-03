package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwhe {
    public static final cwhe a;
    public static final cwhe b;
    public static final cwhe c;
    public static final cwhe d;
    private static final /* synthetic */ cwhe[] e;

    static {
        cwhe cwheVar = new cwhe("DO_NOT_RENDER", 0);
        a = cwheVar;
        cwhe cwheVar2 = new cwhe("CLICKED_FROM_CDP", 1);
        b = cwheVar2;
        cwhe cwheVar3 = new cwhe("CLICKED_FROM_MINI_CDP", 2);
        c = cwheVar3;
        cwhe cwheVar4 = new cwhe("DISMISSED", 3);
        d = cwheVar4;
        cwhe[] cwheVarArr = {cwheVar, cwheVar2, cwheVar3, cwheVar4};
        e = cwheVarArr;
        fczb.a(cwheVarArr);
    }

    private cwhe(String str, int i) {
    }

    public static cwhe[] values() {
        return (cwhe[]) e.clone();
    }
}
