package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvde {
    public static final bvde a;
    public static final bvde b;
    private static final /* synthetic */ bvde[] c;

    static {
        bvde bvdeVar = new bvde("BUGLE_DB", 0);
        a = bvdeVar;
        bvde bvdeVar2 = new bvde("BACKUP_DB", 1);
        b = bvdeVar2;
        bvde[] bvdeVarArr = {bvdeVar, bvdeVar2};
        c = bvdeVarArr;
        fczb.a(bvdeVarArr);
    }

    private bvde(String str, int i) {
    }

    public static bvde[] values() {
        return (bvde[]) c.clone();
    }
}
