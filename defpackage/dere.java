package defpackage;

import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dere extends dcjj implements dent {
    private final int d;

    public dere(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.d = i2;
    }

    @Override // defpackage.dent
    public final int a() {
        return gs("event_type");
    }

    @Override // defpackage.dent
    public final denv b() {
        return new derk(this.a, this.b, this.d);
    }

    @Override // defpackage.dcjo
    public final /* synthetic */ Object d() {
        return new derd(this);
    }

    public final String toString() {
        return "DataEventRef{ type=" + (a() == 1 ? "changed" : a() == 2 ? "deleted" : "unknown") + ", dataitem=" + b().toString() + " }";
    }
}
