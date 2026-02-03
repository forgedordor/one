package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xaj extends fcyz implements fdat {
    final /* synthetic */ Uri a;
    final /* synthetic */ xak b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xaj(fcxy fcxyVar, Uri uri, xak xakVar) {
        super(2, fcxyVar);
        this.a = uri;
        this.b = xakVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xaj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        eieu eieuVarH = eiiy.h("LegacyAttachmentDownloader#download");
        try {
            ekrw ekrwVarH = xak.a.h();
            ekrwVarH.X(eksq.a, "BugleComposeRow2");
            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/attachment/downloader/LegacyAttachmentDownloader$download$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 40, "LegacyAttachmentDownloader.kt");
            Uri uri = this.a;
            ekrdVar.D("Downloading remote attachment to scratch space %s, %s", cqcy.a(uri), null);
            Uri uriK = this.b.c.k(uri);
            if (uriK == null) {
                throw new xai();
            }
            fczl.a(eieuVarH, null);
            return uriK;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        xaj xajVar = new xaj(fcxyVar, this.a, this.b);
        xajVar.c = obj;
        return xajVar;
    }
}
