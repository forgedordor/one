package j$.util.stream;

/* renamed from: j$.util.stream.l0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0106l0 extends AbstractC0111m0 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC0106l0(AbstractC0050a abstractC0050a, int i, int i2) {
        super(abstractC0050a, i);
        this.l = i2;
    }

    @Override // j$.util.stream.AbstractC0050a
    public final boolean H() {
        switch (this.l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.AbstractC0050a, j$.util.stream.BaseStream
    public final LongStream parallel() {
        switch (this.l) {
            case 0:
                this.a.k = true;
                break;
            default:
                this.a.k = true;
                break;
        }
        return this;
    }

    @Override // j$.util.stream.AbstractC0050a, j$.util.stream.BaseStream
    public final LongStream sequential() {
        switch (this.l) {
            case 0:
                this.a.k = false;
                break;
            default:
                this.a.k = false;
                break;
        }
        return this;
    }
}
