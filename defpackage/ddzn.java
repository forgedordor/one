package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.internal.IPhenotypeService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddzn extends dcfm {
    public static final /* synthetic */ int a = 0;

    static {
        Pair.create(new ddzv(), degc.c(null));
    }

    public ddzn(Context context) {
        super(context, ddys.a, dcfa.q, dcfl.a);
    }

    public static defn a() {
        return degc.b(new dcff(new Status(16)));
    }

    public final defn b(final String str) {
        dciz dcizVar = new dciz();
        dcizVar.a = new dcir() { // from class: ddzd
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                int i = ddzn.a;
                ((IPhenotypeService) ((ddzx) obj).w()).commitToConfiguration(new ddzm((defr) obj2), str);
            }
        };
        return j(dcizVar.a());
    }

    public final defn c(final String str, final int i, final String[] strArr, final byte[] bArr) {
        dciz dcizVar = new dciz();
        dcizVar.a = new dcir() { // from class: ddzc
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                int i2 = ddzn.a;
                ((IPhenotypeService) ((ddzx) obj).w()).register(new ddzm((defr) obj2), str, i, strArr, bArr);
            }
        };
        return j(dcizVar.a());
    }

    public final defn d(final String str, final eryf eryfVar) {
        dciz dcizVar = new dciz();
        dcizVar.a = new dcir() { // from class: ddzg
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                int i = ddzn.a;
                ((IPhenotypeService) ((ddzx) obj).w()).setRuntimeProperties(new ddzi((defr) obj2), str, eryfVar.toByteArray());
            }
        };
        dcizVar.b = new Feature[]{ddym.h};
        dcizVar.b();
        return j(dcizVar.a());
    }

    public final boolean e(int i) {
        return dcdu.d.h(this.c, i) == 0;
    }

    public final defn f(final String str) {
        if (!e(12451000)) {
            return a();
        }
        dciz dcizVar = new dciz();
        dcizVar.a = new dcir() { // from class: ddzb
            public final /* synthetic */ String b = "";

            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                int i = ddzn.a;
                ddzm ddzmVar = new ddzm((defr) obj2);
                ((IPhenotypeService) ((ddzx) obj).w()).commitToConfiguration(ddzmVar, "CURRENT:" + this.b + ":" + str);
            }
        };
        return j(dcizVar.a());
    }

    public final defn o(final String str, final String str2) {
        dciz dcizVar = new dciz();
        dcizVar.a = new dcir() { // from class: ddyu
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                int i = ddzn.a;
                ((IPhenotypeService) ((ddzx) obj).w()).getConfigurationSnapshotWithToken(new ddzm((defr) obj2), str, str2, null);
            }
        };
        return j(dcizVar.a());
    }

    public final void p(final int[] iArr, final String str) {
        dciz dcizVar = new dciz();
        dcizVar.a = new dcir() { // from class: ddzh
            public final /* synthetic */ String a = "MOBILE_CONFIGURATION_NAME_SPACE";

            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                int i = ddzn.a;
                ddzm ddzmVar = new ddzm((defr) obj2);
                ((IPhenotypeService) ((ddzx) obj).w()).weakRegister(ddzmVar, "__internal.external_ids#".concat(this.a), 0, new String[]{str}, iArr, null);
            }
        };
        j(dcizVar.a());
    }
}
