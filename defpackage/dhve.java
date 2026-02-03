package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhve {
    public static final dhve a;
    public static final dhve b;
    public static final dhve c;
    public static final dhve d;
    private static final /* synthetic */ dhve[] e;

    static {
        dhve dhveVar = new dhve("RESULT_UNKNOWN", 0);
        a = dhveVar;
        dhve dhveVar2 = new dhve("RESULT_MODEL_INFERENCE", 1);
        b = dhveVar2;
        dhve dhveVar3 = new dhve("RESULT_BLOCKLIST_PROCESS", 2);
        c = dhveVar3;
        dhve dhveVar4 = new dhve("RESULT_HEURISTIC_SCORE", 3);
        d = dhveVar4;
        dhve[] dhveVarArr = {dhveVar, dhveVar2, dhveVar3, dhveVar4};
        e = dhveVarArr;
        fczb.a(dhveVarArr);
    }

    private dhve(String str, int i) {
    }

    public static dhve[] values() {
        return (dhve[]) e.clone();
    }
}
