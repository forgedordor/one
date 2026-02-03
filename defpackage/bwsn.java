package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwsn {
    public static final bwsn a;
    public static final bwsn b;
    public static final bwsn c;
    public static final bwsn d;
    private static final /* synthetic */ bwsn[] e;

    static {
        bwsn bwsnVar = new bwsn("UNKNOWN", 0);
        a = bwsnVar;
        bwsn bwsnVar2 = new bwsn("MMS", 1);
        b = bwsnVar2;
        bwsn bwsnVar3 = new bwsn("RCS", 2);
        c = bwsnVar3;
        bwsn bwsnVar4 = new bwsn("ENCRYPTED_RCS", 3);
        d = bwsnVar4;
        bwsn[] bwsnVarArr = {bwsnVar, bwsnVar2, bwsnVar3, bwsnVar4};
        e = bwsnVarArr;
        fczb.a(bwsnVarArr);
    }

    private bwsn(String str, int i) {
    }

    public static bwsn[] values() {
        return (bwsn[]) e.clone();
    }
}
