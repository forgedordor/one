package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccnk {
    public static final ccnk a;
    public static final ccnk b;
    private static final /* synthetic */ ccnk[] c;

    static {
        ccnk ccnkVar = new ccnk("UNSET", 0);
        a = ccnkVar;
        ccnk ccnkVar2 = new ccnk("INCOMING_ZINNIA_PROCESSED", 1);
        b = ccnkVar2;
        ccnk[] ccnkVarArr = {ccnkVar, ccnkVar2};
        c = ccnkVarArr;
        fczb.a(ccnkVarArr);
    }

    private ccnk(String str, int i) {
    }

    public static ccnk[] values() {
        return (ccnk[]) c.clone();
    }
}
