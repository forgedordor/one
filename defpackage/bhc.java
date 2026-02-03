package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhc extends bjf {
    public final Executor a;
    public final Handler b;

    public bhc(Executor executor, Handler handler) {
        this.a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.b = handler;
    }

    @Override // defpackage.bjf
    public final Handler a() {
        return this.b;
    }

    @Override // defpackage.bjf
    public final Executor b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bjf) {
            bjf bjfVar = (bjf) obj;
            if (this.a.equals(bjfVar.b()) && this.b.equals(bjfVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.a + ", schedulerHandler=" + this.b + "}";
    }
}
