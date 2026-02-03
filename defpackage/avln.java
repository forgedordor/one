package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avln {
    public static final avln a;
    public static final avln b;
    public static final /* synthetic */ fcza c;
    private static final /* synthetic */ avln[] d;

    static {
        avln avlnVar = new avln("FULL", 0);
        a = avlnVar;
        avln avlnVar2 = new avln("INCREMENTAL", 1);
        b = avlnVar2;
        avln[] avlnVarArr = {avlnVar, avlnVar2};
        d = avlnVarArr;
        c = fczb.a(avlnVarArr);
    }

    private avln(String str, int i) {
    }

    public static avln[] values() {
        return (avln[]) d.clone();
    }
}
