package j$.util.stream;

/* renamed from: j$.util.stream.w1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C0161w1 extends AbstractC0166x1 {
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0161w1(G0 g0, Object obj, int i) {
        super(g0);
        this.c = i;
        this.d = obj;
    }

    @Override // j$.util.stream.AbstractC0166x1
    public final void a() {
        switch (this.c) {
            case 0:
                ((F0) this.a).c(this.b, this.d);
                break;
            default:
                this.a.f((Object[]) this.d, this.b);
                break;
        }
    }

    @Override // j$.util.stream.AbstractC0166x1
    public final AbstractC0166x1 b(int i, int i2) {
        switch (this.c) {
            case 0:
                return new C0161w1(this, ((F0) this.a).a(i), i2);
            default:
                return new C0161w1(this, this.a.a(i), i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0161w1(C0161w1 c0161w1, G0 g0, int i) {
        super(c0161w1, g0, i);
        this.c = 1;
        this.d = (Object[]) c0161w1.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0161w1(C0161w1 c0161w1, F0 f0, int i) {
        super(c0161w1, f0, i);
        this.c = 0;
        this.d = c0161w1.d;
    }
}
