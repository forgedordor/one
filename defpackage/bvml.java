package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvml {
    public static final bvml a;
    public static final bvml b;
    public static final bvml c;
    private static final /* synthetic */ bvml[] e;
    public final int d;

    static {
        bvml bvmlVar = new bvml("UNKNOWN", 0, 0);
        a = bvmlVar;
        bvml bvmlVar2 = new bvml("SATELLITE_MODE", 1, 1);
        b = bvmlVar2;
        bvml bvmlVar3 = new bvml("TRUSTED_CONTACTS", 2, 2);
        c = bvmlVar3;
        bvml[] bvmlVarArr = {bvmlVar, bvmlVar2, bvmlVar3};
        e = bvmlVarArr;
        fczb.a(bvmlVarArr);
    }

    private bvml(String str, int i, int i2) {
        this.d = i2;
    }

    public static bvml[] values() {
        return (bvml[]) e.clone();
    }
}
