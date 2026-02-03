package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccyp {
    public static final eksp a = eksp.c("BuglePhenotype");
    static final ejxr b = cdag.v("sms_permission_enable_add_sms_permission_check");
    public static final String[] c = {"ANDROID_MESSAGING", "ANDROID_MESSAGING_PRIMES", "BUGLE_COUNTERS", "CARRIER_SERVICES", "CLIENT_LOGGING_PROD", "EXPRESSION", "EXPRESSION_COUNTERS", "COMMS_MESSAGES_WEB", "BUGLE_SPAM", "MESSAGES"};
    public final ejxr d;
    public final fcsu e;
    public final Context f;
    public final fcsu g;
    private final eosc h;
    private final fcsu i;

    public ccyp(eosc eoscVar, final eygg eyggVar, fcsu fcsuVar, fcsu fcsuVar2, Context context, fcsu fcsuVar3) {
        this.h = eoscVar;
        this.d = ejxx.a(new ejxr() { // from class: ccym
            @Override // defpackage.ejxr
            public final Object get() {
                eksp ekspVar = ccyp.a;
                return new CopyOnWriteArraySet((Collection) eyggVar.b());
            }
        });
        this.i = fcsuVar;
        this.e = fcsuVar2;
        this.f = context;
        this.g = fcsuVar3;
    }

    static evuh a() {
        elzw elzwVar = (elzw) elzx.a.createBuilder();
        elvg elvgVar = cqbe.a;
        elzwVar.copyOnWrite();
        elzx elzxVar = (elzx) elzwVar.instance;
        elzxVar.c = elvgVar.x;
        elzxVar.b |= 1;
        elzwVar.copyOnWrite();
        elzx elzxVar2 = (elzx) elzwVar.instance;
        elzxVar2.b |= 2;
        elzxVar2.d = 757365213L;
        return elzwVar.build();
    }

    public final void b() {
        ccyx ccyxVar = (ccyx) this.i.b();
        ((eksl) a.o().h("com/google/android/apps/messaging/shared/experiments/BuglePhenotypeHelper", "commitBuglePhenotypeAsync", 169, "BuglePhenotypeHelper.java")).q("Committing bugle phenotype.");
        final ejvr ejvrVarA = eiid.a(new ejvr() { // from class: ccyk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eieu eieuVarK = eiiy.k("PhenotypeHelper#onBuglePhenotypeChanged");
                try {
                    boolean zBooleanValue = ((Boolean) ((cczi) ccyp.b.get()).e()).booleanValue();
                    ccyp ccypVar = this.a;
                    boolean zE = !zBooleanValue ? ((crnp) ccypVar.e.b()).e() : ((crnp) ccypVar.e.b()).f() && kxj.c(ccypVar.f, "android.permission.READ_PHONE_STATE") == 0;
                    for (ccyz ccyzVar : (Set) ccypVar.d.get()) {
                        if (!ccyzVar.gd() || zE) {
                            ccyzVar.a();
                        }
                    }
                    eieuVarK.close();
                    return null;
                } catch (Throwable th) {
                    try {
                        eieuVarK.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
        ccyxVar.c(this.h, new ddzs() { // from class: ccyl
            @Override // defpackage.ddzs
            public final void a(boolean z) {
                ejvrVarA.apply(Boolean.valueOf(z));
            }
        });
    }
}
