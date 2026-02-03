package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmpw {
    public static final cmpw a;
    public static final cmpw b;
    public static final cmpw c;
    private static final /* synthetic */ cmpw[] d;

    static {
        cmpw cmpwVar = new cmpw("SUCCEEDED", 0);
        a = cmpwVar;
        cmpw cmpwVar2 = new cmpw("FAILED", 1);
        b = cmpwVar2;
        cmpw cmpwVar3 = new cmpw("SKIPPED", 2);
        c = cmpwVar3;
        cmpw[] cmpwVarArr = {cmpwVar, cmpwVar2, cmpwVar3};
        d = cmpwVarArr;
        fczb.a(cmpwVarArr);
    }

    private cmpw(String str, int i) {
    }

    public static cmpw[] values() {
        return (cmpw[]) d.clone();
    }
}
