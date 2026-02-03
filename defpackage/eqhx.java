package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqhx {
    public static final eqhx a;
    public static final eqhx b;
    public static final eqhx c;
    public static final eqhx d;
    private static final /* synthetic */ eqhx[] e;

    static {
        eqhx eqhxVar = new eqhx("UNKNOWN", 0);
        a = eqhxVar;
        eqhx eqhxVar2 = new eqhx("OFFLINE", 1);
        b = eqhxVar2;
        eqhx eqhxVar3 = new eqhx("ONLINE", 2);
        c = eqhxVar3;
        eqhx eqhxVar4 = new eqhx("NOT_RCS", 3);
        d = eqhxVar4;
        eqhx[] eqhxVarArr = {eqhxVar, eqhxVar2, eqhxVar3, eqhxVar4};
        e = eqhxVarArr;
        fczb.a(eqhxVarArr);
    }

    private eqhx(String str, int i) {
    }

    public static eqhx[] values() {
        return (eqhx[]) e.clone();
    }
}
