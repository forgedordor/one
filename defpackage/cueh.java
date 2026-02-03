package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cueh {
    public static final cueh a;
    public static final cueh b;
    public static final cueh c;
    public static final cueh d;
    public static final cueh e;
    public static final cueh f;
    private static final /* synthetic */ cueh[] g;

    static {
        cueh cuehVar = new cueh("ONE_TO_ONE", 0);
        a = cuehVar;
        cueh cuehVar2 = new cueh("CREATE_GROUP", 1);
        b = cuehVar2;
        cueh cuehVar3 = new cueh("MULTI_SELECT", 2);
        c = cuehVar3;
        cueh cuehVar4 = new cueh("ADD_TO_RCS_GROUP", 3);
        d = cuehVar4;
        cueh cuehVar5 = new cueh("ADD_TO_EMPTY_RCS_GROUP", 4);
        e = cuehVar5;
        cueh cuehVar6 = new cueh("ADD_TO_E2EE_GROUP", 5);
        f = cuehVar6;
        cueh[] cuehVarArr = {cuehVar, cuehVar2, cuehVar3, cuehVar4, cuehVar5, cuehVar6};
        g = cuehVarArr;
        fczb.a(cuehVarArr);
    }

    private cueh(String str, int i) {
    }

    public static cueh[] values() {
        return (cueh[]) g.clone();
    }

    public final boolean a() {
        return this == b || this == d || this == e || this == f;
    }

    public final boolean b() {
        return this == f;
    }

    public final boolean c() {
        return this == d || this == e || this == f;
    }

    public final boolean d() {
        return this == a;
    }

    public final boolean e() {
        return this == b || this == c || this == d || this == e || this == f;
    }
}
