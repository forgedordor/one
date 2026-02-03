package j$.util.stream;

import java.util.function.Predicate;

/* renamed from: j$.util.stream.q0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0131q0 extends AbstractC0140s0 {
    public final /* synthetic */ EnumC0145t0 c;
    public final /* synthetic */ Predicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0131q0(EnumC0145t0 enumC0145t0, Predicate predicate) {
        super(enumC0145t0);
        this.c = enumC0145t0;
        this.d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(obj);
        EnumC0145t0 enumC0145t0 = this.c;
        if (zTest == enumC0145t0.a) {
            this.a = true;
            this.b = enumC0145t0.b;
        }
    }
}
