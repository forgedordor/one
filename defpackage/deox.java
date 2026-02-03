package defpackage;

import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deox implements Runnable {
    final /* synthetic */ DataHolder a;
    final /* synthetic */ depg b;

    public deox(depg depgVar, DataHolder dataHolder) {
        this.a = dataHolder;
        this.b = depgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        denu denuVar = new denu(this.a);
        try {
            this.b.a.j(denuVar);
        } finally {
            denuVar.b();
        }
    }
}
