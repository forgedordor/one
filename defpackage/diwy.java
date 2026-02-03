package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
final class diwy {
    public static final diwy a;
    public static final diwy b;
    public static final /* synthetic */ fcza c;
    private static final /* synthetic */ diwy[] e;
    public final float d;

    static {
        diwy diwyVar = new diwy("Start", 0, 0.0f);
        a = diwyVar;
        diwy diwyVar2 = new diwy("End", 1, 1.0f);
        b = diwyVar2;
        diwy[] diwyVarArr = {diwyVar, diwyVar2};
        e = diwyVarArr;
        c = fczb.a(diwyVarArr);
    }

    private diwy(String str, int i, float f) {
        this.d = f;
    }

    public static diwy[] values() {
        return (diwy[]) e.clone();
    }
}
