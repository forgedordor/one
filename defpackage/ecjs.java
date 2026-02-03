package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecjs {
    public final Context a;
    public final Executor b;
    public String c;
    public Set d;
    public ecjr f;
    private boolean g = false;
    public ejxr e = new ejxr() { // from class: ecjq
        @Override // defpackage.ejxr
        public final Object get() {
            return false;
        }
    };

    public ecjs(Context context, Executor executor) {
        this.a = context;
        this.b = executor;
    }

    public final ecjv a() {
        boolean z = true;
        if (!this.g && this.d == null) {
            z = false;
        }
        ejwl.b(z, "Must specify either forKeys(...) or forAllKeys() before calling build().");
        return new ecjv(this);
    }

    public final void b() {
        this.d = null;
        this.g = true;
    }

    public final void c(String... strArr) {
        ejwl.b(true, "Cannot call forKeys() with null argument");
        ekhv ekhvVar = new ekhv();
        ekhvVar.h(strArr);
        ekhx ekhxVarG = ekhvVar.g();
        ejwl.b(ekhxVarG.size() == strArr.length, "Duplicate keys specified");
        this.d = ekhxVarG;
        this.g = false;
    }

    public final void d(ecjt ecjtVar) {
        this.f = new ecjr(ecjtVar);
    }
}
