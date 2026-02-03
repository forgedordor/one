package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atmy {
    public static final atmy a;
    public static final atmy b;
    private static final /* synthetic */ atmy[] c;

    static {
        atmy atmyVar = new atmy("FULL_FILE", 0);
        a = atmyVar;
        atmy atmyVar2 = new atmy("THUMBNAIL", 1);
        b = atmyVar2;
        atmy[] atmyVarArr = {atmyVar, atmyVar2};
        c = atmyVarArr;
        fczb.a(atmyVarArr);
    }

    private atmy(String str, int i) {
    }

    public static atmy[] values() {
        return (atmy[]) c.clone();
    }
}
