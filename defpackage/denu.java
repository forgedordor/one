package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class denu extends dcjn implements dcfx {
    private final Status b;

    public denu(DataHolder dataHolder) {
        super(dataHolder);
        this.b = new Status(dataHolder.f);
    }

    @Override // defpackage.dcfx
    public final Status a() {
        return this.b;
    }

    @Override // defpackage.dcjn
    protected final /* bridge */ /* synthetic */ Object f(int i, int i2) {
        return new dere(this.a, i, i2);
    }

    @Override // defpackage.dcjn
    protected final String g() {
        return "path";
    }
}
