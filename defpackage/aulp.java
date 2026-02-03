package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aulp {
    public static final aulp a;
    public static final aulp b;
    private static final /* synthetic */ aulp[] c;

    static {
        aulp aulpVar = new aulp("INITIAL_SYNC_SUCCESS", 0);
        a = aulpVar;
        aulp aulpVar2 = new aulp("INITIAL_SYNC_FAILURE", 1);
        b = aulpVar2;
        aulp[] aulpVarArr = {aulpVar, aulpVar2};
        c = aulpVarArr;
        fczb.a(aulpVarArr);
    }

    private aulp(String str, int i) {
    }

    public static aulp[] values() {
        return (aulp[]) c.clone();
    }
}
