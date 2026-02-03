package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doec {
    public static final doec a;
    public static final doec b;
    public static final doec c;
    private static final /* synthetic */ doec[] d;

    static {
        doec doecVar = new doec("LOADING", 0);
        a = doecVar;
        doec doecVar2 = new doec("ONBOARDED", 1);
        b = doecVar2;
        doec doecVar3 = new doec("NOT_ONBOARDED", 2);
        c = doecVar3;
        doec[] doecVarArr = {doecVar, doecVar2, doecVar3};
        d = doecVarArr;
        fczb.a(doecVarArr);
    }

    private doec(String str, int i) {
    }

    public static doec[] values() {
        return (doec[]) d.clone();
    }
}
