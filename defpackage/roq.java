package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class roq implements rfb {
    private final rfb b;
    private final boolean c;

    public roq(rfb rfbVar, boolean z) {
        this.b = rfbVar;
        this.c = z;
    }

    @Override // defpackage.res
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.rfb
    public final rhy b(Context context, rhy rhyVar, int i, int i2) {
        rii riiVar = raw.b(context).a;
        Drawable drawable = (Drawable) rhyVar.c();
        rhy rhyVarA = rop.a(riiVar, drawable, i, i2);
        if (rhyVarA == null) {
            if (this.c) {
                throw new IllegalArgumentException(a.I(drawable, "Unable to convert ", " to a Bitmap"));
            }
            return rhyVar;
        }
        rhy rhyVarB = this.b.b(context, rhyVarA, i, i2);
        if (!rhyVarB.equals(rhyVarA)) {
            return rpd.f(context.getResources(), rhyVarB);
        }
        rhyVarB.e();
        return rhyVar;
    }

    @Override // defpackage.res
    public final boolean equals(Object obj) {
        if (obj instanceof roq) {
            return this.b.equals(((roq) obj).b);
        }
        return false;
    }

    @Override // defpackage.res
    public final int hashCode() {
        return this.b.hashCode();
    }
}
