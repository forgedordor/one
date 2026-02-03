package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class pzy {

    @fcsv
    public static final pzy a;
    public static final pzy b;
    public static final pzy c;
    public static final pzy d;
    private static final /* synthetic */ pzy[] e;

    static {
        pzy pzyVar = new pzy("REPLACE", 0);
        a = pzyVar;
        pzy pzyVar2 = new pzy("KEEP", 1);
        b = pzyVar2;
        pzy pzyVar3 = new pzy("UPDATE", 2);
        c = pzyVar3;
        pzy pzyVar4 = new pzy("CANCEL_AND_REENQUEUE", 3);
        d = pzyVar4;
        pzy[] pzyVarArr = {pzyVar, pzyVar2, pzyVar3, pzyVar4};
        e = pzyVarArr;
        fczb.a(pzyVarArr);
    }

    private pzy(String str, int i) {
    }

    public static pzy[] values() {
        return (pzy[]) e.clone();
    }
}
