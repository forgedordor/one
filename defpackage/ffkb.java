package defpackage;

import java.security.Provider;
import java.security.Signature;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffkb implements ffjx {
    final /* synthetic */ Provider a;
    final /* synthetic */ ffkc b;

    public ffkb(ffkc ffkcVar, Provider provider) {
        this.a = provider;
        this.b = ffkcVar;
    }

    @Override // defpackage.ffjx
    public final Signature a(String str) {
        Provider provider = this.a;
        return provider != null ? Signature.getInstance(this.b.b, provider) : Signature.getInstance(this.b.b);
    }
}
