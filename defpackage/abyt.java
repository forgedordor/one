package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abyt implements afju {
    private final fcsu a;

    public abyt(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    @Override // defpackage.afju
    public final void a(efwo efwoVar) {
        if (abxb.a()) {
            cdiw cdiwVar = (cdiw) this.a.b();
            fcsu fcsuVar = cdiwVar.c;
            if (((cdji) fcsuVar.b()).b.contains(Integer.valueOf(efwoVar.a()))) {
                ((ekrd) cdiw.a.e().h("com/google/android/apps/messaging/shared/gaia/dataservice/GaiaAuthCheckHelper", "queueGaiaAuthCheck", 29, "GaiaAuthCheckHelper.kt")).q("Gaia auth check not queued; already successful");
                return;
            }
            if (((cdji) fcsuVar.b()).a(efwoVar)) {
                ((ekrd) cdiw.a.e().h("com/google/android/apps/messaging/shared/gaia/dataservice/GaiaAuthCheckHelper", "queueGaiaAuthCheck", 33, "GaiaAuthCheckHelper.kt")).q("Gaia auth check not queued; dialog already shown");
                return;
            }
            ((ekrd) cdiw.a.h().h("com/google/android/apps/messaging/shared/gaia/dataservice/GaiaAuthCheckHelper", "queueGaiaAuthCheck", 37, "GaiaAuthCheckHelper.kt")).q("Gaia auth check queued");
            cdjh cdjhVar = cdiwVar.b;
            bzzw bzzwVar = (bzzw) bzzx.a.createBuilder();
            int iA = efwoVar.a();
            bzzwVar.copyOnWrite();
            bzzx bzzxVar = (bzzx) bzzwVar.instance;
            bzzxVar.b |= 1;
            bzzxVar.c = iA;
            bzzx bzzxVar2 = (bzzx) bzzwVar.build();
            caxr caxrVar = new caxr();
            caxrVar.b = efwoVar.toString();
            ((cazj) cdjhVar.a.b()).g(cbcu.g("gaia_auth_check_result", bzzxVar2, caxrVar.a()));
        }
    }
}
