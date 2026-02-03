package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes9.dex */
public final class K extends AbstractC0055b {
    public final D j;
    public final boolean k;

    public K(D d, boolean z, AbstractC0050a abstractC0050a, Spliterator spliterator) {
        super(abstractC0050a, spliterator);
        this.k = z;
        this.j = d;
    }

    @Override // j$.util.stream.AbstractC0065d
    public final Object a() {
        AbstractC0050a abstractC0050a = this.a;
        S3 s3 = (S3) this.j.d.get();
        abstractC0050a.M(this.b, s3);
        Object obj = s3.get();
        if (this.k) {
            if (obj != null) {
                AbstractC0065d abstractC0065d = this;
                while (abstractC0065d != null) {
                    AbstractC0065d abstractC0065d2 = (AbstractC0065d) abstractC0065d.getCompleter();
                    if (abstractC0065d2 != null && abstractC0065d2.d != abstractC0065d) {
                        g();
                        return obj;
                    }
                    abstractC0065d = abstractC0065d2;
                }
                j$.desugar.sun.nio.fs.g.P(this.h, null, obj);
                return obj;
            }
        } else if (obj != null) {
            j$.desugar.sun.nio.fs.g.P(this.h, null, obj);
            return null;
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0065d
    public final AbstractC0065d c(Spliterator spliterator) {
        return new K(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0055b
    public final Object h() {
        return this.j.b;
    }

    @Override // j$.util.stream.AbstractC0065d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.k) {
            K k = (K) this.d;
            K k2 = null;
            while (true) {
                if (k != k2) {
                    Object objI = k.i();
                    if (objI != null && this.j.c.test(objI)) {
                        d(objI);
                        AbstractC0065d abstractC0065d = this;
                        while (true) {
                            if (abstractC0065d != null) {
                                AbstractC0065d abstractC0065d2 = (AbstractC0065d) abstractC0065d.getCompleter();
                                if (abstractC0065d2 != null && abstractC0065d2.d != abstractC0065d) {
                                    g();
                                    break;
                                }
                                abstractC0065d = abstractC0065d2;
                            } else {
                                j$.desugar.sun.nio.fs.g.P(this.h, null, objI);
                                break;
                            }
                        }
                    } else {
                        k2 = k;
                        k = (K) this.e;
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }

    public K(K k, Spliterator spliterator) {
        super(k, spliterator);
        this.k = k.k;
        this.j = k.j;
    }
}
