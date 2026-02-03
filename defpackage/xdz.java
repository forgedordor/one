package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xdz implements xck, wqe, aalp {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl");
    public final Context b;
    public final fdjx c;
    public final wre d;
    public final Optional e;
    public final aisp f;
    public final aqgt g;
    public final aqgx h;
    public final ardn i;
    public final Optional j;
    public final AtomicInteger k;
    public final fdue l;
    public final dpfy m;
    public final dnih n;
    private final fdjx o;
    private final fctc p;
    private final fdvc q;
    private final fdvc r;
    private final fdvc s;
    private final dnjk t;

    /* JADX WARN: Multi-variable type inference failed */
    public xdz(Context context, fdjx fdjxVar, fdjx fdjxVar2, wre wreVar, xgt xgtVar, final fcsu fcsuVar, Optional optional, fduj fdujVar, vtx vtxVar, aisp aispVar, aqgt aqgtVar, aqgx aqgxVar, ardn ardnVar, Optional optional2) {
        context.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        wreVar.getClass();
        optional.getClass();
        fdujVar.getClass();
        aispVar.getClass();
        ardnVar.getClass();
        this.b = context;
        this.c = fdjxVar;
        this.o = fdjxVar2;
        this.d = wreVar;
        this.e = optional;
        this.f = aispVar;
        this.g = aqgtVar;
        this.h = aqgxVar;
        this.i = ardnVar;
        this.j = optional2;
        this.k = new AtomicInteger();
        this.p = fctd.a(new fdae() { // from class: xcl
            @Override // defpackage.fdae
            public final Object invoke() {
                return ((ajlu) fcsuVar.b()).a();
            }
        });
        this.l = fdun.e(0, 1, 3, 1);
        xdi xdiVar = new xdi(new xdf(fdujVar));
        fdus fdusVar = fdur.b;
        this.q = fdtg.b(xdiVar, fdjxVar, fdusVar, null);
        this.r = fdtg.b(new xdo(new xdl(fdujVar)), fdjxVar, fdusVar, "");
        this.s = fdtg.b(new xdu(new xdr(fdujVar)), fdjxVar, fdusVar, null);
        dnjk dnjkVar = new dnjk() { // from class: xcm
            @Override // defpackage.dnjk
            public final void a(String str) {
                str.getClass();
                xdz xdzVar = this.a;
                auvw.k(xdzVar.c, null, null, new xdy(str, xdzVar, null), 3);
            }
        };
        this.t = dnjkVar;
        dpfy dpfyVar = new dpfy(optional2.isPresent() ? fcva.g(dnjkVar, optional2.get()) : fcva.b(dnjkVar), xgtVar.d(), vtxVar);
        this.m = dpfyVar;
        this.n = dpfyVar.f;
        auvw.k(fdjxVar, null, null, new xcs(this, null), 3);
        auvw.k(fdjxVar, null, null, new xcu(this, null), 3);
        auvw.k(fdjxVar, null, null, new xcw(this, null), 3);
    }

    @Override // defpackage.wqe
    public final void a() {
        auvw.k(this.c, null, null, new xdc(this, null), 3);
    }

    @Override // defpackage.xck
    public final fdvc b() {
        fdvc fdvcVar = this.d.a;
        xda xdaVar = new xda(fdvcVar);
        xdb xdbVar = new xdb(this, null);
        fdvc fdvcVar2 = this.r;
        fdvc fdvcVar3 = this.s;
        fdvc fdvcVar4 = this.q;
        fdpl fdplVarB = fdud.b(xdaVar, fdvcVar2, fdvcVar3, fdvcVar4, xdbVar);
        fdus fdusVar = fdur.b;
        String str = ((vvw) fdvcVar.c()).a;
        if (str == null) {
            str = "";
        }
        return fdtg.b(fdplVarB, this.c, fdusVar, new djcv(this.m, str, (String) fdvcVar2.c(), (Integer) fdvcVar4.c(), 0, true, null, new djcu(this.g.a(), this.h.a()), 16));
    }

    public final amst c() {
        return (amst) this.p.a();
    }

    @Override // defpackage.aalp, java.lang.AutoCloseable
    public final void close() {
        auvw.k(this.o, null, null, new xcx(this, null), 3);
    }
}
