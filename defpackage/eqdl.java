package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqdl {
    public static final eqdl a;
    public static final eqdl b;
    public static final eqdl c;
    private static final /* synthetic */ eqdl[] d;

    static {
        eqdl eqdlVar = new eqdl("UNKNOWN_JOIN_BY_LINK_POLICY", 0);
        a = eqdlVar;
        eqdl eqdlVar2 = new eqdl("NO_JOIN_BY_LINK_ALLOWED", 1);
        b = eqdlVar2;
        eqdl eqdlVar3 = new eqdl("JOIN_BY_LINK_ALLOWED", 2);
        c = eqdlVar3;
        eqdl[] eqdlVarArr = {eqdlVar, eqdlVar2, eqdlVar3};
        d = eqdlVarArr;
        fczb.a(eqdlVarArr);
    }

    private eqdl(String str, int i) {
    }

    public static eqdl[] values() {
        return (eqdl[]) d.clone();
    }
}
