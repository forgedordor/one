package defpackage;

import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deug implements dcia {
    final /* synthetic */ DataHolder a;

    public deug(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    @Override // defpackage.dcia
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            ((denq) obj).j(new denu(this.a));
        } finally {
            this.a.close();
        }
    }

    @Override // defpackage.dcia
    public final void b() {
        this.a.close();
    }
}
