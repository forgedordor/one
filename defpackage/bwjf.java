package defpackage;

import com.google.communication.synapse.security.scytale.NativeBaseCrypto;
import com.google.communication.synapse.security.scytale.Scope;
import com.google.media.webrtc.common.StatusOr;
import google.internal.communications.instantmessaging.v1.TachyonCommon$PublicPreKeySets;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwjf {
    public static final cqce a = cqce.g("BugleE2eeEtouffee", "PrekeysManager");
    public final bwkr b;
    public final bwbn c;
    public final eosc d;
    public final eygg e;

    public bwjf(bwkr bwkrVar, bwbn bwbnVar, eosc eoscVar, eygg eyggVar) {
        this.b = bwkrVar;
        this.c = bwbnVar;
        this.d = eoscVar;
        this.e = eyggVar;
    }

    public final eiju a(String str) {
        final int iIntValue = ((Integer) bwbt.d.e()).intValue();
        cqbd cqbdVarA = a.a();
        cqbdVarA.I("Generating new prekey set");
        cqbdVarA.y("count", iIntValue);
        cqbdVarA.r();
        this.e.b();
        final Scope scopeCreate = Scope.create(this.b.b());
        return this.c.a(str).h(new ejvr() { // from class: bwiz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((NativeBaseCrypto) obj).generatePrekeySet(scopeCreate, iIntValue);
            }
        }, this.d).h(new ejvr() { // from class: bwja
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (TachyonCommon$PublicPreKeySets) bwlb.a((StatusOr) obj);
            }
        }, eoqg.a);
    }
}
