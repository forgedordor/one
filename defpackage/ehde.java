package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehde {
    public static final ehde a;
    public static final ehde b;
    public static final ehde c;
    public static final ehde d;
    private static final /* synthetic */ ehde[] e;

    static {
        ehde ehdeVar = new ehde("DEVICE", 0);
        a = ehdeVar;
        ehde ehdeVar2 = new ehde("USER", 1);
        b = ehdeVar2;
        ehde ehdeVar3 = new ehde("UI_DEVICE", 2);
        c = ehdeVar3;
        ehde ehdeVar4 = new ehde("UI_USER", 3);
        d = ehdeVar4;
        ehde[] ehdeVarArr = {ehdeVar, ehdeVar2, ehdeVar3, ehdeVar4};
        e = ehdeVarArr;
        fczb.a(ehdeVarArr);
    }

    private ehde(String str, int i) {
    }

    public static ehde[] values() {
        return (ehde[]) e.clone();
    }
}
