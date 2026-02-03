package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvqb {
    public static final bvqb a;
    public static final bvqb b;
    public static final bvqb c;
    public static final bvqb d;
    private static final /* synthetic */ bvqb[] f;
    public final int e;

    static {
        bvqb bvqbVar = new bvqb("NOT_THROTTLED", 0, 0);
        a = bvqbVar;
        bvqb bvqbVar2 = new bvqb("MINUTE_THROTTLER", 1, 1);
        b = bvqbVar2;
        bvqb bvqbVar3 = new bvqb("FIVE_MINUTE_THROTTLER", 2, 2);
        c = bvqbVar3;
        bvqb bvqbVar4 = new bvqb("TWENTY_MINUTE_THROTTLER", 3, 3);
        d = bvqbVar4;
        bvqb[] bvqbVarArr = {bvqbVar, bvqbVar2, bvqbVar3, bvqbVar4};
        f = bvqbVarArr;
        fczb.a(bvqbVarArr);
    }

    private bvqb(String str, int i, int i2) {
        this.e = i2;
    }

    public static bvqb[] values() {
        return (bvqb[]) f.clone();
    }
}
