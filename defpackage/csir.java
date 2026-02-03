package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csir {
    public static final csir a;
    public static final csir b;
    public static final csir c;
    public static final csir d;
    public static final csir e;
    private static final /* synthetic */ csir[] f;

    static {
        csir csirVar = new csir("UNKNOWN", 0);
        a = csirVar;
        csir csirVar2 = new csir("REPORT", 1);
        b = csirVar2;
        csir csirVar3 = new csir("DELETE_CONVERSATION", 2);
        c = csirVar3;
        csir csirVar4 = new csir("LEAVE_IN_SPAM_FOLDER", 3);
        d = csirVar4;
        csir csirVar5 = new csir("BLOCK_WITHOUT_REPORTING", 4);
        e = csirVar5;
        csir[] csirVarArr = {csirVar, csirVar2, csirVar3, csirVar4, csirVar5};
        f = csirVarArr;
        fczb.a(csirVarArr);
    }

    private csir(String str, int i) {
    }

    public static csir[] values() {
        return (csir[]) f.clone();
    }
}
