package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ohy extends oia {
    public static final List g(String str) {
        str.getClass();
        return fcva.b(okq.k.c(str));
    }

    @Override // defpackage.oia
    public final /* synthetic */ Object a() {
        return fcvo.a;
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        if (!pis.g(bundle, str) || pis.h(bundle, str)) {
            return null;
        }
        boolean[] zArrM = pis.m(bundle, str);
        int length = zArrM.length;
        if (length == 0) {
            return fcvo.a;
        }
        if (length == 1) {
            return fcva.b(Boolean.valueOf(zArrM[0]));
        }
        ArrayList arrayList = new ArrayList(length);
        for (boolean z : zArrM) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object c(String str) {
        return g(str);
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object d(String str, Object obj) {
        List list = (List) obj;
        return list != null ? fcva.ah(list, g(str)) : g(str);
    }

    @Override // defpackage.okq
    public final String e() {
        return "List<Boolean>";
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        List list = (List) obj;
        str.getClass();
        if (list == null) {
            pjc.a(bundle, str);
            return;
        }
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        bundle.putBooleanArray(str, zArr);
    }
}
