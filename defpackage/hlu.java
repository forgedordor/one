package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hlu implements hlw {
    public final Object a;
    public Object b;
    private final ArrayList c = new ArrayList();

    public hlu(Object obj) {
        this.a = obj;
        this.b = obj;
    }

    @Override // defpackage.hlw
    public final Object a() {
        return this.b;
    }

    @Override // defpackage.hlw
    public final /* synthetic */ void b(fdat fdatVar, Object obj) {
        fdatVar.a(a(), obj);
    }

    @Override // defpackage.hlw
    public final void c() {
        this.c.clear();
        this.b = this.a;
        e();
    }

    @Override // defpackage.hlw
    public final void d(Object obj) {
        this.c.add(this.b);
        this.b = obj;
    }

    protected abstract void e();

    @Override // defpackage.hlw
    public /* synthetic */ void g() {
        throw null;
    }

    @Override // defpackage.hlw
    public final void h() {
        this.b = hse.a(this.c);
    }

    @Override // defpackage.hlw
    public /* synthetic */ void f() {
    }
}
