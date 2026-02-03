package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tjf implements ycg {
    public final Context a;
    public final Map b;
    public final fdpl c;
    public final aaft d;
    private final fcyh e;
    private final fdjx f;
    private final fdpl g;
    private final fdpl h;

    public tjf(Context context, fcyh fcyhVar, fdjx fdjxVar, fdpl fdplVar, fdpl fdplVar2, aaft aaftVar) {
        context.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        aaftVar.getClass();
        this.a = context;
        this.e = fcyhVar;
        this.f = fdjxVar;
        this.g = fdplVar;
        this.h = fdplVar2;
        this.d = aaftVar;
        this.b = new LinkedHashMap();
        this.c = fdqc.b(new fdua(fdplVar2, fdplVar, new tje(this, null)), fcyhVar);
    }

    @Override // defpackage.ycg
    public final void a() {
        auvw.k(this.f, null, null, new tjd(this, null), 3);
    }
}
