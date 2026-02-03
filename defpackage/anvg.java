package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anvg {
    public static final anvg a;
    public static final anvg b;
    public static final anvg c;
    private static final /* synthetic */ anvg[] d;

    static {
        anvg anvgVar = new anvg("UNKNOWN", 0);
        a = anvgVar;
        anvg anvgVar2 = new anvg("NOT_APPROVED", 1);
        b = anvgVar2;
        anvg anvgVar3 = new anvg("APPROVED", 2);
        c = anvgVar3;
        anvg[] anvgVarArr = {anvgVar, anvgVar2, anvgVar3};
        d = anvgVarArr;
        fczb.a(anvgVarArr);
    }

    private anvg(String str, int i) {
    }

    public static anvg[] values() {
        return (anvg[]) d.clone();
    }
}
