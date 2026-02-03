package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.libraries.mdi.download.debug.sting.MddDebugActivity;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdtj implements cdte {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/mdd/MddApiLib");
    public final fcsu b;
    private final fcsu c;
    private final eosc d;
    private final eosc e;
    private final fcsu f;

    public cdtj(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, eosc eoscVar, eosc eoscVar2) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.f = fcsuVar3;
        this.d = eoscVar;
        this.e = eoscVar2;
    }

    private final eiju k(String str) {
        dtsl dtslVar = (dtsl) this.b.b();
        dtpz dtpzVarF = dtqa.f();
        dtpzVarF.b(str);
        return eiju.g(dtslVar.e(dtpzVarF.a()));
    }

    @Override // defpackage.cdte
    public final eiju a() {
        dtsl dtslVar = (dtsl) this.b.b();
        dtqb dtqbVarI = dtqc.i();
        dtqbVarI.b(true);
        return eiju.g(dtslVar.f(dtqbVarI.c())).h(new ejvr() { // from class: cdti
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Stream streamFilter = Collection.EL.stream((ekgb) obj).filter(new Predicate() { // from class: cdtf
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
                        return Objects.nonNull((dtma) obj2);
                    }
                });
                int i = ekgb.d;
                return (ekgb) streamFilter.collect(ekcv.a);
            }
        }, this.e);
    }

    @Override // defpackage.cdte
    public final eiju b(String str) {
        dtsl dtslVar = (dtsl) this.b.b();
        dtoy dtoyVarN = dtoz.n();
        dtoyVarN.c(str);
        return eiju.g(dtslVar.c(dtoyVarN.a()));
    }

    @Override // defpackage.cdte
    public final eiju c() {
        return eiju.g(((dtpd) this.f.b()).a((dtsl) this.b.b()));
    }

    @Override // defpackage.cdte
    public final ListenableFuture d() {
        return eooq.g(eork.i(null), new eooz() { // from class: cdtg
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((dtsl) this.a.b.b()).g("MDD.WIFI.CHARGING.PERIODIC.TASK");
            }
        }, this.d);
    }

    @Override // defpackage.cdte
    public final Optional e(Activity activity) {
        return Optional.of(new Intent(activity, (Class<?>) MddDebugActivity.class));
    }

    @Override // defpackage.cdte
    public final String f() {
        return ((dtsl) this.b.b()).k();
    }

    @Override // defpackage.cdte
    public final Optional g(String str) {
        cqaz.h();
        try {
            eiju eijuVarK = k(str);
            long jIntValue = ((Integer) crbf.O.e()).intValue();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            dqle.c();
            dtma dtmaVar = (dtma) eote.b(eijuVarK, jIntValue, timeUnit);
            if (dtmaVar != null) {
                ekrw ekrwVarH = a.h();
                ekrwVarH.X(eksq.a, "BugleMDD");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/mdd/MddApiLib", "maybeGetFileGroup", 96, "MddApiLib.java")).B("Retrieved File Group Name: %s, File Count = %d", dtmaVar.c, dtmaVar.h.size());
                j(str, dtmaVar);
                return Optional.of(dtmaVar);
            }
            ekrw ekrwVarH2 = a.h();
            ekrwVarH2.X(eksq.a, "BugleMDD");
            ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/mdd/MddApiLib", "maybeGetFileGroup", 102, "MddApiLib.java")).q("Retrieved File Group is null");
            i(str);
            return Optional.empty();
        } catch (ExecutionException | TimeoutException e) {
            ekrw ekrwVarI = a.i();
            ekrwVarI.X(eksq.a, "BugleMDD");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/mdd/MddApiLib", "maybeGetFileGroup", 90, "MddApiLib.java")).t("Exception getting group: %s", str);
            i(str);
            return Optional.empty();
        }
    }

    @Override // defpackage.cdte
    public final eiju h(final String str) {
        return k(str).h(new ejvr() { // from class: cdth
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cdtj cdtjVar = this.a;
                String str2 = str;
                dtma dtmaVar = (dtma) obj;
                if (dtmaVar != null) {
                    ekrw ekrwVarH = cdtj.a.h();
                    ekrwVarH.X(eksq.a, "BugleMDD");
                    ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/mdd/MddApiLib", "maybeGetFileGroupAsync", 115, "MddApiLib.java")).B("Retrieved File Group Name: %s, File Count = %d", dtmaVar.c, dtmaVar.h.size());
                    cdtjVar.j(str2, dtmaVar);
                    return Optional.of(dtmaVar);
                }
                ekrw ekrwVarH2 = cdtj.a.h();
                ekrwVarH2.X(eksq.a, "BugleMDD");
                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/mdd/MddApiLib", "maybeGetFileGroupAsync", 121, "MddApiLib.java")).q("Retrieved File Group is null");
                cdtjVar.i(str2);
                return Optional.empty();
            }
        }, this.e);
    }

    public final void i(String str) {
        ((cdur) this.c.b()).c(2, 3, str, 0L);
    }

    public final void j(String str, dtma dtmaVar) {
        ((cdur) this.c.b()).c(2, 2, str, dtmaVar.f);
    }
}
