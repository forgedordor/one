package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rqv implements rfb {
    private final rfb b;

    public rqv(rfb rfbVar) {
        rvi.f(rfbVar);
        this.b = rfbVar;
    }

    @Override // defpackage.res
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.rfb
    public final rhy b(Context context, rhy rhyVar, int i, int i2) {
        rqs rqsVar = (rqs) rhyVar.c();
        rhy rnrVar = new rnr(rqsVar.a(), raw.b(context).a);
        rfb rfbVar = this.b;
        rhy rhyVarB = rfbVar.b(context, rnrVar, i, i2);
        if (!rnrVar.equals(rhyVarB)) {
            rnrVar.e();
        }
        rqsVar.a.a.e(rfbVar, (Bitmap) rhyVarB.c());
        return rhyVar;
    }

    @Override // defpackage.res
    public final boolean equals(Object obj) {
        if (obj instanceof rqv) {
            return this.b.equals(((rqv) obj).b);
        }
        return false;
    }

    @Override // defpackage.res
    public final int hashCode() {
        return this.b.hashCode();
    }
}
