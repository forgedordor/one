package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dydl extends dydg {
    public Context b;
    public dydi c;
    public dxxk d;
    public dycy e;
    public dyif f;
    public dywb g;
    public dyib h;
    public final ejwi i;
    public dxyj j;
    public dxyj k;
    public ExecutorService l;
    public dtah m;
    public dyyb n;
    public dyws o;
    public final ejwi p;
    public final ejwi q;

    public dydl() {
        ejud ejudVar = ejud.a;
        this.i = ejudVar;
        this.p = ejudVar;
        this.q = ejudVar;
    }

    @Override // defpackage.dydg
    public final Context a() {
        Context context = this.b;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Property \"applicationContext\" has not been set");
    }

    @Override // defpackage.dydg
    public final dxxk b() {
        dxxk dxxkVar = this.d;
        if (dxxkVar != null) {
            return dxxkVar;
        }
        throw new IllegalStateException("Property \"accountConverter\" has not been set");
    }

    @Override // defpackage.dydg
    public final dydi c() {
        dydi dydiVar = this.c;
        if (dydiVar != null) {
            return dydiVar;
        }
        throw new IllegalStateException("Property \"accountsModel\" has not been set");
    }

    @Override // defpackage.dydg
    public final dyif d() {
        dyif dyifVar = this.f;
        if (dyifVar != null) {
            return dyifVar;
        }
        throw new IllegalStateException("Property \"features\" has not been set");
    }

    @Override // defpackage.dydg
    public final ejwi e() {
        dxyj dxyjVar = this.j;
        return dxyjVar == null ? ejud.a : ejwi.j(dxyjVar);
    }

    @Override // defpackage.dydg
    public final void f() {
        if (this.h == null) {
            throw new IllegalStateException("Property \"configuration\" has not been set");
        }
    }
}
