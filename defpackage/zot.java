package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zot extends fcyz implements fdaw {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ boolean c;
    /* synthetic */ boolean d;
    final /* synthetic */ zou e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zot(zou zouVar, fcxy fcxyVar) {
        super(5, fcxyVar);
        this.e = zouVar;
    }

    @Override // defpackage.fdaw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        zot zotVar = new zot(this.e, (fcxy) obj5);
        zotVar.a = (ekgb) obj;
        zotVar.b = (ajlk) obj2;
        zotVar.c = zBooleanValue;
        zotVar.d = zBooleanValue2;
        return zotVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [ajlk, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        zot zotVar = this;
        fctl.b(obj);
        ?? r1 = zotVar.a;
        ?? r2 = zotVar.b;
        boolean z = zotVar.c;
        boolean z2 = zotVar.d;
        ArrayList arrayList = new ArrayList(fcva.p((Iterable) r1, 10));
        Iterator it = r1.iterator();
        ekgb ekgbVar = r1;
        while (true) {
            zou zouVar = zotVar.e;
            boolean z3 = false;
            if (!it.hasNext()) {
                ArrayList arrayList2 = arrayList;
                String string = zouVar.a.getString(R.string.scheduled_messages_list_button_text, new Integer(ekgbVar.size()));
                string.getClass();
                return new zov(arrayList2, new djpe(string, z, new zos(zouVar)));
            }
            ajmy ajmyVar = (ajmy) it.next();
            ync yncVarA = zouVar.f.a(ajmyVar, null, null);
            ajlj ajljVarC = r2.c();
            ajlj ajljVar = ajlj.GROUP;
            bvdk bvdkVarI = r2.i();
            if (ajljVarC == ajljVar) {
                z3 = true;
            }
            boolean z4 = z2;
            ArrayList arrayList3 = arrayList;
            arrayList3.add(new zow(zouVar.d.a(new yko(yncVarA, z3, bvdkVarI, null, null, false, false, false, false, false, null, false, false, false, false, false, false, z4, 2096568)), ajmyVar.b(), z, zouVar.e.b));
            arrayList = arrayList3;
            z2 = z4;
            ekgbVar = ekgbVar;
            zotVar = this;
        }
    }
}
