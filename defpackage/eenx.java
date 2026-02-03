package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eenx implements op {
    public eenu a;
    public boolean b = false;
    public int c;

    @Override // defpackage.op
    public final int a() {
        return this.c;
    }

    @Override // defpackage.op
    public final void c(Context context, oc ocVar) {
        this.a.a(ocVar);
    }

    @Override // defpackage.op
    public final Parcelable dG() {
        eenw eenwVar = new eenw();
        eenu eenuVar = this.a;
        eenwVar.a = eenuVar.f;
        SparseArray sparseArray = eenuVar.q;
        eelv eelvVar = new eelv();
        for (int i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            eedk eedkVar = (eedk) sparseArray.valueAt(i);
            eelvVar.put(iKeyAt, eedkVar != null ? eedkVar.b.a : null);
        }
        eenwVar.b = eelvVar;
        return eenwVar;
    }

    @Override // defpackage.op
    public final void e(oo ooVar) {
        throw null;
    }

    @Override // defpackage.op
    public final void f(boolean z) {
        eenr eenrVar;
        pnf pnfVar;
        if (this.b) {
            return;
        }
        if (z) {
            this.a.e();
            return;
        }
        eenu eenuVar = this.a;
        eenr eenrVar2 = eenuVar.G;
        if (eenrVar2 == null || eenuVar.e == null) {
            return;
        }
        eenuVar.F.b = true;
        eenrVar2.c();
        eenuVar.F.b = false;
        if (eenuVar.e != null && (eenrVar = eenuVar.G) != null && eenrVar.a() == eenuVar.e.length) {
            for (int i = 0; i < eenuVar.e.length; i++) {
                if (!(eenuVar.G.b(i) instanceof eenj) || (eenuVar.e[i] instanceof eenk)) {
                    boolean z2 = eenuVar.G.b(i).hasSubMenu() && !(eenuVar.e[i] instanceof eeny);
                    boolean z3 = (eenuVar.G.b(i).hasSubMenu() || (eenuVar.e[i] instanceof eenp)) ? false : true;
                    if ((eenuVar.G.b(i) instanceof eenj) || (!z2 && !z3)) {
                    }
                }
            }
            int i2 = eenuVar.f;
            int iA = eenuVar.G.a();
            for (int i3 = 0; i3 < iA; i3++) {
                MenuItem menuItemB = eenuVar.G.b(i3);
                if (menuItemB.isChecked()) {
                    eenuVar.f(menuItemB);
                    eenuVar.f = menuItemB.getItemId();
                    eenuVar.g = i3;
                }
            }
            if (i2 != eenuVar.f && (pnfVar = eenuVar.b) != null) {
                pnb.b(eenuVar, pnfVar);
            }
            boolean zH = eenuVar.h(eenuVar.c, eenuVar.c());
            for (int i4 = 0; i4 < iA; i4++) {
                eenuVar.F.b = true;
                eenuVar.e[i4].c();
                eens eensVar = eenuVar.e[i4];
                if (eensVar instanceof eenp) {
                    eenp eenpVar = (eenp) eensVar;
                    eenpVar.E(eenuVar.c);
                    eenpVar.y(eenuVar.d);
                    eenpVar.x(eenuVar.C);
                    eenpVar.G(zH);
                }
                if (eenuVar.G.b(i4) instanceof of) {
                    eenuVar.e[i4].f((of) eenuVar.G.b(i4));
                }
                eenuVar.F.b = false;
            }
            return;
        }
        eenuVar.e();
    }

    @Override // defpackage.op
    public final boolean g() {
        return false;
    }

    @Override // defpackage.op
    public final boolean h(ox oxVar) {
        return false;
    }

    @Override // defpackage.op
    public final boolean i(of ofVar) {
        return false;
    }

    @Override // defpackage.op
    public final boolean j(of ofVar) {
        return false;
    }

    @Override // defpackage.op
    public final void n(Parcelable parcelable) {
        if (parcelable instanceof eenw) {
            eenu eenuVar = this.a;
            eenw eenwVar = (eenw) parcelable;
            int i = eenwVar.a;
            int iA = eenuVar.G.a();
            int i2 = 0;
            while (true) {
                if (i2 >= iA) {
                    break;
                }
                MenuItem menuItemB = eenuVar.G.b(i2);
                if (i == menuItemB.getItemId()) {
                    eenuVar.f = i;
                    eenuVar.g = i2;
                    eenuVar.f(menuItemB);
                    break;
                }
                i2++;
            }
            Context context = this.a.getContext();
            eelv eelvVar = eenwVar.b;
            SparseArray sparseArray = new SparseArray(eelvVar.size());
            for (int i3 = 0; i3 < eelvVar.size(); i3++) {
                int iKeyAt = eelvVar.keyAt(i3);
                eedm eedmVar = (eedm) eelvVar.valueAt(i3);
                sparseArray.put(iKeyAt, eedmVar != null ? new eedk(context, eedmVar) : null);
            }
            eenu eenuVar2 = this.a;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                int iKeyAt2 = sparseArray.keyAt(i4);
                SparseArray sparseArray2 = eenuVar2.q;
                if (sparseArray2.indexOfKey(iKeyAt2) < 0) {
                    sparseArray2.append(iKeyAt2, (eedk) sparseArray.get(iKeyAt2));
                }
            }
            eens[] eensVarArr = eenuVar2.e;
            if (eensVarArr != null) {
                for (eens eensVar : eensVarArr) {
                    if (eensVar instanceof eenp) {
                        eenp eenpVar = (eenp) eensVar;
                        eedk eedkVar = (eedk) eenuVar2.q.get(eenpVar.getId());
                        if (eedkVar != null) {
                            eenpVar.p(eedkVar);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.op
    public final void d(oc ocVar, boolean z) {
    }
}
