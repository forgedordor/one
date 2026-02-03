package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgrd {
    public static final cgrd a;
    public static final cgrd b;
    public static final cgrd c;
    public static final cgrd d;
    private static final /* synthetic */ cgrd[] e;

    static {
        cgrd cgrdVar = new cgrd("UNKNOWN", 0);
        a = cgrdVar;
        cgrd cgrdVar2 = new cgrd("LOW", 1);
        b = cgrdVar2;
        cgrd cgrdVar3 = new cgrd("DEFAULT", 2);
        c = cgrdVar3;
        cgrd cgrdVar4 = new cgrd("HIGH", 3);
        d = cgrdVar4;
        cgrd[] cgrdVarArr = {cgrdVar, cgrdVar2, cgrdVar3, cgrdVar4};
        e = cgrdVarArr;
        fczb.a(cgrdVarArr);
    }

    private cgrd(String str, int i) {
    }

    public static cgrd[] values() {
        return (cgrd[]) e.clone();
    }
}
