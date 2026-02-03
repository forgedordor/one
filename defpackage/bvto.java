package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.bvto;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvto extends cayv {
    public final Context a;
    public final fcsu b;
    public final bvub c;
    public final ains d;
    private final bvkr e;
    private final eosc f;
    private final eosc g;
    private final fcsu h;

    /* compiled from: PG */
    interface a {
        bvto aN();
    }

    public bvto(Context context, fcsu fcsuVar, bvub bvubVar, bvkr bvkrVar, ains ainsVar, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar2) {
        this.a = context;
        this.b = fcsuVar;
        this.c = bvubVar;
        this.e = bvkrVar;
        this.d = ainsVar;
        this.f = eoscVar;
        this.g = eoscVar2;
        this.h = fcsuVar2;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(5);
        pzh pzhVar = new pzh();
        pzhVar.c(2);
        ((caxk) caxzVarL).a = pzhVar.a();
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("ProcessUserAlertWorker");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return bvtq.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final bvtq bvtqVar = (bvtq) evuhVar;
        if (!((cdio) this.h.b()).a()) {
            return k(bvtqVar);
        }
        eiju eijuVarH = this.e.h();
        ejvr ejvrVar = new ejvr() { // from class: bvtm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                boolean zIsPresent = optional.isPresent();
                bvto bvtoVar = this.a;
                return zIsPresent ? ((bvto.a) ehlh.a(bvtoVar.a, bvto.a.class, (efwo) optional.get())).aN() : bvtoVar;
            }
        };
        eosc eoscVar = this.f;
        return eijuVarH.h(ejvrVar, eoscVar).i(new eooz() { // from class: bvtn
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((bvto) obj).k(bvtqVar);
            }
        }, eoscVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0104 A[Catch: all -> 0x013b, TryCatch #1 {all -> 0x013b, blocks: (B:3:0x0006, B:5:0x000e, B:6:0x001f, B:8:0x0027, B:9:0x0029, B:11:0x002e, B:17:0x0038, B:19:0x0041, B:21:0x0072, B:34:0x00a0, B:37:0x00a6, B:38:0x00b5, B:40:0x00b9, B:41:0x00c9, B:43:0x00cd, B:44:0x00d6, B:46:0x00e4, B:49:0x00ea, B:51:0x00ee, B:52:0x00f1, B:23:0x0077, B:24:0x007a, B:26:0x0086, B:28:0x0092, B:29:0x0095, B:32:0x009b, B:33:0x009e, B:53:0x0100, B:55:0x0104, B:56:0x010d), top: B:67:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010d A[Catch: all -> 0x013b, TRY_LEAVE, TryCatch #1 {all -> 0x013b, blocks: (B:3:0x0006, B:5:0x000e, B:6:0x001f, B:8:0x0027, B:9:0x0029, B:11:0x002e, B:17:0x0038, B:19:0x0041, B:21:0x0072, B:34:0x00a0, B:37:0x00a6, B:38:0x00b5, B:40:0x00b9, B:41:0x00c9, B:43:0x00cd, B:44:0x00d6, B:46:0x00e4, B:49:0x00ea, B:51:0x00ee, B:52:0x00f1, B:23:0x0077, B:24:0x007a, B:26:0x0086, B:28:0x0092, B:29:0x0095, B:32:0x009b, B:33:0x009e, B:53:0x0100, B:55:0x0104, B:56:0x010d), top: B:67:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eiju k(defpackage.bvtq r14) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvto.k(bvtq):eiju");
    }
}
