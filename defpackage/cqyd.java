package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqyd implements Runnable {
    final /* synthetic */ obt a;
    final /* synthetic */ cqwt b;
    final /* synthetic */ fdis c;
    final /* synthetic */ cqyh d;
    final /* synthetic */ long e;
    final /* synthetic */ cqyk f;

    public cqyd(obt obtVar, cqyk cqykVar, cqwt cqwtVar, fdis fdisVar, cqyh cqyhVar, long j) {
        this.a = obtVar;
        this.f = cqykVar;
        this.b = cqwtVar;
        this.c = fdisVar;
        this.d = cqyhVar;
        this.e = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            oax oaxVar = new oax(new obv(new obu(this.a)), new obv[0]);
            oaxVar.b = 2;
            oay oayVarA = oaxVar.a();
            cqyk cqykVar = this.f;
            String path = ((cqwk) this.b).b.getPath();
            path.getClass();
            oeg oegVar = cqykVar.a;
            oegVar.d();
            oegVar.l = new ofc(oegVar.b, new odz(oegVar));
            oegVar.l.b();
            oegVar.h = oayVarA;
            oegVar.i = path;
            oegVar.f.b();
            oay oayVar = oegVar.h;
            mee.f(oayVar);
            if (oayVar.a.size() <= 1 && ((ekoe) ((obv) oegVar.h.a.get(0)).a).c <= 1) {
                oay oayVar2 = oegVar.h;
                mee.f(oayVar2);
                ((obt) ((obv) oayVar2.a.get(0)).a.get(0)).a.e.equals(mbf.a);
            }
            oaf oafVar = oegVar.d;
            oee oeeVar = oegVar.e;
            oegVar.i(oayVarA, new odh(path, oafVar, oeeVar), oeeVar);
        } catch (IllegalStateException e) {
            this.c.e(-1L, cqyc.a);
            ekrw ekrwVarI = cqyh.a.i();
            ekrwVarI.X(eksq.a, "BugleTranscoding");
            ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarI).g(e).h("com/google/android/apps/messaging/shared/util/media/video/transformer/TranscoderImpl$transcodeAsync$2$2", "run", 262, "TranscoderImpl.kt");
            cqyh cqyhVar = this.d;
            long j = this.e;
            ekrdVar.s("transformer failed in %d ms.", cqyhVar.c.a() - j);
            cqxn cqxnVar = cqyhVar.d;
            cqxnVar.p(2);
            cqxnVar.r(13);
            cqxnVar.k(cqyhVar.b(j));
            cqxnVar.b();
        }
    }
}
