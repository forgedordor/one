package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehus implements fbni {
    public final String a;
    public final diep b;
    public long c;
    private final ejwi d;
    private final ejwi e;

    public ehus(Context context, diep diepVar, ejwi ejwiVar, ejwi ejwiVar2) {
        this.a = context.getPackageName();
        this.b = diepVar;
        this.d = ejwiVar;
        this.e = ejwiVar2;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [fcsu, java.lang.Object] */
    @Override // defpackage.fbni
    public final fbnh a(fbrk fbrkVar, fbnc fbncVar, fbnd fbndVar) {
        if (!((Boolean) this.d.e(false)).booleanValue()) {
            return fbndVar.a(fbrkVar, fbncVar);
        }
        ejwl.m(true, "TikTokRpcStreamz must be bound with @StreamzInterceptorExperiment");
        return new ehur(this, fbndVar.a(fbrkVar, fbncVar), (ehry) ((ejwt) this.e).a.b());
    }
}
