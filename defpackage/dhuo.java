package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhuo {
    public static final dhuo a;
    public static final dhuo b;
    public static final dhuo c;
    private static final /* synthetic */ dhuo[] d;

    static {
        dhuo dhuoVar = new dhuo("UNSPECIFIED", 0);
        a = dhuoVar;
        dhuo dhuoVar2 = new dhuo("JNI", 1);
        b = dhuoVar2;
        dhuo dhuoVar3 = new dhuo("PKVM", 2);
        c = dhuoVar3;
        dhuo[] dhuoVarArr = {dhuoVar, dhuoVar2, dhuoVar3};
        d = dhuoVarArr;
        fczb.a(dhuoVarArr);
    }

    private dhuo(String str, int i) {
    }

    public static dhuo[] values() {
        return (dhuo[]) d.clone();
    }
}
