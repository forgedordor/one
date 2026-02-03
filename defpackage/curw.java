package defpackage;

import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class curw extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ SwitchPreferenceCompat c;
    final /* synthetic */ adhu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public curw(SwitchPreferenceCompat switchPreferenceCompat, adhu adhuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = switchPreferenceCompat;
        this.d = adhuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((curw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
            adhu adhuVar = this.d;
            this.a = switchPreferenceCompat;
            this.b = 1;
            Object objB = adhuVar.b(this);
            if (objB == fcylVar) {
                return fcylVar;
            }
            obj2 = switchPreferenceCompat;
            obj = objB;
        }
        ((TwoStatePreference) obj2).k(obj == adik.PHOTOS_LINK);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new curw(this.c, this.d, fcxyVar);
    }
}
