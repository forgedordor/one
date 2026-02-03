package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public abstract class gd extends pou {
    public final fr a;
    public gg b = null;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public ea e = null;
    private boolean h;

    public gd(fr frVar) {
        this.a = frVar;
    }

    @Override // defpackage.pou
    public final Parcelable a() {
        Bundle bundle;
        ArrayList arrayList = this.c;
        if (arrayList.size() > 0) {
            bundle = new Bundle();
            dz[] dzVarArr = new dz[arrayList.size()];
            arrayList.toArray(dzVarArr);
            bundle.putParcelableArray("states", dzVarArr);
        } else {
            bundle = null;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i >= arrayList2.size()) {
                return bundle;
            }
            ea eaVar = (ea) arrayList2.get(i);
            if (eaVar != null && eaVar.aF()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                String strG = a.g(i, "f");
                fr frVar = this.a;
                if (eaVar.B != frVar) {
                    frVar.X(new IllegalStateException(a.h(eaVar, "Fragment ", " is not currently in the FragmentManager")));
                }
                bundle.putString(strG, eaVar.l);
            }
            i++;
        }
    }

    public abstract ea b(int i);

    @Override // defpackage.pou
    public final Object c(ViewGroup viewGroup, int i) {
        dz dzVar;
        ea eaVar;
        ArrayList arrayList = this.d;
        if (arrayList.size() > i && (eaVar = (ea) arrayList.get(i)) != null) {
            return eaVar;
        }
        if (this.b == null) {
            this.b = new cg(this.a);
        }
        ea eaVarB = b(i);
        ArrayList arrayList2 = this.c;
        if (arrayList2.size() > i && (dzVar = (dz) arrayList2.get(i)) != null) {
            eaVarB.aw(dzVar);
        }
        while (arrayList.size() <= i) {
            arrayList.add(null);
        }
        eaVarB.ax(false);
        arrayList.set(i, eaVarB);
        this.b.s(viewGroup.getId(), eaVarB);
        this.b.m(eaVarB, lvb.d);
        return eaVarB;
    }

    @Override // defpackage.pou
    public final void e(Parcelable parcelable, ClassLoader classLoader) throws NumberFormatException {
        ea eaVarE;
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            ArrayList arrayList = this.c;
            arrayList.clear();
            ArrayList arrayList2 = this.d;
            arrayList2.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    arrayList.add((dz) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int i = Integer.parseInt(str.substring(1));
                    fr frVar = this.a;
                    String string = bundle.getString(str);
                    if (string == null) {
                        eaVarE = null;
                    } else {
                        eaVarE = frVar.e(string);
                        if (eaVarE == null) {
                            frVar.X(new IllegalStateException(a.n(string, str, "Fragment no longer exists for key ", ": unique id ")));
                        }
                    }
                    if (eaVarE != null) {
                        while (arrayList2.size() <= i) {
                            arrayList2.add(null);
                        }
                        eaVarE.ax(false);
                        arrayList2.set(i, eaVarE);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key ".concat(String.valueOf(str)));
                    }
                }
            }
        }
    }

    @Override // defpackage.pou
    public final void f(ViewGroup viewGroup, int i, Object obj) {
        ea eaVar = (ea) obj;
        ea eaVar2 = this.e;
        if (eaVar != eaVar2) {
            if (eaVar2 != null) {
                eaVar2.ax(false);
                if (this.b == null) {
                    this.b = new cg(this.a);
                }
                this.b.m(this.e, lvb.d);
            }
            eaVar.ax(true);
            if (this.b == null) {
                this.b = new cg(this.a);
            }
            this.b.m(eaVar, lvb.e);
            this.e = eaVar;
        }
    }

    @Override // defpackage.pou
    public final void g(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException(a.h(this, "ViewPager with adapter ", " requires a view id"));
        }
    }

    @Override // defpackage.pou
    public final boolean h(View view, Object obj) {
        return ((ea) obj).Q == view;
    }

    @Override // defpackage.pou
    public final void i() {
        gg ggVar = this.b;
        if (ggVar != null) {
            if (!this.h) {
                try {
                    this.h = true;
                    ggVar.d();
                } finally {
                    this.h = false;
                }
            }
            this.b = null;
        }
    }
}
