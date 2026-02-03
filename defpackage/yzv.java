package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yzv implements fdat {
    final /* synthetic */ zaa a;
    final /* synthetic */ fduf b;
    final /* synthetic */ MessageId c;
    final /* synthetic */ Long d;
    final /* synthetic */ anho e;
    final /* synthetic */ boolean f;
    final /* synthetic */ boolean g;
    final /* synthetic */ ahat h;
    final /* synthetic */ boolean i;

    public yzv(zaa zaaVar, fduf fdufVar, MessageId messageId, Long l, anho anhoVar, boolean z, boolean z2, ahat ahatVar, boolean z3) {
        this.a = zaaVar;
        this.b = fdufVar;
        this.c = messageId;
        this.d = l;
        this.e = anhoVar;
        this.f = z;
        this.g = z2;
        this.h = ahatVar;
        this.i = z3;
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(-1224400529);
            final zaa zaaVar = this.a;
            boolean zF = hmlVar.F(zaaVar);
            final fduf fdufVar = this.b;
            boolean zF2 = zF | hmlVar.F(fdufVar);
            final MessageId messageId = this.c;
            boolean zF3 = zF2 | hmlVar.F(messageId);
            final Long l = this.d;
            boolean zD = zF3 | hmlVar.D(l);
            final anho anhoVar = this.e;
            boolean zF4 = zD | hmlVar.F(anhoVar);
            final boolean z = this.f;
            boolean zE = zF4 | hmlVar.E(z);
            final boolean z2 = this.g;
            boolean zE2 = zE | hmlVar.E(z2);
            Object objF = hmlVar.f();
            if (zE2 || objF == hmk.a) {
                Object obj3 = new aaag() { // from class: yzr
                    @Override // defpackage.aaag
                    public final void a(dnvg dnvgVar) {
                        dnvgVar.getClass();
                        zaaVar.n(fdufVar, messageId, l, anhoVar, anhp.b(dnvgVar), z, true, z2);
                    }
                };
                hmlVar.y(obj3);
                objF = obj3;
            }
            aaag aaagVar = (aaag) objF;
            hmlVar.o();
            boolean z3 = this.i;
            aaap aaapVar = (aaap) aaar.a.createBuilder();
            aaapVar.getClass();
            aaas.d(true == z3 ? 5 : 3, aaapVar);
            Object obj4 = anhoVar != null ? anhoVar.a : null;
            angl anglVar = obj4 instanceof angl ? (angl) obj4 : null;
            if (anglVar != null) {
                aaas.c(anglVar.a, aaapVar);
            }
            aaar aaarVarA = aaas.a(aaapVar);
            hmlVar.v(5004770);
            final ahat ahatVar = this.h;
            boolean zF5 = hmlVar.F(ahatVar);
            Object objF2 = hmlVar.f();
            if (zF5 || objF2 == hmk.a) {
                objF2 = new fdae() { // from class: yzs
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        ahatVar.a();
                        return fctx.a;
                    }
                };
                hmlVar.y(objF2);
            }
            fdae fdaeVar = (fdae) objF2;
            hmlVar.o();
            hmlVar.v(-1633490746);
            boolean zF6 = hmlVar.F(zaaVar) | hmlVar.D(l);
            Object objF3 = hmlVar.f();
            if (zF6 || objF3 == hmk.a) {
                objF3 = new fdae() { // from class: yzt
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        zaaVar.g.a(l);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF3);
            }
            fdae fdaeVar2 = (fdae) objF3;
            hmlVar.o();
            hmlVar.v(-1224400529);
            boolean zF7 = hmlVar.F(zaaVar) | hmlVar.F(fdufVar) | hmlVar.F(messageId) | hmlVar.D(l) | hmlVar.F(anhoVar) | hmlVar.E(z) | hmlVar.E(z2);
            Object objF4 = hmlVar.f();
            if (zF7 || objF4 == hmk.a) {
                Object obj5 = new fdap() { // from class: yzu
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj6) {
                        String str = (String) obj6;
                        str.getClass();
                        angl anglVarA = anhp.a(str);
                        zaaVar.n(fdufVar, messageId, l, anhoVar, anglVarA, z, true, z2);
                        return fctx.a;
                    }
                };
                hmlVar.y(obj5);
                objF4 = obj5;
            }
            hmlVar.o();
            aaal.a(new aaah(aaarVarA, fdaeVar, fdaeVar2, (fdap) objF4, aaagVar, null, 32), hmlVar, 0);
        }
        return fctx.a;
    }
}
