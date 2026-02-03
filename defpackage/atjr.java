package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atjr {
    public static final atjr a;
    public static final atjr b;
    public static final atjr c;
    public static final atjr d;
    public static final atjr e;
    public static final atjr f;
    public static final atjr g;
    public static final atjr h;
    public static final atjr i;
    public static final atjr j;
    public static final atjr k;
    public static final atjr l;
    private static final /* synthetic */ atjr[] m;

    static {
        atjr atjrVar = new atjr("PRE_WARM", 0);
        a = atjrVar;
        atjr atjrVar2 = new atjr("AWAITING_SENDING", 1);
        b = atjrVar2;
        atjr atjrVar3 = new atjr("FILE_RESIZING", 2);
        c = atjrVar3;
        atjr atjrVar4 = new atjr("THUMBNAIL_RESIZING", 3);
        d = atjrVar4;
        atjr atjrVar5 = new atjr("FILE_ENCRYPTION", 4);
        e = atjrVar5;
        atjr atjrVar6 = new atjr("THUMBNAIL_ENCRYPTION", 5);
        f = atjrVar6;
        atjr atjrVar7 = new atjr("UPLOAD", 6);
        g = atjrVar7;
        atjr atjrVar8 = new atjr("SERIALIZE", 7);
        h = atjrVar8;
        atjr atjrVar9 = new atjr("SEND", 8);
        i = atjrVar9;
        atjr atjrVar10 = new atjr("NO_OP", 9);
        j = atjrVar10;
        atjr atjrVar11 = new atjr("FILE_AND_THUMBNAIL_COMBINER", 10);
        k = atjrVar11;
        atjr atjrVar12 = new atjr("SEQUENTIAL_PIPELINE", 11);
        l = atjrVar12;
        atjr[] atjrVarArr = {atjrVar, atjrVar2, atjrVar3, atjrVar4, atjrVar5, atjrVar6, atjrVar7, atjrVar8, atjrVar9, atjrVar10, atjrVar11, atjrVar12};
        m = atjrVarArr;
        fczb.a(atjrVarArr);
    }

    private atjr(String str, int i2) {
    }

    public static atjr[] values() {
        return (atjr[]) m.clone();
    }
}
