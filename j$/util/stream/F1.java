package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes9.dex */
public final class F1 extends AbstractC0171y1 {
    public final /* synthetic */ int h;

    public /* synthetic */ F1(int i) {
        this.h = i;
    }

    @Override // j$.util.stream.AbstractC0171y1
    public final T1 O() {
        switch (this.h) {
            case 0:
                return new X1();
            case 1:
                return new V1();
            case 2:
                return new Y1();
            default:
                return new W1();
        }
    }

    @Override // j$.util.stream.AbstractC0171y1, j$.util.stream.R3
    public final Object a(AbstractC0050a abstractC0050a, Spliterator spliterator) {
        switch (this.h) {
            case 0:
                if (!EnumC0094i3.SIZED.x(abstractC0050a.f)) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!EnumC0094i3.SIZED.x(abstractC0050a.f)) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!EnumC0094i3.SIZED.x(abstractC0050a.f)) {
                    break;
                } else {
                    break;
                }
            default:
                if (!EnumC0094i3.SIZED.x(abstractC0050a.f)) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.a(abstractC0050a, spliterator);
    }

    @Override // j$.util.stream.AbstractC0171y1, j$.util.stream.R3
    public final Object b(AbstractC0050a abstractC0050a, Spliterator spliterator) {
        switch (this.h) {
            case 0:
                if (!EnumC0094i3.SIZED.x(abstractC0050a.f)) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!EnumC0094i3.SIZED.x(abstractC0050a.f)) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!EnumC0094i3.SIZED.x(abstractC0050a.f)) {
                    break;
                } else {
                    break;
                }
            default:
                if (!EnumC0094i3.SIZED.x(abstractC0050a.f)) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.b(abstractC0050a, spliterator);
    }

    @Override // j$.util.stream.AbstractC0171y1, j$.util.stream.R3
    public final int c() {
        switch (this.h) {
        }
        return EnumC0094i3.r;
    }
}
