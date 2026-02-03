package defpackage;

import android.media.MediaMetadataRetriever;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doms extends fcyz implements fdat {
    final /* synthetic */ fdap a;
    final /* synthetic */ domt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doms(fdap fdapVar, domt domtVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = fdapVar;
        this.b = domtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((doms) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.a.invoke(mediaMetadataRetriever);
        try {
            return this.b.a(mediaMetadataRetriever);
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new doms(this.a, this.b, fcxyVar);
    }
}
