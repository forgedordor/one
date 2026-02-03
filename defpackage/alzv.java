package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.lang.Iterable$EL;
import j$.util.Map;
import j$.util.function.Consumer$CC;
import java.util.HashMap;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alzv implements andw {
    private final anty b;
    private final fcsu c;
    public final HashMap a = new HashMap();
    private final HashMap d = new HashMap();
    private final Object e = new Object();

    public alzv(anty antyVar, fcsu fcsuVar, ekgb ekgbVar) {
        this.b = antyVar;
        this.c = fcsuVar;
        Iterable$EL.forEach(ekgbVar, new Consumer() { // from class: alzu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ResolvedRecipient resolvedRecipient = (ResolvedRecipient) obj;
                this.a.a.put(resolvedRecipient.F().a, resolvedRecipient);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.andw
    public final int a() {
        int size;
        synchronized (this.e) {
            size = this.a.size();
        }
        return size;
    }

    @Override // defpackage.andw
    public final ResolvedRecipient b(alqm alqmVar) {
        ResolvedRecipient resolvedRecipient;
        synchronized (this.e) {
            resolvedRecipient = (ResolvedRecipient) this.d.get(alqmVar);
        }
        if (resolvedRecipient != null) {
            return resolvedRecipient;
        }
        ResolvedRecipient resolvedRecipient2 = (ResolvedRecipient) ((ekgp) this.b.g(ekgb.r(alqmVar)).c()).get(alqmVar);
        if (resolvedRecipient2 == null) {
            return resolvedRecipient2;
        }
        synchronized (this.e) {
            Map.EL.putIfAbsent(this.d, alqmVar, resolvedRecipient2);
            Map.EL.putIfAbsent(this.a, resolvedRecipient2.F().a, resolvedRecipient2);
        }
        return resolvedRecipient2;
    }

    @Override // defpackage.andw
    public final ResolvedRecipient c(String str) {
        ResolvedRecipient resolvedRecipient;
        synchronized (this.e) {
            resolvedRecipient = (ResolvedRecipient) this.a.get(str);
        }
        if (resolvedRecipient != null) {
            return resolvedRecipient;
        }
        anue anueVar = new anue(str);
        ResolvedRecipient resolvedRecipient2 = (ResolvedRecipient) ((ekgp) this.b.f(ekgb.r(anueVar)).c()).get(anueVar);
        if (resolvedRecipient2 == null) {
            return resolvedRecipient2;
        }
        synchronized (this.e) {
            if (((ardm) this.c.b()).a()) {
                Map.EL.putIfAbsent(this.a, str, resolvedRecipient2);
                Map.EL.putIfAbsent(this.d, resolvedRecipient2.g(), resolvedRecipient2);
            } else {
                HashMap map = this.a;
                if (!map.containsKey(str)) {
                    map.put(str, resolvedRecipient2);
                }
            }
        }
        return resolvedRecipient2;
    }

    @Override // defpackage.andw
    public final ekgb d() {
        ekgb ekgbVarN;
        synchronized (this.e) {
            ekgbVarN = ekgb.n(this.a.values());
        }
        return ekgbVarN;
    }
}
