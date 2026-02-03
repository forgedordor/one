package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amrk implements ajlu {
    public final fcsu a;
    public final ajlu b;
    private final ejxr c;

    public amrk(fcsu fcsuVar, ajlu ajluVar, final EmergencySosConversationId emergencySosConversationId, final anpj anpjVar, final anpj anpjVar2) {
        this.a = fcsuVar;
        this.b = ajluVar;
        this.c = new ejxr() { // from class: amrj
            @Override // defpackage.ejxr
            public final Object get() {
                amrk amrkVar = this.a;
                alfl alflVar = (alfl) amrkVar.a.b();
                anpj anpjVarC = amrkVar.b.c();
                anpjVarC.getClass();
                alfh alfhVar = (alfh) alflVar.a.b();
                alfhVar.getClass();
                alfj alfjVar = (alfj) alflVar.b.b();
                alfjVar.getClass();
                return new alfk(alfhVar, alfjVar, emergencySosConversationId, anpjVarC, anpjVar, anpjVar2);
            }
        };
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
        anpj anpjVarC = this.b.c();
        anpjVarC.getClass();
        return anpjVarC;
    }

    @Override // defpackage.ajlu
    public final anpj d() {
        int i = ekgb.d;
        return new anpk(ekoe.a);
    }

    @Override // defpackage.ajlu
    public final anpj e() {
        return this.b.e();
    }

    @Override // defpackage.ajlu
    public final anpj f() {
        return ((alfk) this.c.get()).a;
    }

    @Override // defpackage.ajlu
    public final anpj g() {
        return this.b.g();
    }

    @Override // defpackage.ajlu
    public final eiju h(aldp aldpVar) {
        throw new UnsupportedOperationException("RBM suggestions are not supported in Emergency SOS.");
    }

    @Override // defpackage.ajlu
    public final eiju i(String str, amwf amwfVar, elny elnyVar, boolean z, boolean z2) {
        return this.b.i(str, amwfVar, elnyVar, z, z2);
    }

    @Override // defpackage.ajlu
    public final eiju j(alff alffVar) {
        return this.b.j(alffVar);
    }

    @Override // defpackage.ajlu
    public final eiju k(ajna ajnaVar, amwf amwfVar, ekgb ekgbVar, MessageId messageId, MessageId messageId2, amie amieVar, elny elnyVar, fhaz fhazVar, List list) {
        return this.b.k(ajnaVar, amwfVar, ekgbVar, messageId, messageId2, amieVar, elnyVar, fhazVar, list);
    }
}
