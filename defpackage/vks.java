package defpackage;

import com.google.android.apps.messaging.R;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vks extends fcyz implements fdaw {
    int a;
    int b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ vkv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vks(vkv vkvVar, fcxy fcxyVar) {
        super(5, fcxyVar);
        this.e = vkvVar;
    }

    @Override // defpackage.fdaw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Boolean) obj4).booleanValue();
        vks vksVar = new vks(this.e, (fcxy) obj5);
        vksVar.c = (ajlk) obj;
        vksVar.d = (dihq) obj2;
        return vksVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        int i;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            i = this.a;
            obj2 = (dihq) this.c;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            ajlk ajlkVar = (ajlk) this.c;
            obj2 = this.d;
            vkv vkvVar = this.e;
            Instant instantF = vkvVar.g.f();
            cgrb cgrbVarK = ajlkVar.k();
            instantF.getClass();
            cgrc cgrcVarA = cgrbVarK.a(instantF);
            int i2 = (cgrcVarA == cgrc.e || cgrcVarA == cgrc.d) ? 1 : 0;
            vkk vkkVar = vkvVar.h;
            this.c = obj2;
            this.a = i2;
            this.b = 1;
            obj = vkkVar.c(ajlkVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            i = i2;
        }
        if (!((Boolean) obj).booleanValue()) {
            ekrw ekrwVarH = vkv.a.h();
            ekrwVarH.X(eksq.a, "BugleNotifications");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/actions/leavegroup/LeaveGroupSnoozeExtension$actionFlow$1", "invokeSuspend", 78, "LeaveGroupSnoozeExtension.kt")).q("Conversation does not support leave group capabilities.");
            return null;
        }
        final vkv vkvVar2 = this.e;
        if (vkvVar2.f.a() && i == 0) {
            String string = vkvVar2.b.getString(R.string.leave_group);
            string.getClass();
            return new dihq(string, djrr.cn, false, false, true, false, null, false, null, new fdae() { // from class: vkr
                @Override // defpackage.fdae
                public final Object invoke() {
                    final vkv vkvVar3 = vkvVar2;
                    if (vkvVar3.i.b(vkvVar3.b)) {
                        final fduf fdufVarA = fdvf.a(true);
                        vkvVar3.d.d(true, new fdap() { // from class: vkl
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj3) {
                                ahat ahatVar = (ahat) obj3;
                                ahatVar.getClass();
                                vkv vkvVar4 = vkvVar3;
                                fduf fdufVar = fdufVarA;
                                auvw.k(vkvVar4.e, null, null, new vku(fdufVar, ahatVar, vkvVar4, null), 3);
                                return vkvVar4.c(ahatVar, fdufVar);
                            }
                        });
                    } else {
                        vkvVar3.j.a();
                    }
                    return fctx.a;
                }
            }, 996);
        }
        ekrw ekrwVarH2 = vkv.a.h();
        ekrwVarH2.X(eksq.a, "BugleNotifications");
        ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/conversation2/actions/leavegroup/LeaveGroupSnoozeExtension$actionFlow$1", "invokeSuspend", 83, "LeaveGroupSnoozeExtension.kt")).q("Conversation was already muted/snoozed. Returning old dialog.");
        return obj2;
    }
}
