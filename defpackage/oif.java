package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oif extends oia {
    public static final List g(String str) {
        str.getClass();
        return fcva.b(okq.a.c(str));
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
        int[] iArrJ = pis.j(bundle, str);
        int length = iArrJ.length;
        if (length == 0) {
            return fcvo.a;
        }
        if (length == 1) {
            return fcva.b(Integer.valueOf(iArrJ[0]));
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i : iArrJ) {
            arrayList.add(Integer.valueOf(i));
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
        return "List<Int>";
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        List list = (List) obj;
        str.getClass();
        if (list != null) {
            bundle.putIntArray(str, fcva.aC(list));
        }
    }
}
