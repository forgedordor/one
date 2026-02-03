package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cszj {
    public final aika a;
    private final asit b;
    private final fdjx c;
    private final aimb d;

    public cszj(asit asitVar, fdjx fdjxVar, aika aikaVar, aimb aimbVar) {
        fdjxVar.getClass();
        aikaVar.getClass();
        aimbVar.getClass();
        this.b = asitVar;
        this.c = fdjxVar;
        this.a = aikaVar;
        this.d = aimbVar;
    }

    public final void a(Supplier supplier) {
        if (this.b.a()) {
            this.d.a().i(fdxs.b(this.c, fcyi.a, fdjz.a, new cszi(supplier, null)), aioj.LOG_SPEC_VIDEO_CALLING_EVENT);
        }
    }
}
