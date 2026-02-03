package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class antt {
    public static final antt a;
    public static final antt b;
    public static final antt c;
    public static final antt d;
    private static final /* synthetic */ antt[] e;

    static {
        antt anttVar = new antt("UNKNOWN", 0);
        a = anttVar;
        antt anttVar2 = new antt("CANNOT_READ", 1);
        b = anttVar2;
        antt anttVar3 = new antt("READING", 2);
        c = anttVar3;
        antt anttVar4 = new antt("SHOULD_READ", 3);
        d = anttVar4;
        antt[] anttVarArr = {anttVar, anttVar2, anttVar3, anttVar4};
        e = anttVarArr;
        fczb.a(anttVarArr);
    }

    private antt(String str, int i) {
    }

    public static antt[] values() {
        return (antt[]) e.clone();
    }
}
