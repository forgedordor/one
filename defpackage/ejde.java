package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ejde extends Exception {
    private final Integer a;
    private final Integer b;
    private final int c;

    public ejde() {
        this(null, null, 0, null, null, 31);
    }

    public Integer a() {
        return this.b;
    }

    public Integer b() {
        return this.a;
    }

    public int c() {
        return this.c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ejde(String str, Throwable th, int i, Integer num, Integer num2, int i2) {
        i = (i2 & 4) != 0 ? 1 : i;
        if (i == 0) {
            throw null;
        }
        int i3 = i2 & 16;
        int i4 = i2 & 8;
        int i5 = i2 & 2;
        int i6 = i2 & 1;
        num2 = i3 != 0 ? null : num2;
        num = i4 != 0 ? null : num;
        super(1 == i6 ? null : str, i5 != 0 ? null : th);
        this.c = i;
        this.a = num;
        this.b = num2;
    }
}
