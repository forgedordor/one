package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqdk {
    public static final eqdk a;
    public static final eqdk b;
    public static final eqdk c;
    private static final /* synthetic */ eqdk[] d;

    static {
        eqdk eqdkVar = new eqdk("UNKNOWN_GROUP_ICON_MODIFICATION_POLICY", 0);
        a = eqdkVar;
        eqdk eqdkVar2 = new eqdk("NO_GROUP_ICON_MODIFICATION_ALLOWED", 1);
        b = eqdkVar2;
        eqdk eqdkVar3 = new eqdk("GROUP_ICON_MODIFICATION_ALLOWED", 2);
        c = eqdkVar3;
        eqdk[] eqdkVarArr = {eqdkVar, eqdkVar2, eqdkVar3};
        d = eqdkVarArr;
        fczb.a(eqdkVarArr);
    }

    private eqdk(String str, int i) {
    }

    public static eqdk[] values() {
        return (eqdk[]) d.clone();
    }
}
