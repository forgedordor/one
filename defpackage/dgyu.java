package defpackage;

import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgyu extends dgvq {
    public final dhgr g;
    private final fcsu h;
    private final crmx i;
    private final InstantMessageConfiguration j;

    public dgyu(dfys dfysVar, dgwg dgwgVar, fcsu fcsuVar, crmx crmxVar, dhjt dhjtVar, dhgr dhgrVar) {
        super(dfysVar, dgwgVar, dhjtVar);
        this.h = fcsuVar;
        this.i = crmxVar;
        this.j = dfysVar.d();
        this.g = dhgrVar;
    }

    @Override // defpackage.dgvq
    protected final void e() {
        if (((Boolean) dhgr.a.a()).booleanValue()) {
            return;
        }
        this.g.b();
    }

    @Override // defpackage.dgvq
    protected final void g(dezf dezfVar) {
        ArrayList arrayList;
        if (dezfVar.b()) {
            dhja.c("Skipping call to unsubscribe to groups due to %s", dezfVar);
            return;
        }
        Map map = this.g.b;
        synchronized (map) {
            arrayList = new ArrayList(map.values());
        }
        Collection.EL.stream(arrayList).map(new Function() { // from class: dgyp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((dhgp) obj).c;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).forEach(new Consumer() { // from class: dgyq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((Optional) obj).ifPresent(new Consumer() { // from class: dgyo
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        ((dgwm) obj2).n();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void p(long j) {
        Long lValueOf = Long.valueOf(j);
        dhja.c("Updating subscription for session %d", lValueOf);
        Optional optionalA = this.g.a(j);
        if (optionalA.isEmpty()) {
            dhja.g("No group found for session %d. Cannot update subscription", lValueOf);
            return;
        }
        dhgp dhgpVar = (dhgp) optionalA.get();
        if (!dhgpVar.e.isPresent()) {
            dhja.g("Group with ID %d has no valid conference URI. Cannot update subscription", lValueOf);
            return;
        }
        String str = (String) dhgpVar.e.get();
        if (dhgpVar.c.isPresent()) {
            dgwm dgwmVar = (dgwm) dhgpVar.c.get();
            dgwmVar.l(false);
            dgwmVar.i = str;
            try {
                dgwmVar.e = dgwmVar.b(dgwmVar.c);
                dgwmVar.m();
                return;
            } catch (ebmn e) {
                dhja.i(e, "Error calling createOriginatingDialogPath(): %s", e.getMessage());
                dgwmVar.g(new dhfv("Error calling createOriginatingDialogPath(): ".concat(String.valueOf(e.getMessage())), e));
                return;
            }
        }
        dgyt dgytVar = new dgyt(this, dhgpVar.a);
        try {
            dfys dfysVar = this.a;
            dgwm dgwmVar2 = new dgwm(dfysVar, this.h, dhjv.l(str, dfysVar.c(), this.i), "conference", this.d, this.e, this.f);
            dgwmVar2.f = "application/conference-info+xml";
            dgwmVar2.j = dfog.E() ? (String[]) Collection.EL.toArray(new dgyh(this.j.mMessageTech, 1).d(), new IntFunction() { // from class: dgyr
                @Override // java.util.function.IntFunction
                public final Object apply(int i) {
                    return new String[i];
                }
            }) : dhjv.C(this.j.a());
            dgwmVar2.d(dgytVar);
            dhgpVar.c = Optional.of(dgwmVar2);
            dgwmVar2.m();
        } catch (ebmn e2) {
            dhja.g("Error subscribing to conference: %s", e2.getMessage());
        }
    }

    @Override // defpackage.dgvq
    public final void n() {
    }

    @Override // defpackage.dgvq
    public final void o() {
    }
}
