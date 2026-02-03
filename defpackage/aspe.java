package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aspe {
    public static final aspe a;
    public static final aspe b;
    public static final aspe c;
    private static final /* synthetic */ aspe[] e;
    public final float d;

    static {
        aspe aspeVar = new aspe("FULL", 0, 1.0f);
        a = aspeVar;
        aspe aspeVar2 = new aspe("HALF", 1, 2.0f);
        b = aspeVar2;
        aspe aspeVar3 = new aspe("TALL", 2, 1.3333334f);
        c = aspeVar3;
        aspe[] aspeVarArr = {aspeVar, aspeVar2, aspeVar3};
        e = aspeVarArr;
        fczb.a(aspeVarArr);
    }

    private aspe(String str, int i, float f) {
        this.d = f;
    }

    public static aspe[] values() {
        return (aspe[]) e.clone();
    }
}
