package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnmp implements drob {
    public final Context a;
    public final dnnc b;
    private final fctc c;

    public dnmp(Context context, dnnc dnncVar) {
        context.getClass();
        this.a = context;
        this.b = dnncVar;
        this.c = fctd.a(new fdae() { // from class: dnmo
            @Override // defpackage.fdae
            public final Object invoke() {
                dnmp dnmpVar = this.a;
                dnmpVar.b.a();
                return new drmj(dnmpVar.a);
            }
        });
    }

    private final drob f() {
        Object objA = this.c.a();
        objA.getClass();
        return (drob) objA;
    }

    @Override // defpackage.drob
    public final droa a() {
        return f().a();
    }

    @Override // defpackage.droc
    public final ListenableFuture b() {
        return f().b();
    }

    @Override // defpackage.droc
    public final String c(String str) {
        str.getClass();
        return f().c(str);
    }

    @Override // defpackage.droc
    public final boolean d(String str) {
        return f().d(str);
    }

    @Override // defpackage.droc
    public final int e() {
        return f().e();
    }
}
