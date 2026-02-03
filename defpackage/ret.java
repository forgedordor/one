package defpackage;

import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ret implements rfb {
    private final Collection b;

    @SafeVarargs
    public ret(rfb... rfbVarArr) {
        if (rfbVarArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.b = Arrays.asList(rfbVarArr);
    }

    @Override // defpackage.res
    public final void a(MessageDigest messageDigest) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((rfb) it.next()).a(messageDigest);
        }
    }

    @Override // defpackage.rfb
    public final rhy b(Context context, rhy rhyVar, int i, int i2) {
        Iterator it = this.b.iterator();
        rhy rhyVar2 = rhyVar;
        while (it.hasNext()) {
            rhy rhyVarB = ((rfb) it.next()).b(context, rhyVar2, i, i2);
            if (rhyVar2 != null && !rhyVar2.equals(rhyVar) && !rhyVar2.equals(rhyVarB)) {
                rhyVar2.e();
            }
            rhyVar2 = rhyVarB;
        }
        return rhyVar2;
    }

    @Override // defpackage.res
    public final boolean equals(Object obj) {
        if (obj instanceof ret) {
            return this.b.equals(((ret) obj).b);
        }
        return false;
    }

    @Override // defpackage.res
    public final int hashCode() {
        return this.b.hashCode();
    }
}
