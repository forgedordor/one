package defpackage;

import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agxe extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ SwitchPreferenceCompat c;
    final /* synthetic */ agxd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agxe(SwitchPreferenceCompat switchPreferenceCompat, agxd agxdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = switchPreferenceCompat;
        this.d = agxdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agxe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            obj2 = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            SwitchPreferenceCompat switchPreferenceCompat = this.c;
            cgte cgteVar = (cgte) ((Optional) this.d.b.b()).get();
            this.a = switchPreferenceCompat;
            this.b = 1;
            Object objF = cgteVar.f(this);
            if (objF == fcylVar) {
                return fcylVar;
            }
            obj2 = switchPreferenceCompat;
            obj = objF;
        }
        ((TwoStatePreference) obj2).k(((Boolean) obj).booleanValue());
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new agxe(this.c, this.d, fcxyVar);
    }
}
