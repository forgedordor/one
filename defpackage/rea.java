package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class rea {
    public static final rea a;
    public static final rea b;
    public static final rea c;
    public static final rea d;
    private static final /* synthetic */ rea[] e;

    static {
        rea reaVar = new rea("CLEARED", 0);
        a = reaVar;
        rea reaVar2 = new rea("RUNNING", 1);
        b = reaVar2;
        rea reaVar3 = new rea("SUCCEEDED", 2);
        c = reaVar3;
        rea reaVar4 = new rea("FAILED", 3);
        d = reaVar4;
        rea[] reaVarArr = {reaVar, reaVar2, reaVar3, reaVar4};
        e = reaVarArr;
        fczb.a(reaVarArr);
    }

    private rea(String str, int i) {
    }

    public static rea[] values() {
        return (rea[]) e.clone();
    }
}
