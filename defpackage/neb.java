package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.util.Objects;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class neb implements nem {
    public nvl a;
    private final ndz b;
    private final mhk c;
    private boolean d;

    public neb(Context context, nnw nnwVar) {
        mhu mhuVar = new mhu(context);
        this.c = mhuVar;
        this.a = new nuw();
        ndz ndzVar = new ndz(nnwVar, this.a);
        this.b = ndzVar;
        if (mhuVar != ndzVar.d) {
            ndzVar.d = mhuVar;
            ndzVar.b.clear();
            ndzVar.c.clear();
        }
        this.d = true;
    }

    public static nem a(Class cls, mhk mhkVar) {
        try {
            return (nem) cls.getConstructor(mhk.class).newInstance(mhkVar);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nem
    public final nep b(mbo mboVar) {
        ejxr ejxrVar;
        mbl mblVar = mboVar.b;
        mee.f(mblVar);
        Uri uri = mblVar.a;
        String scheme = uri.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        String str = mblVar.b;
        if (Objects.equals(str, "application/x-image-uri")) {
            long j = mblVar.i;
            String str2 = mgb.a;
            throw null;
        }
        int iP = mgb.p(uri, str);
        if (mblVar.i != -9223372036854775807L) {
            ((nnn) this.b.a).c();
        }
        try {
            final ndz ndzVar = this.b;
            Map map = ndzVar.c;
            Integer numValueOf = Integer.valueOf(iP);
            nem nemVar = (nem) map.get(numValueOf);
            if (nemVar == null) {
                Map map2 = ndzVar.b;
                ejxr ejxrVar2 = (ejxr) map2.get(numValueOf);
                if (ejxrVar2 == null) {
                    final mhk mhkVar = ndzVar.d;
                    mee.f(mhkVar);
                    if (iP == 0) {
                        final Class<? extends U> clsAsSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(nem.class);
                        ejxrVar = new ejxr() { // from class: ndu
                            @Override // defpackage.ejxr
                            public final Object get() {
                                return neb.a(clsAsSubclass, mhkVar);
                            }
                        };
                    } else if (iP == 1) {
                        final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(nem.class);
                        ejxrVar = new ejxr() { // from class: ndv
                            @Override // defpackage.ejxr
                            public final Object get() {
                                return neb.a(clsAsSubclass2, mhkVar);
                            }
                        };
                    } else if (iP != 2) {
                        if (iP != 3) {
                            ejxrVar2 = new ejxr() { // from class: ndy
                                @Override // defpackage.ejxr
                                public final Object get() {
                                    return new nft(mhkVar, ndzVar.a);
                                }
                            };
                        } else {
                            final Class<? extends U> clsAsSubclass3 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(nem.class);
                            ejxrVar2 = new ejxr() { // from class: ndx
                                @Override // defpackage.ejxr
                                public final Object get() {
                                    try {
                                        return (nem) clsAsSubclass3.getConstructor(null).newInstance(null);
                                    } catch (Exception e) {
                                        throw new IllegalStateException(e);
                                    }
                                }
                            };
                        }
                        map2.put(numValueOf, ejxrVar2);
                    } else {
                        final Class<? extends U> clsAsSubclass4 = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(nem.class);
                        ejxrVar = new ejxr() { // from class: ndw
                            @Override // defpackage.ejxr
                            public final Object get() {
                                return neb.a(clsAsSubclass4, mhkVar);
                            }
                        };
                    }
                    ejxrVar2 = ejxrVar;
                    map2.put(numValueOf, ejxrVar2);
                }
                nemVar = (nem) ejxrVar2.get();
                nemVar.e(ndzVar.f);
                nemVar.c(ndzVar.e);
                nemVar.d();
                map.put(numValueOf, nemVar);
            }
            mbk mbkVar = mboVar.c;
            mbj mbjVar = new mbj(mbkVar);
            if (mbkVar.a == -9223372036854775807L) {
                mbjVar.a = -9223372036854775807L;
            }
            if (mbkVar.d == -3.4028235E38f) {
                mbjVar.d = -3.4028235E38f;
            }
            if (mbkVar.e == -3.4028235E38f) {
                mbjVar.e = -3.4028235E38f;
            }
            if (mbkVar.b == -9223372036854775807L) {
                mbjVar.b = -9223372036854775807L;
            }
            if (mbkVar.c == -9223372036854775807L) {
                mbjVar.c = -9223372036854775807L;
            }
            mbk mbkVar2 = new mbk(mbjVar);
            if (!mbkVar2.equals(mbkVar)) {
                mbd mbdVar = new mbd(mboVar);
                mbdVar.c = new mbj(mbkVar2);
                mboVar = mbdVar.a();
            }
            nep nepVarB = nemVar.b(mboVar);
            mbl mblVar2 = mboVar.b;
            ekgb ekgbVar = mblVar2.g;
            if (!ekgbVar.isEmpty()) {
                int i = ((ekoe) ekgbVar).c;
                nep[] nepVarArr = new nep[i + 1];
                nepVarArr[0] = nepVarB;
                int i2 = 0;
                while (i2 < i) {
                    if (this.d) {
                        mat matVar = new mat();
                        String str3 = ((mbn) ekgbVar.get(i2)).b;
                        matVar.c(null);
                        String str4 = ((mbn) ekgbVar.get(i2)).c;
                        matVar.d = null;
                        int i3 = ((mbn) ekgbVar.get(i2)).d;
                        matVar.e = 0;
                        int i4 = ((mbn) ekgbVar.get(i2)).e;
                        matVar.f = 0;
                        String str5 = ((mbn) ekgbVar.get(i2)).f;
                        matVar.b = null;
                        String str6 = ((mbn) ekgbVar.get(i2)).g;
                        matVar.a = null;
                        final mau mauVar = new mau(matVar);
                        nft nftVar = new nft(this.c, new nnw() { // from class: ndt
                            @Override // defpackage.nnw
                            public final /* synthetic */ nnr[] a(Uri uri2, Map map3) {
                                neb nebVar = this.a;
                                nnr[] nnrVarArr = new nnr[1];
                                nvl nvlVar = nebVar.a;
                                mau mauVar2 = mauVar;
                                nnrVarArr[0] = nvlVar.c(mauVar2) ? new nvf(nebVar.a.b(mauVar2)) : new nea(mauVar2);
                                return nnrVarArr;
                            }
                        });
                        if (this.a.c(mauVar)) {
                            mat matVar2 = new mat(mauVar);
                            matVar2.c("application/x-media3-cues");
                            matVar2.j = mauVar.o;
                            matVar2.K = this.a.a(mauVar);
                            mauVar = new mau(matVar2);
                        }
                        nftVar.a = mauVar;
                        Uri uri2 = ((mbn) ekgbVar.get(i2)).a;
                        throw null;
                    }
                    int i5 = i2 + 1;
                    nepVarArr[i5] = new ngh((mbn) ekgbVar.get(i2));
                    i2 = i5;
                }
                nepVarB = new nfe(nepVarArr);
            }
            long j2 = mboVar.e.c;
            if (j2 != 0) {
                ndj ndjVar = new ndj(nepVarB);
                mee.a(j2 >= 0);
                mee.c(!ndjVar.e);
                ndjVar.b = j2;
                mee.c(!ndjVar.e);
                ndjVar.c = Long.MIN_VALUE;
                mee.c(!ndjVar.e);
                ndjVar.d = true;
                mee.c(!ndjVar.e);
                mee.c(!ndjVar.e);
                mee.c(!ndjVar.e);
                ndjVar.e = true;
                nepVarB = new ndm(ndjVar);
            }
            mee.f(mblVar2);
            mbc mbcVar = mblVar2.d;
            return nepVarB;
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.nem
    @Deprecated
    public final /* bridge */ /* synthetic */ void c(boolean z) {
        this.d = z;
        ndz ndzVar = this.b;
        ndzVar.e = z;
        ((nnn) ndzVar.a).b(z);
        Iterator it = ndzVar.c.values().iterator();
        while (it.hasNext()) {
            ((nem) it.next()).c(z);
        }
    }

    @Override // defpackage.nem
    public final /* bridge */ /* synthetic */ void e(nvl nvlVar) {
        mee.f(nvlVar);
        this.a = nvlVar;
        ndz ndzVar = this.b;
        ndzVar.f = nvlVar;
        ((nnn) ndzVar.a).d(nvlVar);
        Iterator it = ndzVar.c.values().iterator();
        while (it.hasNext()) {
            ((nem) it.next()).e(nvlVar);
        }
    }

    @Override // defpackage.nem
    public final /* bridge */ /* synthetic */ void d() {
    }
}
