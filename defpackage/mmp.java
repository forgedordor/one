package defpackage;

import android.content.Context;
import android.util.SparseArray;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mmp {
    public final Context a;
    public final mag b;
    public final may c;
    public final mou d;
    public final mmh e;
    public final Executor f;
    public final SparseArray g;
    public mmk h;
    public moj i;

    public mmp(Context context, mag magVar, may mayVar, mou mouVar, Executor executor, mmh mmhVar, boolean z) {
        this.a = context;
        this.b = magVar;
        this.c = mayVar;
        this.d = mouVar;
        this.f = executor;
        this.e = mmhVar;
        SparseArray sparseArray = new SparseArray();
        this.g = sparseArray;
        mmo mmoVar = new mmo(new mln(mayVar, mouVar, z));
        sparseArray.put(1, mmoVar);
        sparseArray.put(4, mmoVar);
        sparseArray.put(2, new mmo(new mjm(mayVar, mouVar)));
        sparseArray.put(3, new mmo(new moh(mayVar, mouVar)));
    }

    public final moj a() {
        moj mojVar = this.i;
        mee.g(mojVar);
        return mojVar;
    }

    public final void b() {
        moj mojVar = this.i;
        mee.f(mojVar);
        mojVar.i();
    }

    public final boolean c() {
        return this.i != null;
    }
}
