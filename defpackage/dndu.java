package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dndu implements mw {
    final /* synthetic */ List a;
    final /* synthetic */ int b;

    public dndu(List list, int i) {
        this.a = list;
        this.b = i;
    }

    @Override // defpackage.mw
    public final void a(int i, int i2, Object obj) {
        this.a.add(new dndm(i + this.b, i2, obj));
    }

    @Override // defpackage.mw
    public final void b(int i, int i2) {
        this.a.add(new dndn(i + this.b, i2));
    }

    @Override // defpackage.mw
    public final void c(int i, int i2) {
        int i3 = this.b;
        this.a.add(new dndo(i + i3, i2 + i3));
    }

    @Override // defpackage.mw
    public final void d(int i, int i2) {
        this.a.add(new dndp(i + this.b, i2));
    }
}
