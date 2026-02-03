package defpackage;

import j$.util.function.Consumer$CC;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbqh {
    private final fcsu a;
    private final Set b;

    public cbqh(fcsu fcsuVar, Set set) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        this.b = set;
    }

    public static /* synthetic */ void b(cbqh cbqhVar, emxt emxtVar, ellg ellgVar) {
        aioj aiojVar = aioj.LOG_SPEC_LEGACY_LOGGING;
        emxtVar.getClass();
        aiojVar.getClass();
        ailn ailnVarA = ((aimb) cbqhVar.a.b()).a();
        ailnVarA.d(emxtVar);
        ailnVarA.j(ellgVar, aiojVar);
    }

    public final void a(emxt emxtVar, ellg ellgVar) {
        emxtVar.getClass();
        b(this, emxtVar, ellgVar);
    }

    public final void c(basd basdVar, basd basdVar2, int i, int i2, int i3) {
        basdVar.getClass();
        if (i3 == 0) {
            throw null;
        }
        final elof elofVar = (elof) elpg.b.createBuilder();
        elofVar.getClass();
        ekqg ekqgVarListIterator = ((ekph) this.b).listIterator();
        while (ekqgVarListIterator.hasNext()) {
            enyw enywVarA = ((asrf) ((cbqi) ekqgVarListIterator.next()).a.b()).a();
            elofVar.copyOnWrite();
            elpg elpgVar = (elpg) elofVar.instance;
            elpgVar.Y = enywVarA.h;
            elpgVar.d |= 2097152;
        }
        elofVar.copyOnWrite();
        elpg elpgVar2 = (elpg) elofVar.instance;
        elpgVar2.h = i - 1;
        elpgVar2.c |= 1;
        elofVar.copyOnWrite();
        elpg elpgVar3 = (elpg) elofVar.instance;
        elpgVar3.i = i2 - 1;
        elpgVar3.c |= 2;
        elvg elvgVar = cqbe.a;
        elofVar.copyOnWrite();
        elpg elpgVar4 = (elpg) elofVar.instance;
        elpgVar4.L = elvgVar.x;
        elpgVar4.d |= 512;
        if (i3 != 1) {
            elofVar.copyOnWrite();
            elpg elpgVar5 = (elpg) elofVar.instance;
            elpgVar5.af = i3 - 1;
            elpgVar5.d |= 536870912;
        }
        basdVar.g(new Consumer() { // from class: cbqf
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                String strF = ((basd) obj).f();
                elof elofVar2 = elofVar;
                elofVar2.copyOnWrite();
                elpg elpgVar6 = (elpg) elofVar2.instance;
                evsy evsyVar = elpg.a;
                elpgVar6.c |= Integer.MIN_VALUE;
                elpgVar6.H = strF;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        basdVar2.g(new Consumer() { // from class: cbqg
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                String strF = ((basd) obj).f();
                elof elofVar2 = elofVar;
                elofVar2.copyOnWrite();
                elpg elpgVar6 = (elpg) elofVar2.instance;
                evsy evsyVar = elpg.a;
                elpgVar6.d |= 32768;
                elpgVar6.R = strF;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_MESSAGE;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elpg elpgVar6 = (elpg) elofVar.build();
        elpgVar6.getClass();
        ellhVar2.l = elpgVar6;
        ellhVar2.b |= 4;
        b(this, emxt.BUGLE_MESSAGE, ellgVar);
    }
}
