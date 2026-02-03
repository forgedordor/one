package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgqh {
    public final dgia a;
    private final dggm b;

    public dgqh(dggm dggmVar, dgia dgiaVar) {
        this.b = dggmVar;
        this.a = dgiaVar;
    }

    public final void a(dggp dggpVar) {
        dgia dgiaVar = this.a;
        dggm dggmVar = this.b;
        Set setT = dgiaVar.t();
        dggmVar.b(setT);
        ekrw ekrwVarH = dgqp.a.h();
        ekrwVarH.X(eksq.a, "RcsProvisioningManager");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager$CommonRcsProvisioningChangeListenerHandler", "notifyListener", 1356, "RcsProvisioningManager.java")).I("CommonRcsProvisioningChangeListenerHandler.notifyListener : Notify RcsProvisioningChangeListener %s onRcsProvisioningChange, SIM = %s, available rcs provisioning ids  = %s", dggmVar, dhiz.SIM_ID.c(dggpVar), Collection.EL.stream(setT).map(new Function() { // from class: dgqg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dhiz.SIM_ID.c(dggo.a((dggn) obj).a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(",")));
    }
}
