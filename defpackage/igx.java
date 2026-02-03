package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class igx {
    public static final igx a;
    public static final igx b;
    public static final igx c;
    public static final igx d;
    private static final /* synthetic */ igx[] e;

    static {
        igx igxVar = new igx("Active", 0);
        a = igxVar;
        igx igxVar2 = new igx("ActiveParent", 1);
        b = igxVar2;
        igx igxVar3 = new igx("Captured", 2);
        c = igxVar3;
        igx igxVar4 = new igx("Inactive", 3);
        d = igxVar4;
        igx[] igxVarArr = {igxVar, igxVar2, igxVar3, igxVar4};
        e = igxVarArr;
        fczb.a(igxVarArr);
    }

    private igx(String str, int i) {
    }

    public static igx[] values() {
        return (igx[]) e.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new fctg();
    }

    public final boolean b() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new fctg();
            }
        }
        return true;
    }
}
