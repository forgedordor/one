package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ryl implements rxc {
    public final List a;
    private float b;
    private float c;
    private rym d;
    private boolean e;
    private boolean f;
    private int g;
    private boolean h;

    public ryl(rxb rxbVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.d = null;
        this.e = false;
        this.f = true;
        this.g = -1;
        if (rxbVar == null) {
            return;
        }
        rxbVar.d(this);
        if (this.h) {
            this.d.a((rym) arrayList.get(this.g));
            arrayList.set(this.g, this.d);
            this.h = false;
        }
        rym rymVar = this.d;
        if (rymVar != null) {
            arrayList.add(rymVar);
        }
    }

    @Override // defpackage.rxc
    public final void a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.e = true;
        this.f = false;
        rym rymVar = this.d;
        ryv.c(rymVar.a, rymVar.b, f, f2, f3, z, z2, f4, f5, this);
        this.f = true;
        this.h = false;
    }

    @Override // defpackage.rxc
    public final void b() {
        this.a.add(this.d);
        e(this.b, this.c);
        this.h = true;
    }

    @Override // defpackage.rxc
    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.f || this.e) {
            this.d.b(f, f2);
            this.a.add(this.d);
            this.e = false;
        }
        this.d = new rym(f5, f6, f5 - f3, f6 - f4);
        this.h = false;
    }

    @Override // defpackage.rxc
    public final void e(float f, float f2) {
        this.d.b(f, f2);
        this.a.add(this.d);
        rym rymVar = this.d;
        this.d = new rym(f, f2, f - rymVar.a, f2 - rymVar.b);
        this.h = false;
    }

    @Override // defpackage.rxc
    public final void f(float f, float f2) {
        if (this.h) {
            rym rymVar = this.d;
            List list = this.a;
            rymVar.a((rym) list.get(this.g));
            list.set(this.g, this.d);
            this.h = false;
        }
        rym rymVar2 = this.d;
        if (rymVar2 != null) {
            this.a.add(rymVar2);
        }
        this.b = f;
        this.c = f2;
        this.d = new rym(f, f2, 0.0f, 0.0f);
        this.g = this.a.size();
    }

    @Override // defpackage.rxc
    public final void g(float f, float f2, float f3, float f4) {
        this.d.b(f, f2);
        this.a.add(this.d);
        this.d = new rym(f3, f4, f3 - f, f4 - f2);
        this.h = false;
    }
}
