package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esvq implements fcsu {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ fcsu c;
    private esvk d = null;

    public esvq(Context context, String str, fcsu fcsuVar) {
        this.a = context;
        this.b = str;
        this.c = fcsuVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [esvf, java.lang.Object] */
    @Override // defpackage.fcsu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final esvk b() {
        if (this.d == null) {
            Context context = this.a;
            String str = this.b;
            fcsu fcsuVar = this.c;
            String packageName = context.getPackageName();
            fcsuVar.b().f();
            this.d = new esvk(packageName, str);
        }
        return this.d;
    }
}
