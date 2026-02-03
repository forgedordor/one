package defpackage;

import android.os.IBinder;
import androidx.window.extensions.embedding.SplitInfo;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pwh {
    private final prw a;
    private final prw b;
    private final pwf c;
    private final IBinder d;
    private final SplitInfo.Token e;

    public pwh(prw prwVar, prw prwVar2, pwf pwfVar, IBinder iBinder, SplitInfo.Token token) {
        this.a = prwVar;
        this.b = prwVar2;
        this.c = pwfVar;
        this.d = iBinder;
        this.e = token;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwh)) {
            return false;
        }
        pwh pwhVar = (pwh) obj;
        return fdbq.f(this.a, pwhVar.a) && fdbq.f(this.b, pwhVar.b) && fdbq.f(this.c, pwhVar.c) && fdbq.f(this.e, pwhVar.e) && fdbq.f(this.d, pwhVar.d);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        SplitInfo.Token token = this.e;
        int iHashCode2 = ((iHashCode * 31) + (token != null ? token.hashCode() : 0)) * 31;
        IBinder iBinder = this.d;
        return iHashCode2 + (iBinder != null ? iBinder.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SplitInfo:{");
        sb.append("primaryActivityStack=" + this.a + ", ");
        sb.append("secondaryActivityStack=" + this.b + ", ");
        sb.append("splitAttributes=" + this.c + ", ");
        SplitInfo.Token token = this.e;
        if (token != null) {
            Objects.toString(token);
            sb.append("token=".concat(token.toString()));
        }
        IBinder iBinder = this.d;
        if (iBinder != null) {
            Objects.toString(iBinder);
            sb.append("binder=".concat(iBinder.toString()));
        }
        sb.append("}");
        return sb.toString();
    }

    public pwh(prw prwVar, prw prwVar2, pwf pwfVar) {
        this(prwVar, prwVar2, pwfVar, null, null);
    }

    public pwh(prw prwVar, prw prwVar2, pwf pwfVar, IBinder iBinder) {
        this(prwVar, prwVar2, pwfVar, iBinder, null);
        prh prhVar = new prh();
        fddq fddqVar = new fddq(3, 4);
        int i = fddqVar.a;
        int i2 = fddqVar.b;
        int i3 = prhVar.a;
        if (i > i3 || i3 > i2) {
            throw new UnsupportedOperationException("This API requires extension version " + fddqVar + ", but the device is on " + prhVar.a);
        }
    }
}
