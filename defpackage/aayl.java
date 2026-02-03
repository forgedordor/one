package defpackage;

import defpackage.czxl;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aayl {
    private static final cqce f = cqce.g("Bugle", "DateTimePickerMixin");
    public final ea a;
    public aawc b = aawc.a;
    public Instant c = Instant.EPOCH;
    public boolean d = false;
    public czxm e;

    public aayl(ea eaVar) {
        this.a = eaVar;
    }

    public final void a() {
        aavz aavzVar = (aavz) aawa.a.createBuilder();
        long epochMilli = this.c.toEpochMilli();
        aavzVar.copyOnWrite();
        ((aawa) aavzVar.instance).b = epochMilli;
        aawa aawaVar = (aawa) aavzVar.build();
        aavv aavvVar = new aavv();
        eyhj.e(aavvVar);
        ehog.a(aavvVar, aawaVar);
        aavvVar.aP(this.a);
        b(aavvVar, "DATE");
        this.e.getClass();
        Optional.of(new czxl.d()).ifPresent(new Consumer() { // from class: aaye
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                einf.f((einb) obj, this.a.a);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void b(dn dnVar, String str) {
        eg egVarG;
        fr frVar;
        ea eaVar = this.a;
        if (!eaVar.aF() || (egVarG = eaVar.G()) == null || egVarG.isDestroyed() || (frVar = eaVar.B) == null || frVar.x) {
            f.p("Cannot commit fragment transaction to show date picker.");
            return;
        }
        cg cgVar = new cg(frVar);
        cgVar.u(dnVar, str);
        cgVar.c();
    }

    public final void c() {
        aawr aawrVar = (aawr) aaws.a.createBuilder();
        String str = this.b.c;
        aawrVar.copyOnWrite();
        aaws aawsVar = (aaws) aawrVar.instance;
        str.getClass();
        aawsVar.c = str;
        String str2 = this.b.d;
        aawrVar.copyOnWrite();
        aaws aawsVar2 = (aaws) aawrVar.instance;
        str2.getClass();
        aawsVar2.d = str2;
        String str3 = this.b.e;
        aawrVar.copyOnWrite();
        aaws aawsVar3 = (aaws) aawrVar.instance;
        str3.getClass();
        aawsVar3.e = str3;
        evtg evtgVar = this.b.b;
        aawrVar.copyOnWrite();
        aaws aawsVar4 = (aaws) aawrVar.instance;
        evtg evtgVar2 = aawsVar4.b;
        if (!evtgVar2.c()) {
            aawsVar4.b = evsn.mutableCopy(evtgVar2);
        }
        evpz.addAll(evtgVar, aawsVar4.b);
        aaws aawsVar5 = (aaws) aawrVar.build();
        ea eaVar = this.a;
        aawj aawjVar = new aawj();
        eyhj.e(aawjVar);
        ehog.a(aawjVar, aawsVar5);
        aawjVar.aP(eaVar);
        b(aawjVar, "PRESETS");
        this.e.getClass();
        Optional.of(new czxl.e()).ifPresent(new Consumer() { // from class: aayd
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                einf.f((einb) obj, this.a.a);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void d() {
        aawy aawyVar = (aawy) aawz.a.createBuilder();
        long epochMilli = this.c.toEpochMilli();
        aawyVar.copyOnWrite();
        ((aawz) aawyVar.instance).b = epochMilli;
        aawz aawzVar = (aawz) aawyVar.build();
        int i = aawx.f;
        aawt aawtVar = new aawt();
        eyhj.e(aawtVar);
        ehog.a(aawtVar, aawzVar);
        aawtVar.aP(this.a);
        b(aawtVar, "TIME");
        this.e.getClass();
        Optional.of(new czxl.f()).ifPresent(new Consumer() { // from class: aaxx
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                einf.f((einb) obj, this.a.a);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
