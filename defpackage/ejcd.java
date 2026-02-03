package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejcd {
    public static final ejcd a;
    public static final ejcd b;
    public static final ejcd c;
    public static final ejcd d;
    private static final /* synthetic */ ejcd[] e;

    static {
        ejcd ejcdVar = new ejcd("AVAILABLE", 0);
        a = ejcdVar;
        ejcd ejcdVar2 = new ejcd("DOWNLOADING", 1);
        b = ejcdVar2;
        ejcd ejcdVar3 = new ejcd("DOWNLOADABLE", 2);
        c = ejcdVar3;
        ejcd ejcdVar4 = new ejcd("UNAVAILABLE", 3);
        d = ejcdVar4;
        ejcd[] ejcdVarArr = {ejcdVar, ejcdVar2, ejcdVar3, ejcdVar4};
        e = ejcdVarArr;
        fczb.a(ejcdVarArr);
    }

    private ejcd(String str, int i) {
    }

    public static ejcd[] values() {
        return (ejcd[]) e.clone();
    }
}
