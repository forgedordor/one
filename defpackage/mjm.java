package defpackage;

import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.os.Build;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mjm extends moj {
    public final Queue a;
    public mnn b;
    public maz c;
    public int d;
    public boolean e;
    private final may f;
    private boolean g;

    public mjm(may mayVar, mou mouVar) {
        super(mouVar);
        this.f = mayVar;
        this.a = new LinkedBlockingQueue();
    }

    @Override // defpackage.moj, defpackage.mmi
    public final void c() {
        this.n.d(new mot() { // from class: mjh
            @Override // defpackage.mot
            public final void a() throws mcw {
                mjm mjmVar = this.a;
                mjmVar.d++;
                mjmVar.f();
            }
        });
    }

    @Override // defpackage.moj
    public final int d() {
        return 0;
    }

    @Override // defpackage.moj
    protected final void e() throws mcw {
        this.a.clear();
        this.g = false;
        this.e = false;
        this.d = 0;
        maz mazVar = this.c;
        if (mazVar != null) {
            try {
                mazVar.a();
                this.c = null;
            } catch (meu e) {
                throw mcw.a(e);
            }
        }
        super.e();
    }

    public final void f() throws mcw {
        Gainmap gainmap;
        Queue queue = this.a;
        if (queue.isEmpty() || this.d == 0) {
            return;
        }
        mjl mjlVar = (mjl) queue.element();
        max maxVar = mjlVar.b;
        men menVar = mjlVar.c;
        mee.c(menVar.a());
        long j = maxVar.b;
        mee.c(menVar.a());
        int i = menVar.d;
        menVar.d = i + 1;
        long jRound = Math.round(menVar.b * i);
        mee.c(jRound >= 0);
        long j2 = j + jRound;
        if (!this.g) {
            this.g = true;
            Bitmap bitmap = mjlVar.a;
            try {
                maz mazVar = this.c;
                if (mazVar != null) {
                    mazVar.a();
                }
                int iB = mev.b(bitmap);
                mau mauVar = maxVar.a;
                this.c = new maz(iB, -1, mauVar.v, mauVar.w);
                if (Build.VERSION.SDK_INT >= 34 && bitmap.hasGainmap()) {
                    mnn mnnVar = this.b;
                    mee.f(mnnVar);
                    Gainmap gainmap2 = bitmap.getGainmap();
                    mee.f(gainmap2);
                    if (((mka) mnnVar).g && ((gainmap = ((mka) mnnVar).h) == null || gainmap.getGamma() != gainmap2.getGamma() || gainmap.getRatioMax() != gainmap2.getRatioMax() || gainmap.getRatioMin() != gainmap2.getRatioMin() || gainmap.getEpsilonHdr() != gainmap2.getEpsilonHdr() || gainmap.getEpsilonSdr() != gainmap2.getEpsilonSdr() || gainmap.getDisplayRatioForFullHdr() != gainmap2.getDisplayRatioForFullHdr() || gainmap.getMinDisplayRatioForHdrTransition() != gainmap2.getMinDisplayRatioForHdrTransition() || gainmap.getGainmapContents() != gainmap2.getGainmapContents() || gainmap.getGainmapContents().getGenerationId() != gainmap2.getGainmapContents().getGenerationId())) {
                        ((mka) mnnVar).k = false;
                        ((mka) mnnVar).h = gainmap2;
                        int i2 = ((mka) mnnVar).i;
                        if (i2 == -1) {
                            ((mka) mnnVar).i = mev.b(gainmap2.getGainmapContents());
                        } else {
                            mev.v(i2, gainmap2.getGainmapContents());
                        }
                    }
                }
                mnn mnnVar2 = this.b;
                mee.f(mnnVar2);
                mee.c(((mka) mnnVar2).a.c == 1);
                ((mka) mnnVar2).j = true;
                ((mka) mnnVar2).k = false;
            } catch (meu e) {
                throw mcw.a(e);
            }
        }
        this.d--;
        mnn mnnVar3 = this.b;
        mee.f(mnnVar3);
        may mayVar = this.f;
        maz mazVar2 = this.c;
        mee.f(mazVar2);
        mnnVar3.d(mayVar, mazVar2, j2);
        int i3 = mjr.a;
        if (mjlVar.c.a()) {
            return;
        }
        this.g = false;
        Queue queue2 = this.a;
        ((mjl) queue2.remove()).a.recycle();
        if (queue2.isEmpty() && this.e) {
            mnn mnnVar4 = this.b;
            mee.f(mnnVar4);
            mnnVar4.j();
            this.e = false;
        }
    }

    @Override // defpackage.moj
    public final void g() {
        this.n.d(new mot() { // from class: mjj
            @Override // defpackage.mot
            public final void a() {
                mjm mjmVar = this.a;
                maz mazVar = mjmVar.c;
                if (mazVar != null) {
                    mazVar.a();
                }
                mjmVar.a.clear();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.moj
    public final void h(mmk mmkVar) {
        mee.c(true);
        this.d = 0;
        this.b = mmkVar;
    }

    @Override // defpackage.moj
    public final void i() {
        this.n.d(new mot() { // from class: mji
            @Override // defpackage.mot
            public final void a() {
                mjm mjmVar = this.a;
                if (!mjmVar.a.isEmpty()) {
                    mjmVar.e = true;
                    return;
                }
                mnn mnnVar = mjmVar.b;
                mee.f(mnnVar);
                mnnVar.j();
                int i = mjr.a;
            }
        });
    }

    @Override // defpackage.moj
    public final void j(final Bitmap bitmap, final max maxVar, final men menVar) {
        this.n.d(new mot() { // from class: mjk
            @Override // defpackage.mot
            public final void a() throws mcw {
                men menVar2 = menVar;
                mee.b(menVar2.a(), "Bitmap queued but no timestamps provided.");
                mjl mjlVar = new mjl(bitmap, maxVar, menVar2);
                mjm mjmVar = this.a;
                mjmVar.a.add(mjlVar);
                mjmVar.f();
                mjmVar.e = false;
            }
        });
    }
}
