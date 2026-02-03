package defpackage;

import java.security.Signature;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffkg implements ffjx {
    final /* synthetic */ ffkj a;

    public ffkg(ffkj ffkjVar) {
        this.a = ffkjVar;
    }

    @Override // defpackage.ffjx
    public final Signature a(String str) {
        try {
            return this.a.f.a(str);
        } catch (Exception unused) {
            return Signature.getInstance(str);
        }
    }
}
