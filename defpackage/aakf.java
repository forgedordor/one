package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aakf extends fcyz implements fday {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ boolean e;
    /* synthetic */ boolean f;
    final /* synthetic */ aakh g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aakf(aakh aakhVar, fcxy fcxyVar) {
        super(7, fcxyVar);
        this.g = aakhVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        int i = ((alzc) this.a).a + ((alzc) this.b).a + ((alzc) this.c).a + ((alzc) this.d).a;
        boolean z = this.e;
        boolean z2 = this.f;
        if (i <= 0 || !z2 || !z) {
            return null;
        }
        aakh aakhVar = this.g;
        aako aakoVar = aakhVar.d;
        auvw.k(aakoVar.a, null, null, new aakn(aakoVar, null), 3);
        Context context = aakhVar.a;
        String string = context.getString(R.string.tooltip_close_action);
        string.getClass();
        dllt dlltVar = new dllt(string, new aakg(aakhVar));
        String string2 = context.getString(R.string.cdp_education_tooltip_content);
        string2.getClass();
        ekgb ekgbVarR = ekgb.r(dlltVar);
        ekgbVarR.getClass();
        return new dlmg(string2, ekgbVarR);
    }

    @Override // defpackage.fday
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
        aakf aakfVar = new aakf(this.g, (fcxy) obj7);
        aakfVar.a = (alzc) obj;
        aakfVar.b = (alzc) obj2;
        aakfVar.c = (alzc) obj3;
        aakfVar.d = (alzc) obj4;
        aakfVar.e = zBooleanValue;
        aakfVar.f = zBooleanValue2;
        return aakfVar.b(fctx.a);
    }
}
