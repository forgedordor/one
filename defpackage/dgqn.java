package defpackage;

import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgqn implements dhho {
    public final dgqh a;

    public dgqn(dgqh dgqhVar) {
        this.a = dgqhVar;
    }

    @Override // defpackage.dhho
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        final dgqj dgqjVar = (dgqj) obj;
        if (dgqjVar != null) {
            dgqh dgqhVar = this.a;
            if (dgqhVar.a.t().contains(new dggp(dgqjVar.b()))) {
                dgqjVar.a().filter(new Predicate() { // from class: dgql
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo538negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        return ((dgiq) obj2).ab();
                    }
                }).ifPresent(new Consumer() { // from class: dgqm
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        this.a.a.a(new dggp(dgqjVar.b()));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
        }
        ekrw ekrwVarH = dgqp.a.h();
        ekrwVarH.X(eksq.a, "RcsProvisioningManager");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager$RcsProvisioningChangeListenerConfigurationObserver", "onUpdate", 1480, "RcsProvisioningManager.java")).q("Unable to notify rcs provisioning change listeners because update is null or sim is not rcs available.");
    }
}
