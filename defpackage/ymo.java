package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ymo extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ ymr c;
    final /* synthetic */ ymx d;
    final /* synthetic */ boolean e;
    final /* synthetic */ boolean f;
    final /* synthetic */ boolean g;
    final /* synthetic */ boolean h;
    final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymo(ymr ymrVar, ymx ymxVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.c = ymrVar;
        this.d = ymxVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        ymo ymoVar = new ymo(this.c, this.d, this.e, this.f, this.g, this.h, this.i, (fcxy) obj4);
        ymoVar.a = (List) obj2;
        ymoVar.b = (anlb) obj3;
        return ymoVar.b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0, types: [anlb, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.c.b(this.d, this.e, this.f, this.g, this.h, this.a, this.b, this.i);
    }
}
