package defpackage;

import java.security.Signature;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffka implements ffjx {
    final /* synthetic */ String a;

    public ffka(String str) {
        this.a = str;
    }

    @Override // defpackage.ffjx
    public final Signature a(String str) {
        String str2 = this.a;
        return str2 != null ? Signature.getInstance(str, str2) : Signature.getInstance(str);
    }
}
