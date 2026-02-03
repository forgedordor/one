package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsqa {
    private final Context a;
    private final dxxd b;

    public dsqa(Context context, dxxd dxxdVar) {
        this.a = context;
        this.b = dxxdVar;
    }

    private final void c(List list, String str, int i, int i2) {
        if (str.isEmpty()) {
            return;
        }
        dxxd dxxdVar = this.b;
        dxvb dxvbVarG = dxvd.g();
        dxvbVarG.c(str);
        dxvbVarG.d(i);
        dxvbVarG.b(i2);
        list.add(dxxdVar.a.a(dxxdVar.b, dxvbVarG.a()));
    }

    private static final void d(List list, String str) {
        if (str.isEmpty()) {
            return;
        }
        list.add(eorv.a);
    }

    public final List a(etly etlyVar) {
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        int iB = dsqj.b(etlyVar, context);
        int iA = dsqj.a(etlyVar, context);
        c(arrayList, etlyVar.c == 5 ? (String) etlyVar.d : "", iB, iA);
        Iterator<E> it = etlyVar.k.iterator();
        while (it.hasNext()) {
            etmc etmcVar = ((etnt) it.next()).e;
            if (etmcVar == null) {
                etmcVar = etmc.a;
            }
            c(arrayList, etmcVar.b == 1 ? (String) etmcVar.c : "", iB, iA);
        }
        return arrayList;
    }

    public final List b(etly etlyVar) {
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        dsqj.b(etlyVar, context);
        dsqj.a(etlyVar, context);
        d(arrayList, etlyVar.c == 5 ? (String) etlyVar.d : "");
        Iterator<E> it = etlyVar.k.iterator();
        while (it.hasNext()) {
            etmc etmcVar = ((etnt) it.next()).e;
            if (etmcVar == null) {
                etmcVar = etmc.a;
            }
            d(arrayList, etmcVar.b == 1 ? (String) etmcVar.c : "");
        }
        return arrayList;
    }
}
