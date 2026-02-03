package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckxi {
    public static final ckmc a(eyga eygaVar) {
        Optional optionalB = ciuy.b(eygaVar);
        return !optionalB.isPresent() ? ckmc.REACTION_ACTION_UNSPECIFIED : fdbq.f(optionalB.get(), "+Reaction") ? ckmc.ADD_REACTION : fdbq.f(optionalB.get(), "-Reaction") ? ckmc.REMOVE_REACTION : ckmc.REACTION_ACTION_UNSPECIFIED;
    }
}
