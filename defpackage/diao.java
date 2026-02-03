package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diao {
    public dbjq a;
    public Context b;
    public diag c;
    public ekgb d;
    public ekgb e;
    public final Map f;
    public dian g;
    public boolean h;
    public boolean i;

    public diao() {
        this.a = dbjq.UNKNOWN;
        int i = ekgb.d;
        this.e = ekoe.a;
        this.f = new HashMap();
        this.d = null;
    }

    public final diap a() {
        ejwl.m(this.a != dbjq.UNKNOWN, "Entry Point must be set.");
        if (this.c == null) {
            Log.w("AppDoctorFixerContext", "No AppDoctorLogger set.");
            this.c = new diay();
        }
        return new diap(this);
    }

    public final void b(diak diakVar) {
        this.f.put(diakVar.a, diakVar);
    }

    public final void c() {
        this.i = true;
    }

    public final void d(diaj diajVar, int i) {
        Map map = this.f;
        dbjt dbjtVar = diajVar.a;
        if (map.containsKey(dbjtVar)) {
            int i2 = i - 2;
            b(new diak(dbjtVar, i2 != 2 ? i2 != 4 ? 3 : 6 : 5));
        } else {
            throw new IllegalArgumentException("Status of '" + diajVar.b() + "' cannot be updated since no original status was set.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public diao(diap diapVar) {
        this.a = dbjq.UNKNOWN;
        int i = ekgb.d;
        this.e = ekoe.a;
        this.f = new HashMap();
        this.a = diapVar.a;
        this.b = diapVar.b;
        this.c = diapVar.c;
        this.d = diapVar.d;
        this.e = diapVar.e;
        ekgb ekgbVarG = diapVar.f.values().g();
        for (int i2 = 0; i2 < ekgbVarG.size(); i2++) {
            diak diakVar = (diak) ekgbVarG.get(i2);
            this.f.put(diakVar.a, diakVar);
        }
        this.g = diapVar.g;
        this.h = diapVar.h;
        this.i = diapVar.i;
    }
}
