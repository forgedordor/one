package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rfq implements rfh {
    private final rig a;

    public rfq(rig rigVar) {
        this.a = rigVar;
    }

    @Override // defpackage.rfh
    public final /* bridge */ /* synthetic */ rfi a(Object obj) {
        return new rfr((InputStream) obj, this.a);
    }

    @Override // defpackage.rfh
    public final Class b() {
        return InputStream.class;
    }
}
