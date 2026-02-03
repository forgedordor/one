package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccam {
    public static final ccam a;
    public static final ccam b;
    public static final ccam c;
    public static final ccam d;
    public static final ccam e;
    private static final /* synthetic */ ccam[] f;

    static {
        ccam ccamVar = new ccam("NO_OP", 0);
        a = ccamVar;
        ccam ccamVar2 = new ccam("PENDING", 1);
        b = ccamVar2;
        ccam ccamVar3 = new ccam("SUCCESS", 2);
        c = ccamVar3;
        ccam ccamVar4 = new ccam("FAIL_RETRY", 3);
        d = ccamVar4;
        ccam ccamVar5 = new ccam("FAIL_NO_RETRY", 4);
        e = ccamVar5;
        ccam[] ccamVarArr = {ccamVar, ccamVar2, ccamVar3, ccamVar4, ccamVar5};
        f = ccamVarArr;
        fczb.a(ccamVarArr);
    }

    private ccam(String str, int i) {
    }

    public static ccam[] values() {
        return (ccam[]) f.clone();
    }
}
