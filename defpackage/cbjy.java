package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbjy {
    public static final cbjy a;
    public static final cbjy b;
    private static final /* synthetic */ cbjy[] c;

    static {
        cbjy cbjyVar = new cbjy("QUICK_CHECK", 0);
        a = cbjyVar;
        cbjy cbjyVar2 = new cbjy("IN_DEPTH", 1);
        b = cbjyVar2;
        cbjy[] cbjyVarArr = {cbjyVar, cbjyVar2};
        c = cbjyVarArr;
        fczb.a(cbjyVarArr);
    }

    private cbjy(String str, int i) {
    }

    public static cbjy[] values() {
        return (cbjy[]) c.clone();
    }
}
