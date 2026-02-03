package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chiw extends fcyz implements fdat {
    final /* synthetic */ chix a;
    final /* synthetic */ chif b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chiw(chix chixVar, chif chifVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = chixVar;
        this.b = chifVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chiw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        chif chifVar = this.b;
        ContentValues contentValues = chifVar.g;
        if (TextUtils.isEmpty(contentValues.getAsString("subject"))) {
            contentValues.put("subject", chxx.g(Optional.of(chifVar.b)));
        }
        chix chixVar = this.a;
        chhz chhzVar = chifVar.f;
        UUID uuid = chifVar.b;
        Uri uriA = chixVar.a.a(contentValues, chhzVar.c, chhzVar.a, uuid);
        return uriA == null ? new chih(chifVar.a, uuid, chifVar.c) : chif.a(chifVar, chhz.a(chhzVar, uriA, null, 95));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chiw(this.a, this.b, fcxyVar);
    }
}
