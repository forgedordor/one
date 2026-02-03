package defpackage;

import j$.util.Map;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class cqhc implements Consumer {
    public final /* synthetic */ cqhd a;

    public /* synthetic */ cqhc(cqhd cqhdVar) {
        this.a = cqhdVar;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void z(Object obj) {
        Integer num = (Integer) obj;
        num.intValue();
        cqhd cqhdVar = this.a;
        synchronized (cqhdVar.j) {
            Map map = cqhdVar.i;
            for (cqew cqewVar : (List) Map.EL.getOrDefault(map, num, new ArrayList())) {
                cqewVar.getClass();
                auvh.h(eijx.f(new cqhb(cqewVar), cqhdVar.b));
            }
            for (cqew cqewVar2 : (List) Map.EL.getOrDefault(map, -1, new ArrayList())) {
                cqewVar2.getClass();
                auvh.h(eijx.f(new cqhb(cqewVar2), cqhdVar.b));
            }
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
