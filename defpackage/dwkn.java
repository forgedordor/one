package defpackage;

import java.security.KeyPair;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dwkn extends dwjt {
    @Override // defpackage.dwjt
    public KeyPair a() {
        throw new UnsupportedOperationException(b() != 1 ? "ECDSA" : "MISSING");
    }
}
