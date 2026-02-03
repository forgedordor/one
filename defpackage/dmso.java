package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmso {
    public static final dmso a;
    public static final dmso b;
    public static final dmso c;
    public static final dmso d;
    private static final /* synthetic */ dmso[] f;
    public final int e;
    private final boolean g;

    static {
        dmso dmsoVar = new dmso("PORTRAIT", 0, 0, true);
        a = dmsoVar;
        dmso dmsoVar2 = new dmso("LANDSCAPE_RIGHT", 1, 90, false);
        b = dmsoVar2;
        dmso dmsoVar3 = new dmso("PORTRAIT_UPSIDE_DOWN", 2, 180, true);
        c = dmsoVar3;
        dmso dmsoVar4 = new dmso("LANDSCAPE_LEFT", 3, 270, false);
        d = dmsoVar4;
        dmso[] dmsoVarArr = {dmsoVar, dmsoVar2, dmsoVar3, dmsoVar4};
        f = dmsoVarArr;
        fczb.a(dmsoVarArr);
    }

    private dmso(String str, int i, int i2, boolean z) {
        this.e = i2;
        this.g = z;
    }

    public static dmso[] values() {
        return (dmso[]) f.clone();
    }

    public final boolean a() {
        return !this.g;
    }
}
