package defpackage;

import android.os.Bundle;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class olf extends oia {
    public static final List g(String str) {
        str.getClass();
        return fcva.b(str);
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
        return fcur.M(pis.l(bundle, str));
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
        return "List<String>";
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        List list = (List) obj;
        str.getClass();
        if (list != null) {
            pjc.e(bundle, str, (String[]) list.toArray(new String[0]));
        } else {
            pjc.a(bundle, str);
        }
    }
}
