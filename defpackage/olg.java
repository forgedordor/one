package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class olg extends okq {
    public olg() {
        super(true);
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        if (!pis.g(bundle, str) || pis.h(bundle, str)) {
            return null;
        }
        return pis.c(bundle, str);
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object c(String str) {
        str.getClass();
        if (fdbq.f(str, "null")) {
            return null;
        }
        return str;
    }

    @Override // defpackage.okq
    public final String e() {
        return "string";
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        String str2 = (String) obj;
        if (str2 != null) {
            pjc.d(bundle, str, str2);
        } else {
            pjc.a(bundle, str);
        }
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ String h(Object obj) {
        String str = (String) obj;
        if (str == null) {
            return "null";
        }
        String strEncode = Uri.encode(str, null);
        strEncode.getClass();
        return strEncode;
    }
}
