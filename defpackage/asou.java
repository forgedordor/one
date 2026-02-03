package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asou implements cdfg {
    public final eygg a;
    private final eosc b;

    public asou(eosc eoscVar, eygg eyggVar) {
        this.b = eoscVar;
        this.a = eyggVar;
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju b() {
        return cdfd.b();
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju c() {
        return cdfd.c();
    }

    @Override // defpackage.cdfg
    public final eiju d() {
        return eijx.g(new Callable() { // from class: asot
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ArrayList arrayList = new ArrayList();
                elul elulVarH = ((ajhd) this.a.a.b()).h("last_rbm_active_event_time_millis");
                boolean z = elulVarH == elul.EVENT_AGE_WITHIN_1_DAY;
                boolean z2 = z || elulVarH == elul.EVENT_AGE_1_TO_7_DAYS;
                cdew cdewVar = new cdew();
                cdewVar.b("IsRbm1DA");
                cdewVar.c(String.valueOf(z));
                arrayList.add(cdewVar.a());
                cdew cdewVar2 = new cdew();
                cdewVar2.b("IsRbm7DA");
                cdewVar2.c(String.valueOf(z2));
                arrayList.add(cdewVar2.a());
                return arrayList;
            }
        }, this.b);
    }
}
