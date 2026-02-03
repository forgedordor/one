package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import google.internal.communications.instantmessaging.v1.TachyonCommon$PublicPreKeySets;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwjm implements cfjb {
    public static final cqce a = cqce.g("BugleE2eeEtouffee", "RegisterDataDecoratorImpl");
    public final eosc b;
    public final bwjf c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    private final eosc g;
    private final cexn h;

    public bwjm(eosc eoscVar, eosc eoscVar2, bwjf bwjfVar, fcsu fcsuVar, cexn cexnVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.b = eoscVar;
        this.g = eoscVar2;
        this.c = bwjfVar;
        this.d = fcsuVar;
        this.h = cexnVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
    }

    @Override // defpackage.cfjb
    public final eiju a(final ezli ezliVar, alqm alqmVar, int i) {
        final String str = (String) alqmVar.c().orElseThrow(new Supplier() { // from class: bwji
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IllegalStateException("No normalized phone number.");
            }
        });
        return (i == 1 ? eijx.e(true) : this.h.a(str).i().h(new ejvr() { // from class: bwjk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((cevq) obj) != cevq.REGISTERED_WITH_PREKEYS);
            }
        }, this.b)).i(new eooz() { // from class: bwjj
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                final ezli ezliVar2 = ezliVar;
                if (!bwbt.a()) {
                    bwjm.a.m("Etouffee not enabled. Do not decorate RegisterData");
                    return eijx.e(ezliVar2);
                }
                bwjm bwjmVar = this.a;
                if (!((crmx) bwjmVar.d.b()).G()) {
                    bwjm.a.p("Not default SMS app. Do not decorate RegisterData for Etouffee");
                    return eijx.e(ezliVar2);
                }
                String str2 = str;
                if (((dggw) bwjmVar.e.b()).a(((dggl) bwjmVar.f.b()).a(str2)).f()) {
                    bwjm.a.p("RCS disabled by user. Do not decorate RegisterData for Etouffee");
                    return eijx.e(ezliVar2);
                }
                ezuu ezuuVar = ((ezlj) ezliVar2.instance).l;
                if (ezuuVar == null) {
                    ezuuVar = ezuu.a;
                }
                ezut ezutVar = (ezut) ezuu.a.createBuilder(ezuuVar);
                ezutVar.a(cefn.ETOUFFEE.h);
                if (bwbv.g()) {
                    bwjm.a.p("Advertising Etouffee group");
                    ezutVar.a(cefn.ETOUFFEE_GROUPS.h);
                }
                ezliVar2.copyOnWrite();
                ezlj ezljVar = (ezlj) ezliVar2.instance;
                ezuu ezuuVar2 = (ezuu) ezutVar.build();
                ezuuVar2.getClass();
                ezljVar.l = ezuuVar2;
                ezljVar.b |= 8;
                if (!zBooleanValue) {
                    bwjm.a.p("Added Etouffee capability without generating prekeys");
                    return eijx.e(ezliVar2);
                }
                bwjm.a.p("Added Etouffee capability and will generate prekeys");
                bwjf bwjfVar = bwjmVar.c;
                bwjfVar.e.b();
                eiju eijuVarA = bwjfVar.a(str2);
                ejvr ejvrVar = new ejvr() { // from class: bwjd
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return Optional.of((TachyonCommon$PublicPreKeySets) obj2);
                    }
                };
                eoqg eoqgVar = eoqg.a;
                return eijuVarA.h(ejvrVar, eoqgVar).e(Throwable.class, new ejvr() { // from class: bwje
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        bwjf.a.s("Failed to generate prekey set.", (Throwable) obj2);
                        return Optional.empty();
                    }
                }, eoqgVar).h(new ejvr() { // from class: bwjl
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        Optional optional = (Optional) obj2;
                        boolean zIsPresent = optional.isPresent();
                        ezli ezliVar3 = ezliVar2;
                        if (!zIsPresent) {
                            cqbd cqbdVarA = bwjm.a.a();
                            cqbdVarA.I("Fall back to empty prekey set");
                            cqbdVarA.r();
                            return ezliVar3;
                        }
                        TachyonCommon$PublicPreKeySets tachyonCommon$PublicPreKeySets = (TachyonCommon$PublicPreKeySets) optional.get();
                        ezliVar3.copyOnWrite();
                        ezlj ezljVar2 = (ezlj) ezliVar3.instance;
                        ezlj ezljVar3 = ezlj.a;
                        ezljVar2.p = tachyonCommon$PublicPreKeySets;
                        ezljVar2.b |= 1024;
                        return ezliVar3;
                    }
                }, bwjmVar.b);
            }
        }, this.g);
    }
}
