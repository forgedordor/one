package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum etew {
    BRANCH(0),
    SINGLE(1),
    ANY(2),
    RANGE(3),
    MAP(4),
    TMAP(5);

    public static final etew[] g = values();

    etew(int i) {
        if (i != ordinal()) {
            throw new AssertionError(a.g(i, "bad opcode value: "));
        }
    }

    public static int a(etes etesVar, eteu eteuVar, int i) {
        int iC = (etesVar.c() << 16) | etesVar.c();
        if (!eteuVar.b()) {
            return i;
        }
        int iA = eteuVar.a();
        int i2 = ((int) (1099368461105 >>> (iA * 4))) & 15 & (iC >>> (((int) (903298571996192 >>> (iA * 5))) & 31));
        if (i2 == 0) {
            return 3;
        }
        return etesVar.e(i2 - 1);
    }
}
