package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwen {
    public static final cwen a;
    public static final cwen b;
    public static final cwen c;
    public static final cwen d;
    public static final cwen e;
    private static final /* synthetic */ cwen[] f;

    static {
        cwen cwenVar = new cwen("DO_NOT_RENDER", 0);
        a = cwenVar;
        cwen cwenVar2 = new cwen("DATA_LOADING", 1);
        b = cwenVar2;
        cwen cwenVar3 = new cwen("VISIBLE", 2);
        c = cwenVar3;
        cwen cwenVar4 = new cwen("IN_EXIT_TRANSITION", 3);
        d = cwenVar4;
        cwen cwenVar5 = new cwen("HIDDEN", 4);
        e = cwenVar5;
        cwen[] cwenVarArr = {cwenVar, cwenVar2, cwenVar3, cwenVar4, cwenVar5};
        f = cwenVarArr;
        fczb.a(cwenVarArr);
    }

    private cwen(String str, int i) {
    }

    public static cwen[] values() {
        return (cwen[]) f.clone();
    }
}
