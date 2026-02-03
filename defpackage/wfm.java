package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wfm {
    public static final wfm a;
    public static final wfm b;
    private static final /* synthetic */ wfm[] d;
    public final int c;

    static {
        wfm wfmVar = new wfm("OPTIMIZED", 0, 0);
        a = wfmVar;
        wfm wfmVar2 = new wfm("ORIGINAL", 1, 1);
        b = wfmVar2;
        wfm[] wfmVarArr = {wfmVar, wfmVar2};
        d = wfmVarArr;
        fczb.a(wfmVarArr);
    }

    private wfm(String str, int i, int i2) {
        this.c = i2;
    }

    public static wfm[] values() {
        return (wfm[]) d.clone();
    }
}
