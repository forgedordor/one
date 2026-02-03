package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvqc {
    public static final bvqc a;
    public static final bvqc b;
    private static final /* synthetic */ bvqc[] c;

    static {
        bvqc bvqcVar = new bvqc("THROTTLED", 0);
        a = bvqcVar;
        bvqc bvqcVar2 = new bvqc("NOT_THROTTLED", 1);
        b = bvqcVar2;
        bvqc[] bvqcVarArr = {bvqcVar, bvqcVar2};
        c = bvqcVarArr;
        fczb.a(bvqcVarArr);
    }

    private bvqc(String str, int i) {
    }

    public static bvqc[] values() {
        return (bvqc[]) c.clone();
    }
}
