package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eqcx extends Exception {
    public final eqcs a;
    public final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqcx(String str, eqcs eqcsVar, int i, Throwable th) {
        super(str + ", " + eqcsVar, th);
        eqcsVar.getClass();
        if (i == 0) {
            throw null;
        }
        this.a = eqcsVar;
        this.b = i;
    }

    public /* synthetic */ eqcx(String str, Throwable th, int i) {
        this(str, (i & 2) != 0 ? eqcs.a : null, (i & 4) != 0 ? 4 : 0, (i & 8) != 0 ? null : th);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public eqcx(String str, eqcs eqcsVar, Throwable th) {
        this(str, eqcsVar, 4, th);
        str.getClass();
    }

    public eqcx(String str, Throwable th) {
        this(str, eqcs.a, 4, th);
    }
}
