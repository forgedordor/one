package defpackage;

import android.os.Bundle;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chgt {
    public final auib a;
    public final aubq b;
    public final axcm c;
    public final Instant d;
    public final chbs e;
    public final eyga f;
    public final basd g;
    public final auhk h;
    public final basd i;
    public final boolean j;
    public final cbqz k;
    public final aubt l;
    public final elny m;
    public final augz n;
    public final chwo o;
    private final Bundle p;

    public chgt(auib auibVar, aubq aubqVar, axcm axcmVar, Instant instant, chbs chbsVar, eyga eygaVar, basd basdVar, auhk auhkVar, basd basdVar2, boolean z, cbqz cbqzVar, aubt aubtVar, elny elnyVar, Bundle bundle, augz augzVar, chwo chwoVar) {
        instant.getClass();
        chbsVar.getClass();
        eygaVar.getClass();
        auhkVar.getClass();
        cbqzVar.getClass();
        elnyVar.getClass();
        bundle.getClass();
        this.a = auibVar;
        this.b = aubqVar;
        this.c = axcmVar;
        this.d = instant;
        this.e = chbsVar;
        this.f = eygaVar;
        this.g = basdVar;
        this.h = auhkVar;
        this.i = basdVar2;
        this.j = z;
        this.k = cbqzVar;
        this.l = aubtVar;
        this.m = elnyVar;
        this.p = bundle;
        this.n = augzVar;
        this.o = chwoVar;
        String str = auibVar.c;
        str.getClass();
        if (str.length() <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (axcmVar == null) {
            if (aubqVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            int i = aubqVar.c;
            aubp aubpVarB = aubp.b(i);
            aubpVarB = aubpVarB == null ? aubp.UNKNOWN_TYPE : aubpVarB;
            aubp aubpVar = aubp.UNKNOWN_TYPE;
            if (aubpVarB == aubpVar) {
                throw new IllegalStateException("Check failed.");
            }
            aubp aubpVarB2 = aubp.b(i);
            if ((aubpVarB2 == null ? aubpVar : aubpVarB2) == aubp.GROUP) {
                throw new IllegalStateException("Check failed.");
            }
            aubp aubpVarB3 = aubp.b(i);
            if ((aubpVarB3 != null ? aubpVarB3 : aubpVar) == aubp.BOT) {
                throw new IllegalStateException("Check failed.");
            }
            String str2 = aubqVar.d;
            str2.getClass();
            if (str2.length() <= 0) {
                throw new IllegalStateException("Check failed.");
            }
        }
        basd basdVar3 = basd.a;
        if (fdbq.f(basdVar, basdVar3)) {
            throw new IllegalStateException("Check failed.");
        }
        if (auhkVar != auhk.DELIVERY && auhkVar != auhk.DISPLAYED && auhkVar != auhk.DELIVERY_FAILED) {
            throw new IllegalStateException("Check failed.");
        }
        if (fdbq.f(basdVar2, basdVar3)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public static /* synthetic */ chgt a(chgt chgtVar, eyga eygaVar, aubt aubtVar, augz augzVar, chwo chwoVar, int i) {
        auib auibVar = (i & 1) != 0 ? chgtVar.a : null;
        aubq aubqVar = (i & 2) != 0 ? chgtVar.b : null;
        axcm axcmVar = (i & 4) != 0 ? chgtVar.c : null;
        Instant instant = (i & 8) != 0 ? chgtVar.d : null;
        chbs chbsVar = (i & 16) != 0 ? chgtVar.e : null;
        eyga eygaVar2 = (i & 32) != 0 ? chgtVar.f : eygaVar;
        basd basdVar = (i & 64) != 0 ? chgtVar.g : null;
        auhk auhkVar = (i & 128) != 0 ? chgtVar.h : null;
        basd basdVar2 = (i & 256) != 0 ? chgtVar.i : null;
        boolean z = (i & 512) != 0 ? chgtVar.j : false;
        cbqz cbqzVar = (i & 1024) != 0 ? chgtVar.k : null;
        aubt aubtVar2 = (i & 2048) != 0 ? chgtVar.l : aubtVar;
        elny elnyVar = (i & 4096) != 0 ? chgtVar.m : null;
        Bundle bundle = (i & 8192) != 0 ? chgtVar.p : null;
        augz augzVar2 = (i & 16384) != 0 ? chgtVar.n : augzVar;
        chwo chwoVar2 = (i & 32768) != 0 ? chgtVar.o : chwoVar;
        auibVar.getClass();
        instant.getClass();
        chbsVar.getClass();
        eygaVar2.getClass();
        basdVar.getClass();
        auhkVar.getClass();
        basdVar2.getClass();
        cbqzVar.getClass();
        elnyVar.getClass();
        bundle.getClass();
        return new chgt(auibVar, aubqVar, axcmVar, instant, chbsVar, eygaVar2, basdVar, auhkVar, basdVar2, z, cbqzVar, aubtVar2, elnyVar, bundle, augzVar2, chwoVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chgt)) {
            return false;
        }
        chgt chgtVar = (chgt) obj;
        return fdbq.f(this.a, chgtVar.a) && fdbq.f(this.b, chgtVar.b) && fdbq.f(this.c, chgtVar.c) && fdbq.f(this.d, chgtVar.d) && fdbq.f(this.e, chgtVar.e) && fdbq.f(this.f, chgtVar.f) && fdbq.f(this.g, chgtVar.g) && this.h == chgtVar.h && fdbq.f(this.i, chgtVar.i) && this.j == chgtVar.j && fdbq.f(this.k, chgtVar.k) && fdbq.f(this.l, chgtVar.l) && this.m == chgtVar.m && fdbq.f(this.p, chgtVar.p) && fdbq.f(this.n, chgtVar.n) && fdbq.f(this.o, chgtVar.o);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        aubq aubqVar = this.b;
        int iHashCode2 = (iHashCode + (aubqVar == null ? 0 : aubqVar.hashCode())) * 31;
        axcm axcmVar = this.c;
        int iHashCode3 = (((((((((((((((((iHashCode2 + (axcmVar == null ? 0 : axcmVar.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + (true != this.j ? 1237 : 1231)) * 31) + this.k.hashCode()) * 31;
        aubt aubtVar = this.l;
        int iHashCode4 = (((((iHashCode3 + (aubtVar == null ? 0 : aubtVar.hashCode())) * 31) + this.m.hashCode()) * 31) + this.p.hashCode()) * 31;
        augz augzVar = this.n;
        int iHashCode5 = (iHashCode4 + (augzVar == null ? 0 : augzVar.hashCode())) * 31;
        chwo chwoVar = this.o;
        return iHashCode5 + (chwoVar != null ? chwoVar.hashCode() : 0);
    }

    public final String toString() {
        return "SendRcsReportData(traceId=" + this.a + ", self=" + this.b + ", myIdentity=" + this.c + ", sentTimestamp=" + this.d + ", destinationTokens=" + this.e + ", customHeaders=" + this.f + ", receivedMessageId=" + this.g + ", receiptType=" + this.h + ", reportId=" + this.i + ", encrypted=" + this.j + ", encryptionProtocol=" + this.k + ", serializedContent=" + this.l + ", source=" + this.m + ", grabBag=" + this.p + ", result=" + this.n + ", resultAndDiagnostics=" + this.o + ")";
    }
}
