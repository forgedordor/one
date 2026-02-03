package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpuf implements fdau {
    final /* synthetic */ float a;
    final /* synthetic */ fdap b;
    final /* synthetic */ boolean c;
    final /* synthetic */ fdae d;
    final /* synthetic */ gst e;
    final /* synthetic */ ebk f;

    public dpuf(float f, fdap fdapVar, boolean z, fdae fdaeVar, gst gstVar, ebk ebkVar) {
        this.a = f;
        this.b = fdapVar;
        this.c = z;
        this.d = fdaeVar;
        this.e = gstVar;
        this.f = ebkVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        ((cyg) obj).getClass();
        ico icoVar = ics.e;
        ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVar, 0);
        long jB = hmg.b(hmlVar);
        long j = jB ^ (jB >>> 32);
        hxi hxiVarN = hmlVar.N();
        ics icsVarB = icj.b(hmlVar, icoVar);
        fdae fdaeVar = jbb.a;
        hmlVar.M();
        hmlVar.x();
        if (hmlVar.H()) {
            hmlVar.j(fdaeVar);
        } else {
            hmlVar.z();
        }
        int i = (int) j;
        hsk.b(hmlVar, ixmVarA, jbb.e);
        hsk.b(hmlVar, hxiVarN, jbb.d);
        fdat fdatVar = jbb.f;
        if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i))) {
            Integer numValueOf = Integer.valueOf(i);
            hmlVar.y(numValueOf);
            hmlVar.h(numValueOf, fdatVar);
        }
        ebk ebkVar = this.f;
        gst gstVar = this.e;
        fdae fdaeVar2 = this.d;
        boolean z = this.c;
        fdap fdapVar = this.b;
        float f = this.a;
        hsk.b(hmlVar, icsVarB, jbb.c);
        dthc.a(f, fdapVar, icoVar, z, fdaeVar2, gstVar, null, hxe.d(1473813557, new dpud(ebkVar, gstVar), hmlVar), hxe.d(-426102922, new dpue(gstVar), hmlVar), dpts.b, hmlVar, 905970048, 0, 144);
        hmlVar.n();
        return fctx.a;
    }
}
