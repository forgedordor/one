package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpo {
    public static final fpo a;
    public static final fpo b;
    private static final /* synthetic */ fpo[] c;

    static {
        fpo fpoVar = new fpo("Closed", 0);
        a = fpoVar;
        fpo fpoVar2 = new fpo("Open", 1);
        b = fpoVar2;
        fpo[] fpoVarArr = {fpoVar, fpoVar2};
        c = fpoVarArr;
        fczb.a(fpoVarArr);
    }

    private fpo(String str, int i) {
    }

    public static fpo[] values() {
        return (fpo[]) c.clone();
    }
}
