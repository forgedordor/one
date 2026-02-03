package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bacm extends bahx {
    private short A;
    public MessageIdType a;
    public String b;
    public String c;
    public Uri d;
    public Uri e;
    public String f;
    public String g;
    public LocationInformation h;
    public String i;
    public String j;
    public String k;
    public dqbw l;
    public bvdr m;
    public athh n;
    public bvdq o;
    private int p;
    private int q;
    private long r;
    private long s;
    private elha t;
    private long u;
    private long v;
    private int w;
    private boolean x;
    private boolean y;
    private bvdy z;

    @Override // defpackage.bahx
    public final bahy a() {
        MessageIdType messageIdType;
        elha elhaVar;
        bvdr bvdrVar;
        bvdy bvdyVar;
        if (this.A == 511 && (messageIdType = this.a) != null && (elhaVar = this.t) != null && (bvdrVar = this.m) != null && (bvdyVar = this.z) != null) {
            return new bacn(messageIdType, this.b, this.c, this.d, this.e, this.p, this.q, this.r, this.s, elhaVar, this.f, this.g, this.u, this.h, this.i, this.j, this.k, this.l, this.v, bvdrVar, this.w, this.x, this.y, this.n, this.o, bvdyVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" messageId");
        }
        if ((this.A & 1) == 0) {
            sb.append(" width");
        }
        if ((this.A & 2) == 0) {
            sb.append(" height");
        }
        if ((this.A & 4) == 0) {
            sb.append(" duration");
        }
        if ((this.A & 8) == 0) {
            sb.append(" targetFileSize");
        }
        if (this.t == null) {
            sb.append(" source");
        }
        if ((this.A & 16) == 0) {
            sb.append(" mediaModifiedTimestamp");
        }
        if ((this.A & 32) == 0) {
            sb.append(" fileSizeBytes");
        }
        if (this.m == null) {
            sb.append(" mediaSendType");
        }
        if ((this.A & 64) == 0) {
            sb.append(" bundleIndex");
        }
        if ((this.A & 128) == 0) {
            sb.append(" preserveSize");
        }
        if ((this.A & 256) == 0) {
            sb.append(" saveToExternalStorage");
        }
        if (this.z == null) {
            sb.append(" richCardMediaDownloadFailureReason");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.bahx
    public final elha b() {
        elha elhaVar = this.t;
        if (elhaVar != null) {
            return elhaVar;
        }
        throw new IllegalStateException("Property \"source\" has not been set");
    }

    @Override // defpackage.bahx
    public final Optional c() {
        return (this.A & 128) == 0 ? Optional.empty() : Optional.of(Boolean.valueOf(this.x));
    }

    @Override // defpackage.bahx
    public final Optional d() {
        return (this.A & 256) == 0 ? Optional.empty() : Optional.of(Boolean.valueOf(this.y));
    }

    @Override // defpackage.bahx
    public final String e() {
        return this.c;
    }

    @Override // defpackage.bahx
    public final void f(int i) {
        this.w = i;
        this.A = (short) (this.A | 64);
    }

    @Override // defpackage.bahx
    public final void g(long j) {
        this.r = j;
        this.A = (short) (this.A | 4);
    }

    @Override // defpackage.bahx
    public final void h(long j) {
        this.v = j;
        this.A = (short) (this.A | 32);
    }

    @Override // defpackage.bahx
    public final void i(int i) {
        this.q = i;
        this.A = (short) (this.A | 2);
    }

    @Override // defpackage.bahx
    public final void j(long j) {
        this.u = j;
        this.A = (short) (this.A | 16);
    }

    @Override // defpackage.bahx
    public final void k(boolean z) {
        this.x = z;
        this.A = (short) (this.A | 128);
    }

    @Override // defpackage.bahx
    public final void l(bvdy bvdyVar) {
        if (bvdyVar == null) {
            throw new NullPointerException("Null richCardMediaDownloadFailureReason");
        }
        this.z = bvdyVar;
    }

    @Override // defpackage.bahx
    public final void m(boolean z) {
        this.y = z;
        this.A = (short) (this.A | 256);
    }

    @Override // defpackage.bahx
    public final void n(elha elhaVar) {
        if (elhaVar == null) {
            throw new NullPointerException("Null source");
        }
        this.t = elhaVar;
    }

    @Override // defpackage.bahx
    public final void o(long j) {
        this.s = j;
        this.A = (short) (this.A | 8);
    }

    @Override // defpackage.bahx
    public final void p(int i) {
        this.p = i;
        this.A = (short) (this.A | 1);
    }
}
