package defpackage;

import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dcjv {
    public Object d;
    public boolean e = false;
    final /* synthetic */ BaseGmsClient f;

    public dcjv(BaseGmsClient baseGmsClient, Object obj) {
        this.f = baseGmsClient;
        this.d = obj;
    }

    protected abstract void c();

    public final void d() {
        synchronized (this) {
            this.d = null;
        }
    }

    public final void e() {
        d();
        ArrayList arrayList = this.f.j;
        synchronized (arrayList) {
            arrayList.remove(this);
        }
    }
}
