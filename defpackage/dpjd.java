package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpjd {
    public static final dpjd a;
    public static final dpjd b;
    public static final dpjd c;
    public static final dpjd d;
    private static final /* synthetic */ dpjd[] e;

    static {
        dpjd dpjdVar = new dpjd("OPEN", 0);
        a = dpjdVar;
        dpjd dpjdVar2 = new dpjd("OPENING", 1);
        b = dpjdVar2;
        dpjd dpjdVar3 = new dpjd("CLOSING", 2);
        c = dpjdVar3;
        dpjd dpjdVar4 = new dpjd("CLOSED", 3);
        d = dpjdVar4;
        dpjd[] dpjdVarArr = {dpjdVar, dpjdVar2, dpjdVar3, dpjdVar4};
        e = dpjdVarArr;
        fczb.a(dpjdVarArr);
    }

    private dpjd(String str, int i) {
    }

    public static dpjd[] values() {
        return (dpjd[]) e.clone();
    }
}
