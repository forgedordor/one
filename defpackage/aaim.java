package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaim implements tdg {
    public final Context a;
    public final aaiu b;
    public final afzc c;
    private final fdjx d;
    private final fcsu e;
    private final Boolean f;

    public aaim(Context context, fdjx fdjxVar, aaiu aaiuVar, afzc afzcVar, fcsu fcsuVar) {
        context.getClass();
        fdjxVar.getClass();
        aaiuVar.getClass();
        afzcVar.getClass();
        fcsuVar.getClass();
        this.a = context;
        this.d = fdjxVar;
        this.b = aaiuVar;
        this.c = afzcVar;
        this.e = fcsuVar;
        this.f = (Boolean) fcsuVar.b();
    }

    @Override // defpackage.tdg
    public final fdvc a() {
        return egwx.a(new fdui(new aait(this.b, null)), this.d, new aaik(this));
    }

    @Override // defpackage.tdg
    public final /* synthetic */ boolean b() {
        return this.f.booleanValue();
    }

    public final void c() {
        auvw.k(this.d, null, null, new aail(this, null), 3);
    }
}
