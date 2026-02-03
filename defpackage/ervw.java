package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ervw extends ThreadLocal {
    final /* synthetic */ ervx a;

    public ervw(ervx ervxVar) {
        this.a = ervxVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() throws InvalidKeyException {
        try {
            ervg ervgVar = ervg.b;
            ervx ervxVar = this.a;
            Mac mac = (Mac) ervgVar.a(ervxVar.a);
            mac.init(ervxVar.b);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
