package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class lva {
    private static final /* synthetic */ fcza $ENTRIES;
    private static final /* synthetic */ lva[] $VALUES;
    public static final luz Companion;
    public static final lva ON_ANY;
    public static final lva ON_CREATE;
    public static final lva ON_DESTROY;
    public static final lva ON_PAUSE;
    public static final lva ON_RESUME;
    public static final lva ON_START;
    public static final lva ON_STOP;

    static {
        lva lvaVar = new lva("ON_CREATE", 0);
        ON_CREATE = lvaVar;
        lva lvaVar2 = new lva("ON_START", 1);
        ON_START = lvaVar2;
        lva lvaVar3 = new lva("ON_RESUME", 2);
        ON_RESUME = lvaVar3;
        lva lvaVar4 = new lva("ON_PAUSE", 3);
        ON_PAUSE = lvaVar4;
        lva lvaVar5 = new lva("ON_STOP", 4);
        ON_STOP = lvaVar5;
        lva lvaVar6 = new lva("ON_DESTROY", 5);
        ON_DESTROY = lvaVar6;
        lva lvaVar7 = new lva("ON_ANY", 6);
        ON_ANY = lvaVar7;
        lva[] lvaVarArr = {lvaVar, lvaVar2, lvaVar3, lvaVar4, lvaVar5, lvaVar6, lvaVar7};
        $VALUES = lvaVarArr;
        $ENTRIES = fczb.a(lvaVarArr);
        Companion = new luz();
    }

    private lva(String str, int i) {
    }

    public static lva[] values() {
        return (lva[]) $VALUES.clone();
    }

    public final lvb a() {
        switch (ordinal()) {
            case 0:
            case 4:
                return lvb.c;
            case 1:
            case 3:
                return lvb.d;
            case 2:
                return lvb.e;
            case 5:
                return lvb.a;
            case 6:
                toString();
                throw new IllegalArgumentException(toString().concat(" has no target state"));
            default:
                throw new fctg();
        }
    }
}
