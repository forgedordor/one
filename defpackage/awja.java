package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awja {
    public static final awja a;
    public static final awja b;
    public static final awja c;
    public static final awja d;
    private static final /* synthetic */ awja[] e;

    static {
        awja awjaVar = new awja("PHONE_E164", 0);
        a = awjaVar;
        awja awjaVar2 = new awja("BOT", 1);
        b = awjaVar2;
        awja awjaVar3 = new awja("GROUP", 2);
        c = awjaVar3;
        awja awjaVar4 = new awja("EMERGENCY", 3);
        d = awjaVar4;
        awja[] awjaVarArr = {awjaVar, awjaVar2, awjaVar3, awjaVar4};
        e = awjaVarArr;
        fczb.a(awjaVarArr);
    }

    private awja(String str, int i) {
    }

    public static awja[] values() {
        return (awja[]) e.clone();
    }
}
