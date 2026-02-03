package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amlh implements amky {
    public final ejxr a;
    public final ejxr b;
    private final ejxr c;
    private final eosc d;
    private final ejxr e;
    private final eygg f;
    private final ajmh g;
    private final ejxr h;

    public amlh(eosc eoscVar, final fcsu fcsuVar, final fcsu fcsuVar2, final fcsu fcsuVar3, final fcsu fcsuVar4, final fcsu fcsuVar5, final fcsu fcsuVar6, eygg eyggVar, final fcsu fcsuVar7, final BugleConversationId bugleConversationId, final anpj anpjVar, final anpj anpjVar2, ajmh ajmhVar) {
        this.d = eoscVar;
        this.f = eyggVar;
        this.g = ajmhVar;
        this.c = ejxx.a(new ejxr() { // from class: amkz
            @Override // defpackage.ejxr
            public final Object get() {
                anph anphVar = (anph) fcsuVar.b();
                amsr amsrVar = (amsr) fcsuVar2.b();
                auaq auaqVar = (auaq) amsrVar.a.b();
                auaqVar.getClass();
                cqtp cqtpVar = (cqtp) amsrVar.b.b();
                cqtpVar.getClass();
                alrj alrjVar = (alrj) amsrVar.c.b();
                alrjVar.getClass();
                ExecutorService executorService = (ExecutorService) amsrVar.d.b();
                executorService.getClass();
                cogw cogwVar = (cogw) amsrVar.e.b();
                cogwVar.getClass();
                return anphVar.a(new amsq(auaqVar, cqtpVar, alrjVar, executorService, cogwVar, bugleConversationId, anpjVar2));
            }
        });
        this.a = ejxx.a(new ejxr() { // from class: amla
            /* JADX WARN: Type inference failed for: r13v0, types: [eygg, java.lang.Object] */
            @Override // defpackage.ejxr
            public final Object get() {
                anph anphVar = (anph) fcsuVar.b();
                ammm ammmVar = (ammm) fcsuVar3.b();
                amng amngVar = (amng) fcsuVar7.b();
                cqtp cqtpVar = (cqtp) ammmVar.a.b();
                cqtpVar.getClass();
                eosc eoscVar2 = (eosc) ammmVar.b.b();
                eoscVar2.getClass();
                eosc eoscVar3 = (eosc) ammmVar.c.b();
                eoscVar3.getClass();
                fcsu fcsuVar8 = ammmVar.d;
                cqpz cqpzVar = (cqpz) ammmVar.e.b();
                cqpzVar.getClass();
                fcsu fcsuVar9 = ammmVar.f;
                fcsu fcsuVar10 = ammmVar.g;
                fcsu fcsuVar11 = ammmVar.h;
                ?? B = ammmVar.i.b();
                B.getClass();
                ((apwn) ammmVar.j.b()).getClass();
                fcsu fcsuVar12 = ammmVar.k;
                amngVar.getClass();
                return anphVar.a(new amml(cqtpVar, eoscVar2, eoscVar3, fcsuVar8, cqpzVar, fcsuVar9, fcsuVar10, fcsuVar11, B, fcsuVar12, bugleConversationId, anpjVar, anpjVar2, amngVar));
            }
        });
        this.e = ejxx.a(new ejxr() { // from class: amlb
            @Override // defpackage.ejxr
            public final Object get() {
                alet aletVar = (alet) fcsuVar5.b();
                amlh amlhVar = this.a;
                return aletVar.a(bugleConversationId, (anpj) amlhVar.a.get(), anpjVar2, anpjVar, amlhVar);
            }
        });
        this.h = ejxx.a(new ejxr() { // from class: amlc
            @Override // defpackage.ejxr
            public final Object get() {
                amsd amsdVar = (amsd) fcsuVar6.b();
                anpj anpjVar3 = (anpj) this.a.a.get();
                cmpy cmpyVar = (cmpy) amsdVar.a.b();
                cmpyVar.getClass();
                asrh asrhVar = (asrh) amsdVar.b.b();
                asrhVar.getClass();
                fdjx fdjxVar = (fdjx) amsdVar.c.b();
                fdjxVar.getClass();
                fcyh fcyhVar = (fcyh) amsdVar.d.b();
                fcyhVar.getClass();
                cogw cogwVar = (cogw) amsdVar.e.b();
                cogwVar.getClass();
                cjpc cjpcVar = (cjpc) amsdVar.f.b();
                cjpcVar.getClass();
                anpjVar3.getClass();
                return new amsc(cmpyVar, asrhVar, fdjxVar, fcyhVar, cogwVar, cjpcVar, amsdVar.g, amsdVar.h, bugleConversationId, anpjVar, anpjVar3);
            }
        });
        this.b = ejxx.a(new ejxr() { // from class: amld
            @Override // defpackage.ejxr
            public final Object get() {
                return ((amzz) fcsuVar4.b()).a();
            }
        });
    }

    @Override // defpackage.ajlu
    public final amst a() {
        return (amst) this.h.get();
    }

    @Override // defpackage.ajlu
    public final anpj b() {
        return (anpj) this.c.get();
    }

    @Override // defpackage.ajlu
    public final anpj c() {
        return (anpj) this.a.get();
    }

    @Override // defpackage.ajlu
    public final anpj d() {
        return ((ales) this.e.get()).a();
    }

    @Override // defpackage.ajlu
    public final anpj e() {
        return ((ales) this.e.get()).b();
    }

    @Override // defpackage.ajlu
    public final anpj f() {
        return ((ales) this.e.get()).c();
    }

    @Override // defpackage.ajlu
    public final anpj g() {
        return ((ales) this.e.get()).d();
    }

    @Override // defpackage.ajlu
    public final eiju h(aldp aldpVar) {
        return ((ales) this.e.get()).e(aldpVar);
    }

    @Override // defpackage.ajlu
    public final eiju i(String str, amwf amwfVar, elny elnyVar, boolean z, boolean z2) {
        return ((ales) this.e.get()).f(str, amwfVar, elnyVar, z, z2);
    }

    @Override // defpackage.ajlu
    public final eiju j(alff alffVar) {
        return ((ales) this.e.get()).g(alffVar);
    }

    @Override // defpackage.ajlu
    public final eiju k(final ajna ajnaVar, final amwf amwfVar, final ekgb ekgbVar, MessageId messageId, final MessageId messageId2, final amie amieVar, final elny elnyVar, final fhaz fhazVar, final List list) {
        eygg eyggVar = this.f;
        final long epochMilli = ((cogw) eyggVar.b()).f().toEpochMilli();
        final long jA = ((cogw) eyggVar.b()).a();
        final eiju eijuVarB = ((anpj) this.a.get()).b();
        final eiju eijuVarV = messageId != null ? this.g.v(messageId) : eijx.e(null);
        return eijx.k(eijuVarB, eijuVarV).b(new eooy() { // from class: amle
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                amzy amzyVar = (amzy) this.a.b.get();
                ajlh ajlhVar = (ajlh) eork.q(eijuVarB);
                ajlt ajltVar = (ajlt) eork.q(eijuVarV);
                MessageId messageId3 = messageId2;
                amie amieVar2 = amieVar;
                elny elnyVar2 = elnyVar;
                long j = epochMilli;
                long j2 = jA;
                fhaz fhazVar2 = fhazVar;
                return amzyVar.d(ajnaVar, ajlhVar, amwfVar, ekgbVar, ajltVar, messageId3, amieVar2, elnyVar2, j, j2, fhazVar2, list, null);
            }
        }, this.d);
    }

    @Override // defpackage.amky
    public final eiju l(final anhn anhnVar) {
        eygg eyggVar = this.f;
        final long epochMilli = ((cogw) eyggVar.b()).f().toEpochMilli();
        final long jA = ((cogw) eyggVar.b()).a();
        return ((anpj) this.a.get()).b().i(new eooz() { // from class: amlf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                amlm amlmVar = (amlm) obj;
                return ((amzy) this.a.b.get()).a(anhnVar, amlmVar, epochMilli, jA);
            }
        }, this.d);
    }

    @Override // defpackage.amky
    public final eiju m(final MessageId messageId, final String str, final fhaz fhazVar) {
        eygg eyggVar = this.f;
        final long epochMilli = ((cogw) eyggVar.b()).f().toEpochMilli();
        final long jA = ((cogw) eyggVar.b()).a();
        return ((anpj) this.a.get()).b().i(new eooz() { // from class: amlg
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((amzy) this.a.b.get()).b((amlm) obj, messageId, epochMilli, jA, str, fhazVar);
            }
        }, this.d);
    }
}
