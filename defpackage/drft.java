package defpackage;

import android.os.Trace;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drft implements rlq, drga {
    public final rlo b;
    public final rlq c;
    public final drgb d;
    public final Class e;
    private static final eksp f = eksp.c("FifeModelLoader");
    public static final rew a = new rew("com.google.android.libraries.glide.fife.FifeModelLoader.useBatchSizeAsAlternate", false, new rev() { // from class: drfm
        @Override // defpackage.rev
        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
            rew rewVar = drft.a;
            if (((Boolean) obj).booleanValue()) {
                messageDigest.update(bArr);
            }
        }
    });

    public drft(rlq rlqVar, drgb drgbVar, rlo rloVar, Class cls) {
        new eoqh();
        this.c = rlqVar;
        this.d = drgbVar;
        this.e = cls;
        if (drgbVar != null) {
            ((eddw) drgbVar).c = this;
        }
        this.b = rloVar == null ? new rlo(2000L) : rloVar;
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }

    public final rlc c(drfl drflVar, int i, int i2, boolean z, rld rldVar) {
        plm.a("FifeModelLoader.buildGlideUrl");
        int i3 = 0;
        boolean z2 = z && rldVar == null;
        if (z2) {
            try {
                rlc rlcVar = (rlc) this.b.a(drflVar, i, i2);
                if (rlcVar != null) {
                    return rlcVar;
                }
            } finally {
                Trace.endSection();
            }
        }
        drfz drfzVar = drflVar.b;
        String strA = drflVar.c.b;
        int i4 = drfzVar.b;
        int iC = drfz.c(i);
        int iC2 = drfz.c(i2);
        int i5 = ebuj.a;
        int i6 = ebuh.a;
        String strB = ebuj.b(strA, i4, iC, iC2);
        if (strB != null) {
            strA = strB;
        } else {
            if (iC != 0) {
                i3 = iC;
            } else if (iC2 != 0) {
            }
            strA = ebuk.a(i3, iC2, strA);
        }
        if (rldVar == null) {
            drgb drgbVar = this.d;
            rldVar = drgbVar == null ? rld.a : drgbVar.a(drflVar);
        }
        rlc rlcVar2 = new rlc(strA, rldVar);
        if (z2) {
            this.b.b(drflVar, i, i2, rlcVar2);
        }
        return rlcVar2;
    }

    @Override // defpackage.rlq
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final rlp a(final drfl drflVar, final int i, final int i2, rex rexVar) throws Throwable {
        rlp rlpVar;
        plm.a("FifeModelLoader.beginSection");
        try {
            ((eksl) f.o().h("com/google/android/libraries/glide/fife/FifeModelLoader", "buildLoadData", 132, "FifeModelLoader.java")).I("Loading fife model, model: %s, width: %d, height: %d", drflVar, Integer.valueOf(i), Integer.valueOf(i2));
            try {
                if (this.d == null) {
                    rlpVar = this.c.a(c(drflVar, i, i2, true, null), i, i2, rexVar);
                } else {
                    List listSingletonList = Collections.EMPTY_LIST;
                    if (((Boolean) rexVar.b(a)).booleanValue()) {
                        listSingletonList = Collections.singletonList(new drfy(drflVar, i, i2, new drfx() { // from class: drfn
                            @Override // defpackage.drfx
                            public final rlc a() {
                                return this.a.c(drflVar, i, i2, false, null);
                            }
                        }));
                    }
                    rlpVar = new rlp(new drfy(drflVar, i, i2, new drfx() { // from class: drfo
                        @Override // defpackage.drfx
                        public final rlc a() {
                            return this.a.c(drflVar, i, i2, true, null);
                        }
                    }), listSingletonList, new drfq(this, drflVar, i, i2, rexVar));
                }
                Trace.endSection();
                return rlpVar;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public drft(rlq rlqVar, Class cls) {
        this(rlqVar, null, null, cls);
    }
}
