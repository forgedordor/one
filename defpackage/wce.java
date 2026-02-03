package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wce extends fcyz implements fdaw {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ boolean d;
    final /* synthetic */ wcf e;
    final /* synthetic */ wat f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wce(wcf wcfVar, wat watVar, fcxy fcxyVar) {
        super(5, fcxyVar);
        this.e = wcfVar;
        this.f = watVar;
    }

    @Override // defpackage.fdaw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        wce wceVar = new wce(this.e, this.f, (fcxy) obj5);
        wceVar.a = (String) obj;
        wceVar.b = (dpqk) obj2;
        wceVar.c = (wfl) obj3;
        wceVar.d = zBooleanValue;
        return wceVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        wfl wflVar = (wfl) this.c;
        fdae fdaeVar = wflVar.b;
        djrr djrrVar = wflVar.a;
        boolean z = this.d;
        wcf wcfVar = this.e;
        djrr djrrVarA = wcfVar.a();
        fcww fcwwVar = new fcww((byte[]) null);
        if (wcfVar.d.a() && (((dpqk) obj3).a instanceof dpsb) && z) {
            String string = wcfVar.a.getString(R.string.tune_button_content_description);
            string.getClass();
            fcwwVar.add(new dpov(djrrVar, string, fdaeVar));
        }
        wat watVar = this.f;
        Context context = wcfVar.a;
        djrr djrrVar2 = djrr.e;
        String string2 = context.getString(R.string.show_camera_button_content_description);
        string2.getClass();
        fcwwVar.add(new dpov(djrrVar2, string2, watVar.a));
        return new wcg((String) obj2, djrrVarA, fcva.a(fcwwVar));
    }
}
