package defpackage;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqtm {
    public final List a;
    public final boolean b;
    private final Map c;
    private final ekfw d;
    private final AtomicInteger e;

    public dqtm() {
        this(false);
    }

    public static dqwj a(final int i) {
        return i == 0 ? new dqwj() { // from class: dqtk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (String) obj;
            }
        } : new dqwj() { // from class: dqtl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return "JT_" + i + "_" + ((String) obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void f(dqxp dqxpVar, ekgb ekgbVar) {
        for (int i = 0; i < ((ekoe) ekgbVar).c; i++) {
            dqth dqthVar = (dqth) ekgbVar.get(i);
            e(dqthVar.e);
            f(dqxpVar, dqthVar.a.m.c());
        }
    }

    public final dqwj b(String str) {
        return (dqwj) this.c.get(str);
    }

    public final ekgb c() {
        return this.d.g();
    }

    public final boolean d() {
        return this.b;
    }

    public final void e(String str) {
        Map map = this.c;
        if (map.containsKey(str)) {
        } else {
            map.put(str, a(this.e.getAndIncrement()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dqtm(dqxp dqxpVar, dqwv dqwvVar, boolean z) {
        this(z);
        dqoy dqoyVar = (dqoy) dqwvVar;
        ekqh it = dqoyVar.r.iterator();
        while (it.hasNext()) {
            dqth dqthVar = (dqth) it.next();
            this.d.h(dqthVar);
            this.a.add(dqthVar.a.o);
        }
        f(dqxpVar, dqoyVar.r);
    }

    public dqtm(boolean z) {
        this.c = new ArrayMap();
        int i = ekgb.d;
        this.d = new ekfw();
        this.a = new ArrayList();
        this.e = new AtomicInteger(1);
        this.b = z;
    }
}
