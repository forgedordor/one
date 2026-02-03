package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ohz extends okq {
    public ohz() {
        super(false);
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        if (!pis.g(bundle, str) || pis.h(bundle, str)) {
            return null;
        }
        boolean z = bundle.getBoolean(str, false);
        if (z || !bundle.getBoolean(str, true)) {
            return Boolean.valueOf(z);
        }
        pit.a(str);
        throw new fcta();
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object c(String str) {
        boolean z;
        str.getClass();
        if (fdbq.f(str, "true")) {
            z = true;
        } else {
            if (!fdbq.f(str, "false")) {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.okq
    public final String e() {
        return "boolean";
    }

    @Override // defpackage.okq
    public final /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        bundle.putBoolean(str, ((Boolean) obj).booleanValue());
    }
}
