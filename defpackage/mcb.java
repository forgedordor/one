package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mcb {
    public static final mcc a(maq maqVar) {
        return new mcc(maqVar.a());
    }

    public static final void b(mcc mccVar, maq maqVar) {
        int i = mcc.b;
        mar marVar = mccVar.a;
        for (int i2 = 0; i2 < marVar.b(); i2++) {
            maqVar.b(marVar.a(i2));
        }
    }

    public static final void c(int i, boolean z, maq maqVar) {
        if (z) {
            maqVar.b(i);
        }
    }
}
