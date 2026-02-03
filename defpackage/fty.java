package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fty {
    public static final fty a;
    public static final fty b;
    private static final /* synthetic */ fty[] c;

    static {
        fty ftyVar = new fty("Dismissed", 0);
        a = ftyVar;
        fty ftyVar2 = new fty("ActionPerformed", 1);
        b = ftyVar2;
        fty[] ftyVarArr = {ftyVar, ftyVar2};
        c = ftyVarArr;
        fczb.a(ftyVarArr);
    }

    private fty(String str, int i) {
    }

    public static fty[] values() {
        return (fty[]) c.clone();
    }
}
