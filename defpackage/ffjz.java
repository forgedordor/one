package defpackage;

import java.security.Signature;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffjz implements ffjx {
    final /* synthetic */ ffkc a;

    public ffjz(ffkc ffkcVar) {
        this.a = ffkcVar;
    }

    @Override // defpackage.ffjx
    public final Signature a(String str) {
        try {
            return this.a.e.a(str);
        } catch (Exception unused) {
            return Signature.getInstance(str);
        }
    }
}
