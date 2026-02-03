package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzry extends dzsa {
    public int a;
    public int b;
    public int c;
    public int d;
    public ekgb e;
    public byte f;
    public int g;

    @Override // defpackage.dzsa
    public final void a(int i) {
        this.b = i;
        this.f = (byte) (this.f | 2);
    }

    @Override // defpackage.dzsa
    public final void b(int i) {
        this.a = i;
        this.f = (byte) (this.f | 1);
    }

    @Override // defpackage.dzsa
    public final void c(int i) {
        this.c = i;
        this.f = (byte) (this.f | 4);
    }

    @Override // defpackage.dzsa
    public final void d(int i) {
        this.d = i;
        this.f = (byte) (this.f | 8);
    }

    @Override // defpackage.dzsa
    public final void e(List list) {
        this.e = ekgb.n(list);
    }
}
