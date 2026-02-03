package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oii extends oia {
    public static final List g(String str) {
        str.getClass();
        return fcva.b(okq.e.c(str));
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
        long[] jArrK = pis.k(bundle, str);
        int length = jArrK.length;
        if (length == 0) {
            return fcvo.a;
        }
        if (length == 1) {
            return fcva.b(Long.valueOf(jArrK[0]));
        }
        ArrayList arrayList = new ArrayList(length);
        for (long j : jArrK) {
            arrayList.add(Long.valueOf(j));
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
        return "List<Long>";
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        List list = (List) obj;
        str.getClass();
        if (list != null) {
            bundle.putLongArray(str, fcva.aD(list));
        } else {
            pjc.a(bundle, str);
        }
    }
}
