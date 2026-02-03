package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.multishare.chip.ChipData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afnk extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ afnl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afnk(afnl afnlVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = afnlVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        afnk afnkVar = new afnk(this.c, (fcxy) obj3);
        afnkVar.a = (ajou) obj;
        afnkVar.b = (afmy) obj2;
        return afnkVar.b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [ajou, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [afmy, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        List arrayList;
        fctl.b(obj);
        final ?? r1 = this.a;
        ?? r2 = this.b;
        if (r1 != 0) {
            final afnl afnlVar = this.c;
            ekgb ekgbVarB = r1.b();
            arrayList = new ArrayList(fcva.p(ekgbVarB, 10));
            ekqh it = ekgbVarB.iterator();
            while (it.hasNext()) {
                final ajpk ajpkVar = (ajpk) it.next();
                String strB = ((aqiu) afnlVar.c.b()).a() ? cssf.b(ajpkVar.b, false) : ajpkVar.b;
                arrayList.add(new djwc(ajpkVar.a() + " " + strB, null, null, r2.f(ajpkVar.a), false, new fdae() { // from class: afni
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        ChipData chipDataB = afmx.b(r1, ajpkVar.a);
                        afnl afnlVar2 = afnlVar;
                        afnlVar2.b.c(chipDataB);
                        afnlVar2.c();
                        return fctx.a;
                    }
                }, null, 0, 214));
            }
        } else {
            arrayList = fcvo.a;
        }
        afnl afnlVar2 = this.c;
        String string = afnlVar2.a.getString(R.string.picker_disambiguation_title);
        string.getClass();
        return new djmn(string, arrayList, null, null, null, null, null, null, new afnj(afnlVar2), 252);
    }
}
