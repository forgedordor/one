package defpackage;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.Objects;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwt implements mtx, mwu {
    private boolean A;
    public final PlaybackSession a;
    public String b;
    public PlaybackMetrics.Builder c;
    private final Context d;
    private final mwv f;
    private int l;
    private mbz o;
    private mws p;
    private mws q;
    private mws r;
    private mau s;
    private mau t;
    private mau u;
    private boolean v;
    private boolean w;
    private int x;
    private int y;
    private int z;
    private final Executor e = mef.a();
    private final mck h = new mck();
    private final mcj i = new mcj();
    private final HashMap k = new HashMap();
    private final HashMap j = new HashMap();
    private final long g = SystemClock.elapsedRealtime();
    private int m = 0;
    private int n = 0;

    public mwt(Context context, PlaybackSession playbackSession) {
        this.d = context.getApplicationContext();
        this.a = playbackSession;
        mwm mwmVar = new mwm();
        this.f = mwmVar;
        mwmVar.c = this;
    }

    private static int m(int i) {
        switch (mgb.k(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void n(int i, long j, mau mauVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.g);
        if (mauVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = mauVar.n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = mauVar.o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = mauVar.k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = mauVar.j;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = mauVar.v;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = mauVar.w;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = mauVar.G;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = mauVar.H;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = mauVar.d;
            if (str4 != null) {
                String[] strArrAh = mgb.ah(str4, "-");
                Pair pairCreate = Pair.create(strArrAh[0], strArrAh.length >= 2 ? strArrAh[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                if (pairCreate.second != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) pairCreate.second);
                }
            }
            float f = mauVar.z;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.e.execute(new Runnable() { // from class: mwn
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.reportTrackChangeEvent(trackChangeEventBuild);
            }
        });
    }

    private final boolean o(mws mwsVar) {
        if (mwsVar != null) {
            return mwsVar.c.equals(this.f.c());
        }
        return false;
    }

    private final void p(long j, mau mauVar) {
        if (Objects.equals(this.t, mauVar)) {
            return;
        }
        int i = this.t == null ? 1 : 0;
        this.t = mauVar;
        n(0, j, mauVar, i);
    }

    private final void q(long j, mau mauVar) {
        if (Objects.equals(this.u, mauVar)) {
            return;
        }
        int i = this.u == null ? 1 : 0;
        this.u = mauVar;
        n(2, j, mauVar, i);
    }

    private final void r(long j, mau mauVar) {
        if (Objects.equals(this.s, mauVar)) {
            return;
        }
        int i = this.s == null ? 1 : 0;
        this.s = mauVar;
        n(1, j, mauVar, i);
    }

    @Override // defpackage.mtx
    public final void a(mtv mtvVar, nej nejVar) {
        nen nenVar = mtvVar.d;
        if (nenVar == null) {
            return;
        }
        mau mauVar = nejVar.b;
        mee.f(mauVar);
        mws mwsVar = new mws(mauVar, this.f.d(mtvVar.b, nenVar));
        int i = nejVar.a;
        if (i != 0) {
            if (i == 1) {
                this.q = mwsVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.r = mwsVar;
                return;
            }
        }
        this.p = mwsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0299  */
    @Override // defpackage.mtx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.mcg r20, defpackage.mtw r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwt.b(mcg, mtw):void");
    }

    @Override // defpackage.mtx
    public final void d(mtv mtvVar, int i, long j) {
        nen nenVar = mtvVar.d;
        if (nenVar != null) {
            mwv mwvVar = this.f;
            mcl mclVar = mtvVar.b;
            HashMap map = this.k;
            String strD = mwvVar.d(mclVar, nenVar);
            Long l = (Long) map.get(strD);
            HashMap map2 = this.j;
            Long l2 = (Long) map2.get(strD);
            map.put(strD, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            map2.put(strD, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // defpackage.mtx
    public final void e(mbz mbzVar) {
        this.o = mbzVar;
    }

    @Override // defpackage.mtx
    public final void f(int i) {
        if (i == 1) {
            this.v = true;
            i = 1;
        }
        this.l = i;
    }

    @Override // defpackage.mtx
    public final void g(mpd mpdVar) {
        this.x += mpdVar.g;
        this.y += mpdVar.e;
    }

    @Override // defpackage.mtx
    public final void h(mde mdeVar) {
        mws mwsVar = this.p;
        if (mwsVar != null) {
            mau mauVar = mwsVar.a;
            if (mauVar.w == -1) {
                mat matVar = new mat(mauVar);
                matVar.t = mdeVar.b;
                matVar.u = mdeVar.c;
                this.p = new mws(new mau(matVar), mwsVar.c);
            }
        }
    }

    public final void j() {
        PlaybackMetrics.Builder builder = this.c;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.z);
            this.c.setVideoFramesDropped(this.x);
            this.c.setVideoFramesPlayed(this.y);
            Long l = (Long) this.j.get(this.b);
            this.c.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.k.get(this.b);
            this.c.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.c.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.c.build();
            this.e.execute(new Runnable() { // from class: mwq
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.reportPlaybackMetrics(playbackMetricsBuild);
                }
            });
        }
        this.c = null;
        this.b = null;
        this.z = 0;
        this.x = 0;
        this.y = 0;
        this.s = null;
        this.t = null;
        this.u = null;
        this.A = false;
    }

    public final void k(mcl mclVar, nen nenVar) {
        int iA;
        int i;
        PlaybackMetrics.Builder builder = this.c;
        if (nenVar == null || (iA = mclVar.a(nenVar.a)) == -1) {
            return;
        }
        mcj mcjVar = this.i;
        mclVar.n(iA, mcjVar);
        mck mckVar = this.h;
        mclVar.p(mcjVar.c, mckVar);
        mbl mblVar = mckVar.d.b;
        if (mblVar == null) {
            i = 0;
        } else {
            int iP = mgb.p(mblVar.a, mblVar.b);
            i = iP != 0 ? iP != 1 ? iP != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        if (mckVar.m != -9223372036854775807L && !mckVar.k && !mckVar.i && !mckVar.c()) {
            builder.setMediaDurationMillis(mckVar.b());
        }
        builder.setPlaybackType(true != mckVar.c() ? 1 : 2);
        this.A = true;
    }

    @Override // defpackage.mwu
    public final void l(mtv mtvVar, String str) {
        nen nenVar = mtvVar.d;
        if ((nenVar == null || !nenVar.b()) && str.equals(this.b)) {
            j();
        }
        this.j.remove(str);
        this.k.remove(str);
    }

    @Override // defpackage.mtx
    public final void i(boolean z) {
    }

    @Override // defpackage.mtx
    public final /* synthetic */ void c(mtv mtvVar, boolean z) {
    }
}
