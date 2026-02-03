package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxue extends bxws {
    private bxut a;
    private ekgb b;
    private ekgb c;
    private ekgb d;
    private ekgb e;
    private ekgb f;
    private ekgb g;
    private bxut h;

    @Override // defpackage.bxws
    public final bxwt a() {
        ekgb ekgbVar;
        ekgb ekgbVar2;
        ekgb ekgbVar3;
        ekgb ekgbVar4;
        ekgb ekgbVar5;
        ekgb ekgbVar6;
        bxut bxutVar;
        bxut bxutVar2 = this.a;
        if (bxutVar2 != null && (ekgbVar = this.b) != null && (ekgbVar2 = this.c) != null && (ekgbVar3 = this.d) != null && (ekgbVar4 = this.e) != null && (ekgbVar5 = this.f) != null && (ekgbVar6 = this.g) != null && (bxutVar = this.h) != null) {
            return new bxuf(bxutVar2, ekgbVar, ekgbVar2, ekgbVar3, ekgbVar4, ekgbVar5, ekgbVar6, bxutVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" conversations");
        }
        if (this.b == null) {
            sb.append(" messageIds");
        }
        if (this.c == null) {
            sb.append(" images");
        }
        if (this.d == null) {
            sb.append(" videos");
        }
        if (this.e == null) {
            sb.append(" links");
        }
        if (this.f == null) {
            sb.append(" locations");
        }
        if (this.g == null) {
            sb.append(" contacts");
        }
        if (this.h == null) {
            sb.append(" starredTexts");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.bxws
    public final void b(List list) {
        this.g = ekgb.n(list);
    }

    @Override // defpackage.bxws
    public final void c(bxut bxutVar) {
        if (bxutVar == null) {
            throw new NullPointerException("Null conversations");
        }
        this.a = bxutVar;
    }

    @Override // defpackage.bxws
    public final void d(List list) {
        this.c = ekgb.n(list);
    }

    @Override // defpackage.bxws
    public final void e(List list) {
        this.e = ekgb.n(list);
    }

    @Override // defpackage.bxws
    public final void f(List list) {
        this.f = ekgb.n(list);
    }

    @Override // defpackage.bxws
    public final void g(Collection collection) {
        this.b = ekgb.n(collection);
    }

    @Override // defpackage.bxws
    public final void h(bxut bxutVar) {
        if (bxutVar == null) {
            throw new NullPointerException("Null starredTexts");
        }
        this.h = bxutVar;
    }

    @Override // defpackage.bxws
    public final void i(List list) {
        this.d = ekgb.n(list);
    }
}
