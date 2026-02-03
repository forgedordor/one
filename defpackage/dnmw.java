package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnmw implements drob {
    public final Context a;
    public final dnkk b;
    public final dnky c;
    public final dnnc d;
    private final fdjx e;
    private final fctc f = fctd.a(new fdae() { // from class: dnmq
        @Override // defpackage.fdae
        public final Object invoke() {
            dnmw dnmwVar = this.a;
            dnmwVar.d.a();
            return new drmj(dnmwVar.a);
        }
    });

    public dnmw(Context context, fdjx fdjxVar, dnkk dnkkVar, dnky dnkyVar, dnnc dnncVar) {
        this.a = context;
        this.e = fdjxVar;
        this.b = dnkkVar;
        this.c = dnkyVar;
        this.d = dnncVar;
    }

    @Override // defpackage.drob
    public final droa a() {
        return f().a();
    }

    @Override // defpackage.droc
    public final ListenableFuture b() {
        return fdxs.b(this.e, fcyi.a, fdjz.a, new dnmv(this, null));
    }

    @Override // defpackage.droc
    public final String c(String str) {
        str.getClass();
        String str2 = (String) fdim.a(fcyi.a, new dnmr(this, str, null));
        return str2 == null ? f().c(str) : str2;
    }

    @Override // defpackage.droc
    public final boolean d(String str) {
        return f().d(str);
    }

    @Override // defpackage.droc
    public final int e() {
        return f().e();
    }

    public final drob f() {
        Object objA = this.f.a();
        objA.getClass();
        return (drob) objA;
    }
}
