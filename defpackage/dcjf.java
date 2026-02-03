package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dcjf<T> implements dcjh<T> {
    protected final DataHolder a;

    protected dcjf(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    @Override // defpackage.dcfu
    public final void b() {
        DataHolder dataHolder = this.a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // defpackage.dcjh
    public int c() {
        DataHolder dataHolder = this.a;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return new dcji(this);
    }
}
