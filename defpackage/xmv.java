package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xmv extends fcyz implements fdat {
    int a;
    final /* synthetic */ xmw b;
    final /* synthetic */ fdap c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xmv(xmw xmwVar, fdap fdapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xmwVar;
        this.c = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xmv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            xmw xmwVar = this.b;
            this.a = 1;
            obj = fdtc.a(xmwVar.e, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        final ekgb ekgbVar = (ekgb) obj;
        if (ekgbVar.isEmpty()) {
            ekrw ekrwVarE = xmw.a.e();
            ekrwVarE.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/ActiveSimChecker$check$1", "invokeSuspend", 56, "ActiveSimChecker.kt")).q("No active self identities, not showing SIM picker dialog");
            return fctx.a;
        }
        if (ekgbVar.size() == 1) {
            ekrw ekrwVarH = xmw.a.h();
            ekrwVarH.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/ActiveSimChecker$check$1", "invokeSuspend", 63, "ActiveSimChecker.kt")).B("Automatically switching SIM to id: %s, subId: %s", ((aoer) fcva.X(ekgbVar)).h(), ((aoer) fcva.X(ekgbVar)).b());
            xmw xmwVar2 = this.b;
            if (xmwVar2.g.a()) {
                ((ains) xmwVar2.d.b()).c("Bugle.Sim.ActiveSimChecker.AutoSwitched");
            }
            fdap fdapVar = this.c;
            Object objX = fcva.X(ekgbVar);
            objX.getClass();
            fdapVar.invoke(objX);
            return fctx.a;
        }
        final xmw xmwVar3 = this.b;
        if (!xmwVar3.h.compareAndSet(false, true)) {
            ekrw ekrwVarE2 = xmw.a.e();
            ekrwVarE2.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarE2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/ActiveSimChecker$check$1", "invokeSuspend", 76, "ActiveSimChecker.kt")).q("Already displaying SIM picker dialog");
            return fctx.a;
        }
        ekrw ekrwVarE3 = xmw.a.e();
        ekrwVarE3.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarE3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/ActiveSimChecker$check$1", "invokeSuspend", 80, "ActiveSimChecker.kt")).r("Displaying SIM picker dialog with %d subscriptions", ekgbVar.size());
        if (xmwVar3.g.a()) {
            ((ains) xmwVar3.d.b()).c("Bugle.Sim.ActiveSimChecker.Dialog.Shown");
        }
        final fdap fdapVar2 = this.c;
        xmwVar3.f.d(false, new fdap() { // from class: xmu
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                final ahat ahatVar = (ahat) obj2;
                ahatVar.getClass();
                final xmw xmwVar4 = xmwVar3;
                Context context = xmwVar4.c;
                String string = context.getString(R.string.sim_dialog_picker_title);
                string.getClass();
                ekgb ekgbVar2 = ekgbVar;
                int i2 = 10;
                ArrayList arrayList = new ArrayList(fcva.p(ekgbVar2, 10));
                int i3 = 0;
                for (Object obj3 : ekgbVar2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        fcva.m();
                    }
                    final aoer aoerVar = (aoer) obj3;
                    if (i4 < 0 || i4 >= i2) {
                        throw new IllegalArgumentException(a.e(i4, "Int ", " is not a decimal digit"));
                    }
                    if (aoerVar.a() == 0) {
                        context.getColor(R.color.sim_icon_text_color);
                    } else {
                        dlst.a(context, aoerVar.a());
                    }
                    final fdap fdapVar3 = fdapVar2;
                    dlcr dlcrVarA = dlcs.a(aoerVar.d());
                    String string2 = context.getString(R.string.sim_dialog_picker_row_text, aoerVar.q(), Integer.valueOf(i4));
                    string2.getClass();
                    arrayList.add(new dkbu(dlcrVarA, string2, aoerVar.p(), new fdae() { // from class: xmt
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            ahatVar.a();
                            xmwVar4.h.set(false);
                            ekrw ekrwVarH2 = xmw.a.h();
                            ekrwVarH2.X(eksq.a, "BugleComposeRow2");
                            ekrd ekrdVar = (ekrd) ekrwVarH2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/ActiveSimChecker", "showSimDialog$lambda$2$lambda$1$lambda$0", 121, "ActiveSimChecker.kt");
                            aoer aoerVar2 = aoerVar;
                            ekrdVar.B("Switching SIM from mSim dialog to id: %s, subId: %s", aoerVar2.h(), aoerVar2.b());
                            aoerVar2.getClass();
                            fdapVar3.invoke(aoerVar2);
                            return fctx.a;
                        }
                    }));
                    i3 = i4;
                    i2 = 10;
                }
                return new djmn(string, arrayList, null, null, null, null, null, null, null, 508);
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xmv(this.b, this.c, fcxyVar);
    }
}
