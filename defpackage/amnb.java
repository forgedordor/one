package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amnb implements aokl {
    public final int a;
    private final fcsu b;
    private final fctc c = fctd.a(new fdae() { // from class: ammz
        @Override // defpackage.fdae
        public final Object invoke() {
            return new amna(this.a);
        }
    });

    public amnb(fcsu fcsuVar, int i) {
        this.b = fcsuVar;
        this.a = i;
    }

    private final aokj d() {
        return e() ? aokj.SMS : aokj.SATELLITE;
    }

    private final boolean e() {
        return ((cljh) ((cliy) this.b.b()).h().c()).c();
    }

    @Override // defpackage.aokl
    @fcsv
    public final aokk a(String str) {
        int length;
        int length2;
        ecem.b();
        int i = (str == null || str.length() == 0) ? 0 : 1;
        if (str != null) {
            length = str.length();
        } else {
            str = null;
            length = 0;
        }
        int i2 = this.a;
        boolean zE = e();
        if (str == null) {
            str = "";
        }
        if (zE) {
            length2 = str.length();
        } else {
            byte[] bytes = str.getBytes(fdfy.a);
            bytes.getClass();
            length2 = bytes.length;
        }
        int i3 = i2 - length2;
        aojx aojxVar = new aojx();
        aojxVar.d(i);
        aojxVar.c(length);
        aojxVar.b(i3);
        aojxVar.f(1);
        aojxVar.e(false);
        aojxVar.g(0);
        aojxVar.h(d());
        aojxVar.j(d());
        return aojxVar.i();
    }

    @Override // defpackage.aokl
    public final aokk b(amwf amwfVar, boolean z) {
        return a(amwfVar != null ? amwfVar.c() : null);
    }

    @Override // defpackage.aokl
    public final aokm c() {
        return (amna) this.c.a();
    }
}
