package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anga implements ajlu {
    public final fcsu a;
    public final ajlu b;
    private final ejxr c = new ejxr() { // from class: anfz
        @Override // defpackage.ejxr
        public final Object get() {
            anga angaVar = this.a;
            albb albbVar = (albb) angaVar.a.b();
            angaVar.b.c().getClass();
            ((aler) albbVar.a.b()).getClass();
            return new albc(angaVar);
        }
    };

    public anga(fcsu fcsuVar, ajlu ajluVar, BugleConversationId bugleConversationId, anpj anpjVar, anpj anpjVar2) {
        this.a = fcsuVar;
        this.b = ajluVar;
    }

    @Override // defpackage.ajlu
    public final amst a() {
        return this.b.a();
    }

    @Override // defpackage.ajlu
    public final anpj b() {
        return this.b.b();
    }

    @Override // defpackage.ajlu
    public final anpj c() {
        return this.b.c();
    }

    @Override // defpackage.ajlu
    public final anpj d() {
        return this.b.d();
    }

    @Override // defpackage.ajlu
    public final anpj e() {
        return this.b.e();
    }

    @Override // defpackage.ajlu
    public final anpj f() {
        return this.b.f();
    }

    @Override // defpackage.ajlu
    public final anpj g() {
        return this.b.g();
    }

    @Override // defpackage.ajlu
    public final eiju h(aldp aldpVar) {
        return this.b.h(aldpVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ales, java.lang.Object] */
    @Override // defpackage.ajlu
    public final eiju i(String str, amwf amwfVar, elny elnyVar, boolean z, boolean z2) {
        return this.c.get().f(str, amwfVar, elnyVar, z, z2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ales, java.lang.Object] */
    @Override // defpackage.ajlu
    public final eiju j(alff alffVar) {
        return this.c.get().g(alffVar);
    }

    @Override // defpackage.ajlu
    public final eiju k(ajna ajnaVar, amwf amwfVar, ekgb ekgbVar, MessageId messageId, MessageId messageId2, amie amieVar, elny elnyVar, fhaz fhazVar, List list) {
        return this.b.k(ajnaVar, amwfVar, ekgbVar, messageId, messageId2, amieVar, elnyVar, fhazVar, list);
    }
}
