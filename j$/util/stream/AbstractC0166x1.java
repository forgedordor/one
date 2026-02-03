package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.x1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0166x1 extends CountedCompleter {
    public final G0 a;
    public final int b;

    public AbstractC0166x1(G0 g0) {
        this.a = g0;
        this.b = 0;
    }

    public abstract void a();

    public abstract AbstractC0166x1 b(int i, int i2);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        AbstractC0166x1 abstractC0166x1B = this;
        while (abstractC0166x1B.a.r() != 0) {
            abstractC0166x1B.setPendingCount(abstractC0166x1B.a.r() - 1);
            int i = 0;
            int iCount = 0;
            while (i < abstractC0166x1B.a.r() - 1) {
                AbstractC0166x1 abstractC0166x1B2 = abstractC0166x1B.b(i, abstractC0166x1B.b + iCount);
                iCount = (int) (abstractC0166x1B2.a.count() + iCount);
                abstractC0166x1B2.fork();
                i++;
            }
            abstractC0166x1B = abstractC0166x1B.b(i, abstractC0166x1B.b + iCount);
        }
        abstractC0166x1B.a();
        abstractC0166x1B.propagateCompletion();
    }

    public AbstractC0166x1(AbstractC0166x1 abstractC0166x1, G0 g0, int i) {
        super(abstractC0166x1);
        this.a = g0;
        this.b = i;
    }
}
