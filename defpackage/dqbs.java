package defpackage;

import android.media.MediaPlayer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqbs extends fcyz implements fdat {
    public dqbs(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return new dqbs((fcxy) obj2).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return new MediaPlayer();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dqbs(fcxyVar);
    }
}
