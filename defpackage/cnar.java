package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnar {
    public static final cnar a;
    public static final cnar b;
    public static final cnar c;
    private static final /* synthetic */ cnar[] d;

    static {
        cnar cnarVar = new cnar("SUCCESS", 0);
        a = cnarVar;
        cnar cnarVar2 = new cnar("TEMPORARY_FAILURE", 1);
        b = cnarVar2;
        cnar cnarVar3 = new cnar("PERMANENT_FAILURE", 2);
        c = cnarVar3;
        cnar[] cnarVarArr = {cnarVar, cnarVar2, cnarVar3};
        d = cnarVarArr;
        fczb.a(cnarVarArr);
    }

    private cnar(String str, int i) {
    }

    public static cnar[] values() {
        return (cnar[]) d.clone();
    }
}
