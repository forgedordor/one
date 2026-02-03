package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ria implements res {
    private static final rvf b = new rvf(50);
    private final rig c;
    private final res d;
    private final res e;
    private final int f;
    private final int g;
    private final Class h;
    private final rex i;
    private final rfb j;

    public ria(rig rigVar, res resVar, res resVar2, int i, int i2, rfb rfbVar, Class cls, rex rexVar) {
        this.c = rigVar;
        this.d = resVar;
        this.e = resVar2;
        this.f = i;
        this.g = i2;
        this.j = rfbVar;
        this.h = cls;
        this.i = rexVar;
    }

    @Override // defpackage.res
    public final void a(MessageDigest messageDigest) {
        rig rigVar = this.c;
        byte[] bArr = (byte[]) rigVar.e(byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f).putInt(this.g).array();
        this.e.a(messageDigest);
        this.d.a(messageDigest);
        messageDigest.update(bArr);
        rfb rfbVar = this.j;
        if (rfbVar != null) {
            rfbVar.a(messageDigest);
        }
        this.i.a(messageDigest);
        Class cls = this.h;
        rvf rvfVar = b;
        byte[] bytes = (byte[]) rvfVar.h(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(a);
            rvfVar.i(cls, bytes);
        }
        messageDigest.update(bytes);
        rigVar.c(bArr);
    }

    @Override // defpackage.res
    public final boolean equals(Object obj) {
        if (obj instanceof ria) {
            ria riaVar = (ria) obj;
            if (this.g == riaVar.g && this.f == riaVar.f && rvk.l(this.j, riaVar.j) && this.h.equals(riaVar.h) && this.d.equals(riaVar.d) && this.e.equals(riaVar.e) && this.i.equals(riaVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.res
    public final int hashCode() {
        int iHashCode = (this.d.hashCode() * 31) + this.e.hashCode();
        rfb rfbVar = this.j;
        int iHashCode2 = (((iHashCode * 31) + this.f) * 31) + this.g;
        if (rfbVar != null) {
            iHashCode2 = (iHashCode2 * 31) + rfbVar.hashCode();
        }
        return (((iHashCode2 * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        rex rexVar = this.i;
        rfb rfbVar = this.j;
        Class cls = this.h;
        res resVar = this.e;
        return "ResourceCacheKey{sourceKey=" + String.valueOf(this.d) + ", signature=" + String.valueOf(resVar) + ", width=" + this.f + ", height=" + this.g + ", decodedResourceClass=" + String.valueOf(cls) + ", transformation='" + String.valueOf(rfbVar) + "', options=" + String.valueOf(rexVar) + "}";
    }
}
