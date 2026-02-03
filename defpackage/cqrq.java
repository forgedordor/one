package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.iid.FirebaseInstanceId;
import j$.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqrq {
    public final fcsu a;
    public final Context b;
    public final cogw c;
    public final dcdt e;
    public final crqv f;
    public final eosc g;
    public final egpe i;
    private final egpe j;
    public final Random d = new Random();
    public final ejxr h = ejxx.a(new ejxr() { // from class: cqrm
        @Override // defpackage.ejxr
        public final Object get() throws InterruptedException, NumberFormatException {
            cqrq cqrqVar = this.a;
            FirebaseInstanceId firebaseInstanceIdB = FirebaseInstanceId.b();
            FirebaseInstanceId.k(firebaseInstanceIdB.d);
            if (firebaseInstanceIdB.q(firebaseInstanceIdB.c())) {
                firebaseInstanceIdB.n();
            }
            int iHash = Objects.hash(firebaseInstanceIdB.f(), Long.valueOf(TimeUnit.MILLISECONDS.toDays(cqrqVar.c.f().toEpochMilli() + TimeUnit.HOURS.toMillis(Objects.hashCode(r1) % (((Integer) cqry.p.e()).intValue() * 24)))), cqrqVar.b.getPackageName());
            Random random = cqrqVar.d;
            random.setSeed(iHash);
            return Integer.valueOf(random.nextInt());
        }
    });

    public cqrq(fcsu fcsuVar, Context context, cogw cogwVar, dcdt dcdtVar, crqv crqvVar, eosc eoscVar, eosc eoscVar2) {
        this.a = fcsuVar;
        this.b = context;
        this.c = cogwVar;
        this.e = dcdtVar;
        this.f = crqvVar;
        this.g = eoscVar;
        this.i = new egpe(new eooy() { // from class: cqrn
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return eijx.e((Integer) this.a.h.get());
            }
        }, eoscVar2);
        this.j = new egpe(new eooy() { // from class: cqro
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                cqrq cqrqVar = this.a;
                dcdt dcdtVar2 = cqrqVar.e;
                Context context2 = cqrqVar.b;
                int i = dcdtVar2.h(context2, 12200000) == 0 ? 0 : 1;
                crqv crqvVar2 = cqrqVar.f;
                if (!crqvVar2.q("has_sent_a_message", false)) {
                    i |= 4;
                }
                if (crqvVar2.d("max_conversation_count", 0) < ((Integer) ccze.p.e()).intValue()) {
                    i |= 8;
                }
                if (crqvVar2.q("has_dismissed_hats", false)) {
                    i |= 16;
                }
                cogw cogwVar2 = cqrqVar.c;
                long epochMilli = cogwVar2.f().toEpochMilli();
                if (epochMilli - ((Long) cqry.o.e()).longValue() < Math.min(crqvVar2.e("last_app_update_time_millis", epochMilli), crqvVar2.e("app_install_time_millis", epochMilli))) {
                    i |= 32;
                }
                long epochMilli2 = cogwVar2.f().toEpochMilli() - ((Long) cqry.m.e()).longValue();
                if (epochMilli2 < crqvVar2.e("rating_prompt_last_time_millis", epochMilli2)) {
                    i |= 64;
                }
                int iIntValue = cswl.a(context2).b - ((Integer) cqry.n.e()).intValue();
                if (iIntValue < crqvVar2.d("rating_prompt_shown_version", iIntValue)) {
                    i |= 128;
                }
                if (((Integer) cqrqVar.h.get()).intValue() % ((Integer) cqry.p.e()).intValue() != 0) {
                    i |= 256;
                }
                return eijx.e(Integer.valueOf(i));
            }
        }, eoscVar2);
    }

    public final eiju a() {
        return ((Boolean) cqry.r.e()).booleanValue() ? eijx.e(0) : eiju.g(this.j.c());
    }

    @Deprecated
    public final eiju b(eiju eijuVar) {
        return eijuVar.h(new ejvr() { // from class: cqrl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(this.a.c.f().toEpochMilli() - ((Long) obj).longValue() < 259200000);
            }
        }, this.g);
    }

    public final eiju c() {
        return a().h(new ejvr() { // from class: cqrk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() != 0);
            }
        }, this.g);
    }
}
