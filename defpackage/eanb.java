package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eanb implements eaje {
    public final eaww a;
    public final eajj b;
    public final eajo c;
    public final eant d;
    public final diep e;
    public final eanu f;

    public eanb(eanu eanuVar, eaww eawwVar, eajj eajjVar, eajo eajoVar, eant eantVar, diep diepVar) {
        this.f = eanuVar;
        this.a = eawwVar;
        this.b = eajjVar;
        this.c = eajoVar;
        this.d = eantVar;
        this.e = diepVar;
    }

    @Override // defpackage.eaje
    public final defn a(eava eavaVar, final int i) {
        eaua eauaVar = (eaua) eavaVar;
        if (TextUtils.isEmpty(eauaVar.a)) {
            return degc.b(new dcff(new Status(9012, "Place ID must not be empty.")));
        }
        if (eauaVar.b.isEmpty()) {
            return degc.b(new dcff(new Status(9012, "Place Fields must not be empty.")));
        }
        eanu eanuVar = this.f;
        eamo eamoVar = new eamo(eavaVar, eanuVar.b(), eanuVar.a(), this.a);
        diep diepVar = this.e;
        eajj eajjVar = this.b;
        final long jA = diepVar.a();
        return eajjVar.a(eamoVar, eamp.class).b(new deeq() { // from class: eamz
            @Override // defpackage.deeq
            public final Object a(defn defnVar) throws dcff {
                eamp eampVar = (eamp) defnVar.i();
                String str = eampVar.status;
                int iA = eanf.a(str);
                if (eavp.b(iA)) {
                    throw new dcff(new Status(iA, eanf.b(str, eampVar.errorMessage)));
                }
                eane eaneVar = eampVar.result;
                String[] strArr = eampVar.htmlAttributions;
                return new eaub(eanc.d(eaneVar, strArr != null ? ekgb.p(strArr) : null));
            }
        }).b(new deeq() { // from class: eana
            @Override // defpackage.deeq
            public final Object a(defn defnVar) {
                long j = jA;
                int i2 = i;
                eanb eanbVar = this.a;
                eanbVar.d.d(defnVar, j, eanbVar.e.a(), 2, i2, eaiu.a);
                return (eavb) defnVar.i();
            }
        });
    }
}
