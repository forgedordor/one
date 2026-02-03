package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class awim implements ejvr {
    @Override // defpackage.ejvr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final awja apply(aubp aubpVar) {
        int iOrdinal = aubpVar.ordinal();
        if (iOrdinal == 0) {
            return b();
        }
        if (iOrdinal == 1) {
            return awja.a;
        }
        if (iOrdinal == 2) {
            return awja.c;
        }
        if (iOrdinal == 3) {
            return awja.b;
        }
        if (iOrdinal == 4) {
            return awja.d;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(aubpVar))));
    }

    public abstract awja b();
}
