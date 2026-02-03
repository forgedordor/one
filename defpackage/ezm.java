package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezm {
    public static final ezm a;
    public static final ezm b;
    public static final ezm c;
    private static final /* synthetic */ ezm[] d;

    static {
        ezm ezmVar = new ezm("None", 0);
        a = ezmVar;
        ezm ezmVar2 = new ezm("Selection", 1);
        b = ezmVar2;
        ezm ezmVar3 = new ezm("Cursor", 2);
        c = ezmVar3;
        ezm[] ezmVarArr = {ezmVar, ezmVar2, ezmVar3};
        d = ezmVarArr;
        fczb.a(ezmVarArr);
    }

    private ezm(String str, int i) {
    }

    public static ezm[] values() {
        return (ezm[]) d.clone();
    }
}
