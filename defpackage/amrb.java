package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amrb {
    public static final amrb a;
    public static final amrb b;
    private static final /* synthetic */ amrb[] c;

    static {
        amrb amrbVar = new amrb("RCS", 0);
        a = amrbVar;
        amrb amrbVar2 = new amrb("XMS", 1);
        b = amrbVar2;
        amrb[] amrbVarArr = {amrbVar, amrbVar2};
        c = amrbVarArr;
        fczb.a(amrbVarArr);
    }

    private amrb(String str, int i) {
    }

    public static amrb[] values() {
        return (amrb[]) c.clone();
    }
}
