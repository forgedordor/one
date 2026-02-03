package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cicc implements cicm {
    public final cibz a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final eosc e;

    public cicc(cibz cibzVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, eosc eoscVar) {
        this.a = cibzVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = eoscVar;
    }

    @Override // defpackage.cicm
    public final ConversationIdType a(cicr cicrVar) {
        cpeb cpebVarC = c(cicrVar);
        return cpebVarC == null ? barn.a : cpebVarC.a();
    }

    @Override // defpackage.cicm
    public final cpeb c(cicr cicrVar) {
        Optional optional = ((ciaj) cicrVar).r;
        eyga eygaVar = (eyga) optional.orElse(null);
        civa civaVar = civa.RCS_PENPAL_NAMESPACE;
        Optional optionalA = civb.a(eygaVar, civaVar, "BUGLE-CONVERSATION-ID");
        final Optional optionalOf = optionalA.isPresent() ? Optional.of(barn.b((String) optionalA.get())) : Optional.empty();
        if (optionalOf.isPresent()) {
            return new cpdx((ConversationIdType) optionalOf.get(), new eygg() { // from class: cica
                @Override // defpackage.eygg
                public final Object b() {
                    return this.a.a.b((ConversationIdType) optionalOf.get());
                }
            });
        }
        Optional optionalA2 = civb.a((eyga) optional.orElse(null), civaVar, "PENPAL-COUNTERPARTY-NUMBER");
        Optional optionalOf2 = optionalA2.isPresent() ? Optional.of(((anuh) this.d.b()).a(((alrj) this.c.b()).b(((asqx) this.b.b()).a((String) optionalA2.get(), false)))) : Optional.empty();
        if (!optionalOf2.isPresent()) {
            return this.a.c(cicrVar);
        }
        cibz cibzVar = this.a;
        ciai ciaiVar = new ciai(cicrVar);
        ciaiVar.r(ekgb.r(optionalOf2.get()));
        return cibzVar.c(ciaiVar.D());
    }

    @Override // defpackage.cicm
    public final eiju d(final cicr cicrVar) {
        return eijx.g(new Callable() { // from class: cicb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a(cicrVar);
            }
        }, this.e);
    }
}
