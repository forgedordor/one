package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ymp extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ ymr c;
    final /* synthetic */ ajlt d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymp(ymr ymrVar, ajlt ajltVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ymrVar;
        this.d = ajltVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ymp) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [fdpm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [fdpm] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.List] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ?? r2;
        ArrayList arrayList;
        List listB;
        String strN;
        Object objC;
        fcyl fcylVar = fcyl.a;
        int i = this.b;
        if (i == 0) {
            fctl.b(obj);
            r2 = (fdpm) this.e;
            arrayList = new ArrayList();
            ymr ymrVar = this.c;
            ajlt ajltVar = this.d;
            ajmc ajmcVarD = ajltVar.d();
            if (ajmcVarD instanceof ajlr) {
                listB = ymrVar.f(((ajlr) ajmcVarD).a());
            } else {
                if (!(ajmcVarD instanceof ajmq)) {
                    throw new UnsupportedOperationException();
                }
                aoer aoerVarC = ((ajmq) ajmcVarD).c();
                String string = ymrVar.a.getString(R.string.message_metatext_sent_by_you);
                string.getClass();
                alqm alqmVar = (alqm) fdct.b(aoerVarC.o());
                String strAa = (alqmVar == null || (strN = alqmVar.n()) == null) ? null : fdgn.aa(strN, 4);
                if (strAa == null) {
                    strAa = aoerVarC.r();
                }
                listB = fcva.b(new dklv(string, null, null, false, strAa, null, true, false, 174));
            }
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(((dklv) it.next()).a);
            }
            this.e = arrayList;
            this.a = r2;
            this.b = 1;
            ajmc ajmcVarD2 = ajltVar.d();
            if (ajmcVarD2 instanceof ajlr) {
                objC = ymrVar.a(((ajlr) ajmcVarD2).a());
            } else {
                if (!(ajmcVarD2 instanceof ajmq)) {
                    throw new UnsupportedOperationException();
                }
                objC = ymrVar.c(((ajmq) ajmcVarD2).c(), this);
            }
            if (objC == fcylVar) {
                return fcylVar;
            }
        } else {
            if (i != 1) {
                fctl.b(obj);
                return fctx.a;
            }
            r2 = this.a;
            ?? r3 = (List) this.e;
            fctl.b(obj);
            arrayList = r3;
            objC = obj;
        }
        ymr ymrVar2 = this.c;
        ajlt ajltVar2 = this.d;
        xzl xzlVar = new xzl((dklq) objC, arrayList, ymrVar2.e(ajltVar2), fcva.b(ajltVar2.w() ? djrr.cj : djrr.ck));
        this.e = null;
        this.a = null;
        this.b = 2;
        if (r2.fO(xzlVar, this) == fcylVar) {
            return fcylVar;
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ymp ympVar = new ymp(this.c, this.d, fcxyVar);
        ympVar.e = obj;
        return ympVar;
    }
}
