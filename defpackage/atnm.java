package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import defpackage.axtl;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atnm implements atnu {
    public final fcsu a;
    public final Duration b;
    public final cazg c;
    private final eosc d;
    private final Optional e;
    private final cogw f;

    public atnm(eosc eoscVar, fcsu fcsuVar, Optional optional, cogw cogwVar, Duration duration, cazg cazgVar) {
        this.d = eoscVar;
        this.a = fcsuVar;
        this.e = optional;
        this.f = cogwVar;
        this.b = duration;
        this.c = cazgVar;
    }

    @Override // defpackage.atnu
    public final eiju a(final MessageCoreData messageCoreData) {
        messageCoreData.aX(Instant.ofEpochMilli(messageCoreData.cK() ? messageCoreData.o() : this.f.f().toEpochMilli()));
        this.e.ifPresent(new Consumer() { // from class: atnj
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                MessageCoreData messageCoreData2 = messageCoreData;
                messageCoreData2.u();
                messageCoreData2.k();
                ((cdzq) obj).a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Callable callable = new Callable() { // from class: atnk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(((baxe) this.a.a.b()).U(messageCoreData));
            }
        };
        eosc eoscVar = this.d;
        return eijx.g(callable, eoscVar).h(new ejvr() { // from class: atnl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) throws Throwable {
                int iC = aypw.c(messageCoreData);
                ejwl.b(true, "ProcessPendingMessagesAction: empty processing work item handler");
                axtl.a aVar = (axtl.a) cqtf.a(axtl.a.class);
                if (!aVar.cO().G()) {
                    ekrw ekrwVarJ = axtl.a.j();
                    ekrwVarJ.X(eksq.a, "BugleDataModel");
                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/action/PendingMessagesProcessor", "processPendingMessagesFromWorkItemHandler", 306, "PendingMessagesProcessor.java")).q("PendingMessagesProcessor: skipped - not default SMS app");
                    return null;
                }
                long epochMilli = aVar.y().f().toEpochMilli();
                if (aVar.aM().d(iC, epochMilli)) {
                    ekrw ekrwVarH = axtl.a.h();
                    ekrwVarH.X(eksq.a, "BugleDataModel");
                    ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/action/PendingMessagesProcessor", "processPendingMessagesFromWorkItemHandler", 311, "PendingMessagesProcessor.java")).q("PendingMessagesProcessor: skipped - too frequent");
                    return null;
                }
                axtn axtnVarAL = aVar.aL();
                fcsu fcsuVar = axtnVarAL.a;
                ayqj ayqjVar = (ayqj) axtnVarAL.b.b();
                ayqjVar.getClass();
                cogw cogwVar = (cogw) axtnVarAL.c.b();
                cogwVar.getClass();
                fcsu fcsuVar2 = axtnVarAL.d;
                cqbm cqbmVar = (cqbm) axtnVarAL.e.b();
                cqbmVar.getClass();
                fcsu fcsuVar3 = axtnVarAL.f;
                ajhd ajhdVar = (ajhd) axtnVarAL.g.b();
                ajhdVar.getClass();
                axxy axxyVar = (axxy) axtnVarAL.h.b();
                axxyVar.getClass();
                ayqd ayqdVar = (ayqd) axtnVarAL.i.b();
                ayqdVar.getClass();
                ayqx ayqxVar = (ayqx) axtnVarAL.j.b();
                ayqxVar.getClass();
                axsj axsjVar = (axsj) axtnVarAL.k.b();
                axsjVar.getClass();
                bveg bvegVar = (bveg) axtnVarAL.l.b();
                bvegVar.getClass();
                aypv aypvVar = (aypv) axtnVarAL.m.b();
                aypvVar.getClass();
                ayrm ayrmVar = (ayrm) axtnVarAL.n.b();
                ayrmVar.getClass();
                Optional optional = (Optional) axtnVarAL.o.b();
                optional.getClass();
                cjpo cjpoVar = (cjpo) axtnVarAL.p.b();
                cjpoVar.getClass();
                bydb bydbVar = (bydb) axtnVarAL.q.b();
                bydbVar.getClass();
                ((cokd) axtnVarAL.r.b()).getClass();
                fcsu fcsuVar4 = axtnVarAL.s;
                fcsu fcsuVar5 = axtnVarAL.t;
                axtk axtkVar = (axtk) axtnVarAL.u.b();
                axtkVar.getClass();
                fcsu fcsuVar6 = axtnVarAL.v;
                cmxr cmxrVar = (cmxr) axtnVarAL.w.b();
                cmxrVar.getClass();
                eosc eoscVar2 = (eosc) axtnVarAL.x.b();
                eoscVar2.getClass();
                ckfo ckfoVar = (ckfo) axtnVarAL.y.b();
                ckfoVar.getClass();
                atnm atnmVar = this.a;
                Map map = (Map) axtnVarAL.z.b();
                map.getClass();
                aujz aujzVar = (aujz) axtnVarAL.A.b();
                aujzVar.getClass();
                axth axthVar = (axth) axtnVarAL.B.b();
                axthVar.getClass();
                fcsu fcsuVar7 = axtnVarAL.C;
                fcsu fcsuVar8 = axtnVarAL.D;
                fcsu fcsuVar9 = axtnVarAL.E;
                fcsu fcsuVar10 = axtnVarAL.F;
                fcsu fcsuVar11 = axtnVarAL.G;
                fcsu fcsuVar12 = axtnVarAL.H;
                fcsu fcsuVar13 = axtnVarAL.I;
                fcsu fcsuVar14 = axtnVarAL.J;
                fcsu fcsuVar15 = axtnVarAL.K;
                fcsu fcsuVar16 = axtnVarAL.L;
                cazg cazgVar = atnmVar.c;
                new axtl(fcsuVar15, fcsuVar, ayqjVar, cogwVar, fcsuVar2, cqbmVar, fcsuVar3, ajhdVar, axxyVar, ayqdVar, ayqxVar, axsjVar, bvegVar, aypvVar, ayrmVar, optional, cjpoVar, bydbVar, fcsuVar4, fcsuVar5, axtkVar, fcsuVar6, cmxrVar, eoscVar2, iC, atnmVar.b, null, null, cazgVar, cazgVar.getClass().getSimpleName(), ckfoVar, map, aujzVar, axthVar, fcsuVar7, fcsuVar8, fcsuVar9, fcsuVar12, fcsuVar13, fcsuVar10, fcsuVar11, fcsuVar14, fcsuVar16).c();
                axxy.d = epochMilli;
                return null;
            }
        }, eoscVar);
    }
}
