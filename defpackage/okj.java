package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class okj extends okq {
    public okj() {
        super(false);
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        return Integer.valueOf(pis.a(bundle, str));
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object c(String str) throws NumberFormatException {
        int i;
        str.getClass();
        if (fdgn.t(str, "0x")) {
            String strSubstring = str.substring(2);
            strSubstring.getClass();
            i = Integer.parseInt(strSubstring, 16);
        } else {
            i = Integer.parseInt(str);
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.okq
    public final String e() {
        return "reference";
    }

    @Override // defpackage.okq
    public final /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        bundle.putInt(str, ((Number) obj).intValue());
    }
}
