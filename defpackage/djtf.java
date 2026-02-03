package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djtf {
    public static final djtf a;
    public static final djtf b;
    public static final djtf c;
    public static final djtf d;
    public static final djtf e;
    private static final /* synthetic */ djtf[] f;

    static {
        djtf djtfVar = new djtf("PROCESSING_NO_CONTENT", 0);
        a = djtfVar;
        djtf djtfVar2 = new djtf("DOWNLOADABLE_NO_CONTENT", 1);
        b = djtfVar2;
        djtf djtfVar3 = new djtf("NO_CONNECTION_NO_CONTENT", 2);
        c = djtfVar3;
        djtf djtfVar4 = new djtf("MANUAL_DOWNLOADING_NO_CONTENT", 3);
        d = djtfVar4;
        djtf djtfVar5 = new djtf("NORMAL", 4);
        e = djtfVar5;
        djtf[] djtfVarArr = {djtfVar, djtfVar2, djtfVar3, djtfVar4, djtfVar5};
        f = djtfVarArr;
        fczb.a(djtfVarArr);
    }

    private djtf(String str, int i) {
    }

    public static djtf[] values() {
        return (djtf[]) f.clone();
    }
}
