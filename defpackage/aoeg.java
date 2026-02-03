package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoeg implements aofc {
    public final awzf a;
    public final aods b;
    public final Optional c;
    public final fcsu d;
    public final fcsu e;
    public final anpj f;
    public final aofq g;
    private final aoeo h;
    private final eosc i;
    private final fdjx j;
    private final fctc k;
    private final aofp l;

    public aoeg(awzf awzfVar, aoeo aoeoVar, aofq aofqVar, aods aodsVar, Optional optional, fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar, fdjx fdjxVar, aofp aofpVar, fcsu fcsuVar3) {
        awzfVar.getClass();
        aodsVar.getClass();
        optional.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        eoscVar.getClass();
        fdjxVar.getClass();
        aofpVar.getClass();
        fcsuVar3.getClass();
        this.a = awzfVar;
        this.h = aoeoVar;
        this.g = aofqVar;
        this.b = aodsVar;
        this.c = optional;
        this.d = fcsuVar2;
        this.i = eoscVar;
        this.j = fdjxVar;
        this.l = aofpVar;
        this.e = fcsuVar3;
        this.f = new anpl(aoeoVar, new ejvr() { // from class: aody
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekgb ekgbVar = (ekgb) obj;
                ekgbVar.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : ekgbVar) {
                    if (((aoer) obj2).w()) {
                        arrayList.add(obj2);
                    }
                }
                return ekfv.a(arrayList);
            }
        }, eoscVar);
        this.k = fctd.a(new fdae() { // from class: aodz
            @Override // defpackage.fdae
            public final Object invoke() {
                return ((aojw) this.a.e.b()).a();
            }
        });
    }

    @Override // defpackage.aofc
    public final anpj a() {
        return this.f;
    }

    @Override // defpackage.aofc
    public final anpj b() {
        return this.l.a();
    }

    @Override // defpackage.aofc
    public final anpj c() {
        return (anpj) this.k.a();
    }

    @Override // defpackage.aofc
    public final anpj d() {
        return this.h;
    }

    @Override // defpackage.aofc
    public final eiju e(SelfIdentityId selfIdentityId) {
        selfIdentityId.getClass();
        if (selfIdentityId.c().length() != 0 || !selfIdentityId.d()) {
            return auvw.c(this.j, fcyi.a, fdjz.a, new aoed(selfIdentityId, this, null));
        }
        eiju eijuVarE = eijx.e(Optional.empty());
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.aofc
    public final eiju f() throws IOException {
        eieu eieuVarH = eiiy.h("SelfIdentityRepository#getSelfIdentityForCreatingNewConversationsOrPreservingLegacyBugsNoOtherReason");
        try {
            eiju eijuVarC = auvw.c(this.j, fcyi.a, fdjz.a, new aoee(this, null));
            fczl.a(eieuVarH, null);
            return eijuVarC;
        } finally {
        }
    }

    @Override // defpackage.aofc
    public final eiju g(SelfIdentityId selfIdentityId, alqm alqmVar) {
        selfIdentityId.getClass();
        alqmVar.getClass();
        return auvw.c(this.j, fcyi.a, fdjz.a, new aoef(this, selfIdentityId, alqmVar, null));
    }

    @Override // defpackage.aofc
    public final eiju h(final Optional optional) {
        final fdap fdapVar = new fdap() { // from class: aoea
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return ((aogn) obj).b(this.a, optional);
            }
        };
        Object objOrElse = this.c.map(new Function() { // from class: aoeb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(eijx.e(false));
        objOrElse.getClass();
        return (eiju) objOrElse;
    }
}
